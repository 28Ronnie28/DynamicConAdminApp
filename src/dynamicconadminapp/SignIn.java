/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicconadminapp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Ronnie
 */
public class SignIn extends javax.swing.JFrame {
Connection con = null;
ResultSet rs;
PreparedStatement pstmt = null;
    /**
     * Creates new form SignIn
     */
    public SignIn(Connection con) {
        this.con = con;
        initComponents();
        setLocationRelativeTo(null);
        jPanel2.setBackground(Color.darkGray);
        
        setBackground();
    }
    
    public void setBackground(){
        JLabel backgroundLbl = new JLabel();
        setLayout(new BorderLayout());
        add(backgroundLbl);
        backgroundLbl.setIcon(new ImageIcon(new ImageIcon(SignIn.class.getResource("/Resources/Pic1.jpg")).getImage().getScaledInstance(1360, 768, java.awt.Image.SCALE_SMOOTH)));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Usernametxf = new javax.swing.JTextField();
        Passwordtxf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        SignInbtn = new javax.swing.JButton();
        ForgotPlbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1360, 768));
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Sign In");

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.setInheritsPopupMenu(true);
        jPanel2.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Password:");

        Usernametxf.setBackground(new java.awt.Color(102, 102, 102));
        Usernametxf.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        Usernametxf.setForeground(new java.awt.Color(0, 0, 0));

        Passwordtxf.setBackground(new java.awt.Color(102, 102, 102));
        Passwordtxf.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        Passwordtxf.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Username:");

        SignInbtn.setBackground(new java.awt.Color(102, 102, 102));
        SignInbtn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        SignInbtn.setForeground(new java.awt.Color(0, 0, 0));
        SignInbtn.setText("Sign In");
        SignInbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInbtnActionPerformed(evt);
            }
        });

        ForgotPlbl.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        ForgotPlbl.setForeground(new java.awt.Color(0, 0, 0));
        ForgotPlbl.setText("Forgot Password?");
        ForgotPlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ForgotPlblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SignInbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Usernametxf, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Passwordtxf, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ForgotPlbl)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Usernametxf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Passwordtxf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(ForgotPlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addComponent(SignInbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(jLabel2)))
                .addContainerGap(321, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(257, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(201, 201, 201))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SignInbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInbtnActionPerformed
boolean flag = false;

try {
    pstmt = con.prepareStatement("SELECT Username,UPassword,FirstName,AdminOrUser FROM SignInInfo;");
    rs = pstmt.executeQuery();
    
    while(rs.next()){
        if (Usernametxf.getText().matches(rs.getString("Username"))){
            if (Passwordtxf.getText().matches(rs.getString("UPassword"))){;
                DynamicConAdminApp.CurrentUser = rs.getString("FirstName");
                flag = true;       
            }
        }
    }    
} catch (SQLException ex) {
    Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
}

if(flag==true){
    this.dispose();
    JOptionPane.showMessageDialog(null, "You successfully logged in.");
    new Home(con).setVisible(true);
}else{ 
    JOptionPane.showMessageDialog(null, "Incorrect Name or Password!!!");
}    
    }//GEN-LAST:event_SignInbtnActionPerformed

    private void ForgotPlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForgotPlblMouseClicked
String Uname = JOptionPane.showInputDialog("Username?");    

try {
    pstmt = con.prepareStatement("SELECT Username,SecurityQuestion,SecurityAnswer,UPassword FROM SignInInfo WHERE Username = '"+Uname+"';");
    rs = pstmt.executeQuery();
    while(rs.next()){
        if(rs.getString("Username").matches(Uname)){
            String Answer = JOptionPane.showInputDialog(rs.getString("SecurityQuestion"));
            if(Answer.matches(rs.getString("SecurityAnswer"))){
                JOptionPane.showMessageDialog(this, "Correct! Your Password Was "+rs.getString("UPassword"));
            }else{
                JOptionPane.showMessageDialog(this, "Incorrect Answer!");
            }
        }
    }
    if(rs.wasNull()){
        JOptionPane.showMessageDialog(this, "No Such Username!"); //werk nie dunno
    }
} catch (SQLException ex) {
    Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
}
    }//GEN-LAST:event_ForgotPlblMouseClicked

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
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new SignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ForgotPlbl;
    private javax.swing.JTextField Passwordtxf;
    private javax.swing.JButton SignInbtn;
    private javax.swing.JTextField Usernametxf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}