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
public class EditAvWWindow extends javax.swing.JFrame {

    public EditAvWWindow() throws IOException, FileNotFoundException, ClassNotFoundException {
        programmer=Programmer.getInstance();
        initComponents();        
        this.setLocationRelativeTo(null); 
        jDialogCaution.setVisible(false);
        jDialogCaution.setLocationRelativeTo(null);
    }
    
    public EditAvWWindow(AudiovisualWork AvW,String text) throws IOException, FileNotFoundException, ClassNotFoundException {
        programmer=Programmer.getInstance();
        initComponents();
        genresChange=false;
        jProgressBarAverageQualification.setValue((int) AvW.getAverageQualification());
        switch ((int)AvW.getAverageQualification()) {
            
            case 0: 
                jProgressBarAverageQualification.setString((int) AvW.getAverageQualification()+" Wow what a bad");
            break;
            
            case 1:
                jProgressBarAverageQualification.setString((int) AvW.getAverageQualification()+" Really bad");
            break;
            
            case 2:
                jProgressBarAverageQualification.setString((int) AvW.getAverageQualification()+" Bad");
            break;
            
            case 3:
                jProgressBarAverageQualification.setString((int) AvW.getAverageQualification()+" Acceptable");
            break;
            
            case 4:
                jProgressBarAverageQualification.setString((int) AvW.getAverageQualification()+" Nice");
            break;
            
            case 5:
                jProgressBarAverageQualification.setString((int) AvW.getAverageQualification()+" Really good");
            break;
        }
        jTextFieldTitle.setText(AvW.getTitle());
        jTextFieldGenre.setText(AvW.getGenere());
        jComboBoxGenre.setVisible(false);
        jTextFieldRating.setText(AvW.getRating());
        jTextFieldDirect.setText(AvW.getDirect());
        this.AvW=AvW;
        if(text.startsWith("Movie:")) {            
            jFormattedTextFieldDuration.setText(String.valueOf(AvW.getDurationmin())+" minutos");
            jFormattedTextFieldEpisodes.setText("Only for series");
            jFormattedTextFieldSeasons.setText("Only for series");
            jFormattedTextFieldEpisodes.setEnabled(false);
            jFormattedTextFieldSeasons.setEnabled(false);
            jLabelEpisodes.setEnabled(false);
            jLabelSeasons.setEnabled(false);
        }
        if(text.startsWith("Series:")) {
            jFormattedTextFieldDuration.setText("Only for movies");
            jLabelDuration.setEnabled(false);
            jFormattedTextFieldDuration.setEnabled(false);
            jFormattedTextFieldEpisodes.setText(String.valueOf(AvW.getEpisodes()));
            jFormattedTextFieldSeasons.setText(String.valueOf(AvW.getSeason()));
        }
        jDialogCaution.setVisible(false);
        jDialogCaution.setLocationRelativeTo(null);
        this.setLocationRelativeTo(null);
        jTextFieldTitle.requestFocus();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogCaution = new javax.swing.JDialog();
        jButtonAccept = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabelCautionText1 = new javax.swing.JLabel();
        jLabelCautionText2 = new javax.swing.JLabel();
        jTextFieldTitle = new javax.swing.JTextField();
        jTextFieldGenre = new javax.swing.JTextField();
        jTextFieldRating = new javax.swing.JTextField();
        jTextFieldDirect = new javax.swing.JTextField();
        jFormattedTextFieldDuration = new javax.swing.JFormattedTextField();
        jFormattedTextFieldEpisodes = new javax.swing.JFormattedTextField();
        jFormattedTextFieldSeasons = new javax.swing.JFormattedTextField();
        jButtonReturn = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonDone = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jComboBoxGenre = new javax.swing.JComboBox<>();
        jProgressBarAverageQualification = new javax.swing.JProgressBar();
        jLabelAvWWindowTitle = new javax.swing.JLabel();
        jLabelTitle = new javax.swing.JLabel();
        jLabelGenre = new javax.swing.JLabel();
        jLabelRating = new javax.swing.JLabel();
        jLabelDirect = new javax.swing.JLabel();
        jLabelDuration = new javax.swing.JLabel();
        jLabelEpisodes = new javax.swing.JLabel();
        jLabelSeasons = new javax.swing.JLabel();
        jLabelAvWWindowBackground = new javax.swing.JLabel();

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

        jTextFieldTitle.setBackground(new java.awt.Color(255, 255, 255, 0));
        jTextFieldTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextFieldTitle.setForeground(new java.awt.Color(203, 96, 239));
        jTextFieldTitle.setBorder(null);
        jTextFieldTitle.setOpaque(false);
        getContentPane().add(jTextFieldTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 240, -1));

