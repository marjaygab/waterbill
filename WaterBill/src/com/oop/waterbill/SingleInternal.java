/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oop.waterbill;

/**
 *
 * @author student
 */
public class SingleInternal extends javax.swing.JPanel {
    private boolean multiple = false;
    /**
     * Creates new form InputInternal
     */
    public SingleInternal(Boolean multiple) {
        initComponents();
        finishbuttoninternal.setEnabled(!multiple);
        finishbuttoninternal.setVisible(!multiple);
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
        jLabel6 = new javax.swing.JLabel();
        lastsingleinternal = new javax.swing.JTextField();
        firstsingleinternal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        middlesingleinternal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        agesingleinternal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        accountsingeinternal = new javax.swing.JTextField();
        gendersingleinternal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        homesingleinternal = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        areainternalcombo = new java.awt.Choice();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        coordinternalcombo = new java.awt.Choice();
        metersingleinternal = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        connectioninternalcombo = new java.awt.Choice();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        readingsingleinternal = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        clearbuttoninternal = new javax.swing.JButton();
        finishbuttoninternal = new javax.swing.JButton();
        confirmbuttoninternal = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(253, 253, 253));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Last Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        lastsingleinternal.setEditable(false);
        lastsingleinternal.setBackground(new java.awt.Color(253, 253, 253));
        lastsingleinternal.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(lastsingleinternal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 140, -1));

        firstsingleinternal.setEditable(false);
        firstsingleinternal.setBackground(new java.awt.Color(253, 253, 253));
        firstsingleinternal.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(firstsingleinternal, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 150, -1));

        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("First Name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        middlesingleinternal.setEditable(false);
        middlesingleinternal.setBackground(new java.awt.Color(253, 253, 253));
        middlesingleinternal.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(middlesingleinternal, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 120, -1));

        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Middle Name");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, -1, -1));

        agesingleinternal.setEditable(false);
        agesingleinternal.setBackground(new java.awt.Color(253, 253, 253));
        agesingleinternal.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(agesingleinternal, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 50, -1));

        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Age");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 70, -1));

        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Account Number");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        accountsingeinternal.setBackground(new java.awt.Color(253, 253, 253));
        accountsingeinternal.setForeground(new java.awt.Color(51, 51, 51));
        accountsingeinternal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountsingeinternalActionPerformed(evt);
            }
        });
        jPanel1.add(accountsingeinternal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 110, -1));

        gendersingleinternal.setEditable(false);
        gendersingleinternal.setBackground(new java.awt.Color(253, 253, 253));
        gendersingleinternal.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(gendersingleinternal, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 50, -1));

        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Area");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 70, -1));

        homesingleinternal.setEditable(false);
        homesingleinternal.setBackground(new java.awt.Color(253, 253, 253));
        homesingleinternal.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(homesingleinternal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 370, -1));

        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Home Address");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 100, -1));
        jPanel1.add(areainternalcombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 110, -1));

        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Gender");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 70, -1));

        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Coordinator");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 70, -1));
        jPanel1.add(coordinternalcombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 110, -1));

        metersingleinternal.setEditable(false);
        metersingleinternal.setBackground(new java.awt.Color(253, 253, 253));
        metersingleinternal.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(metersingleinternal, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 120, -1));

        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Meter No.");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 70, -1));
        jPanel1.add(connectioninternalcombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 180, -1));

        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Type of Connection");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 120, -1));

        jPanel2.setBackground(new java.awt.Color(134, 207, 190));

        readingsingleinternal.setBackground(new java.awt.Color(253, 253, 253));
        readingsingleinternal.setForeground(new java.awt.Color(51, 51, 51));

        jLabel17.setForeground(new java.awt.Color(253, 253, 253));
        jLabel17.setText("Reading");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(readingsingleinternal, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(readingsingleinternal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 250, 80));

        jPanel3.setBackground(new java.awt.Color(253, 253, 253));

        clearbuttoninternal.setBackground(new java.awt.Color(134, 207, 190));
        clearbuttoninternal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        clearbuttoninternal.setForeground(new java.awt.Color(255, 255, 255));
        clearbuttoninternal.setText("Clear");
        clearbuttoninternal.setContentAreaFilled(false);
        clearbuttoninternal.setOpaque(true);
        clearbuttoninternal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbuttoninternalActionPerformed(evt);
            }
        });

        finishbuttoninternal.setBackground(new java.awt.Color(134, 207, 190));
        finishbuttoninternal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        finishbuttoninternal.setForeground(new java.awt.Color(255, 255, 255));
        finishbuttoninternal.setText("Finish");
        finishbuttoninternal.setContentAreaFilled(false);
        finishbuttoninternal.setOpaque(true);

        confirmbuttoninternal.setBackground(new java.awt.Color(134, 207, 190));
        confirmbuttoninternal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        confirmbuttoninternal.setForeground(new java.awt.Color(255, 255, 255));
        confirmbuttoninternal.setText("Cofirm");
        confirmbuttoninternal.setContentAreaFilled(false);
        confirmbuttoninternal.setOpaque(true);
        confirmbuttoninternal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmbuttoninternalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(confirmbuttoninternal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clearbuttoninternal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(finishbuttoninternal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearbuttoninternal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(finishbuttoninternal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmbuttoninternal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 330, 80));

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void accountsingeinternalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountsingeinternalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountsingeinternalActionPerformed

    private void confirmbuttoninternalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmbuttoninternalActionPerformed
        // TODO add your handling code here:
        
        
        
        
        
        
        
    }//GEN-LAST:event_confirmbuttoninternalActionPerformed

    private void clearbuttoninternalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbuttoninternalActionPerformed
        // TODO add your handling code here:
        lastsingleinternal.setText("");
        firstsingleinternal.setText("");
        middlesingleinternal.setText("");
        agesingleinternal.setText("");
        gendersingleinternal.setText("");
        homesingleinternal.setText("");
        metersingleinternal.setText("");
        accountsingeinternal.setText("");
        
        
    }//GEN-LAST:event_clearbuttoninternalActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        A1Single_Bulk_Input  ok =  new A1Single_Bulk_Input();
       ok.getAccNum(accountsingeinternal.getText());
       
       lastsingleinternal.setText(ok.getlast_());
       firstsingleinternal.setText(ok.getfirst_());
       middlesingleinternal.setText(ok.getmiddle_());
       agesingleinternal.setText(ok.getage_());
       gendersingleinternal.setText(ok.getgender_());
       homesingleinternal.setText(ok.gethomeadd());
       metersingleinternal.setText(ok.getmeterno());
               

       
       
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountsingeinternal;
    private javax.swing.JTextField agesingleinternal;
    private java.awt.Choice areainternalcombo;
    private javax.swing.JButton clearbuttoninternal;
    private javax.swing.JButton confirmbuttoninternal;
    private java.awt.Choice connectioninternalcombo;
    private java.awt.Choice coordinternalcombo;
    private javax.swing.JButton finishbuttoninternal;
    private javax.swing.JTextField firstsingleinternal;
    private javax.swing.JTextField gendersingleinternal;
    private javax.swing.JTextField homesingleinternal;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField lastsingleinternal;
    private javax.swing.JTextField metersingleinternal;
    private javax.swing.JTextField middlesingleinternal;
    private javax.swing.JTextField readingsingleinternal;
    // End of variables declaration//GEN-END:variables
}
