/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oop.waterbill;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;
import javax.swing.ImageIcon;

/**
 *
 * @author User
 */
public class Menu extends javax.swing.JFrame {
    final Color blue = new Color(33   , 63, 87);
    final Color white = new Color(253  , 253, 253);
    GridBagLayout layout = new GridBagLayout();
     GridBagConstraints c = new GridBagConstraints();
    RecordsPanel records;
    PaymentPanel payment;
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        records = new RecordsPanel();
        payment = new PaymentPanel();
        DynamicPanel.setLayout(layout);
       
        c.gridx = 0;
       c.gridy = 0;
       DynamicPanel.add(payment,c);
       DynamicPanel.add(records,c);
        //payment.setVisible(true);
        //records.setVisible(false);

        paymenttext.setForeground(blue);
        paymenticon.setIcon(new ImageIcon("src\\com\\oop\\waterbill\\Paycheque_35px_2.png"));
        paymentpanel.setBackground(white);
        resetColor(1);

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
        jPanel2 = new javax.swing.JPanel();
        paymentpanel = new javax.swing.JPanel();
        paymenticon = new javax.swing.JLabel();
        paymenttext = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        recordpanel = new javax.swing.JPanel();
        recordtext = new javax.swing.JLabel();
        recordicon = new javax.swing.JLabel();
        inputpanel = new javax.swing.JPanel();
        inputtext = new javax.swing.JLabel();
        inputicon = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        DynamicPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(33, 63, 87));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        paymentpanel.setBackground(new java.awt.Color(33, 63, 87));
        paymentpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                paymentpanelMousePressed(evt);
            }
        });
        paymentpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        paymenticon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        paymenticon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/oop/waterbill/Paycheque_35px.png"))); // NOI18N
        paymentpanel.add(paymenticon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        paymenttext.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        paymenttext.setForeground(new java.awt.Color(253, 253, 253));
        paymenttext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        paymenttext.setText("Payments");
        paymentpanel.add(paymenttext, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 90, 20));

        jPanel2.add(paymentpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 190, 40));

        jPanel5.setMinimumSize(new java.awt.Dimension(170, 47));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, 50));

        recordpanel.setBackground(new java.awt.Color(33, 63, 87));
        recordpanel.setPreferredSize(new java.awt.Dimension(170, 30));
        recordpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                recordpanelMousePressed(evt);
            }
        });
        recordpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        recordtext.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        recordtext.setForeground(new java.awt.Color(253, 253, 253));
        recordtext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        recordtext.setText("Records");
        recordpanel.add(recordtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, 20));

        recordicon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        recordicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/oop/waterbill/Business Contact_35px_1.png"))); // NOI18N
        recordicon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        recordpanel.add(recordicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 20));

        jPanel2.add(recordpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 190, 40));

        inputpanel.setBackground(new java.awt.Color(33, 63, 87));
        inputpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inputpanelMousePressed(evt);
            }
        });
        inputpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputtext.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        inputtext.setForeground(new java.awt.Color(253, 253, 253));
        inputtext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inputtext.setText("Input Reading");
        inputpanel.add(inputtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 20));

        inputicon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inputicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/oop/waterbill/Plus_25px.png"))); // NOI18N
        inputpanel.add(inputicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 30, -1));

        jPanel2.add(inputpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 190, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 560));

        jPanel3.setBackground(new java.awt.Color(253, 253, 253));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout DynamicPanelLayout = new javax.swing.GroupLayout(DynamicPanel);
        DynamicPanel.setLayout(DynamicPanelLayout);
        DynamicPanelLayout.setHorizontalGroup(
            DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        DynamicPanelLayout.setVerticalGroup(
            DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        jPanel3.add(DynamicPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 56, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 680, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void paymentpanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentpanelMousePressed
        // TODO add your handling code here:
        
        paymenttext.setForeground(blue);
        paymenticon.setIcon(new ImageIcon("src\\com\\oop\\waterbill\\Paycheque_35px_2.png"));
        paymentpanel.setBackground(white);
        resetColor(1);
        
    }//GEN-LAST:event_paymentpanelMousePressed

    private void recordpanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recordpanelMousePressed
        // TODO add your handling code here:
        recordtext.setForeground(blue);
        recordicon.setIcon(new ImageIcon("src\\com\\oop\\waterbill\\Business Contact_35px_2.png"));
        recordpanel.setBackground(white);
        resetColor(2);
       // records.setVisible(true);
    }//GEN-LAST:event_recordpanelMousePressed

    private void inputpanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputpanelMousePressed
        // TODO add your handling code here:
        inputtext.setForeground(blue);
        inputicon.setIcon(new ImageIcon("src\\com\\oop\\waterbill\\Plus_25px_1.png"));
        inputpanel.setBackground(white);
        resetColor(3);
    }//GEN-LAST:event_inputpanelMousePressed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    public void resetColor(int choice){
     c.gridx = 0;
        c.gridy = 0;
        switch(choice){
            case 1:
                recordtext.setForeground(white);
        recordicon.setIcon(new ImageIcon("src\\com\\oop\\waterbill\\Business Contact_35px_1.png"));
        recordpanel.setBackground(blue);
        inputtext.setForeground(white);
        inputicon.setIcon(new ImageIcon("src\\com\\oop\\waterbill\\Plus_25px.png"));
        inputpanel.setBackground(blue);
         //DynamicPanel.remove(records);
        //DynamicPanel.add(payment,c);
        //DynamicPanel.add(records,c);
        //payment.setVisible(false);
        records.setVisible(false);
        payment.setVisible(true);
                break;
            case 2:
                 inputtext.setForeground(white);
        inputicon.setIcon(new ImageIcon("src\\com\\oop\\waterbill\\Plus_25px.png"));
        inputpanel.setBackground(blue);
         paymenttext.setForeground(white);
        paymenticon.setIcon(new ImageIcon("src\\com\\oop\\waterbill\\Paycheque_35px.png"));
        paymentpanel.setBackground(blue);
         //DynamicPanel.remove(payment);
        //DynamicPanel.add(records,c);
       
       
records.setVisible(true); 
payment.setVisible(false);
        break;
            case 3:
                paymenttext.setForeground(white);
        paymenticon.setIcon(new ImageIcon("src\\com\\oop\\waterbill\\Paycheque_35px.png"));
        paymentpanel.setBackground(blue);
        recordtext.setForeground(white);
        recordicon.setIcon(new ImageIcon("src\\com\\oop\\waterbill\\Business Contact_35px_1.png"));
        recordpanel.setBackground(blue);
        records.setVisible(false);
                break;
            default:
                break;
        
        
        
        }
    
    
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DynamicPanel;
    private javax.swing.JLabel inputicon;
    private javax.swing.JPanel inputpanel;
    private javax.swing.JLabel inputtext;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel paymenticon;
    private javax.swing.JPanel paymentpanel;
    private javax.swing.JLabel paymenttext;
    private javax.swing.JLabel recordicon;
    private javax.swing.JPanel recordpanel;
    private javax.swing.JLabel recordtext;
    // End of variables declaration//GEN-END:variables
}