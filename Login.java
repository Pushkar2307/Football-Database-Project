/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import wc.Fan_selectClub;
import wc.admin_home;
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    static String type;
    public Login(String abc) {
        type=abc;
        initComponents();
    }
    String url="jdbc:oracle:thin:@DESKTOP-08UAP4B:1521:XE";
    String username="push";
    String password="umsy0410";

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel1.setText("Username");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(156, 170, 90, 25);

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel2.setText("Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(156, 261, 80, 25);

        jTextField1.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jTextField1.setText("jTextField1");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(383, 170, 62, 22);

        jPasswordField1.setText("jPasswordField1");
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(379, 263, 111, 20);

        jButton1.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(268, 376, 85, 29);

        jLabel3.setFont(new java.awt.Font("Yu Gothic Medium", 0, 36)); // NOI18N
        jLabel3.setText("Login");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(260, 70, 190, 58);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/bg4.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-6, 0, 640, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String user=jTextField1.getText();
        String pass=new String(jPasswordField1.getPassword());
        try{
            Connection conn=DriverManager.getConnection(url,username,password);
            Statement stmt=conn.createStatement();
            //Statement stmt2=conn.createStatement();
            if(stmt.execute("select username,password from user where username='"+user+"','"+"and password='"+pass+"'"+"and role='"+type+"'"))
            {
                JOptionPane.showMessageDialog(this,"Successful Login!!");
                if(type.equals("Admin"))
                {
                    this.setVisible(false);
                    new admin_home().setVisible(true);
                }
                if(type.equals("Fan"))
                {
                    this.setVisible(false);
                    new Fan_selectClub(user).setVisible(true);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Invalid Login.Try Again!");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login(type).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