        jTextFieldGenre.setBackground(new java.awt.Color(255,255,255,0));
        jTextFieldGenre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldGenre.setForeground(new java.awt.Color(203, 96, 239));
        jTextFieldGenre.setBorder(null);
        jTextFieldGenre.setOpaque(false);
        jTextFieldGenre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldGenreMouseClicked(evt);
            }
        });
        getContentPane().add(jTextFieldGenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 240, -1));

        jTextFieldRating.setBackground(new java.awt.Color(255, 255, 255, 0));
        jTextFieldRating.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldRating.setForeground(new java.awt.Color(203, 96, 239));
        jTextFieldRating.setBorder(null);
        jTextFieldRating.setOpaque(false);
        getContentPane().add(jTextFieldRating, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 240, -1));

        jTextFieldDirect.setBackground(new java.awt.Color(255, 255, 255, 0));
        jTextFieldDirect.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldDirect.setForeground(new java.awt.Color(203, 96, 239));
        jTextFieldDirect.setBorder(null);
        jTextFieldDirect.setOpaque(false);
        getContentPane().add(jTextFieldDirect, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 240, -1));

        jFormattedTextFieldDuration.setBackground(new java.awt.Color(255, 255, 255, 0));
        jFormattedTextFieldDuration.setBorder(null);
        jFormattedTextFieldDuration.setForeground(new java.awt.Color(203, 96, 239));
        jFormattedTextFieldDuration.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFormattedTextFieldDuration.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jFormattedTextFieldDuration.setOpaque(false);
        getContentPane().add(jFormattedTextFieldDuration, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 240, -1));

        jFormattedTextFieldEpisodes.setBackground(new java.awt.Color(255, 255, 255, 0));
        jFormattedTextFieldEpisodes.setBorder(null);
        jFormattedTextFieldEpisodes.setForeground(new java.awt.Color(203, 96, 239));
        jFormattedTextFieldEpisodes.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFormattedTextFieldEpisodes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jFormattedTextFieldEpisodes.setOpaque(false);
        getContentPane().add(jFormattedTextFieldEpisodes, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 240, -1));

        jFormattedTextFieldSeasons.setBackground(new java.awt.Color(255, 255, 255, 0));
        jFormattedTextFieldSeasons.setBorder(null);
        jFormattedTextFieldSeasons.setForeground(new java.awt.Color(203, 96, 239));
        jFormattedTextFieldSeasons.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFormattedTextFieldSeasons.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jFormattedTextFieldSeasons.setOpaque(false);
        getContentPane().add(jFormattedTextFieldSeasons, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 240, -1));

        jButtonReturn.setBackground(new java.awt.Color(0, 6, 69));
        jButtonReturn.setForeground(new java.awt.Color(255, 255, 255));
        jButtonReturn.setText("Return");
        jButtonReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReturnActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 10, -1, -1));

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

        jButtonExit.setBackground(new java.awt.Color(0, 6, 69));
        jButtonExit.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 60, -1));

        jComboBoxGenre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Action", "Adventure", "Comedy", "Crime & Gangster", "Drama", "Historical", "Horror", "Musical", "Sience fiction", "War", "Westerns" }));
        getContentPane().add(jComboBoxGenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 230, -1));

        jProgressBarAverageQualification.setBackground(new java.awt.Color(51, 51, 51));
        jProgressBarAverageQualification.setForeground(new java.awt.Color(0, 0, 153));
        jProgressBarAverageQualification.setMaximum(5);
        jProgressBarAverageQualification.setString("0");
        jProgressBarAverageQualification.setStringPainted(true);
        getContentPane().add(jProgressBarAverageQualification, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 15, -1, -1));

        jLabelAvWWindowTitle.setFont(new java.awt.Font("Sylfaen", 1, 28)); // NOI18N
        jLabelAvWWindowTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAvWWindowTitle.setText("Edit Audiovisual Work");
        getContentPane().add(jLabelAvWWindowTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitle.setText("Title:");
        getContentPane().add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabelGenre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelGenre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGenre.setText("Genre:");
        getContentPane().add(jLabelGenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabelRating.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelRating.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRating.setText("Rating:");
        getContentPane().add(jLabelRating, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 180, -1, -1));

        jLabelDirect.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelDirect.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDirect.setText("Direct:");
        getContentPane().add(jLabelDirect, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabelDuration.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelDuration.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDuration.setText("Duration:");
        getContentPane().add(jLabelDuration, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 260, -1, -1));

        jLabelEpisodes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelEpisodes.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEpisodes.setText("Episodes:");
        getContentPane().add(jLabelEpisodes, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 300, -1, -1));

        jLabelSeasons.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelSeasons.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSeasons.setText("Seasons:");
        getContentPane().add(jLabelSeasons, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 340, -1, -1));

        jLabelAvWWindowBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picks/Fondo Azul.png"))); // NOI18N
        getContentPane().add(jLabelAvWWindowBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 342, 423));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDoneActionPerformed
        String genres;
        if (genresChange==true) {
           genres=(String)jComboBoxGenre.getSelectedItem();
        }
        else {
           genres=jTextFieldGenre.getText().trim();
        }
        
        try {
            if(AvW.whatAvW().equals("Movie")) {
                programmer.editMovie(new Movie(Integer.parseInt(jFormattedTextFieldDuration.getText().replace(" minutos", "")), jTextFieldTitle.getText(),genres, jTextFieldRating.getText(), jTextFieldDirect.getText(), AvW.getAvWNumber()));
            }
            else if(AvW.whatAvW().equals("Series")) {
                programmer.editSeries(new Series(Integer.parseInt(jFormattedTextFieldEpisodes.getText()), Integer.parseInt(jFormattedTextFieldSeasons.getText()), jTextFieldTitle.getText(),genres, jTextFieldRating.getText(), jTextFieldDirect.getText(), AvW.getAvWNumber()));
            }           
            ProgrammerWindow PW = new ProgrammerWindow();            
            this.setVisible(false);
            PW.setVisible(true);    
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(EditAvWWindow.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_jButtonDoneActionPerformed

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
            if(AvW.whatAvW().equals("Movie")) {                
                programmer.deleteMovie(AvW.getAvWNumber());
                programmer.setMoviesBin();
            }
            else if(AvW.whatAvW().equals("Series")) {                
                programmer.deleteSeries(AvW.getAvWNumber());
                programmer.setSeriesBin();
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

    private void jTextFieldGenreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldGenreMouseClicked
        jTextFieldGenre.setVisible(false);
        jComboBoxGenre.setVisible(true);
        genresChange=true;
    }//GEN-LAST:event_jTextFieldGenreMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditAvWWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new EditAvWWindow().setVisible(true);
                } catch (IOException | ClassNotFoundException ex) {
                    Logger.getLogger(EditAvWWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    private boolean genresChange;
    private AudiovisualWork AvW;
    private Programmer programmer;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAccept;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonDone;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonReturn;
    private javax.swing.JComboBox<String> jComboBoxGenre;
    private javax.swing.JDialog jDialogCaution;
    private javax.swing.JFormattedTextField jFormattedTextFieldDuration;
    private javax.swing.JFormattedTextField jFormattedTextFieldEpisodes;
    private javax.swing.JFormattedTextField jFormattedTextFieldSeasons;
    private javax.swing.JLabel jLabelAvWWindowBackground;
    private javax.swing.JLabel jLabelAvWWindowTitle;
    private javax.swing.JLabel jLabelCautionText1;
    private javax.swing.JLabel jLabelCautionText2;
    private javax.swing.JLabel jLabelDirect;
    private javax.swing.JLabel jLabelDuration;
    private javax.swing.JLabel jLabelEpisodes;
    private javax.swing.JLabel jLabelGenre;
    private javax.swing.JLabel jLabelRating;
    private javax.swing.JLabel jLabelSeasons;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JProgressBar jProgressBarAverageQualification;
    private javax.swing.JTextField jTextFieldDirect;
    private javax.swing.JTextField jTextFieldGenre;
    private javax.swing.JTextField jTextFieldRating;
    private javax.swing.JTextField jTextFieldTitle;
    // End of variables declaration//GEN-END:variables
}
