/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login;

import java.awt.Color;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import menuHelp.Help;

/**
 *
 * @author asus
 */
public class gametrial extends javax.swing.JFrame {

    /**
     * Creates new form game
     */
    private String var = "X";
    private int countX = 0;
    private int countO = 0;
    boolean checker;
    private Clip clip;
    
    public gametrial() {
        initComponents();
        setSize(1072, 830);
        setLocationRelativeTo(null);
        try {
            File musicPath = new File("src/audio/sound.wav");
            if(musicPath.exists()) {
                clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(musicPath));
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);
            } else {
                System.out.println("Can't find music file");
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    private void change(){
        if(var.equals("X")){
            var = "O" ;
        }else{
            var = "X";
        }
    }
    
    private void score (){
        scoreX.setText(String.valueOf(countX));
        scoreO.setText(String.valueOf(countO));
        
    }
    private void Xwinner(){
        JOptionPane.showMessageDialog(this,"Player X Wins","KUDOS",
                JOptionPane.INFORMATION_MESSAGE);
        countX++;
        score();
        
    }
    
    private void Owinner(){
        JOptionPane.showMessageDialog(this,"Player O Wins","KUDOS",
                JOptionPane.INFORMATION_MESSAGE);
        countO++;
        score();
    }
    private void draw(){
        String one = jButton_1.getText();
        String two = jButton_2.getText();
        String three = jButton_3.getText();
        String four = jButton_4.getText();
        String five = jButton_5.getText();
        String six = jButton_6.getText();
        String seven = jButton_7.getText();
        String eight = jButton_8.getText();
        String nine = jButton_9.getText();
        
        if(one != "" && two != "" && three !="" && four !="" && 
                five !="" && six !="" && seven !="" && eight !="" 
                && nine !="" ){
        JOptionPane.showMessageDialog(this,"DRAW GAME",
                "DRAW",
        JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
    
    private void winner(){
        String one = jButton_1.getText();
        String two = jButton_2.getText();
        String three = jButton_3.getText();
        String four = jButton_4.getText();
        String five = jButton_5.getText();
        String six = jButton_6.getText();
        String seven = jButton_7.getText();
        String eight = jButton_8.getText();
        String nine = jButton_9.getText();
        
        if(one=="X" && two=="X" && three=="X"){
            jButton_1.setBackground(Color.darkGray);
            jButton_2.setBackground(Color.darkGray);
            jButton_3.setBackground(Color.darkGray);
            
            
            Xwinner();
            
        }
        if(four=="X" && five=="X" && six=="X"){
            jButton_4.setBackground(Color.darkGray);
            jButton_5.setBackground(Color.darkGray);
            jButton_6.setBackground(Color.darkGray);
            
            
            Xwinner();
        }
        if(seven=="X" && eight=="X" && nine=="X"){
            jButton_7.setBackground(Color.darkGray);
            jButton_8.setBackground(Color.darkGray);
            jButton_9.setBackground(Color.darkGray);
            Xwinner();
        }
        if(one=="X" && five=="X" && nine=="X"){
            jButton_1.setBackground(Color.darkGray);
            jButton_5.setBackground(Color.darkGray);
            jButton_9.setBackground(Color.darkGray);
            
            
            Xwinner();
            
        }
        if(two=="X" && five=="X" && eight=="X"){
            jButton_2.setBackground(Color.darkGray);
            jButton_5.setBackground(Color.darkGray);
            jButton_8.setBackground(Color.darkGray);
            
            
            Xwinner();
            
        }
        if(three=="X" && five=="X" && seven=="X"){
            jButton_3.setBackground(Color.darkGray);
            jButton_5.setBackground(Color.darkGray);
            jButton_7.setBackground(Color.darkGray);
            
            
            Xwinner();
            
        }
        if(one=="X" && four=="X" && seven=="X"){
            jButton_1.setBackground(Color.darkGray);
            jButton_4.setBackground(Color.darkGray);
            jButton_7.setBackground(Color.darkGray);
            
            
            Xwinner();
            
        }
        if(three=="X" && six=="X" && nine=="X"){
            jButton_3.setBackground(Color.darkGray);
            jButton_6.setBackground(Color.darkGray);
            jButton_9.setBackground(Color.darkGray);
            
            
            Xwinner();
            
        }
        
        
        //for O
        
        if(one=="O" && two=="O" && three=="O"){
            jButton_1.setBackground(Color.darkGray);
            jButton_2.setBackground(Color.darkGray);
            jButton_3.setBackground(Color.darkGray);
            Owinner();
            
        }
        if(four=="O" && five=="O" && six=="O"){
            jButton_4.setBackground(Color.darkGray);
            jButton_5.setBackground(Color.darkGray);
            jButton_6.setBackground(Color.darkGray);
            Owinner();
        }
        if(seven=="O" && eight=="O" && nine=="O"){
            jButton_7.setBackground(Color.darkGray);
            jButton_8.setBackground(Color.darkGray);
            jButton_9.setBackground(Color.darkGray);
            Owinner();
        }
        if(one=="O" && five=="O" && nine=="O"){
            jButton_1.setBackground(Color.darkGray);
            jButton_5.setBackground(Color.darkGray);
            jButton_9.setBackground(Color.darkGray);
            Owinner();
            
        }
        if(two=="O" && five=="O" && eight=="O"){
            jButton_2.setBackground(Color.darkGray);
            jButton_5.setBackground(Color.darkGray);
            jButton_8.setBackground(Color.darkGray);
            Owinner();
            
        }
        if(three=="O" && five=="O" && seven=="O"){
            jButton_3.setBackground(Color.darkGray);
            jButton_5.setBackground(Color.darkGray);
            jButton_7.setBackground(Color.darkGray);
            Owinner();
            
        }
        if(one=="O" && four=="O" && seven=="O"){
            jButton_1.setBackground(Color.darkGray);
            jButton_4.setBackground(Color.darkGray);
            jButton_7.setBackground(Color.darkGray);
            Owinner();
            
        }
        if(three=="O" && six=="O" && nine=="O"){
            jButton_3.setBackground(Color.darkGray);
            jButton_6.setBackground(Color.darkGray);
            jButton_9.setBackground(Color.darkGray);
            Owinner();
            
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

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        grid1 = new javax.swing.JPanel();
        jButton_1 = new javax.swing.JButton();
        grid2 = new javax.swing.JPanel();
        jButton_2 = new javax.swing.JButton();
        grid3 = new javax.swing.JPanel();
        jButton_3 = new javax.swing.JButton();
        grid4 = new javax.swing.JPanel();
        jButton_4 = new javax.swing.JButton();
        grid5 = new javax.swing.JPanel();
        jButton_5 = new javax.swing.JButton();
        grid6 = new javax.swing.JPanel();
        jButton_6 = new javax.swing.JButton();
        grid7 = new javax.swing.JPanel();
        jButton_7 = new javax.swing.JButton();
        grid8 = new javax.swing.JPanel();
        jButton_8 = new javax.swing.JButton();
        grid9 = new javax.swing.JPanel();
        jButton_9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnsound2 = new javax.swing.JButton();
        btnsound1 = new javax.swing.JButton();
        cbcolor = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        btnng = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        btnexit = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        labels = new javax.swing.JLabel();
        labels2 = new javax.swing.JLabel();
        scoreX = new javax.swing.JLabel();
        scoreO = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        btnreset = new javax.swing.JButton();
        desktop = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        appinfo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setForeground(new java.awt.Color(0, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 600));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel5.setLayout(new java.awt.GridLayout(3, 3, 1, 1));

        grid1.setBackground(new java.awt.Color(255, 255, 255));
        grid1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        grid1.setForeground(new java.awt.Color(0, 153, 153));
        grid1.setLayout(new java.awt.BorderLayout());

        jButton_1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 150)); // NOI18N
        jButton_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_1ActionPerformed(evt);
            }
        });
        grid1.add(jButton_1, java.awt.BorderLayout.CENTER);

        jPanel5.add(grid1);

        grid2.setBackground(new java.awt.Color(255, 255, 255));
        grid2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        grid2.setLayout(new java.awt.BorderLayout());

        jButton_2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 150)); // NOI18N
        jButton_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_2ActionPerformed(evt);
            }
        });
        grid2.add(jButton_2, java.awt.BorderLayout.CENTER);

        jPanel5.add(grid2);

        grid3.setBackground(new java.awt.Color(255, 255, 255));
        grid3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        grid3.setLayout(new java.awt.BorderLayout());

        jButton_3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 150)); // NOI18N
        jButton_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_3ActionPerformed(evt);
            }
        });
        grid3.add(jButton_3, java.awt.BorderLayout.CENTER);

        jPanel5.add(grid3);

        grid4.setBackground(new java.awt.Color(255, 255, 255));
        grid4.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        grid4.setLayout(new java.awt.BorderLayout());

        jButton_4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 150)); // NOI18N
        jButton_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_4ActionPerformed(evt);
            }
        });
        grid4.add(jButton_4, java.awt.BorderLayout.CENTER);

        jPanel5.add(grid4);

        grid5.setBackground(new java.awt.Color(255, 255, 255));
        grid5.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        grid5.setLayout(new java.awt.BorderLayout());

        jButton_5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 150)); // NOI18N
        jButton_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_5ActionPerformed(evt);
            }
        });
        grid5.add(jButton_5, java.awt.BorderLayout.CENTER);

        jPanel5.add(grid5);

        grid6.setBackground(new java.awt.Color(255, 255, 255));
        grid6.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        grid6.setLayout(new java.awt.BorderLayout());

        jButton_6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 150)); // NOI18N
        jButton_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_6ActionPerformed(evt);
            }
        });
        grid6.add(jButton_6, java.awt.BorderLayout.CENTER);

        jPanel5.add(grid6);

        grid7.setBackground(new java.awt.Color(255, 255, 255));
        grid7.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        grid7.setLayout(new java.awt.BorderLayout());

        jButton_7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 150)); // NOI18N
        jButton_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_7ActionPerformed(evt);
            }
        });
        grid7.add(jButton_7, java.awt.BorderLayout.CENTER);

        jPanel5.add(grid7);

        grid8.setBackground(new java.awt.Color(255, 255, 255));
        grid8.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        grid8.setLayout(new java.awt.BorderLayout());

        jButton_8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 150)); // NOI18N
        jButton_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_8ActionPerformed(evt);
            }
        });
        grid8.add(jButton_8, java.awt.BorderLayout.CENTER);

        jPanel5.add(grid8);

        grid9.setBackground(new java.awt.Color(255, 255, 255));
        grid9.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        grid9.setLayout(new java.awt.BorderLayout());

        jButton_9.setFont(new java.awt.Font("Tempus Sans ITC", 1, 150)); // NOI18N
        jButton_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_9ActionPerformed(evt);
            }
        });
        grid9.add(jButton_9, java.awt.BorderLayout.CENTER);

        jPanel5.add(grid9);

        jPanel1.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        btnsound2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mute.png"))); // NOI18N
        btnsound2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsound2ActionPerformed(evt);
            }
        });

        btnsound1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sound.png"))); // NOI18N
        btnsound1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsound1ActionPerformed(evt);
            }
        });

        cbcolor.setFont(new java.awt.Font("Ravie", 1, 14)); // NOI18N
        cbcolor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Red", "Green", "Light", "Dark", "Windows" }));
        cbcolor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        cbcolor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbcolorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbcolor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(410, 410, 410)
                .addComponent(btnsound1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnsound2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnsound2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnsound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbcolor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/NICKDT-11777-spongebob-squarepants-bikini-bottom-tic-tac-toe-promos-16x9.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jPanel7.setBackground(new java.awt.Color(255, 0, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel7.setPreferredSize(new java.awt.Dimension(213, 40));

        btnng.setFont(new java.awt.Font("Ravie", 1, 24)); // NOI18N
        btnng.setForeground(new java.awt.Color(0, 204, 204));
        btnng.setText("NEW GAME");
        btnng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnngActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnng, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(btnng, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(255, 51, 204));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel8.setPreferredSize(new java.awt.Dimension(213, 40));

        btnexit.setFont(new java.awt.Font("Ravie", 1, 24)); // NOI18N
        btnexit.setForeground(new java.awt.Color(0, 204, 204));
        btnexit.setText("EXIT");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnexit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnexit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(255, 0, 204));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        labels.setFont(new java.awt.Font("Ravie", 1, 24)); // NOI18N
        labels.setText("PLAYER X:");

        labels2.setFont(new java.awt.Font("Ravie", 1, 24)); // NOI18N
        labels2.setText("PLAYER O:");

        scoreX.setFont(new java.awt.Font("Ravie", 1, 24)); // NOI18N
        scoreX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreX.setText("0");
        scoreX.setOpaque(true);

        scoreO.setFont(new java.awt.Font("Ravie", 1, 24)); // NOI18N
        scoreO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreO.setText("0");
        scoreO.setOpaque(true);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labels)
                    .addComponent(labels2))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scoreO, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scoreX, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labels)
                    .addComponent(scoreX, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labels2)
                    .addComponent(scoreO, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(255, 0, 204));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        btnreset.setFont(new java.awt.Font("Ravie", 1, 24)); // NOI18N
        btnreset.setForeground(new java.awt.Color(0, 204, 204));
        btnreset.setText("RESET");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnreset, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnreset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        desktop.setBackground(new java.awt.Color(0, 204, 204));
        desktop.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1057, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 217, Short.MAX_VALUE)
        );

        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jMenu1.setText("Setting");

        jMenuItem1.setText("Logout");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        appinfo.setText("Next");
        appinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appinfoActionPerformed(evt);
            }
        });
        jMenu2.add(appinfo);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1100, 841));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_1ActionPerformed
        // TODO add your handling code here:
        jButton_1.setText(var);
        if(var.equalsIgnoreCase("X")){
            jButton_1.setForeground(Color.red);
        }else{
            jButton_1.setForeground(Color.blue);
        }
        change();
        winner();
        draw();
    }//GEN-LAST:event_jButton_1ActionPerformed

    private void jButton_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_2ActionPerformed
        // TODO add your handling code here:
        jButton_2.setText(var);
        if(var.equalsIgnoreCase("X")){
            jButton_2.setForeground(Color.red);
        }else{
            jButton_2.setForeground(Color.blue);
        }
        change();
        winner();
        draw();
    }//GEN-LAST:event_jButton_2ActionPerformed

    private void jButton_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_4ActionPerformed
        // TODO add your handling code here:
        jButton_4.setText(var);
        if(var.equalsIgnoreCase("X")){
            jButton_4.setForeground(Color.red);
        }else{
            jButton_4.setForeground(Color.blue);
        }
        change();
        winner();
        draw();
    }//GEN-LAST:event_jButton_4ActionPerformed

    private void jButton_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_5ActionPerformed
        // TODO add your handling code here:
        jButton_5.setText(var);
        if(var.equalsIgnoreCase("X")){
            jButton_5.setForeground(Color.red);
        }else{
            jButton_5.setForeground(Color.blue);
        }
        change();
        winner();
        draw();
    }//GEN-LAST:event_jButton_5ActionPerformed

    private void jButton_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_7ActionPerformed
        // TODO add your handling code here:
        jButton_7.setText(var);
        if(var.equalsIgnoreCase("X")){
            jButton_7.setForeground(Color.red);
        }else{
            jButton_7.setForeground(Color.blue);
        }
        change();
        winner();
        draw();
    }//GEN-LAST:event_jButton_7ActionPerformed

    private void jButton_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_8ActionPerformed
        // TODO add your handling code here:
        jButton_8.setText(var);
        if(var.equalsIgnoreCase("X")){
            jButton_8.setForeground(Color.red);
        }else{
            jButton_8.setForeground(Color.blue);
        }
        change();
        winner();
        draw();
    }//GEN-LAST:event_jButton_8ActionPerformed

    private void jButton_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_3ActionPerformed
        // TODO add your handling code here:
        jButton_3.setText(var);
        if(var.equalsIgnoreCase("X")){
            jButton_3.setForeground(Color.red);
        }else{
            jButton_3.setForeground(Color.blue);
        }
        change();
        winner();
        draw();
    }//GEN-LAST:event_jButton_3ActionPerformed

    private void jButton_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_6ActionPerformed
        // TODO add your handling code here:
        jButton_6.setText(var);
        if(var.equalsIgnoreCase("X")){
            jButton_6.setForeground(Color.red);
        }else{
            jButton_6.setForeground(Color.blue);
        }
        change();
        winner();
        draw();
    }//GEN-LAST:event_jButton_6ActionPerformed

    private void jButton_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_9ActionPerformed
        // TODO add your handling code here:
        jButton_9.setText(var);
        if(var.equalsIgnoreCase("X")){
            jButton_9.setForeground(Color.red);
        }else{
            jButton_9.setForeground(Color.blue);
        }
        change();
        winner();
        draw();
    }//GEN-LAST:event_jButton_9ActionPerformed
    private JFrame frame;
    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        // TODO add your handling code here:
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if You want to exit", "Tic Tac Toe",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            this.dispose();
            TicTacToe h = new TicTacToe();
        h.setVisible(true);
        clip.stop();
        }
        
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnngActionPerformed
        // TODO add your handling code here:
        this.dispose();
        SignUp s = new SignUp();
        s.setVisible(true);
        clip.stop();
    }//GEN-LAST:event_btnngActionPerformed

    private void btnsound2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsound2ActionPerformed
        // TODO add your handling code here:
        clip.stop();
    }//GEN-LAST:event_btnsound2ActionPerformed

    private void cbcolorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbcolorActionPerformed
        // TODO add your handling code here:
        String color = cbcolor.getSelectedItem().toString();
        switch(color) {
        case "Red":
            getContentPane().setBackground(Color.RED);
            break;
        case "Green":
            getContentPane().setBackground(Color.GREEN);
            break;
        }
        if (color.equals("Ligth")){
            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()){
                    if ("Nimbus".equals(info.getName())){
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
                SwingUtilities.updateComponentTreeUI(this);
                
            }catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex){
                
                java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
            
            }
        }else if (color.equals("Dark")){
            try{
                javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
                UIManager.put("control", new Color(128,128,128));
                UIManager.put("info", new Color(128,128,128));
                UIManager.put("nimbusBase", new Color(18,30,49));
                UIManager.put("nimbusAlertYellow", new Color(248,187,0));
                UIManager.put("nimbusDisabledText", new Color(128,128,128));
                UIManager.put("nimbusFocus", new Color(115,164,209));
                UIManager.put("nimbusGreen", new Color(176,179,50));
                UIManager.put("nimbusInfoBlue", new Color(66,139,221));
                UIManager.put("nimbusLightBackground", new Color(18,30,49));
                UIManager.put("nimbusOrange", new Color(191,98,4));
                UIManager.put("nimbusRed", new Color(169,46,34));
                UIManager.put("nimbusSelectedText", new Color(255,255,255));
                UIManager.put("nimbusSelectionBackground", new Color(104,93,156));
                UIManager.put("text", new Color(230,230,230));
                SwingUtilities.updateComponentTreeUI(this);
            }catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }else if (color.equals("Windows")){
            try {
            // Menggunakan tema Windows
                javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                SwingUtilities.updateComponentTreeUI(this);
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        }
        
    }//GEN-LAST:event_cbcolorActionPerformed

    private void btnsound1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsound1ActionPerformed
        // TODO add your handling code here:
        clip.start();
        
    }//GEN-LAST:event_btnsound1ActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        // TODO add your handling code here:
        this.dispose();
        SignUp s = new SignUp();
        s.setVisible(true);
        clip.stop();
        
    }//GEN-LAST:event_btnresetActionPerformed

    private void appinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appinfoActionPerformed
        // TODO add your handling code here:
        Help h = new Help();
        desktop.add(h);
        h.setVisible(true);
    }//GEN-LAST:event_appinfoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        
        System.exit(0);
        JOptionPane.showMessageDialog(null, "Logout Succesfully");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(gametrial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gametrial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gametrial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gametrial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gametrial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem appinfo;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnng;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnsound1;
    private javax.swing.JButton btnsound2;
    private javax.swing.JComboBox<String> cbcolor;
    private javax.swing.JPanel desktop;
    private javax.swing.JPanel grid1;
    private javax.swing.JPanel grid2;
    private javax.swing.JPanel grid3;
    private javax.swing.JPanel grid4;
    private javax.swing.JPanel grid5;
    private javax.swing.JPanel grid6;
    private javax.swing.JPanel grid7;
    private javax.swing.JPanel grid8;
    private javax.swing.JPanel grid9;
    private javax.swing.JButton jButton_1;
    private javax.swing.JButton jButton_2;
    private javax.swing.JButton jButton_3;
    private javax.swing.JButton jButton_4;
    private javax.swing.JButton jButton_5;
    private javax.swing.JButton jButton_6;
    private javax.swing.JButton jButton_7;
    private javax.swing.JButton jButton_8;
    private javax.swing.JButton jButton_9;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel labels;
    private javax.swing.JLabel labels2;
    private javax.swing.JLabel scoreO;
    private javax.swing.JLabel scoreX;
    // End of variables declaration//GEN-END:variables
}
