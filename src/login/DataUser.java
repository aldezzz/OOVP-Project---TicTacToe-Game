/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package login;


import java.sql.Connection;
import javax.swing.JTable;
import java.sql.Connection;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asus
 */
public class DataUser extends javax.swing.JPanel {
    
    public void displaydata (){
        DefaultTableModel  model = new DefaultTableModel();
        
        model.addColumn("No.");
        model.addColumn("userID");
        model.addColumn("username");
        model.addColumn("email");
        model.addColumn("phone");
        model.addColumn("gender");
        model.addColumn("password");
        
        try{
            int no = 1;
            String sql = "SELECT * FROM login";
            java.sql.Connection conn = (Connection)connection.getconnection();
            java.sql.Statement p = conn.createStatement();
            java.sql.ResultSet r = p.executeQuery(sql);
            
            while(r.next()){
                model.addRow(new Object[]{no++,r.getString(1),r.getString(2),r.getString(3),r.getString(4),r.getString(5),r.getString(6)});
                
                tableuser.setModel(model);
                
            }
        }catch(SQLException e){
            System.out.println("ERROR :" +e.getMessage());
            
        }
        
        
    }
    
    

    /**
     * Creates new form DataUser
     */
    public DataUser() {
        initComponents();
        txID.setEnabled(false);
        autonumber();
        displaydata();
    }
    
    private void delete(){
        txID.setText("");
        txUser.setText("");
        txEmail.setText("");
        txPhone.setText("");
        txgender.setText("");
        pfpassword.setText("");
    }
    private void autonumber () {
        try{
            Connection conn = connection.getconnection();
            Statement s = conn.createStatement();
            String sql = "SELECT * FROM login ORDER BY userID DESC";
            ResultSet r = s.executeQuery(sql);
            if (r.next()){
                String ID = r.getString("userID").substring(2);
                String userID = "" +(Integer.parseInt(ID)+ 1);
                String Zero = "";
                
                if (userID.length()==1)
                {Zero = "00"; }
                else if(userID.length()==2)
                {Zero = "0";}
                else if (userID.length()==3)
                {Zero = "";}
                
                txID.setText("10" + Zero + userID);
            }else{
                txID.setText("10001");
            }
            r.close();
            s.close();
        }catch (Exception e) {
            System.out.println("autonumber error");
                
        
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainpanel = new javax.swing.JPanel();
        datauser = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableuser = new javax.swing.JTable();
        btnrefresh = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txUser = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txPhone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txgender = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        pfpassword = new javax.swing.JTextField();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        setLayout(new java.awt.CardLayout());

        mainpanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                mainpanelComponentShown(evt);
            }
        });
        mainpanel.setLayout(new java.awt.CardLayout());

        datauser.setBackground(new java.awt.Color(255, 51, 204));
        datauser.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                datauserComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ravie", 1, 18)); // NOI18N
        jLabel1.setText("Data User");

        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btndelete.setText("DELETE");
        btndelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btndeleteMouseClicked(evt);
            }
        });
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        jButton3.setText("CANCEL");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        tableuser.setBackground(new java.awt.Color(0, 204, 204));
        tableuser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableuserMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tableuser);

        btnrefresh.setText("REFRESH");
        btnrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jLabel4.setText("userID");

        jLabel5.setText(" username");

        txUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txUserActionPerformed(evt);
            }
        });

        jLabel6.setText("email");

        jLabel7.setText("phone");

        jLabel8.setText("gender(*Male/Female)");

        jLabel21.setText("Password");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(txID)
                    .addComponent(txUser)
                    .addComponent(txEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel21)
                    .addComponent(pfpassword, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                    .addComponent(txgender)
                    .addComponent(txPhone))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pfpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout datauserLayout = new javax.swing.GroupLayout(datauser);
        datauser.setLayout(datauserLayout);
        datauserLayout.setHorizontalGroup(
            datauserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datauserLayout.createSequentialGroup()
                .addGroup(datauserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(datauserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(datauserLayout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addComponent(jLabel1))
                        .addGroup(datauserLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane4))
                        .addGroup(datauserLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(datauserLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAdd)
                        .addGap(18, 18, 18)
                        .addComponent(btndelete)
                        .addGap(18, 18, 18)
                        .addComponent(btnrefresh)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        datauserLayout.setVerticalGroup(
            datauserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datauserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(datauserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btndelete)
                    .addComponent(btnrefresh)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        mainpanel.add(datauser, "card2");

        add(mainpanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        
        
            
        
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:

        

            try{
                String sql = "INSERT INTO login VALUES ('"+txID.getText()+"' , '"+txUser.getText()+"' , '"+txEmail.getText()+"', '"+txPhone.getText()+"','"+txgender.getText()+"' ,'"+pfpassword.getText()+"')";

                java.sql.Connection conn = (Connection) connection.getconnection();
                java.sql.PreparedStatement p = conn.prepareStatement(sql);

                p.execute();
                JOptionPane.showMessageDialog(null, "Add user Successfully");

                
                
                
                

                
                

            }catch(Exception e) {
                
                System.out.println("add error ");

            }
        
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void datauserComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_datauserComponentShown
        // TODO add your handling code here:
        
    }//GEN-LAST:event_datauserComponentShown

    private void mainpanelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_mainpanelComponentShown
        // TODO add your handling code here:
        
    }//GEN-LAST:event_mainpanelComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formComponentShown

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
        // TODO add your handling code here:
        autonumber();
        try{
            String sql = "SELECT * FROM login WHERE userID = '"+txID.getText()+"'";
            Connection conn = (Connection)connection.getconnection();
            java.sql.PreparedStatement p = conn.prepareStatement(sql);
            p.execute();
            autonumber();
            
        }catch (Exception e){
            System.out.println("error");
            
        }
        autonumber();
        displaydata();
        delete();
    }//GEN-LAST:event_btnrefreshActionPerformed

    private void btndeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndeleteMouseClicked
        // TODO add your handling code here:
        try{

            String sql = "DELETE FROM login WHERE userID = '"+txID.getText()+"'";
            java.sql.Connection conn = (Connection)connection.getconnection();
            java.sql.PreparedStatement p = conn.prepareStatement(sql);
            p.execute();
            JOptionPane.showMessageDialog(null, "Delete user Successfully");

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Delete user Failed");
            System.out.println("ERROR :" +e.getMessage());

        }
        
        
    }//GEN-LAST:event_btndeleteMouseClicked

    private void tableuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableuserMouseClicked
        // TODO add your handling code here:
        
        int row = tableuser.rowAtPoint(evt.getPoint());
        String userID = tableuser.getValueAt(row, 1).toString();
        txID.setText(userID);
        String username = tableuser.getValueAt(row, 2).toString();
        txUser.setText(username);
        String email = tableuser.getValueAt(row, 3).toString();
        txEmail.setText(email);
        String phone = tableuser.getValueAt(row, 4).toString();
        txPhone.setText(phone);
        String gender = tableuser.getValueAt(row, 5).toString();
        txgender.setText(gender);
        String password = tableuser.getValueAt(row, 6).toString();
        pfpassword.setText(password);
    }//GEN-LAST:event_tableuserMouseClicked

    private void txUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txUserActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JPanel datauser;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JTextField pfpassword;
    private javax.swing.JTable tableuser;
    private javax.swing.JTextField txEmail;
    private javax.swing.JTextField txID;
    private javax.swing.JTextField txPhone;
    private javax.swing.JTextField txUser;
    private javax.swing.JTextField txgender;
    // End of variables declaration//GEN-END:variables
}
