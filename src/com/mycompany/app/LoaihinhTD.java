/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.app;

import dao.LoadDAO;
import entity.loaihinhtd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class LoaihinhTD extends javax.swing.JFrame {

    /**
     * Creates new form LoaihinhTD
     */
    public LoaihinhTD() {
        initComponents();
        LoadDAO loadDAO = new LoadDAO();
        List<loaihinhtd> listIns = loadDAO.getAllloaihinhtd();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        for (loaihinhtd o : listIns) {
            model.addRow(new Object[]{o.getMa(), o.getLoai(),
                o.getTime(), o.getKcal()});
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

        txtLOAIHD = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtTIME = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtKCAL = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnTHEMLICH = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnUPDATE = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txtMA = new javax.swing.JTextField();
        txtMALICH = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtLOAIHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLOAIHDActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon("E:\\ABC\\icons8-home-page-34.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtTIME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTIMEActionPerformed(evt);
            }
        });

        jLabel1.setText("HOME");

        txtKCAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKCALActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã TD", "Loại hình", "Thời gian tâp", "KCAL tiêu thụ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Tập luyện thôi nào!");

        btnTHEMLICH.setText("Thêm vào lịch");
        btnTHEMLICH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTHEMLICHActionPerformed(evt);
            }
        });

        jButton2.setText("Thêm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnUPDATE.setText("Update");
        btnUPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUPDATEActionPerformed(evt);
            }
        });

        jButton5.setText("Xóa");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel3.setText("Mã TD muốn thêm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addGap(86, 86, 86)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtMA, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addComponent(txtLOAIHD, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTIME)
                                        .addGap(28, 28, 28)
                                        .addComponent(txtKCAL, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(btnUPDATE)
                                                .addComponent(jButton2)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnTHEMLICH)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(txtMALICH, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(11, 11, 11))
                                            .addComponent(jLabel3))
                                        .addGap(81, 81, 81)))))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLOAIHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTIME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKCAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(btnUPDATE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(13, 13, 13)
                        .addComponent(txtMALICH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTHEMLICH)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLOAIHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLOAIHDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLOAIHDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here
        new HOME().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtTIMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTIMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTIMEActionPerformed

    private void txtKCALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKCALActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKCALActionPerformed
    
    
    private void btnTHEMLICHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTHEMLICHActionPerformed
        // TODO add your handling code here:
        //them du lieu vao lich
        int id;
        int tt=0;
        Statement st;
        ResultSet rs;

        Statement st5;
        ResultSet rs5;
        
        String accountname = DANGNHAP.ACCOUNTNAME;
        try {
            Connection con = KETNOI.dbConnector();
            String sql = "SELECT * FROM users Where ACCOUNTNAME = ? ";
            PreparedStatement ps = con.prepareCall(sql);
            ps.setString(1, accountname);
            rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println("TIM DU LIEU THANH CONG");
            }
            id = rs.getInt(1);
            String matd =txtMALICH.getText();
            int matd1= Integer.parseInt(matd);

            String sqld = "UPDATE lichtrinh SET MA_TD = ?,TRANGTHAI=? WHERE ID =?";

            PreparedStatement psd = con.prepareStatement(sqld);
            psd.setInt(1, matd1);
            psd.setInt(2, 0);
            psd.setInt(3,id);
            int nd = psd.executeUpdate();
        } catch (Exception e) {
        }

        new LICH().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTHEMLICHActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String ma = txtMA.getText();
        String loai = txtLOAIHD.getText();
        String time = txtTIME.getText();
        String kcal = txtKCAL.getText();

        int ma1 = Integer.parseInt(ma);
        int time1 = Integer.parseInt(time);
        int kcal1 = Integer.parseInt(kcal);

        LoadDAO loadDAO = new LoadDAO();

        loadDAO.insert(ma1, loai, time1, kcal1);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        while (model.getRowCount() != 0) {
            model.removeRow(0);
        }

        List<loaihinhtd> listIns = loadDAO.getAllloaihinhtd();
        for (loaihinhtd o : listIns) {
            model.addRow(new Object[]{o.getMa(), o.getLoai(),
                o.getTime(), o.getKcal()});
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        String ma = jTable1.getValueAt(row, 0).toString();
        String loai = jTable1.getValueAt(row, 1).toString();
        String time = jTable1.getValueAt(row, 2).toString();
        String kcal = jTable1.getValueAt(row, 3).toString();

        txtMA.setText(ma);
        txtMALICH.setText(ma);
        txtLOAIHD.setText(loai);
        txtTIME.setText(time);
        txtKCAL.setText(kcal);


    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_jTable1KeyReleased

    private void btnUPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUPDATEActionPerformed
        // TODO add your handling code here:

        String ma = txtMA.getText();
        String loai = txtLOAIHD.getText();
        String time = txtTIME.getText();
        String kcal = txtKCAL.getText();

        int ma1 = Integer.parseInt(ma);
        int time1 = Integer.parseInt(time);
        int kcal1 = Integer.parseInt(kcal);

        LoadDAO loadDAO = new LoadDAO();

        loadDAO.update(ma1, loai, time1, kcal1);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        while (model.getRowCount() != 0) {
            model.removeRow(0);
        }

        List<loaihinhtd> listIns = loadDAO.getAllloaihinhtd();
        for (loaihinhtd o : listIns) {
            model.addRow(new Object[]{o.getMa(), o.getLoai(),
                o.getTime(), o.getKcal()});
        }

    }//GEN-LAST:event_btnUPDATEActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String ma = txtMA.getText();
        int ma1 = Integer.parseInt(ma);

        LoadDAO loadDAO = new LoadDAO();

        loadDAO.delete(ma1);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        while (model.getRowCount() != 0) {
            model.removeRow(0);
        }

        List<loaihinhtd> listIns = loadDAO.getAllloaihinhtd();
        for (loaihinhtd o : listIns) {
            model.addRow(new Object[]{o.getMa(), o.getLoai(),
                o.getTime(), o.getKcal()});
        }
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(LoaihinhTD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoaihinhTD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoaihinhTD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoaihinhTD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoaihinhTD().setVisible(true);

            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTHEMLICH;
    private javax.swing.JButton btnUPDATE;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtKCAL;
    private javax.swing.JTextField txtLOAIHD;
    private javax.swing.JTextField txtMA;
    private javax.swing.JTextField txtMALICH;
    private javax.swing.JTextField txtTIME;
    // End of variables declaration//GEN-END:variables

    private static class loadDao {

        private static void update(String ma, String loai, String time, String kcal) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public loadDao() {
        }
    }

}
