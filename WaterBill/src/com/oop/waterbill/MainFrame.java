/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oop.waterbill;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class MainFrame extends javax.swing.JFrame {
    Login con=new Login();

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        userlogin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        passwordlogin = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        loginbutton = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(95, 210, 195));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/oop/waterbill/faucetwhite.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 500));

        jPanel1.setBackground(new java.awt.Color(34, 45, 65));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userlogin.setBackground(new java.awt.Color(34, 45, 65));
        userlogin.setForeground(new java.awt.Color(253, 253, 253));
        userlogin.setText("Enter your username");
        userlogin.setBorder(null);
        userlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userloginMousePressed(evt);
            }
        });
        userlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userloginActionPerformed(evt);
            }
        });
        jPanel1.add(userlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 210, 20));

        jLabel2.setForeground(new java.awt.Color(253, 253, 253));
        jLabel2.setText("USER NAME");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/oop/waterbill/line-01.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 10));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/oop/waterbill/line-01.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 10));

        jLabel5.setForeground(new java.awt.Color(253, 253, 253));
        jLabel5.setText("PASSWORD");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        passwordlogin.setBackground(new java.awt.Color(34, 45, 65));
        passwordlogin.setForeground(new java.awt.Color(253, 253, 253));
        passwordlogin.setText("jPasswordField1");
        passwordlogin.setBorder(null);
        passwordlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passwordloginMousePressed(evt);
            }
        });
        passwordlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordloginActionPerformed(evt);
            }
        });
        jPanel1.add(passwordlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 230, 10));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(253, 253, 253));
        jLabel6.setText("LOG IN");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        loginbutton.setBackground(new java.awt.Color(33, 63, 87));
        loginbutton.setForeground(new java.awt.Color(253, 253, 253));
        loginbutton.setText("Log in");
        loginbutton.setContentAreaFilled(false);
        loginbutton.setOpaque(true);
        loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(loginbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 90, 40));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 320, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userloginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userloginActionPerformed

    private void passwordloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordloginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordloginActionPerformed

    private void loginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbuttonActionPerformed
        // TODO add your handling code here:
         int a,d=1;
String b=userlogin.getText();
String c=passwordlogin.getText();
   
a=con.getData(b,c);

if(a==1&&d==1){
    
    this.setVisible(false);
    new Menu().setVisible(true);
    
}
else if (a!=1&&d==1){
    JOptionPane.showMessageDialog(null, "Access Not Granted");
    
}
    }//GEN-LAST:event_loginbuttonActionPerformed

    private void userloginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userloginMousePressed
        // TODO add your handling code here:
        userlogin.setText("");
        
    }//GEN-LAST:event_userloginMousePressed

    private void passwordloginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordloginMousePressed
        // TODO add your handling code here:
         passwordlogin.setText("");
    }//GEN-LAST:event_passwordloginMousePressed
    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton loginbutton;
    private javax.swing.JPasswordField passwordlogin;
    private javax.swing.JTextField userlogin;
    // End of variables declaration//GEN-END:variables
}
