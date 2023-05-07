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
public class AddSeriesWindow extends javax.swing.JFrame {

    public AddSeriesWindow() throws IOException, FileNotFoundException, ClassNotFoundException {
        programmer=Programmer.getInstance();
        initComponents();
        jLabelTitleAsterisk.setVisible(false);
        jLabelGenreAsterisk.setVisible(false);
        jLabelRatingAsterisk.setVisible(false);
        jLabelDirectAsterisk.setVisible(false);
        jLabelEpisodesAsterisk.setVisible(false);
        jLabelSeasonAsterisk.setVisible(false);
        jLabelYouHaveToFillTheApacesMarkedWithAsterisk.setVisible(false);
        this.setLocationRelativeTo(null);
        jTextFieldTitle.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldTitle = new javax.swing.JTextField();
        jTextFieldRating = new javax.swing.JTextField();
        jTextFieldDirect = new javax.swing.JTextField();
        jFormattedTextFieldEpisodes = new javax.swing.JFormattedTextField();
        jFormattedTextFieldSeason = new javax.swing.JFormattedTextField();
        jButtonReturn = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jButtonDone = new javax.swing.JButton();
        jComboBoxGenre = new javax.swing.JComboBox<>();
        jLabelAddSeriesWindowTitle = new javax.swing.JLabel();
        jLabelTitle = new javax.swing.JLabel();
        jLabelGenre = new javax.swing.JLabel();
        jLabelRating = new javax.swing.JLabel();
        jLabelDirect = new javax.swing.JLabel();
        jLabelEpisodes = new javax.swing.JLabel();
        jLabelSeason = new javax.swing.JLabel();
        jLabelTitleAsterisk = new javax.swing.JLabel();
        jLabelGenreAsterisk = new javax.swing.JLabel();
        jLabelRatingAsterisk = new javax.swing.JLabel();
        jLabelDirectAsterisk = new javax.swing.JLabel();
        jLabelEpisodesAsterisk = new javax.swing.JLabel();
        jLabelSeasonAsterisk = new javax.swing.JLabel();
        jLabelYouHaveToFillTheApacesMarkedWithAsterisk = new javax.swing.JLabel();
        jLabelAddSeriesWindowBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jTextFieldTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 140, -1));
        getContentPane().add(jTextFieldRating, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 140, -1));
        getContentPane().add(jTextFieldDirect, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 140, -1));

        jFormattedTextFieldEpisodes.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        getContentPane().add(jFormattedTextFieldEpisodes, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 140, -1));

        jFormattedTextFieldSeason.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        getContentPane().add(jFormattedTextFieldSeason, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 140, -1));

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

        jButtonDone.setBackground(new java.awt.Color(0, 102, 153));
        jButtonDone.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDone.setText("Done");
        jButtonDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDoneActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDone, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, -1, -1));

        jComboBoxGenre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Action", "Adventure", "Comedy", "Crime & Gangster", "Drama", "Historical", "Horror", "Musical", "Sience fiction", "War", "Westerns" }));
        getContentPane().add(jComboBoxGenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 140, -1));

        jLabelAddSeriesWindowTitle.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        jLabelAddSeriesWindowTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAddSeriesWindowTitle.setText("Add Series");
        getContentPane().add(jLabelAddSeriesWindowTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitle.setText("Title");
        getContentPane().add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        jLabelGenre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelGenre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGenre.setText("Genre");
        getContentPane().add(jLabelGenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        jLabelRating.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelRating.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRating.setText("Rating");
        getContentPane().add(jLabelRating, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        jLabelDirect.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelDirect.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDirect.setText("Direct");
        getContentPane().add(jLabelDirect, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        jLabelEpisodes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelEpisodes.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEpisodes.setText("Episodes");
        getContentPane().add(jLabelEpisodes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        jLabelSeason.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelSeason.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSeason.setText("Season");
        getContentPane().add(jLabelSeason, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        jLabelTitleAsterisk.setForeground(new java.awt.Color(255, 0, 0));
        jLabelTitleAsterisk.setText("*");
        getContentPane().add(jLabelTitleAsterisk, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));

        jLabelGenreAsterisk.setForeground(new java.awt.Color(255, 0, 0));
        jLabelGenreAsterisk.setText("*");
        getContentPane().add(jLabelGenreAsterisk, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, -1, -1));

        jLabelRatingAsterisk.setForeground(new java.awt.Color(255, 0, 0));
        jLabelRatingAsterisk.setText("*");
        getContentPane().add(jLabelRatingAsterisk, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, -1));

        jLabelDirectAsterisk.setForeground(new java.awt.Color(255, 0, 0));
        jLabelDirectAsterisk.setText("*");
        getContentPane().add(jLabelDirectAsterisk, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, -1));

        jLabelEpisodesAsterisk.setForeground(new java.awt.Color(255, 0, 0));
        jLabelEpisodesAsterisk.setText("*");
        getContentPane().add(jLabelEpisodesAsterisk, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, -1, -1));

        jLabelSeasonAsterisk.setForeground(new java.awt.Color(255, 0, 0));
        jLabelSeasonAsterisk.setText("*");
        getContentPane().add(jLabelSeasonAsterisk, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, -1, -1));

        jLabelYouHaveToFillTheApacesMarkedWithAsterisk.setForeground(new java.awt.Color(255, 0, 0));
        jLabelYouHaveToFillTheApacesMarkedWithAsterisk.setText("You have to fill the spaces marked with *");
        getContentPane().add(jLabelYouHaveToFillTheApacesMarkedWithAsterisk, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        jLabelAddSeriesWindowBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picks/Fondo Azul.png"))); // NOI18N
        getContentPane().add(jLabelAddSeriesWindowBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 342, 423));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDoneActionPerformed
        jLabelTitleAsterisk.setVisible(false);
        jLabelGenreAsterisk.setVisible(false);
        jLabelRatingAsterisk.setVisible(false);
        jLabelDirectAsterisk.setVisible(false);
        jLabelEpisodesAsterisk.setVisible(false);
        jLabelSeasonAsterisk.setVisible(false);
        jLabelYouHaveToFillTheApacesMarkedWithAsterisk.setVisible(false);
        if(jTextFieldTitle.getText().trim().equals("")||((String)jComboBoxGenre.getSelectedItem()).trim().equals("")||jTextFieldRating.getText().trim().equals("")||jTextFieldDirect.getText().trim().equals("")||jFormattedTextFieldEpisodes.getText().trim().equals("")||jFormattedTextFieldSeason.getText().trim().equals("")) {
            jLabelYouHaveToFillTheApacesMarkedWithAsterisk.setVisible(true);
            if(jTextFieldTitle.getText().trim().equals("")) {
                jLabelTitleAsterisk.setVisible(true);
            }
            if(((String)jComboBoxGenre.getSelectedItem()).trim().equals("")) {
                jLabelGenreAsterisk.setVisible(true);
            }
            if(jTextFieldRating.getText().trim().equals("")) {
                jLabelRatingAsterisk.setVisible(true);
            }
            if(jTextFieldDirect.getText().trim().equals("")) {
                jLabelDirectAsterisk.setVisible(true);
            }
            if(jFormattedTextFieldEpisodes.getText().trim().equals("")) {
                jLabelEpisodesAsterisk.setVisible(true);
            }
            if(jFormattedTextFieldSeason.getText().trim().equals("")) {
                jLabelSeasonAsterisk.setVisible(true);
            }
        }
        else {
            try {
                programmer.setSeries(new Series(Integer.parseInt(jFormattedTextFieldEpisodes.getText()), Integer.parseInt(jFormattedTextFieldSeason.getText()), jTextFieldTitle.getText(), ((String)jComboBoxGenre.getSelectedItem()), jTextFieldRating.getText(), jTextFieldDirect.getText(), programmer.getCounters()[2]));
                programmer.setSeriesBin();
                ProgrammerWindow PW=new ProgrammerWindow();
                this.setVisible(false);
                PW.setVisible(true);
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(AddMovieWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButtonDoneActionPerformed

    private void jButtonReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReturnActionPerformed
        try {
            ProgrammerWindow PW = new ProgrammerWindow();
            this.setVisible(false);
            PW.setVisible(true);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(AddMovieWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonReturnActionPerformed

    public static void main(String args[]) {  
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSeriesWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AddSeriesWindow().setVisible(true);
                } catch (IOException | ClassNotFoundException ex) {
                    Logger.getLogger(AddSeriesWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    private Programmer programmer;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDone;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonReturn;
    private javax.swing.JComboBox<String> jComboBoxGenre;
    private javax.swing.JFormattedTextField jFormattedTextFieldEpisodes;
    private javax.swing.JFormattedTextField jFormattedTextFieldSeason;
    private javax.swing.JLabel jLabelAddSeriesWindowBackground;
    private javax.swing.JLabel jLabelAddSeriesWindowTitle;
    private javax.swing.JLabel jLabelDirect;
    private javax.swing.JLabel jLabelDirectAsterisk;
    private javax.swing.JLabel jLabelEpisodes;
    private javax.swing.JLabel jLabelEpisodesAsterisk;
    private javax.swing.JLabel jLabelGenre;
    private javax.swing.JLabel jLabelGenreAsterisk;
    private javax.swing.JLabel jLabelRating;
    private javax.swing.JLabel jLabelRatingAsterisk;
    private javax.swing.JLabel jLabelSeason;
    private javax.swing.JLabel jLabelSeasonAsterisk;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelTitleAsterisk;
    private javax.swing.JLabel jLabelYouHaveToFillTheApacesMarkedWithAsterisk;
    private javax.swing.JTextField jTextFieldDirect;
    private javax.swing.JTextField jTextFieldRating;
    private javax.swing.JTextField jTextFieldTitle;
    // End of variables declaration//GEN-END:variables
}
