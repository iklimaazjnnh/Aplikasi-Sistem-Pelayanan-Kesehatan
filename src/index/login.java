/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package index;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import koneksi.koneksi;
/**
 *
 * @author User
 */
public class login extends javax.swing.JFrame {
    private Connection conn = new koneksi().connect();
    /**
     * Creates new form login
     */
    public login() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblpw = new javax.swing.JLabel();
        lblid = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtpw = new javax.swing.JPasswordField();
        btnlogin = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(226, 245, 245));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setRequestFocusEnabled(false);
        jPanel3.setVerifyInputWhenFocusTarget(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(8, 36, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SIGN IN");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 50, 510, 44);

        lblpw.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblpw.setForeground(new java.awt.Color(8, 36, 204));
        lblpw.setText("Password");
        jPanel2.add(lblpw);
        lblpw.setBounds(110, 250, 115, 29);

        lblid.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblid.setForeground(new java.awt.Color(8, 36, 204));
        lblid.setText("ID");
        jPanel2.add(lblid);
        lblid.setBounds(110, 140, 30, 29);

        txtid.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtid.setForeground(new java.awt.Color(8, 36, 204));
        txtid.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(8, 36, 204)));
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        jPanel2.add(txtid);
        txtid.setBounds(110, 190, 280, 28);

        txtpw.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtpw.setForeground(new java.awt.Color(8, 36, 204));
        txtpw.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtpw.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(8, 36, 204)));
        jPanel2.add(txtpw);
        txtpw.setBounds(110, 300, 280, 28);

        btnlogin.setBackground(new java.awt.Color(8, 36, 204));
        btnlogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(255, 255, 255));
        btnlogin.setText("Login");
        btnlogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlogin.setOpaque(false);
        btnlogin.setSelected(true);
        btnlogin.setVerifyInputWhenFocusTarget(false);
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        jPanel2.add(btnlogin);
        btnlogin.setBounds(150, 380, 200, 40);

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 510, 490));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 720));

        jPanel4.setBackground(new java.awt.Color(8, 36, 204));
        jPanel4.setForeground(new java.awt.Color(0, 0, 102));
        jPanel4.setRequestFocusEnabled(false);
        jPanel4.setVerifyInputWhenFocusTarget(false);
        jPanel4.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Punya gua\\PS TONI\\logo apetik.png")); // NOI18N
        jPanel5.add(jLabel1);
        jLabel1.setBounds(100, 190, 300, 90);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(8, 36, 204));
        jLabel3.setText("We Take Care Our Patient Health");
        jPanel5.add(jLabel3);
        jLabel3.setBounds(140, 280, 230, 17);

        jPanel4.add(jPanel5);
        jPanel5.setBounds(0, 120, 510, 490);

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 640, 720));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1280, 780);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "SELECT * FROM admin WHERE id_admin='"+txtid.getText()+"' AND password='"+txtpw.getText()+"'";
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            if(hasil.next()){
                
                userid.setUserLogin(hasil.getString("id_admin"));
                JOptionPane.showMessageDialog(null, "Berhasil Login");
                
                this.setVisible(false);
                new home().setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null, "Id atau Password Salah");
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Gagal Login!!!" +e);
        }
    }//GEN-LAST:event_btnloginActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lblpw;
    private javax.swing.JTextField txtid;
    private javax.swing.JPasswordField txtpw;
    // End of variables declaration//GEN-END:variables
}