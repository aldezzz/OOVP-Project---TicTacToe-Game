/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

/**
 *
 * @author asus
 */
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTextField;

public class Autonumber extends SignUp{
    public Autonumber(JTextField txID) {
        super(txID);
        autonumber();
    }
    private void autonumber() {
        try {
            Connection conn = connection.getconnection();
            Statement s = conn.createStatement();
            String sql = "SELECT * FROM login ORDER BY userID DESC";
            ResultSet r = s.executeQuery(sql);
            if (r.next()) {
                String ID = r.getString("userID").substring(2);
                String userID = "" + (Integer.parseInt(ID) + 1);
                String Zero = "";

                if (userID.length() == 1) {
                    Zero = "00";
                } else if (userID.length() == 2) {
                    Zero = "0";
                } else if (userID.length() == 3) {
                    Zero = "";
                }

                txID.setText("10" + Zero + userID);
            } else {
                txID.setText("10001");
            }
            r.close();
            s.close();
        } catch (Exception e) {
            System.out.println("autonumber error");
        }
    }
}

