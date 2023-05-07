package Windows;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.Arrays;
import java.util.logging.*;
import proyectocine.*;

/**
 *
 * @author Juan Diego Suarez Londoño
 */
public class LoginWindow extends javax.swing.JFrame {

    public LoginWindow() throws IOException, FileNotFoundException, ClassNotFoundException {
        programmer = Programmer.getInstance();
        initComponents();
        jLabelInvalidUserOrPasswordPleaseVerify.setVisible(false);
        this.setLocationRelativeTo(null);
        jTextFieldUserName.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldUserName = new javax.swing.JTextField();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jButtonLogin = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jLabelSingUp = new javax.swing.JLabel();
        jLabelUser = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jLabelLoginIcon = new javax.swing.JLabel();
        jLabelInvalidUserOrPasswordPleaseVerify = new javax.swing.JLabel();
        jLabelLoginWindowBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldUserNameKeyReleased(evt);
            }
        });
        getContentPane().add(jTextFieldUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 140, -1));

        jPasswordFieldPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordFieldPasswordKeyReleased(evt);
            }
        });
        getContentPane().add(jPasswordFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 140, -1));

        jButtonLogin.setBackground(new java.awt.Color(0, 102, 153));
        jButtonLogin.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogin.setText("Login");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 70, -1));

        jButtonExit.setBackground(new java.awt.Color(0, 6, 69));
        jButtonExit.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 60, -1));

        jLabelSingUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSingUp.setText("New User? Sing up now! ");
        jLabelSingUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSingUpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSingUpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSingUpMouseExited(evt);
            }
        });
        getContentPane().add(jLabelSingUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, -1));

        jLabelUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelUser.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUser.setText("User");
        getContentPane().add(jLabelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        jLabelPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassword.setText("Password");
        getContentPane().add(jLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabelLoginIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picks/Dash Login Icon.jpg"))); // NOI18N
        getContentPane().add(jLabelLoginIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 250, 170));

        jLabelInvalidUserOrPasswordPleaseVerify.setForeground(new java.awt.Color(255, 0, 0));
        jLabelInvalidUserOrPasswordPleaseVerify.setText("Invalid user or password, please verify");
        jLabelInvalidUserOrPasswordPleaseVerify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelInvalidUserOrPasswordPleaseVerifyMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelInvalidUserOrPasswordPleaseVerify, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        jLabelLoginWindowBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picks/Fondo Azul.png"))); // NOI18N
        getContentPane().add(jLabelLoginWindowBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 423));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jLabelSingUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSingUpMouseClicked
        try {
            CreateAccountWindow RW = new CreateAccountWindow();
            this.setVisible(false);
            RW.setVisible(true);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(LoginWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabelSingUpMouseClicked

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        try {
            loginLW();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(LoginWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jLabelSingUpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSingUpMouseEntered
        jLabelSingUp.setForeground(Color.BLUE);
    }//GEN-LAST:event_jLabelSingUpMouseEntered

    private void jLabelSingUpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSingUpMouseExited
        jLabelSingUp.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabelSingUpMouseExited

    private void jLabelInvalidUserOrPasswordPleaseVerifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInvalidUserOrPasswordPleaseVerifyMouseClicked
        InvalidUserWindow IU = new InvalidUserWindow();
        this.setVisible(false);
        IU.setVisible(true);
    }//GEN-LAST:event_jLabelInvalidUserOrPasswordPleaseVerifyMouseClicked

    private void jPasswordFieldPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldPasswordKeyReleased
        if (evt.getKeyCode() == 10) {
            try {
                loginLW();
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(LoginWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jPasswordFieldPasswordKeyReleased

    private void jTextFieldUserNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldUserNameKeyReleased
        if (evt.getKeyCode() == 10) {
            try {
                loginLW();
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(LoginWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jTextFieldUserNameKeyReleased

    private void loginLW() throws IOException, FileNotFoundException, ClassNotFoundException {
        String password = String.copyValueOf(jPasswordFieldPassword.getPassword());
        if (programmer.login(jTextFieldUserName.getText().trim(), password.trim()) != null) {
            MainWindow MW = new MainWindow(programmer.login(jTextFieldUserName.getText().trim(), password.trim()));
            this.setVisible(false);
            MW.setVisible(true);
        }
        if (jTextFieldUserName.getText().trim().equals(programmer.getName()) && password.trim().equals(programmer.getPassword())) {
            try {
                ProgrammerWindow PW = new ProgrammerWindow();
                this.setVisible(false);
                PW.setVisible(true);
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(LoginWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        jLabelInvalidUserOrPasswordPleaseVerify.setVisible(true);
    }

    public static void main(String args[]) {
        try {

            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new LoginWindow().setVisible(true);
                } catch (IOException | ClassNotFoundException ex) {
                    Logger.getLogger(LoginWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    private Programmer programmer;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabelInvalidUserOrPasswordPleaseVerify;
    private javax.swing.JLabel jLabelLoginIcon;
    private javax.swing.JLabel jLabelLoginWindowBackground;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelSingUp;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JTextField jTextFieldUserName;
    // End of variables declaration//GEN-END:variables
}
