 package Windows;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyectocine.*;
 
/**
 *
 * @author Juan Diego Suarez Londoño
 */
public class EditUsersWindow extends javax.swing.JFrame {
    
    public EditUsersWindow() throws IOException, FileNotFoundException, ClassNotFoundException {
        programmer=Programmer.getInstance();
        initComponents();
        jDialogCaution.setVisible(false);
        jDialogCaution.setLocationRelativeTo(null);
        setLocationRelativeTo(null);
    }
    
    public EditUsersWindow(User normal) throws IOException, FileNotFoundException, ClassNotFoundException {
        programmer=Programmer.getInstance();
        initComponents();
        jDialogCaution.setVisible(false);
        jDialogCaution.setLocationRelativeTo(null);
        setLocationRelativeTo(null);    
        jTextFieldUserName.setText(normal.getName());
        jTextFieldPassword.setText(normal.getPassword());
        jTextFieldUserName.requestFocus();
        if(normal.getUserNumber()!=-1) {
            this.normal=(Profiles)normal;
        }     
        else {
            this.normal=new Profiles(normal.getName(),normal.getPassword(),normal.getUserNumber());
            jButtonDelete.setEnabled(false);
        }
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogCaution = new javax.swing.JDialog();
        jButtonAccept = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabelCautionText1 = new javax.swing.JLabel();
        jLabelCautionText2 = new javax.swing.JLabel();
        jTextFieldUserName = new javax.swing.JTextField();
        jTextFieldPassword = new javax.swing.JTextField();
        jButtonReturn = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonDone = new javax.swing.JButton();
        jLabelEditUser = new javax.swing.JLabel();
        jLabelUserName = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jLabelUserWindowBackground = new javax.swing.JLabel();

        jDialogCaution.setTitle("Caution");
        jDialogCaution.setBounds(new java.awt.Rectangle(0, 0, 285, 150));
        jDialogCaution.setUndecorated(true);
        jDialogCaution.setSize(new java.awt.Dimension(270, 100));
        jDialogCaution.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonAccept.setText("Accept");
        jButtonAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcceptActionPerformed(evt);
            }
        });
        jDialogCaution.getContentPane().add(jButtonAccept, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        jDialogCaution.getContentPane().add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        jLabelCautionText1.setText("Esta a punto de borrar un trabajo audio visual.");
        jDialogCaution.getContentPane().add(jLabelCautionText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabelCautionText2.setText("Para priceder, presione aceptar.");
        jDialogCaution.getContentPane().add(jLabelCautionText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 25, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldUserName.setBackground(new java.awt.Color(255, 255, 255, 0));
        jTextFieldUserName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldUserName.setForeground(new java.awt.Color(203, 96, 239));
        jTextFieldUserName.setBorder(null);
        jTextFieldUserName.setOpaque(false);
        getContentPane().add(jTextFieldUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 210, -1));

        jTextFieldPassword.setBackground(new java.awt.Color(255, 255, 255, 0));
        jTextFieldPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldPassword.setForeground(new java.awt.Color(203, 96, 239));
        jTextFieldPassword.setBorder(null);
        jTextFieldPassword.setOpaque(false);
        getContentPane().add(jTextFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 210, -1));

        jButtonReturn.setBackground(new java.awt.Color(0, 6, 69));
        jButtonReturn.setForeground(new java.awt.Color(255, 255, 255));
        jButtonReturn.setText("Return");
        jButtonReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReturnActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 10, -1, -1));

        jButtonExit.setBackground(new java.awt.Color(0, 6, 69));
        jButtonExit.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 60, -1));

        jButtonDelete.setBackground(new java.awt.Color(102, 0, 0));
        jButtonDelete.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, -1, -1));

        jButtonDone.setBackground(new java.awt.Color(0, 102, 153));
        jButtonDone.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDone.setText("Done");
        jButtonDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDoneActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDone, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, -1, -1));

        jLabelEditUser.setFont(new java.awt.Font("Sylfaen", 1, 28)); // NOI18N
        jLabelEditUser.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEditUser.setText("Edit User");
        getContentPane().add(jLabelEditUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        jLabelUserName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelUserName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUserName.setText("User name");
        getContentPane().add(jLabelUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabelPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassword.setText("Password");
        getContentPane().add(jLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabelUserWindowBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picks/Fondo Azul.png"))); // NOI18N
        getContentPane().add(jLabelUserWindowBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 342, 423));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDoneActionPerformed
        try {
            if(normal.getUserNumber()!=-1) {
                if(((Profiles)normal).getWhat().equals("User")||((Profiles)normal).getWhat().equals("Critic")) {
                    programmer.editUser(new Profiles(jTextFieldUserName.getText().trim(), jTextFieldPassword.getText().trim(), normal.getUserNumber()));
                }
            }
            else {
                programmer.setName(jTextFieldUserName.getText().trim());
                programmer.setPassword(jTextFieldPassword.getText().trim());
                programmer.setAdminBin();
            }
            ProgrammerWindow PW = new ProgrammerWindow();            
            this.setVisible(false);
            PW.setVisible(true);    
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(EditAvWWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButtonDoneActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReturnActionPerformed
       try {
            ProgrammerWindow PW = new ProgrammerWindow();
            this.setVisible(false);
            PW.setVisible(true);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(EditAvWWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonReturnActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        jDialogCaution.setVisible(true);
        setEnabled(false);
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcceptActionPerformed
        try {            
            if(((Profiles)normal).getWhat().equals("User")||((Profiles)normal).getWhat().equals("Critic")) {                                
                programmer.deleteUser(normal.getUserNumber());
                programmer.setUsersBin();                
            }  
            jDialogCaution.setVisible(false);
            ProgrammerWindow PW = new ProgrammerWindow();            
            this.setVisible(false);
            PW.setVisible(true);    
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(EditAvWWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonAcceptActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        jDialogCaution.setVisible(false);
        setEnabled(true);
        setVisible(true);
    }//GEN-LAST:event_jButtonCancelActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditUsersWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new EditUsersWindow().setVisible(true);
                } catch (IOException | ClassNotFoundException ex) {
                    Logger.getLogger(EditUsersWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    private Programmer programmer;
    private User normal;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAccept;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonDone;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonReturn;
    private javax.swing.JDialog jDialogCaution;
    private javax.swing.JLabel jLabelCautionText1;
    private javax.swing.JLabel jLabelCautionText2;
    private javax.swing.JLabel jLabelEditUser;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelUserName;
    private javax.swing.JLabel jLabelUserWindowBackground;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldUserName;
    // End of variables declaration//GEN-END:variables
}
