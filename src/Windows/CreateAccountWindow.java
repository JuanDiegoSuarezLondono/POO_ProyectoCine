package Windows;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyectocine.*;

/**
 *
 * @author Juan Diego Suarez Londoño
 */
public class CreateAccountWindow extends javax.swing.JFrame {

    
    public CreateAccountWindow() throws IOException, FileNotFoundException, ClassNotFoundException {
        programmer=Programmer.getInstance();
        initComponents();
        jLabelUserNameAsterisk.setVisible(false);
        jLabelPasswordAsterisk.setVisible(false);
        jLabelYouHaveToFilTheSpacesMarkedWithAsterisk.setVisible(false);
        jLabelThisUserNameAlreadyExistPleaseIngresOtherName.setVisible(false);
        this.setLocationRelativeTo(null);
        jTextFieldUserName.requestFocus();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldUserName = new javax.swing.JTextField();
        jTextFieldPassword = new javax.swing.JTextField();
        jButtonExit = new javax.swing.JButton();
        jButtonReturn = new javax.swing.JButton();
        jButtonCreateMyAccount = new javax.swing.JButton();
        jLabelEnteryourUserName = new javax.swing.JLabel();
        jLabelEnterAPasswod = new javax.swing.JLabel();
        jLabelYouHaveToFilTheSpacesMarkedWithAsterisk = new javax.swing.JLabel();
        jLabelUserNameAsterisk = new javax.swing.JLabel();
        jLabelPasswordAsterisk = new javax.swing.JLabel();
        jLabelThisUserNameAlreadyExistPleaseIngresOtherName = new javax.swing.JLabel();
        jLabelRegisterWindowBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(342, 423));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUserNameActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 140, -1));
        getContentPane().add(jTextFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 140, -1));

        jButtonExit.setBackground(new java.awt.Color(0, 6, 69));
        jButtonExit.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 60, -1));

        jButtonReturn.setBackground(new java.awt.Color(0, 6, 69));
        jButtonReturn.setForeground(new java.awt.Color(255, 255, 255));
        jButtonReturn.setText("Return");
        jButtonReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReturnActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 10, -1, -1));

        jButtonCreateMyAccount.setBackground(new java.awt.Color(0, 102, 153));
        jButtonCreateMyAccount.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCreateMyAccount.setText("Create My Account");
        jButtonCreateMyAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateMyAccountActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCreateMyAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        jLabelEnteryourUserName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelEnteryourUserName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEnteryourUserName.setText("Enter your user name:");
        getContentPane().add(jLabelEnteryourUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabelEnterAPasswod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelEnterAPasswod.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEnterAPasswod.setText("Enter a passwod:");
        getContentPane().add(jLabelEnterAPasswod, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));
        jLabelEnterAPasswod.getAccessibleContext().setAccessibleName("jLabel1s");

        jLabelYouHaveToFilTheSpacesMarkedWithAsterisk.setForeground(new java.awt.Color(255, 0, 0));
        jLabelYouHaveToFilTheSpacesMarkedWithAsterisk.setText("You have to fill the spaces marked with *");
        jLabelYouHaveToFilTheSpacesMarkedWithAsterisk.setToolTipText("");
        getContentPane().add(jLabelYouHaveToFilTheSpacesMarkedWithAsterisk, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        jLabelUserNameAsterisk.setForeground(new java.awt.Color(255, 0, 0));
        jLabelUserNameAsterisk.setText("*");
        getContentPane().add(jLabelUserNameAsterisk, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));

        jLabelPasswordAsterisk.setForeground(new java.awt.Color(255, 0, 0));
        jLabelPasswordAsterisk.setText("*");
        getContentPane().add(jLabelPasswordAsterisk, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

        jLabelThisUserNameAlreadyExistPleaseIngresOtherName.setForeground(new java.awt.Color(255, 0, 0));
        jLabelThisUserNameAlreadyExistPleaseIngresOtherName.setText("This user name already exist, please ingres other name");
        getContentPane().add(jLabelThisUserNameAlreadyExistPleaseIngresOtherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabelRegisterWindowBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picks/Fondo Azul.png"))); // NOI18N
        jLabelRegisterWindowBackground.setText("jLabel1");
        jLabelRegisterWindowBackground.setMinimumSize(new java.awt.Dimension(342, 423));
        jLabelRegisterWindowBackground.setPreferredSize(new java.awt.Dimension(342, 423));
        getContentPane().add(jLabelRegisterWindowBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 342, 423));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCreateMyAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateMyAccountActionPerformed
        jLabelYouHaveToFilTheSpacesMarkedWithAsterisk.setVisible(false);
        jLabelUserNameAsterisk.setVisible(false);
        jLabelPasswordAsterisk.setVisible(false);
        jLabelThisUserNameAlreadyExistPleaseIngresOtherName.setVisible(false);
        if (jTextFieldUserName.getText().trim().equals("") || jTextFieldPassword.getText().trim().equals("")) {
            jLabelYouHaveToFilTheSpacesMarkedWithAsterisk.setVisible(true);
            if(jTextFieldUserName.getText().trim().equals("")) {
                jLabelUserNameAsterisk.setVisible(true);
            }
            if(jTextFieldPassword.getText().trim().equals("")) {
                jLabelPasswordAsterisk.setVisible(true);
            }            
        }
        else if(!programmer.thereIsUser(jTextFieldUserName.getText().trim())){
            try {              
                programmer.setUser(new Profiles(jTextFieldUserName.getText(), jTextFieldPassword.getText(), programmer.getCounters()[0]));
                programmer.setUsersBin();
                LoginWindow LG = new LoginWindow();            
                this.setVisible(false);
                LG.setVisible(true);
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(CreateAccountWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(programmer.thereIsUser(jTextFieldUserName.getText().trim())){
            jLabelThisUserNameAlreadyExistPleaseIngresOtherName.setVisible(true);            
        }
    }//GEN-LAST:event_jButtonCreateMyAccountActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReturnActionPerformed
        try {
            LoginWindow LG = new LoginWindow();
            this.setVisible(false);
            LG.setVisible(true);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(CreateAccountWindow.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_jButtonReturnActionPerformed

    private void jTextFieldUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUserNameActionPerformed

    public static void main(String args[]) {        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccountWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CreateAccountWindow().setVisible(true);
                } catch (IOException | ClassNotFoundException ex) {
                    Logger.getLogger(CreateAccountWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    private Programmer programmer;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCreateMyAccount;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonReturn;
    private javax.swing.JLabel jLabelEnterAPasswod;
    private javax.swing.JLabel jLabelEnteryourUserName;
    private javax.swing.JLabel jLabelPasswordAsterisk;
    private javax.swing.JLabel jLabelRegisterWindowBackground;
    private javax.swing.JLabel jLabelThisUserNameAlreadyExistPleaseIngresOtherName;
    private javax.swing.JLabel jLabelUserNameAsterisk;
    private javax.swing.JLabel jLabelYouHaveToFilTheSpacesMarkedWithAsterisk;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldUserName;
    // End of variables declaration//GEN-END:variables
}
