import java.sql.*;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Registration extends javax.swing.JFrame {

    /**
     * Creates new form Registration
     */
    public Registration() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NAME_LB = new javax.swing.JLabel();
        NAME_TF = new javax.swing.JTextField();
        PASSWORD_LB = new javax.swing.JLabel();
        PASSWORD_PF = new javax.swing.JPasswordField();
        USERNAME_LB = new javax.swing.JLabel();
        USERNAME_TF = new javax.swing.JTextField();
        AVAILABILITY_LB = new javax.swing.JLabel();
        PHONENO_LB = new javax.swing.JLabel();
        PHONENO_TF = new javax.swing.JTextField();
        CARDNO_LB = new javax.swing.JLabel();
        CARDNO_TF = new javax.swing.JTextField();
        SUBMIT_BT = new javax.swing.JButton();
        EXIT_BT = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Virtual DJ", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("REGISTRATION : PLEASE ENTER INFORMATION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("HOME");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 15, -1, 30));

        NAME_LB.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        NAME_LB.setForeground(new java.awt.Color(0, 102, 51));
        NAME_LB.setText("NAME");
        getContentPane().add(NAME_LB, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 50, -1));
        getContentPane().add(NAME_TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 130, -1));

        PASSWORD_LB.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        PASSWORD_LB.setForeground(new java.awt.Color(0, 102, 51));
        PASSWORD_LB.setText("PASSWORD");
        getContentPane().add(PASSWORD_LB, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 90, 20));
        getContentPane().add(PASSWORD_PF, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 130, -1));

        USERNAME_LB.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        USERNAME_LB.setForeground(new java.awt.Color(0, 102, 0));
        USERNAME_LB.setText("USERNAME");
        getContentPane().add(USERNAME_LB, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 80, -1));
        getContentPane().add(USERNAME_TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 130, -1));

        AVAILABILITY_LB.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        AVAILABILITY_LB.setForeground(new java.awt.Color(0, 0, 204));
        AVAILABILITY_LB.setText("CHECK AVAILABILITY");
        AVAILABILITY_LB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AVAILABILITY_LBMouseClicked(evt);
            }
        });
        getContentPane().add(AVAILABILITY_LB, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 140, 30));

        PHONENO_LB.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        PHONENO_LB.setForeground(new java.awt.Color(0, 102, 51));
        PHONENO_LB.setText("PHONE NO");
        getContentPane().add(PHONENO_LB, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 70, -1));
        getContentPane().add(PHONENO_TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 130, -1));

        CARDNO_LB.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        CARDNO_LB.setForeground(new java.awt.Color(0, 102, 51));
        CARDNO_LB.setText("CARD NUMBER");
        getContentPane().add(CARDNO_LB, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 110, -1));
        getContentPane().add(CARDNO_TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 130, -1));

        SUBMIT_BT.setText("Submit");
        SUBMIT_BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUBMIT_BTActionPerformed(evt);
            }
        });
        getContentPane().add(SUBMIT_BT, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));

        EXIT_BT.setText("Exit");
        EXIT_BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXIT_BTActionPerformed(evt);
            }
        });
        getContentPane().add(EXIT_BT, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, -1, -1));

        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 51));
        jLabel3.setText("City");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 40, 20));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 130, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Enter 10 digit mobile no");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 170, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Enter 16 digit Card No");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 160, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Enter 5 character long Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 220, -1));

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, -1, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Capture7.PNG"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Welcome_Frame().setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void SUBMIT_BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUBMIT_BTActionPerformed
        // TODO add your handling code here:
        String name=NAME_TF.getText();
        String username=USERNAME_TF.getText();
        String password=new String(PASSWORD_PF.getPassword());
        String phone=PHONENO_TF.getText();
        String city=jTextField1.getText();
        String card_no=CARDNO_TF.getText();
       if(name.isEmpty())
       {
           JOptionPane.showMessageDialog(this,"Please Enter Name");
       }
       else
       {
        if(username.isEmpty())
       {
           JOptionPane.showMessageDialog(this,"Please Enter UserName");
       }
        else
        {
        if(password.isEmpty())
       {
           JOptionPane.showMessageDialog(this,"Please Enter Password");
       }
        else
        {
        int Plength= password.length();
        if(Plength<5)
        {
            JOptionPane.showMessageDialog(this,"Password should contain atleast 5 characters");
        }
        else
        {
        if(phone.isEmpty())
       {
           JOptionPane.showMessageDialog(this,"Please Enter Phone_No");
       }
        else
        {
        if(phone.length()!=10)
        {
            JOptionPane.showMessageDialog(this,"PHONE NO SHOULD CONTAIN 10 NUMBERS");
        }
        else
        {
        if(city.isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Please Enter City");
        }
        else
        {
        if(card_no.isEmpty())
       {
           JOptionPane.showMessageDialog(this,"Please Enter Card No");
       }
        else
        {
        int Clength=card_no.length();
        if(Clength!=16)
        {
            JOptionPane.showMessageDialog(this,"Card No should contain 16 characters");
        }
        else
        {
        try
        {
            Class.forName("java.sql.DriverManager");
            Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/E_AUCTION","root","root");
            Statement stmt=(Statement)con.createStatement();
            String sql1="Insert into Users values('"+name+"','"+username+"','"+password+"','"+phone+"','"+city+"','"+card_no+"');";
            stmt.executeUpdate(sql1);
            JOptionPane.showMessageDialog(this,"REGISTRATION SUCCESSFUL");
            this.setVisible(false);
            new Welcome_Frame().setVisible(true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
        }
        }
        }
        }
        }
        }
        }
        }
        }
    }//GEN-LAST:event_SUBMIT_BTActionPerformed

    private void AVAILABILITY_LBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AVAILABILITY_LBMouseClicked
        // TODO add your handling code here:
        String username=USERNAME_TF.getText();
        if(username.isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Please enter UserName");
        }
        else
        {
        try
        {
            Class.forName("java.sql.DriverManager");
            Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/E_AUCTION","root","root");
            Statement stmt=(Statement)con.createStatement();
            String sql1="Select * from Users where UserName='"+username+"';";
            ResultSet rs=stmt.executeQuery(sql1);
            int found=0;
            if(rs.first())
            {
               found++;
            }
            if(found==0)
            {
                JOptionPane.showMessageDialog(this,"Username is Available");
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Username is not Available");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
        }
    }//GEN-LAST:event_AVAILABILITY_LBMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        NAME_TF.setText("");
        USERNAME_TF.setText("");
        PASSWORD_PF.setText("");
        PHONENO_TF.setText("");
        CARDNO_TF.setText("");
      jTextField1.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void EXIT_BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXIT_BTActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_EXIT_BTActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Welcome_Frame().setVisible(true); 
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AVAILABILITY_LB;
    private javax.swing.JLabel CARDNO_LB;
    private javax.swing.JTextField CARDNO_TF;
    private javax.swing.JButton EXIT_BT;
    private javax.swing.JLabel NAME_LB;
    private javax.swing.JTextField NAME_TF;
    private javax.swing.JLabel PASSWORD_LB;
    private javax.swing.JPasswordField PASSWORD_PF;
    private javax.swing.JLabel PHONENO_LB;
    private javax.swing.JTextField PHONENO_TF;
    private javax.swing.JButton SUBMIT_BT;
    private javax.swing.JLabel USERNAME_LB;
    private javax.swing.JTextField USERNAME_TF;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
