/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.app;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
/**
 *
 * @author admin
 */
public class Setting extends javax.swing.JFrame {

    /**
     * Creates new form Setting
     */
    public Setting() {
        initComponents();
    }
    
    Statement st;
    ResultSet rs;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnBACKTOHOME = new javax.swing.JButton();
        btnDANGXUAT = new javax.swing.JButton();
        btnDOIMATKHAU = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTENTAIKHOAN = new javax.swing.JTextField();
        txtMATKHAUCU = new javax.swing.JTextField();
        txtMATKHAUMOI = new javax.swing.JTextField();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBACKTOHOME.setText("BACK TO HOME");
        btnBACKTOHOME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBACKTOHOMEActionPerformed(evt);
            }
        });

        btnDANGXUAT.setText("Đăng xuất");
        btnDANGXUAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDANGXUATActionPerformed(evt);
            }
        });

        btnDOIMATKHAU.setText("Đổi mật khẩu");
        btnDOIMATKHAU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDOIMATKHAUActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Tên tài khoản ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Mật khẩu cũ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Mật khẩu mới");

        txtTENTAIKHOAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTENTAIKHOANActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnBACKTOHOME))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTENTAIKHOAN)
                            .addComponent(txtMATKHAUCU)
                            .addComponent(txtMATKHAUMOI, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(225, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnDANGXUAT)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnDOIMATKHAU)
                        .addGap(217, 217, 217))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnBACKTOHOME)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTENTAIKHOAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMATKHAUCU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMATKHAUMOI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(btnDOIMATKHAU)
                .addGap(32, 32, 32)
                .addComponent(btnDANGXUAT)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTENTAIKHOANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTENTAIKHOANActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTENTAIKHOANActionPerformed

    private void btnDANGXUATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDANGXUATActionPerformed
        // TODO add your handling code here:
        new DANGNHAP().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnDANGXUATActionPerformed

    private void btnDOIMATKHAUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDOIMATKHAUActionPerformed
        // TODO add your handling code here:
        try{  
            //chua code dang nhap
            
            Connection con = KETNOI.dbConnector();
            String sql = "SELECT * FROM Users Where ACCOUNTNAME = ? and PASSWORD = ? ";
            PreparedStatement ps = con.prepareCall(sql);
            ps.setString(1,txtTENTAIKHOAN.getText());
            ps.setString(2,txtMATKHAUCU.getText());
            rs=ps.executeQuery();
            String sqlb ="UPDATE users SET PASSWORD=? WHERE ACCOUNTNAME =?";
            
            if(txtTENTAIKHOAN.getText().equals("")||txtMATKHAUCU.getText().equals("")){
                JOptionPane.showMessageDialog(this,"KHONG DUOC DE TRONG THONG TIN");
            }
            else if(rs.next()){
                PreparedStatement statement =con.prepareStatement(sqlb);
                statement.setString(1, txtMATKHAUMOI.getText());
                statement.setString(2, txtTENTAIKHOAN.getText());
                int rowsUpdated =statement.executeUpdate();
                if(rowsUpdated>0){
                    JOptionPane.showMessageDialog(this, "DOI MAT KHAU THANH CONG");
                }
                new HOME().setVisible(true);
                dispose();
                
            }else {
                JOptionPane.showMessageDialog(this, "Tai khoan hoac mat khau sai");
            }

        } catch (Exception ex) {
            
        }
    }//GEN-LAST:event_btnDOIMATKHAUActionPerformed

    private void btnBACKTOHOMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBACKTOHOMEActionPerformed
        // TODO add your handling code here:
        new HOME().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBACKTOHOMEActionPerformed

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
            java.util.logging.Logger.getLogger(Setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Setting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBACKTOHOME;
    private javax.swing.JButton btnDANGXUAT;
    private javax.swing.JButton btnDOIMATKHAU;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtMATKHAUCU;
    private javax.swing.JTextField txtMATKHAUMOI;
    private javax.swing.JTextField txtTENTAIKHOAN;
    // End of variables declaration//GEN-END:variables
}