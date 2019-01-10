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
public class admin_PlayerALL extends javax.swing.JFrame {
    
    public admin_PlayerALL() {
        initComponents();
    }
String url = "jdbc:oracle:thin:@workstation:1521:XE";
    String username = "raj";
    String password = "raj123";
    //String pos,pos1;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADD");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(320, 190, 80, 40);

        jButton1.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(310, 470, 80, 30);

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("UPDATE");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 190, 80, 30);

        jTable1.setFont(new java.awt.Font("Nirmala UI", 0, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Player ID", "Player Name", "Country", "Rating", "Cost", "position"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(160, 10, 580, 180);

        jButton2.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(150, 470, 90, 30);

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DELETE");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(470, 190, 80, 40);

        jTextField9.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jTextField9.setText("jTextField9");
        getContentPane().add(jTextField9);
        jTextField9.setBounds(460, 230, 80, 30);

        jButton3.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(460, 270, 90, 30);

        jTextField10.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jTextField10.setText("jTextField10");
        getContentPane().add(jTextField10);
        jTextField10.setBounds(150, 390, 90, 30);

        jTextField11.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jTextField11.setText("jTextField11");
        getContentPane().add(jTextField11);
        jTextField11.setBounds(300, 390, 90, 30);

        jComboBox1.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(310, 430, 80, 30);

        jComboBox2.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(150, 430, 90, 30);

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
        jButton4.setBounds(430, 470, 280, 50);

        jTextField1.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jTextField1.setText("jTextField1");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(300, 230, 90, 30);

        jTextField2.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jTextField2.setText("jTextField2");
        getContentPane().add(jTextField2);
        jTextField2.setBounds(300, 270, 90, 30);

        jTextField3.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jTextField3.setText("jTextField3");
        getContentPane().add(jTextField3);
        jTextField3.setBounds(300, 310, 90, 30);

        jTextField4.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jTextField4.setText("jTextField4");
        getContentPane().add(jTextField4);
        jTextField4.setBounds(300, 350, 90, 30);

        jTextField13.setText("jTextField1");
        getContentPane().add(jTextField13);
        jTextField13.setBounds(300, 230, 80, 30);

        jTextField14.setText("jTextField2");
        getContentPane().add(jTextField14);
        jTextField14.setBounds(300, 270, 80, 30);

        jTextField15.setText("jTextField3");
        getContentPane().add(jTextField15);
        jTextField15.setBounds(300, 310, 80, 30);

        jTextField16.setText("jTextField4");
        getContentPane().add(jTextField16);
        jTextField16.setBounds(300, 350, 80, 30);

        jTextField5.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jTextField5.setText("jTextField5");
        getContentPane().add(jTextField5);
        jTextField5.setBounds(150, 230, 90, 30);

        jTextField6.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jTextField6.setText("jTextField6");
        getContentPane().add(jTextField6);
        jTextField6.setBounds(150, 270, 90, 30);

        jTextField7.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jTextField7.setText("jTextField7");
        getContentPane().add(jTextField7);
        jTextField7.setBounds(150, 310, 90, 30);

        jTextField8.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jTextField8.setText("jTextField8");
        getContentPane().add(jTextField8);
        jTextField8.setBounds(150, 350, 90, 30);

        jLabel5.setBackground(new java.awt.Color(255, 0, 51));
        jLabel5.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabel5.setText("Player ID");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 230, 100, 30);

        jLabel6.setBackground(new java.awt.Color(255, 0, 51));
        jLabel6.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabel6.setText("Player Name");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 270, 100, 30);

        jLabel7.setBackground(new java.awt.Color(255, 0, 51));
        jLabel7.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabel7.setText("Country");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 310, 100, 30);

        jLabel8.setBackground(new java.awt.Color(255, 0, 51));
        jLabel8.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabel8.setText("Rating");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 354, 100, 30);

        jLabel9.setBackground(new java.awt.Color(255, 0, 51));
        jLabel9.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabel9.setText("Cost");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 390, 100, 30);

        jLabel10.setBackground(new java.awt.Color(255, 0, 51));
        jLabel10.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabel10.setText("Position");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 430, 100, 30);

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 2, 16)); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 150, 80, 30);

        jLabel11.setBackground(new java.awt.Color(255, 0, 51));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(-340, -20, 1090, 630);

        setBounds(0, 0, 756, 567);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String Pid=jTextField1.getText();
        String Pname=jTextField2.getText();
        String Pcountry=jTextField3.getText();
        String Prating=jTextField4.getText();
        String Pcost=jTextField11.getText();
        String pos=jComboBox1.getItemAt(jComboBox1.getSelectedIndex());
        int flag=0;
        String sql;
        try{
            Connection conn=DriverManager.getConnection(url,username,password);
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("select P_ID from player");
            while(rs.next()){
                Object row[]=new Object[1];
                row[0]=rs.getObject(1).toString();
                if(row[0].equals(Pid)){
                    JOptionPane.showMessageDialog(this,"ERROR:Player ID VIOLATION.");
                    flag=1;
                    break;
                }
            }
            rs.close();
            if(flag==0){
                sql="insert into stadium values('"+Pid+"','"+Pname+"','"+Pcountry+"','"+Prating+"','"+Pcost+"','"+pos+"')";
                stmt.execute(sql);
                JOptionPane.showMessageDialog(this,"NEW Player ADDED!!");
            }
            DefaultTableModel tb1=(DefaultTableModel)jTable1.getModel();
            sql="select * from player";
            ResultSet r=stmt.executeQuery(sql);
            tb1.setRowCount(0);
            while(r.next()){
                Object row[]=new Object[5];
                row[0]=r.getObject(1).toString();
                row[1]=r.getObject(2).toString();
                row[2]=r.getObject(3).toString();
                row[3]=r.getObject(4).toString();
                row[4]=r.getObject(5).toString();
                tb1.addRow(row);
            }
            r.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String Pid=jTextField5.getText();
        String Pname=jTextField6.getText();
        String Pcountry=jTextField7.getText();
        String Prating=jTextField8.getText();
        String Pcost=jTextField10.getText();
        String pos1=jComboBox1.getItemAt(jComboBox1.getSelectedIndex());
        int flag=0;
        String sql;

        try{
            Connection conn=DriverManager.getConnection(url,username,password);
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("select P_ID from stadium");
            while(rs.next()){
                Object row[]=new Object[1];
                row[0]=rs.getObject(1).toString();
                if(row[0].equals(Pid)){
                    stmt.execute("update player set PNAME='"+Pname+"',PCOUNTRY='"+Pcountry+"',Prating='"+Prating+"',PCOST='"+Pcost+"',POS='"+pos1+"'  where P_ID="+Pid);
                    JOptionPane.showMessageDialog(null,"SUCCESSFUL","DONE!",JOptionPane.INFORMATION_MESSAGE);
                    flag=1;
                    break;
                }
            }
            rs.close();
            if(flag==0){
                JOptionPane.showMessageDialog(null,"UNSUCCESSFUL","Invalid Player ID !",JOptionPane.INFORMATION_MESSAGE);
            }
            DefaultTableModel tb1=(DefaultTableModel)jTable1.getModel();
            sql="select * from player";
            ResultSet r=stmt.executeQuery(sql);
            tb1.setRowCount(0);
            while(r.next()){
                Object row[]=new Object[5];
                row[0]=r.getObject(1).toString();
                row[1]=r.getObject(2).toString();
                row[2]=r.getObject(3).toString();
                row[3]=r.getObject(4).toString();
                row[4]=r.getObject(5).toString();
                tb1.addRow(row);
            }
            r.close();

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String Pid=jTextField9.getText();
        int flag=0;
        String sql;
        try{
            Connection conn=DriverManager.getConnection(url,username,password);
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("select P_ID from player");
            while(rs.next()){
                Object row[]=new Object[1];
                row[0]=rs.getObject(1).toString();
                if(row[0].equals(Pid)){
                    sql="delete from player where P_id='"+Pid+"'";
                    stmt.execute(sql);
                    JOptionPane.showMessageDialog(this,"DELETE DONE..SUCCESSFULLY!");
                    flag=1;
                    break;
                }
            }
            rs.close();
            if(flag==0){
                JOptionPane.showMessageDialog(this,"Player ID NOT FOUND.");
            }
            DefaultTableModel tb1=(DefaultTableModel)jTable1.getModel();
            sql="select * from player";
            ResultSet r=stmt.executeQuery(sql);
            tb1.setRowCount(0);
            while(r.next()){
                Object row[]=new Object[5];
                row[0]=r.getObject(1).toString();
                row[1]=r.getObject(2).toString();
                row[2]=r.getObject(3).toString();
                row[3]=r.getObject(4).toString();
                row[4]=r.getObject(5).toString();
                tb1.addRow(row);
            }
            r.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        //String country[]={"India","Aus","U.S.A","England","Newzealand"};
        jComboBox1.addItem("GoalKeeper");
        jComboBox1.addItem("Attacker");
        jComboBox1.addItem("Midfielder");
        jComboBox1.addItem("Defender");

        String pos=jComboBox1.getItemAt(jComboBox1.getSelectedIndex());
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        jComboBox1.addItem("GoalKeeper");
        jComboBox1.addItem("Attacker");
        jComboBox1.addItem("Midfielder");
        jComboBox1.addItem("Defender");

        //pos1=jComboBox1.getItemAt(jComboBox1.getSelectedIndex());
    }//GEN-LAST:event_jComboBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(admin_PlayerALL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_PlayerALL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_PlayerALL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_PlayerALL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_PlayerALL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
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
