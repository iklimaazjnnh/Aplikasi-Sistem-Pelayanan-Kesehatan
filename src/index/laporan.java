/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package index;
import javax.swing.JFrame;
import java.sql.*;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import koneksi.koneksi;
/**
 *
 * @author User
 */
public class laporan extends javax.swing.JFrame {
private Connection conn = new koneksi().connect();
    /**
     * Creates new form laporan
     */
    public laporan() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblhome = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btndokter = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnpasien = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        btnadmin = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        btnobat = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        btnkonsul = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        btnpembayaran = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setRequestFocusEnabled(false);
        jPanel6.setVerifyInputWhenFocusTarget(false);

        jPanel3.setBackground(new java.awt.Color(195, 208, 222));
        jPanel3.setRequestFocusEnabled(false);
        jPanel3.setVerifyInputWhenFocusTarget(false);

        lblhome.setBackground(new java.awt.Color(255, 255, 255));
        lblhome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblhome.setForeground(new java.awt.Color(0, 0, 204));
        lblhome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblhome.setText("MENU");
        lblhome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblhome.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        lblhome.setOpaque(true);
        lblhome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblhomeMouseClicked(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("KONSULTASI");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.setOpaque(true);
        jLabel7.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jLabel7ComponentAdded(evt);
            }
        });
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DATA OBAT");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PEMBAYARAN");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(195, 208, 222));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("LAPORAN");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.setOpaque(true);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 204));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("PENDAFTARAN");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.setOpaque(true);
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 204));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("DOKTER");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.setOpaque(true);
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(525, Short.MAX_VALUE)
                .addComponent(lblhome, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblhome, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 0, 1280, 170);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setLayout(null);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/lap dokter.png"))); // NOI18N
        jPanel2.add(jLabel12);
        jLabel12.setBounds(0, 0, 260, 190);

        btndokter.setBackground(new java.awt.Color(0, 0, 204));
        btndokter.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btndokter.setForeground(new java.awt.Color(255, 255, 255));
        btndokter.setText("LAPORAN DATA DOKTER");
        btndokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndokterActionPerformed(evt);
            }
        });
        jPanel2.add(btndokter);
        btndokter.setBounds(0, 190, 260, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(200, 60, 260, 226);

        jPanel4.setLayout(null);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/lap pasien.png"))); // NOI18N
        jPanel4.add(jLabel11);
        jLabel11.setBounds(0, 0, 260, 190);

        btnpasien.setBackground(new java.awt.Color(0, 0, 204));
        btnpasien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnpasien.setForeground(new java.awt.Color(255, 255, 255));
        btnpasien.setText("LAPORAN DATA PASIEN");
        btnpasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpasienActionPerformed(evt);
            }
        });
        jPanel4.add(btnpasien);
        btnpasien.setBounds(0, 190, 260, 40);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(510, 60, 260, 226);

        jPanel5.setLayout(null);

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/lap admin.png"))); // NOI18N
        jPanel5.add(jLabel18);
        jLabel18.setBounds(0, 0, 260, 190);

        btnadmin.setBackground(new java.awt.Color(0, 0, 204));
        btnadmin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnadmin.setForeground(new java.awt.Color(255, 255, 255));
        btnadmin.setText("LAPORAN DATA ADMIN");
        btnadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadminActionPerformed(evt);
            }
        });
        jPanel5.add(btnadmin);
        btnadmin.setBounds(0, 190, 260, 40);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(850, 310, 260, 226);

        jPanel7.setLayout(null);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/lap obat.png"))); // NOI18N
        jPanel7.add(jLabel13);
        jLabel13.setBounds(0, 0, 260, 190);

        btnobat.setBackground(new java.awt.Color(0, 0, 204));
        btnobat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnobat.setForeground(new java.awt.Color(255, 255, 255));
        btnobat.setText("LAPORAN DATA OBAT");
        btnobat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnobatActionPerformed(evt);
            }
        });
        jPanel7.add(btnobat);
        btnobat.setBounds(0, 190, 260, 40);

        jPanel1.add(jPanel7);
        jPanel7.setBounds(850, 60, 260, 226);

        jPanel8.setLayout(null);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/lap konsultasi.png"))); // NOI18N
        jPanel8.add(jLabel14);
        jLabel14.setBounds(0, 0, 260, 190);

        btnkonsul.setBackground(new java.awt.Color(0, 0, 204));
        btnkonsul.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnkonsul.setForeground(new java.awt.Color(255, 255, 255));
        btnkonsul.setText("LAPORAN DATA KONSULTASI");
        btnkonsul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkonsulActionPerformed(evt);
            }
        });
        jPanel8.add(btnkonsul);
        btnkonsul.setBounds(0, 190, 260, 40);

        jPanel1.add(jPanel8);
        jPanel8.setBounds(200, 310, 260, 226);

        jPanel9.setLayout(null);

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/lap uang.png"))); // NOI18N
        jPanel9.add(jLabel17);
        jLabel17.setBounds(0, 0, 260, 190);

        btnpembayaran.setBackground(new java.awt.Color(0, 0, 204));
        btnpembayaran.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnpembayaran.setForeground(new java.awt.Color(255, 255, 255));
        btnpembayaran.setText("LAPORAN DATA PEMBAYARAN");
        btnpembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpembayaranActionPerformed(evt);
            }
        });
        jPanel9.add(btnpembayaran);
        btnpembayaran.setBounds(0, 190, 260, 40);

        jPanel1.add(jPanel9);
        jPanel9.setBounds(510, 310, 260, 226);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 170, 1280, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblhomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblhomeMouseClicked
        // TODO add your handling code here:
        new home().show();
    }//GEN-LAST:event_lblhomeMouseClicked

    private void jLabel7ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jLabel7ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7ComponentAdded

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        new konsultasi().show();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        new dataobat().show();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        new pembayaran().show();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        new pasien().show();
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        new Dokter().show();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void btndokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndokterActionPerformed
    try {
        String path = "./src/laporanproject/dokter.jrxml";
        HashMap parameter = new HashMap();
        JasperPrint print = JasperFillManager.fillReport(path, parameter, conn);

        JasperViewer.viewReport(print, false);
    } catch (Exception ex) {
         JOptionPane.showMessageDialog(rootPane,"dokumen tidak ada"+ex);
    }
    }//GEN-LAST:event_btndokterActionPerformed

    private void btnpasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpasienActionPerformed
         try {
        String path = "./src/laporanproject/pasien.jrxml";
        HashMap parameter = new HashMap();
        JasperPrint print = JasperFillManager.fillReport(path, parameter, conn);

        JasperViewer.viewReport(print, false);
    } catch (Exception ex) {
         JOptionPane.showMessageDialog(rootPane,"dokumen tidak ada"+ex);
    }
    }//GEN-LAST:event_btnpasienActionPerformed

    private void btnobatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnobatActionPerformed
        try {
        String path = "./src/laporanproject/obat.jrxml";
        HashMap parameter = new HashMap();
        JasperPrint print = JasperFillManager.fillReport(path, parameter, conn);

        JasperViewer.viewReport(print, false);
    } catch (Exception ex) {
         JOptionPane.showMessageDialog(rootPane,"dokumen tidak ada"+ex);
    }
    }//GEN-LAST:event_btnobatActionPerformed

    private void btnkonsulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkonsulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnkonsulActionPerformed

    private void btnpembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpembayaranActionPerformed

    }//GEN-LAST:event_btnpembayaranActionPerformed

    private void btnadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadminActionPerformed
         try {
        String path = "./src/laporanproject/admin.jrxml";
        HashMap parameter = new HashMap();
        JasperPrint print = JasperFillManager.fillReport(path, parameter, conn);

        JasperViewer.viewReport(print, false);
    } catch (Exception ex) {
         JOptionPane.showMessageDialog(rootPane,"dokumen tidak ada"+ex);
    }
    }//GEN-LAST:event_btnadminActionPerformed

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
            java.util.logging.Logger.getLogger(laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new laporan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadmin;
    private javax.swing.JButton btndokter;
    private javax.swing.JButton btnkonsul;
    private javax.swing.JButton btnobat;
    private javax.swing.JButton btnpasien;
    private javax.swing.JButton btnpembayaran;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblhome;
    // End of variables declaration//GEN-END:variables
}
