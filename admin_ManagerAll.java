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
public class admin_ManagerAll extends javax.swing.JFrame {

    public admin_ManagerAll() {
        initComponents();
    }
String url = "jdbc:oracle:thin:@workstation:1521:XE";
    String username = "raj";
    String password = "raj123";
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADD");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 230, 60, 30);

        jTextField1.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jTextField1.setText("jTextField1");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(270, 260, 100, 30);

        jTextField2.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jTextField2.setText("jTextField2");
        getContentPane().add(jTextField2);
        jTextField2.setBounds(270, 290, 100, 30);

        jTextField4.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jTextField4.setText("jTextField4");
        getContentPane().add(jTextField4);
        jTextField4.setBounds(270, 350, 100, 30);

        jTextField3.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jTextField3.setText("jTextField3");
        getContentPane().add(jTextField3);
        jTextField3.setBounds(270, 320, 100, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Manager ID", "Manager Name", "City", "Country"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(130, 10, 600, 220);

        jButton1.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(280, 390, 70, 30);

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("UPDATE");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 230, 78, 27);

        jTextField5.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jTextField5.setText("jTextField5");
        getContentPane().add(jTextField5);
        jTextField5.setBounds(150, 260, 90, 30);

        jTextField6.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jTextField6.setText("jTextField6");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6);
        jTextField6.setBounds(150, 290, 90, 30);

        jTextField7.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jTextField7.setText("jTextField7");
        getContentPane().add(jTextField7);
        jTextField7.setBounds(150, 320, 90, 30);

        jTextField8.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jTextField8.setText("jTextField8");
        getContentPane().add(jTextField8);
        jTextField8.setBounds(150, 350, 90, 30);

        jButton2.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(150, 390, 90, 30);

        jButton3.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(420, 300, 100, 30);

        jTextField9.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jTextField9.setText("jTextField9");
        getContentPane().add(jTextField9);
        jTextField9.setBounds(420, 260, 100, 30);

        jLabel4.setBackground(new java.awt.Color(204, 255, 255));
        jLabel4.setFont(new java.awt.Font("Nirmala UI", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DELETE");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(430, 230, 160, 30);

        jButton4.setBackground(new java.awt.Color(0, 153, 0));
        jButton4.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Save And Go Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(240, 430, 280, 50);

        jLabel6.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setText("Manager ID ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 270, 82, 20);

        jLabel7.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 51));
        jLabel7.setText("Manager Name");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 290, 130, 30);

        jLabel8.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 51));
        jLabel8.setText("City");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 320, 80, 30);

        jLabel9.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 51));
        jLabel9.setText("Country");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 350, 80, 30);

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-270, 0, 1020, 740);

        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(580, 260, 34, 14);

        setBounds(0, 0, 762, 541);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String Mid=jTextField1.getText();
        String Mname=jTextField2.getText();
        String Mcity=jTextField3.getText();
        String Mcountry=jTextField4.getText();
        int flag=0;
        String sql;
        try{
            Connection conn=DriverManager.getConnection(url,username,password);
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("select M_ID from manager");
            while(rs.next()){
                Object row[]=new Object[1];
                row[0]=rs.getObject(1).toString();
                if(row[0].equals(Mid)){
                    JOptionPane.showMessageDialog(this,"ERROR:Manager ID VIOLATION.");
                    flag=1;
                    break;
                }
            }
            rs.close();
            if(flag==0){
                sql="insert into manager values('"+Mid+"','"+Mname+"','"+Mcity+"','"+Mcountry+"')";
                stmt.execute(sql);
                JOptionPane.showMessageDialog(this,"NEW Manager ADDED!!");
            }
            DefaultTableModel tb1=(DefaultTableModel)jTable1.getModel();
            sql="select * from manager";
            ResultSet r=stmt.executeQuery(sql);
            tb1.setRowCount(0);
            while(r.next()){
                Object row[]=new Object[4];
                row[0]=r.getObject(1).toString();
                row[1]=r.getObject(2).toString();
                row[2]=r.getObject(3).toString();
                row[3]=r.getObject(4).toString();
                tb1.addRow(row);
            }
            r.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        /*if(flag==0){
            7         sql="insert into stadium values('"+Sid+"','"+Sname+"','"+Scapacity+"','"+Scountry+"')";
            try{
                Connection conn=DriverManager.getConnection(url,username,password);
                Statement stmt=conn.createStatement();
                stmt.execute(sql);
                JOptionPane.showMessageDialog(this,"NEW Stadium ADDED!!");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this,e.getMessage());

            }
        }*/
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String Mid=jTextField5.getText();
        String Mname=jTextField6.getText();
        String Mcity=jTextField7.getText();
        String Mcountry=jTextField8.getText();
        int flag=0;
        String sql;

        try{
            Connection conn=DriverManager.getConnection(url,username,password);
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("select M_ID from stadium");
            while(rs.next()){
                Object row[]=new Object[1];
                row[0]=rs.getObject(1).toString();
                if(row[0].equals(Mid)){
                    stmt.execute("update manager set MNAME='"+Mname+"',MCITY="+Mcity+",MCOUNTRY='"+Mcountry+"'  where M_ID="+Mid);
                    JOptionPane.showMessageDialog(null,"SUCCESSFUL","DONE!",JOptionPane.INFORMATION_MESSAGE);
                    flag=1;
                    break;
                }
            }
            rs.close();
            if(flag==0){
                JOptionPane.showMessageDialog(null,"UNSUCCESSFUL","Invalid manager ID !",JOptionPane.INFORMATION_MESSAGE);
            }
            DefaultTableModel tb1=(DefaultTableModel)jTable1.getModel();
            sql="select * from manager";
            ResultSet r=stmt.executeQuery(sql);
            tb1.setRowCount(0);
            while(r.next()){
                Object row[]=new Object[4];
                row[0]=r.getObject(1).toString();
                row[1]=r.getObject(2).toString();
                row[2]=r.getObject(3).toString();
                row[3]=r.getObject(4).toString();
                tb1.addRow(row);
            }
            r.close();

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String Mid=jTextField9.getText();
        int flag=0;
        String sql;
        try{
            Connection conn=DriverManager.getConnection(url,username,password);
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("select M_ID from stadium");
            while(rs.next()){
                Object row[]=new Object[1];
                row[0]=rs.getObject(1).toString();
                if(row[0].equals(Mid)){
                    sql="delete from manager where M_id='"+Mid+"'";
                    stmt.execute(sql);
                    JOptionPane.showMessageDialog(this,"DELETE DONE..SUCCESSFULLY!");
                    flag=1;
                    break;
                }
            }
            rs.close();
            if(flag==0){
                JOptionPane.showMessageDialog(this,"Manager ID NOT FOUND.");
            }
            DefaultTableModel tb1=(DefaultTableModel)jTable1.getModel();
            sql="select * from manager";
            ResultSet r=stmt.executeQuery(sql);
            tb1.setRowCount(0);
            while(r.next()){
                Object row[]=new Object[4];
                row[0]=r.getObject(1).toString();
                row[1]=r.getObject(2).toString();
                row[2]=r.getObject(3).toString();
                row[3]=r.getObject(4).toString();
                tb1.addRow(row);
            }
            r.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        DefaultTableModel tb1=(DefaultTableModel)jTable1.getModel();
        String sql="select * from manager";
        try{
            Connection conn=DriverManager.getConnection(url,username,password);
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            tb1.setRowCount(0);
            while(rs.next()){
                Object row[]=new Object[4];
                row[0]=rs.getObject(1).toString();
                row[1]=rs.getObject(2).toString();
                row[2]=rs.getObject(3).toString();
                row[3]=rs.getObject(4).toString();
                tb1.addRow(row);
                //System.out.println("LL");
            }
            rs.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_formWindowActivated

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        admin_home c=new admin_home();
        this.setVisible(false);
        c.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(admin_ManagerAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_ManagerAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_ManagerAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_ManagerAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_ManagerAll().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
