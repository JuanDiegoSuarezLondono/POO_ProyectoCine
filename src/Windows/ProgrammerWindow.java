package Windows;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import proyectocine.*;

/**
 *
 * @author Juan Diego Suarez Londoño
 */
public class ProgrammerWindow extends javax.swing.JFrame {

    public ProgrammerWindow() throws IOException, FileNotFoundException, ClassNotFoundException {
        programmer=Programmer.getInstance();        
        initComponents();            
        setLocationRelativeTo(null);
        jTextFieldSearcher.requestFocus();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelLents = new javax.swing.JLabel();
        jTextFieldSearcher = new javax.swing.JTextField();
        jButtonReturn = new javax.swing.JButton();
        jButtonAddMovie = new javax.swing.JButton();
        jButtonAddSeries = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jButtonShowAll = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPanelSearchesFound = new javax.swing.JScrollPane();
        jListPanelSearchesFound = new javax.swing.JList<>();
        jLabelProgrammerWindowTitle = new javax.swing.JLabel();
        jLabelProgrammerWindowBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLents.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picks/Lents.png"))); // NOI18N
        getContentPane().add(jLabelLents, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 178, 22, 22));

        jTextFieldSearcher.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldSearcher.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSearcherKeyReleased(evt);
            }
        });
        getContentPane().add(jTextFieldSearcher, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 175, 300, -1));

        jButtonReturn.setBackground(new java.awt.Color(0, 6, 69));
        jButtonReturn.setForeground(new java.awt.Color(255, 255, 255));
        jButtonReturn.setText("Return");
        jButtonReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReturnActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 10, -1, -1));

        jButtonAddMovie.setBackground(new java.awt.Color(0, 102, 153));
        jButtonAddMovie.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAddMovie.setText("Add Movie");
        jButtonAddMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddMovieActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAddMovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 111, -1));

        jButtonAddSeries.setBackground(new java.awt.Color(0, 102, 153));
        jButtonAddSeries.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAddSeries.setText("Add Series");
        jButtonAddSeries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddSeriesActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAddSeries, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 111, -1));

        jButtonExit.setBackground(new java.awt.Color(0, 6, 69));
        jButtonExit.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 60, -1));

        jButtonShowAll.setBackground(new java.awt.Color(0, 102, 153));
        jButtonShowAll.setForeground(new java.awt.Color(255, 255, 255));
        jButtonShowAll.setText("Show all");
        jButtonShowAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowAllActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonShowAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 111, -1));

        jButton1.setBackground(new java.awt.Color(0, 102, 153));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Edit Programer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 111, -1));

        jScrollPanelSearchesFound.setFocusable(false);

        jListPanelSearchesFound.setVisibleRowCount(12);
        jScrollPanelSearchesFound.setViewportView(jListPanelSearchesFound);

        getContentPane().add(jScrollPanelSearchesFound, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 204, 300, 200));

        jLabelProgrammerWindowTitle.setFont(new java.awt.Font("Sylfaen", 1, 28)); // NOI18N
        jLabelProgrammerWindowTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelProgrammerWindowTitle.setText("Programmer mode");
        getContentPane().add(jLabelProgrammerWindowTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jLabelProgrammerWindowBackground.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelProgrammerWindowBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picks/Fondo Azul.png"))); // NOI18N
        getContentPane().add(jLabelProgrammerWindowBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 342, 423));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddMovieActionPerformed
        try {
            AddMovieWindow AMW = new AddMovieWindow();
            AMW.setVisible(true);
            this.setVisible(false);  
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(ProgrammerWindow.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }//GEN-LAST:event_jButtonAddMovieActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonAddSeriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddSeriesActionPerformed
        try {
            AddSeriesWindow ASW = new AddSeriesWindow();
            ASW.setVisible(true);
            this.setVisible(false);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(ProgrammerWindow.class.getName()).log(Level.SEVERE, null, ex);
        }           
    }//GEN-LAST:event_jButtonAddSeriesActionPerformed

    private void jTextFieldSearcherKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearcherKeyReleased
        list=new String[programmer.getTotalCounters()];
        for(int i=0;i<programmer.getTotalCounters();i++){
                list[i]="";
            }
        
        if(!(jTextFieldSearcher.getText().trim().isEmpty() && (evt.getKeyCode()<33 || evt.getKeyCode()>165))) {
            int LP=0;   
            for(int i=0;;i++) {
                if(programmer.getEqualUser(jTextFieldSearcher.getText())[i]!=null) {
                    list[LP]="User: "+programmer.getEqualUser(jTextFieldSearcher.getText())[i].getName(); 
                    LP++;
                }
                else {
                    break;
                }
            }            
            for(int i=0;;i++) {
                if(programmer.getEqualMovie(jTextFieldSearcher.getText())[i]!=null) {
                    list[LP]="Movie: "+programmer.getEqualMovie(jTextFieldSearcher.getText())[i].getTitle();    
                    LP++;
                } 
                else {
                    break;
                }
            }
            for(int i=0;;i++) {
                if(programmer.getEqualSeries(jTextFieldSearcher.getText())[i]!=null) {
                    list[LP]="Series: "+programmer.getEqualSeries(jTextFieldSearcher.getText())[i].getTitle(); 
                    LP++;
                }
                else {
                    break;
                }
            }
        }
        
        jListPanelSearchesFound=new JList<String>(list);
        
        jListPanelSearchesFound.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (jListPanelSearchesFound.getSelectedValue().startsWith("User")) {
                    try {
                        EditUsersWindow UW = new EditUsersWindow(programmer.whatUser(jListPanelSearchesFound.getSelectedValue()));
                        setVisible(false);
                        UW.setVisible(true);
                    } catch (IOException | ClassNotFoundException ex) {
                        Logger.getLogger(ProgrammerWindow.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }                 
                else if(jListPanelSearchesFound.getSelectedValue().startsWith("Movie") || jListPanelSearchesFound.getSelectedValue().startsWith("Series")) {                    
                    try {
                        EditAvWWindow AvWW = new EditAvWWindow(programmer.whatAvW(jListPanelSearchesFound.getSelectedValue()),jListPanelSearchesFound.getSelectedValue());
                        setVisible(false);
                        AvWW.setVisible(true);
                    } catch (IOException | ClassNotFoundException ex) {
                        Logger.getLogger(ProgrammerWindow.class.getName()).log(Level.SEVERE, null, ex);
                    }                    
                }
             }
        });
        jScrollPanelSearchesFound.setViewportView(jListPanelSearchesFound);
    }//GEN-LAST:event_jTextFieldSearcherKeyReleased

    private void jButtonShowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowAllActionPerformed
        jTextFieldSearcher.setText("");
        list=new String[programmer.getTotalCounters()];
        for(int i=0;i<programmer.getTotalCounters();i++){
                list[i]="";
            }
        int LP=0;
        for(int i=0;;i++) {
                if(programmer.getUsers()[i]!=null) {
                    list[LP]="User: "+programmer.getUsers()[i].getName(); 
                    LP++;
                }
                else {
                    break;
                }
            }
        for(int i=0;;i++) {
                if(programmer.getMovies()[i]!=null) {
                        list[LP]="Movie: "+programmer.getMovies()[i].getTitle(); 
                    LP++;
                }
                else {
                    break;
                }
            }
        for(int i=0;;i++) {
                if(programmer.getSeries()[i]!=null) {
                        list[LP]="Series: "+programmer.getSeries()[i].getTitle(); 
                    LP++;
                }
                else {
                    break;
                }
            }
        jListPanelSearchesFound=new JList<String>(list);   
        jListPanelSearchesFound.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(jListPanelSearchesFound.getSelectedValue().startsWith("Movie") || jListPanelSearchesFound.getSelectedValue().startsWith("Series")) {
                    try {
                        EditAvWWindow AvWW = new EditAvWWindow(programmer.whatAvW(jListPanelSearchesFound.getSelectedValue()),jListPanelSearchesFound.getSelectedValue());
                        setVisible(false);
                        AvWW.setVisible(true);
                    } catch (IOException | ClassNotFoundException ex) {
                        Logger.getLogger(ProgrammerWindow.class.getName()).log(Level.SEVERE, null, ex);
                    }                    
                }
                else if (jListPanelSearchesFound.getSelectedValue().startsWith("User")) {
                    try {
                        EditUsersWindow UW = new EditUsersWindow(programmer.whatUser(jListPanelSearchesFound.getSelectedValue()));
                        setVisible(false);
                        UW.setVisible(true);
                    } catch (IOException | ClassNotFoundException ex) {
                        Logger.getLogger(ProgrammerWindow.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
             }
        });        
        jScrollPanelSearchesFound.setViewportView(jListPanelSearchesFound);
    }//GEN-LAST:event_jButtonShowAllActionPerformed

    private void jButtonReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReturnActionPerformed
        try {
            LoginWindow LG = new LoginWindow();
            this.setVisible(false);
            LG.setVisible(true);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(ProgrammerWindow.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_jButtonReturnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            EditUsersWindow UW = new EditUsersWindow(programmer);
            setVisible(false);
            UW.setVisible(true);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(ProgrammerWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
        
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProgrammerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ProgrammerWindow().setVisible(true);
                } catch (IOException | ClassNotFoundException ex) {
                    Logger.getLogger(ProgrammerWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    private Programmer programmer;
    private String[] list;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAddMovie;
    private javax.swing.JButton jButtonAddSeries;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonReturn;
    private javax.swing.JButton jButtonShowAll;
    private javax.swing.JLabel jLabelLents;
    private javax.swing.JLabel jLabelProgrammerWindowBackground;
    private javax.swing.JLabel jLabelProgrammerWindowTitle;
    private javax.swing.JList<String> jListPanelSearchesFound;
    private javax.swing.JScrollPane jScrollPanelSearchesFound;
    private javax.swing.JTextField jTextFieldSearcher;
    // End of variables declaration//GEN-END:variables
}
