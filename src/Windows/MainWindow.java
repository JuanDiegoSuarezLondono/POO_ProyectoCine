package Windows;

import java.awt.Color;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JList;
import proyectocine.*;

/**
 *
 * @author Juan Diego Suarez Londoño
 */
public class MainWindow extends javax.swing.JFrame {

    public MainWindow() throws IOException, FileNotFoundException, ClassNotFoundException {
        programmer=Programmer.getInstance();
        initComponents();    
        this.setLocationRelativeTo(null);
    }
    
    public MainWindow(Profiles normal) throws IOException, FileNotFoundException, ClassNotFoundException {
        programmer=Programmer.getInstance();
        initComponents(); 
        jDialogCaution.setVisible(false);
        jDialogCaution.setLocationRelativeTo(null);
        this.normal=normal;
        jLabelUserName.setText("Welcome "+normal.getName());
        jButtonRestore.setEnabled(false);
        jSliderQualification.setEnabled(false);
        if(normal.getWhat().equalsIgnoreCase("Critic")) {
            jButtonOnlyCriticUsers.setVisible(false);
        }
        jTextAreaReview.setEnabled(false);
        jButtonSubmit.setEnabled(false);
        jButtonAdd.setEnabled(false);
        jButtonDelete.setEnabled(false);
        this.setLocationRelativeTo(null);
    }

    public MainWindow(Profiles normal,String[] list) throws IOException, FileNotFoundException, ClassNotFoundException {
        programmer=Programmer.getInstance();
        initComponents(); 
        this.normal=normal;
        jLabelUserName.setText("Welcome "+normal.getName());
        jButtonRestore.setEnabled(false);
        jSliderQualification.setEnabled(false);
        if(normal.getWhat().equalsIgnoreCase("Critic")) {
            jButtonOnlyCriticUsers.setVisible(false);
        }
        jTextAreaReview.setEnabled(false);
        jButtonSubmit.setEnabled(false);
        jButtonAdd.setEnabled(false);
        jButtonDelete.setEnabled(false);
        this.setLocationRelativeTo(null);
        jListPanelSearchesFound=new JList<String>(list);  
        jScrollPanelSearchesFound.setViewportView(jListPanelSearchesFound);
        if(list.length!=0){
            jListPanelSearchesFound.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {                 
                    jSliderQualification.setEnabled(true);
                    jButtonAdd.setEnabled(false);
                    jButtonDelete.setEnabled(false);                    
                    jButtonRestore.setEnabled(true);
                    if(jListPanelSearchesFound.getSelectedValue().startsWith("Movie")) {
                        jSliderQualification.setValue(programmer.getMovies()[programmer.getEqualMovie(jListPanelSearchesFound.getSelectedValue().replace("Movie: ",""))[0].getAvWNumber()].getQualfication()[normal.getUserNumber()]);
                        jTextAreaReview.setText(programmer.getEqualMovie(jListPanelSearchesFound.getSelectedValue().replace("Movie: ",""))[0].getReview()[normal.getUserNumber()]);
                        
                    }
                    else if(jListPanelSearchesFound.getSelectedValue().startsWith("Series")){
                        jSliderQualification.setValue(programmer.getSeries()[programmer.getEqualSeries(jListPanelSearchesFound.getSelectedValue().replace("Series: ",""))[0].getAvWNumber()].getQualfication()[normal.getUserNumber()]);
                        jTextAreaReview.setText(programmer.getEqualSeries(jListPanelSearchesFound.getSelectedValue().replace("Series: ",""))[0].getReview()[normal.getUserNumber()]);
                    }
                    if(jSliderQualification.getValue()!=0 && normal.getWhat().equalsIgnoreCase("Critic")) { 
                        jButtonSubmit.setEnabled(true);
                        jTextAreaReview.setEnabled(true);                        
                    }
                    else {
                        jButtonSubmit.setEnabled(false);
                        jTextAreaReview.setEnabled(false);
                    }
                }
            });
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jDialogCaution = new javax.swing.JDialog();
        jScrollPaneConditions = new javax.swing.JScrollPane();
        jTextAreaTermns = new javax.swing.JTextArea();
        jButtonAccept = new javax.swing.JButton();
        jButtonDecline = new javax.swing.JButton();
        jLabelCupHeadDevil = new javax.swing.JLabel();
        jSliderQualification = new javax.swing.JSlider();
        jLabelLents = new javax.swing.JLabel();
        jTextFieldSearcher = new javax.swing.JTextField();
        jButtonDelete = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jButtonSubmit = new javax.swing.JButton();
        jButtonRestore = new javax.swing.JButton();
        WhatDoYouSuggest = new javax.swing.JButton();
        jButtonMeetWithFriends = new javax.swing.JButton();
        jButtonMyQualifications = new javax.swing.JButton();
        jButtonReturn = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jButtonOnlyCriticUsers = new javax.swing.JButton();
        jScrollPaneReview = new javax.swing.JScrollPane();
        jTextAreaReview = new javax.swing.JTextArea();
        jScrollPanelSearchesFound = new javax.swing.JScrollPane();
        jListPanelSearchesFound = new javax.swing.JList<>();
        jLabelUserName = new javax.swing.JLabel();
        jLabelReview = new javax.swing.JLabel();
        jLabelMainWindowBackground = new javax.swing.JLabel();

        jDialogCaution.setUndecorated(true);
        jDialogCaution.setPreferredSize(new java.awt.Dimension(300, 120));
        jDialogCaution.setSize(new java.awt.Dimension(315, 310));
        jDialogCaution.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPaneConditions.setBackground(new java.awt.Color(255, 255, 255, 0));
        jScrollPaneConditions.setBorder(null);
        jScrollPaneConditions.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneConditions.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPaneConditions.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextAreaTermns.setEditable(false);
        jTextAreaTermns.setBackground(new java.awt.Color(255, 255, 255, 0));
        jTextAreaTermns.setColumns(20);
        jTextAreaTermns.setRows(5);
        jTextAreaTermns.setText("If you accept get the critic account, you will sell us \n your soul for all the eternity and will leave us share \nand sell your personal information to koreans gangs");
        jTextAreaTermns.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPaneConditions.setViewportView(jTextAreaTermns);

        jDialogCaution.getContentPane().add(jScrollPaneConditions, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 60));

        jButtonAccept.setText("Accept");
        jButtonAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcceptActionPerformed(evt);
            }
        });
        jDialogCaution.getContentPane().add(jButtonAccept, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jButtonDecline.setText("Decline");
        jButtonDecline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeclineActionPerformed(evt);
            }
        });
        jDialogCaution.getContentPane().add(jButtonDecline, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));

        jLabelCupHeadDevil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picks/DevilI Cup Head.png"))); // NOI18N
        jDialogCaution.getContentPane().add(jLabelCupHeadDevil, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 260, 230));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSliderQualification.setBackground(new java.awt.Color(0, 0, 153));
        jSliderQualification.setForeground(new java.awt.Color(255, 255, 255));
        jSliderQualification.setMajorTickSpacing(1);
        jSliderQualification.setMaximum(5);
        jSliderQualification.setMinorTickSpacing(1);
        jSliderQualification.setPaintLabels(true);
        jSliderQualification.setToolTipText("");
        jSliderQualification.setValue(0);
        jSliderQualification.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jSliderQualification.setOpaque(false);
        jSliderQualification.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderQualificationStateChanged(evt);
            }
        });
        getContentPane().add(jSliderQualification, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 162, 40));

        jLabelLents.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picks/Lents.png"))); // NOI18N
        getContentPane().add(jLabelLents, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 214, 22, 22));

        jTextFieldSearcher.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldSearcher.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSearcherKeyReleased(evt);
            }
        });
        getContentPane().add(jTextFieldSearcher, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 300, -1));

        jButtonDelete.setBackground(new java.awt.Color(153, 0, 0));
        jButtonDelete.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 300, -1, -1));

        jButtonAdd.setBackground(new java.awt.Color(0, 153, 0));
        jButtonAdd.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jButtonAdd.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 60, -1));

        jButtonSubmit.setBackground(new java.awt.Color(0, 102, 153));
        jButtonSubmit.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jButtonSubmit.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSubmit.setText("Submit");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, -1, -1));

        jButtonRestore.setBackground(new java.awt.Color(0, 102, 153));
        jButtonRestore.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jButtonRestore.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRestore.setText("Restore");
        jButtonRestore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRestoreActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRestore, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 102, -1, -1));

        WhatDoYouSuggest.setBackground(new java.awt.Color(0, 102, 153));
        WhatDoYouSuggest.setForeground(new java.awt.Color(255, 255, 255));
        WhatDoYouSuggest.setText("¿What do you suggest?");
        WhatDoYouSuggest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WhatDoYouSuggestActionPerformed(evt);
            }
        });
        getContentPane().add(WhatDoYouSuggest, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 162, -1));

        jButtonMeetWithFriends.setBackground(new java.awt.Color(0, 102, 153));
        jButtonMeetWithFriends.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMeetWithFriends.setText("Meet with friends");
        jButtonMeetWithFriends.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMeetWithFriendsActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMeetWithFriends, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 173, 162, -1));

        jButtonMyQualifications.setBackground(new java.awt.Color(0, 102, 153));
        jButtonMyQualifications.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMyQualifications.setText("My qualifications");
        jButtonMyQualifications.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMyQualificationsActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMyQualifications, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, 62));

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

        jButtonOnlyCriticUsers.setBackground(new java.awt.Color(255, 255, 255, 0));
        jButtonOnlyCriticUsers.setText("Only critcs users");
        jButtonOnlyCriticUsers.setBorder(null);
        jButtonOnlyCriticUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonOnlyCriticUsersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonOnlyCriticUsersMouseExited(evt);
            }
        });
        jButtonOnlyCriticUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOnlyCriticUsersActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOnlyCriticUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, -1, -1));

        jTextAreaReview.setColumns(8);
        jTextAreaReview.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jTextAreaReview.setLineWrap(true);
        jTextAreaReview.setRows(1);
        jScrollPaneReview.setViewportView(jTextAreaReview);

        getContentPane().add(jScrollPaneReview, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 326, 300, 60));

        jScrollPanelSearchesFound.setViewportView(jListPanelSearchesFound);

        getContentPane().add(jScrollPanelSearchesFound, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 242, 300, 60));

        jLabelUserName.setFont(new java.awt.Font("Sylfaen", 1, 28)); // NOI18N
        jLabelUserName.setForeground(new java.awt.Color(255, 255, 255));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jListPanelSearchesFound, org.jdesktop.beansbinding.ObjectProperty.create(), jLabelUserName, org.jdesktop.beansbinding.BeanProperty.create("labelFor"));
        bindingGroup.addBinding(binding);

        getContentPane().add(jLabelUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jLabelReview.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jLabelReview.setForeground(new java.awt.Color(255, 255, 255));
        jLabelReview.setText("Review:");
        getContentPane().add(jLabelReview, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 305, -1, -1));

        jLabelMainWindowBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picks/Fondo Azul.png"))); // NOI18N
        getContentPane().add(jLabelMainWindowBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 342, 423));

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void WhatDoYouSuggestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WhatDoYouSuggestActionPerformed
        jTextAreaReview.setText(null);
        normal=programmer.getUsers()[normal.getUserNumber()];
        jTextFieldSearcher.setText("");
        jTextAreaReview.setEnabled(false);
        jButtonSubmit.setEnabled(false);
        jSliderQualification.setValue(0);
        jSliderQualification.setEnabled(false);
        jButtonRestore.setEnabled(false);
        Movie[] myMovies=new Movie[normal.counter[0]];
        Series[] mySeries=new Series[normal.counter[1]];
        for(int i=0;i<normal.counter[0];i++) {
            myMovies[i]=programmer.getEqualMovie(normal.getMoviesQualified()[i])[0];
        }
        for(int i=0;i<normal.counter[1];i++) {
            mySeries[i]=programmer.getEqualSeries(normal.getSeriesQualified()[i])[0];
        }
        
        list=new String[programmer.moviesRecommended(myMovies,normal).length+programmer.seriesRecommended(mySeries, normal).length];
        for(int i=0;i<list.length;i++){
                list[i]="";
            }
        int LP=0;
        for(int i=0;i<programmer.moviesRecommended(myMovies, normal).length;i++) {
                list[LP]="Movie: "+programmer.moviesRecommended(myMovies, normal)[i];    
                LP++;
            }
            for(int i=0;i<programmer.seriesRecommended(mySeries, normal).length;i++) {
                    list[LP]="Series: "+programmer.seriesRecommended(mySeries, normal)[i];  
                LP++;
            }
        jListPanelSearchesFound=new JList<String>(list);  
        jScrollPanelSearchesFound.setViewportView(jListPanelSearchesFound);
        
        jListPanelSearchesFound.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {                 
                jSliderQualification.setEnabled(true);
                jButtonAdd.setEnabled(false);
                jButtonDelete.setEnabled(false);                    
                jButtonRestore.setEnabled(true);
                if(jListPanelSearchesFound.getSelectedValue().startsWith("Movie")) {
                    jSliderQualification.setValue(programmer.getMovies()[programmer.getEqualMovie(jListPanelSearchesFound.getSelectedValue().replace("Movie: ",""))[0].getAvWNumber()].getQualfication()[normal.getUserNumber()]);
                    jTextAreaReview.setText(programmer.getEqualMovie(jListPanelSearchesFound.getSelectedValue().replace("Movie: ",""))[0].getReview()[normal.getUserNumber()]);
                }
                else if(jListPanelSearchesFound.getSelectedValue().startsWith("Series")){
                    jSliderQualification.setValue(programmer.getSeries()[programmer.getEqualSeries(jListPanelSearchesFound.getSelectedValue().replace("Series: ",""))[0].getAvWNumber()].getQualfication()[normal.getUserNumber()]);
                    jTextAreaReview.setText(programmer.getEqualSeries(jListPanelSearchesFound.getSelectedValue().replace("Series: ",""))[0].getReview()[normal.getUserNumber()]);
                }
                if(jSliderQualification.getValue()!=0 && normal.getWhat().equalsIgnoreCase("Critic")) { 
                    jButtonSubmit.setEnabled(true);
                    jTextAreaReview.setEnabled(true);
                }
                else {
                    jButtonSubmit.setEnabled(false);
                    jTextAreaReview.setEnabled(false);
                }
            }
        });
    }//GEN-LAST:event_WhatDoYouSuggestActionPerformed

    private void jButtonMyQualificationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMyQualificationsActionPerformed
        jTextAreaReview.setText(null);
        jTextFieldSearcher.setText("");
        list=new String[programmer.getUsers()[normal.getUserNumber()].getTotalQualifications()];
        for(int i=0;i<programmer.getUsers()[normal.getUserNumber()].getTotalQualifications();i++){
                list[i]="";
            }        
            int LP=0;
            jSliderQualification.setValue(0);
            jButtonRestore.setEnabled(false);
            jSliderQualification.setEnabled(false);
            jTextAreaReview.setEnabled(false);
            jButtonSubmit.setEnabled(false);
            jButtonAdd.setEnabled(false);
            jButtonDelete.setEnabled(false);
            for(int i=0;i<programmer.getUsers()[normal.getUserNumber()].counter[0];i++) {
                list[LP]="Movie: "+programmer.getUsers()[normal.getUserNumber()].getMoviesQualified()[i];    
                LP++;
            }
            for(int i=0;i<programmer.getUsers()[normal.getUserNumber()].counter[1];i++) {
                list[LP]="Series: "+programmer.getUsers()[normal.getUserNumber()].getSeriesQualified()[i];  
                LP++;
            }
        
        
        jListPanelSearchesFound=new JList<String>(list);
        
        jListPanelSearchesFound.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {                 
                jSliderQualification.setEnabled(true);
                jButtonAdd.setEnabled(false);
                jButtonDelete.setEnabled(false);                    
                jButtonRestore.setEnabled(true);
                if(jListPanelSearchesFound.getSelectedValue().startsWith("Movie")) {
                    jSliderQualification.setValue(programmer.getMovies()[programmer.getEqualMovie(jListPanelSearchesFound.getSelectedValue().replace("Movie: ",""))[0].getAvWNumber()].getQualfication()[normal.getUserNumber()]);
                    jTextAreaReview.setText(programmer.getEqualMovie(jListPanelSearchesFound.getSelectedValue().replace("Movie: ",""))[0].getReview()[normal.getUserNumber()]);
                }
                else if(jListPanelSearchesFound.getSelectedValue().startsWith("Series")){
                    jSliderQualification.setValue(programmer.getSeries()[programmer.getEqualSeries(jListPanelSearchesFound.getSelectedValue().replace("Series: ",""))[0].getAvWNumber()].getQualfication()[normal.getUserNumber()]);
                    jTextAreaReview.setText(programmer.getEqualSeries(jListPanelSearchesFound.getSelectedValue().replace("Series: ",""))[0].getReview()[normal.getUserNumber()]);
                }
                if(jSliderQualification.getValue()!=0 && normal.getWhat().equalsIgnoreCase("Critic")) { 
                    jButtonSubmit.setEnabled(true);
                    jTextAreaReview.setEnabled(true);
                }
                else {
                    jButtonSubmit.setEnabled(false);
                    jTextAreaReview.setEnabled(false);
                }
            }
        });
        jScrollPanelSearchesFound.setViewportView(jListPanelSearchesFound);
    }//GEN-LAST:event_jButtonMyQualificationsActionPerformed

    private void jButtonReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReturnActionPerformed
        try {
            LoginWindow LG = new LoginWindow();
            this.setVisible(false);
            LG.setVisible(true);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_jButtonReturnActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jTextFieldSearcherKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearcherKeyReleased
        list=new String[programmer.getTotalCounters()-1];
        for(int i=0;i<programmer.getTotalCounters()-1;i++){
                list[i]="";
            }
        
        if(!(jTextFieldSearcher.getText().trim().isEmpty() && (evt.getKeyCode()<33 || evt.getKeyCode()>165))) {
            int LP=0;
            jSliderQualification.setValue(0);
            jButtonRestore.setEnabled(false);
            jSliderQualification.setEnabled(false);
            jTextAreaReview.setEnabled(false);
            jButtonSubmit.setEnabled(false);
            jButtonAdd.setEnabled(false);
            jButtonDelete.setEnabled(false);
            for(int i=0;;i++) {
                if(programmer.getEqualUser(jTextFieldSearcher.getText())[i]!=null) {
                    if(!normal.getName().equalsIgnoreCase(programmer.getEqualUser(jTextFieldSearcher.getText())[i].getName())) {
                        list[LP]="User: "+programmer.getEqualUser(jTextFieldSearcher.getText())[i].getName(); 
                        LP++;
                    }                    
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
                    if(normal.friendExist(jListPanelSearchesFound.getSelectedValue().replace("User: ", ""))) {
                        jButtonDelete.setEnabled(true);
                        jButtonAdd.setEnabled(false);
                    }
                    else {                        
                        jButtonAdd.setEnabled(true);
                        jButtonDelete.setEnabled(false);
                    }
                    jSliderQualification.setEnabled(false);
                    jButtonRestore.setEnabled(false);
                }                 
                else if(jListPanelSearchesFound.getSelectedValue().startsWith("Movie") || jListPanelSearchesFound.getSelectedValue().startsWith("Series")) {                    
                    jSliderQualification.setEnabled(true);
                    jButtonAdd.setEnabled(false);
                    jButtonDelete.setEnabled(false);                    
                    jButtonRestore.setEnabled(true);                    
                    if(jListPanelSearchesFound.getSelectedValue().startsWith("Movie")) {
                        jSliderQualification.setValue(programmer.getMovies()[programmer.getEqualMovie(jListPanelSearchesFound.getSelectedValue().replace("Movie: ",""))[0].getAvWNumber()].getQualfication()[normal.getUserNumber()]);
                        jTextAreaReview.setText(programmer.getEqualMovie(jListPanelSearchesFound.getSelectedValue().replace("Movie: ",""))[0].getReview()[normal.getUserNumber()]);
                    }
                    else if(jListPanelSearchesFound.getSelectedValue().startsWith("Series")){
                        jSliderQualification.setValue(programmer.getSeries()[programmer.getEqualSeries(jListPanelSearchesFound.getSelectedValue().replace("Series: ",""))[0].getAvWNumber()].getQualfication()[normal.getUserNumber()]);
                        jTextAreaReview.setText(programmer.getEqualSeries(jListPanelSearchesFound.getSelectedValue().replace("Series: ",""))[0].getReview()[normal.getUserNumber()]);
                    }
                    if(jSliderQualification.getValue()!=0 && normal.getWhat().equalsIgnoreCase("Critic")) { 
                        jButtonSubmit.setEnabled(true);
                        jTextAreaReview.setEnabled(true);
                    }
                    else {
                        jButtonSubmit.setEnabled(false);
                        jTextAreaReview.setEnabled(false);
                    }
                }
             }
        });
        jScrollPanelSearchesFound.setViewportView(jListPanelSearchesFound);
    }//GEN-LAST:event_jTextFieldSearcherKeyReleased

    private void jButtonMeetWithFriendsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMeetWithFriendsActionPerformed
        normal=programmer.getUsers()[normal.getUserNumber()];
        try {
            MeetWithFriendsWindow MWFW = new MeetWithFriendsWindow(normal);
            this.setVisible(false);
            MWFW.setVisible(true);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonMeetWithFriendsActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        if(normal.getWhat().equals("User")) {
            programmer.getUsers()[normal.getUserNumber()].setFriend(jListPanelSearchesFound.getSelectedValue().replace("User: ", ""));        
            try {
                programmer.setUsersBin();
            } catch (IOException ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        }       
        jButtonAdd.setEnabled(false);
        jButtonDelete.setEnabled(true);
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        programmer.getUsers()[normal.getUserNumber()].deleteFriend(jListPanelSearchesFound.getSelectedValue().replace("User: ", ""));
        try {
            programmer.setUsersBin();
        } catch (IOException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        jButtonAdd.setEnabled(true);
        jButtonDelete.setEnabled(false);
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jSliderQualificationStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderQualificationStateChanged
        if(jSliderQualification.getValueIsAdjusting()) {
            if(jSliderQualification.getValue()!=0 && normal.getWhat().equalsIgnoreCase("Critic")) { 
                jButtonSubmit.setEnabled(true);
                jTextAreaReview.setEnabled(true);
            }
            else {
                jTextAreaReview.setText("");
                jButtonSubmit.setEnabled(false);
                jTextAreaReview.setEnabled(false);
            }
            if(jListPanelSearchesFound.getSelectedValue().startsWith("Movie")) {
                programmer.getMovies()[programmer.getEqualMovie(jListPanelSearchesFound.getSelectedValue().replace("Movie: ",""))[0].getAvWNumber()].setQualify(jSliderQualification.getValue(),normal.getUserNumber());
                if(!programmer.getUsers()[normal.getUserNumber()].moviesQualifiedExist(jListPanelSearchesFound.getSelectedValue().replace("Movie: ",""))) {
                    programmer.getUsers()[normal.getUserNumber()].setMoviesQualified(jListPanelSearchesFound.getSelectedValue().replace("Movie: ",""));
                }
                else if(jSliderQualification.getValue()==0) {
                    programmer.getUsers()[normal.getUserNumber()].deleteMovies(jListPanelSearchesFound.getSelectedValue().replace("Movie: ",""));
                    programmer.getEqualMovie(jListPanelSearchesFound.getSelectedValue().replace("Movie: ",""))[0].setReview(null,normal.getUserNumber());
                    jTextAreaReview.setText(null);
                }       
                
                try {
                    programmer.setMoviesBin();                    
                } catch (IOException ex) {
                    Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                }                
            }
            else if(jListPanelSearchesFound.getSelectedValue().startsWith("Series")){
                programmer.getSeries()[programmer.getEqualSeries(jListPanelSearchesFound.getSelectedValue().replace("Series: ",""))[0].getAvWNumber()].setQualify(jSliderQualification.getValue(),normal.getUserNumber());
                if(!programmer.getUsers()[normal.getUserNumber()].seriesQualifiedExist(jListPanelSearchesFound.getSelectedValue().replace("Series: ",""))) {
                    programmer.getUsers()[normal.getUserNumber()].setSeriesQualified(jListPanelSearchesFound.getSelectedValue().replace("Series: ",""));
                }
                else if(jSliderQualification.getValue()==0) {
                    programmer.getUsers()[normal.getUserNumber()].deleteSeries(jListPanelSearchesFound.getSelectedValue().replace("Series: ",""));
                    programmer.getEqualSeries(jListPanelSearchesFound.getSelectedValue().replace("Series: ",""))[0].setReview(null,normal.getUserNumber());
                    jTextAreaReview.setText(null);
                }
                try {
                    programmer.setSeriesBin();
                } catch (IOException ex) {
                    Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                }                
            }
            try {
                programmer.setUsersBin();
            } catch (IOException ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jSliderQualificationStateChanged

    private void jButtonRestoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRestoreActionPerformed
        jSliderQualification.setValue(0);
        if(jSliderQualification.getValue()!=0 && normal.getWhat().equalsIgnoreCase("Critic")) { 
            jButtonSubmit.setEnabled(true);
            jTextAreaReview.setEnabled(true);
        }
        else {
            jButtonSubmit.setEnabled(false);
            jTextAreaReview.setEnabled(false);
        }
        if(jListPanelSearchesFound.getSelectedValue().startsWith("Movie")) {
            programmer.getEqualMovie(jListPanelSearchesFound.getSelectedValue().replace("Movie: ",""))[0].setReview(null,normal.getUserNumber());
            jTextAreaReview.setText(null);
            programmer.getMovies()[programmer.getEqualMovie(jListPanelSearchesFound.getSelectedValue().replace("Movie: ",""))[0].getAvWNumber()].setQualify(jSliderQualification.getValue(),normal.getUserNumber());
            programmer.getUsers()[normal.getUserNumber()].deleteMovies(jListPanelSearchesFound.getSelectedValue().replace("Movie: ",""));
            try {
                programmer.setMoviesBin();
            } 
            catch (IOException ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            }                        
        }
        else if(jListPanelSearchesFound.getSelectedValue().startsWith("Series")){
            programmer.getEqualSeries(jListPanelSearchesFound.getSelectedValue().replace("Series: ",""))[0].setReview(null,normal.getUserNumber());
            jTextAreaReview.setText(null);
            programmer.getSeries()[programmer.getEqualSeries(jListPanelSearchesFound.getSelectedValue().replace("Series: ",""))[0].getAvWNumber()].setQualify(jSliderQualification.getValue(),normal.getUserNumber());
            programmer.getUsers()[normal.getUserNumber()].deleteSeries(jListPanelSearchesFound.getSelectedValue().replace("Series: ",""));
            try {
                programmer.setSeriesBin();
            } 
            catch (IOException ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            }                          
        }
        try {
            programmer.setUsersBin();
        } catch (IOException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonRestoreActionPerformed

    private void jButtonOnlyCriticUsersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonOnlyCriticUsersMouseEntered
        jButtonOnlyCriticUsers.setForeground(Color.GREEN);
    }//GEN-LAST:event_jButtonOnlyCriticUsersMouseEntered

    private void jButtonOnlyCriticUsersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonOnlyCriticUsersMouseExited
        jButtonOnlyCriticUsers.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButtonOnlyCriticUsersMouseExited

    private void jButtonOnlyCriticUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOnlyCriticUsersActionPerformed
        jDialogCaution.setVisible(true);
        setEnabled(false);
    }//GEN-LAST:event_jButtonOnlyCriticUsersActionPerformed

    private void jButtonAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcceptActionPerformed
        jDialogCaution.setVisible(false);
        jButtonOnlyCriticUsers.setVisible(false);
        programmer.getUsers()[normal.getUserNumber()].setWhat();
        normal=programmer.getUsers()[normal.getUserNumber()];
        try {
            programmer.setUsersBin();
        } catch (IOException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        setVisible(true);
        setEnabled(true);
    }//GEN-LAST:event_jButtonAcceptActionPerformed

    private void jButtonDeclineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeclineActionPerformed
        jDialogCaution.setVisible(false);        
        setVisible(true);
        setEnabled(true);
    }//GEN-LAST:event_jButtonDeclineActionPerformed

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
        if(jListPanelSearchesFound.getSelectedValue().startsWith("Movie")) {
            programmer.getEqualMovie(jListPanelSearchesFound.getSelectedValue().replace("Movie: ",""))[0].setReview(jTextAreaReview.getText(), normal.getUserNumber());    
            try {
                programmer.setMoviesBin();
            } catch (IOException ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(jListPanelSearchesFound.getSelectedValue().startsWith("Series")){
            programmer.getEqualSeries(jListPanelSearchesFound.getSelectedValue().replace("Series: ",""))[0].setReview(jTextAreaReview.getText(), normal.getUserNumber());
            try {
                programmer.setSeriesBin();
            } catch (IOException ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButtonSubmitActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainWindow().setVisible(true);
                } catch (IOException | ClassNotFoundException ex) {
                    Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    private Programmer programmer;
    private String[] list;
    private Profiles normal;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton WhatDoYouSuggest;
    private javax.swing.JButton jButtonAccept;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonDecline;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonMeetWithFriends;
    private javax.swing.JButton jButtonMyQualifications;
    private javax.swing.JButton jButtonOnlyCriticUsers;
    private javax.swing.JButton jButtonRestore;
    private javax.swing.JButton jButtonReturn;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JDialog jDialogCaution;
    private javax.swing.JLabel jLabelCupHeadDevil;
    private javax.swing.JLabel jLabelLents;
    private javax.swing.JLabel jLabelMainWindowBackground;
    private javax.swing.JLabel jLabelReview;
    private javax.swing.JLabel jLabelUserName;
    private javax.swing.JList<String> jListPanelSearchesFound;
    private javax.swing.JScrollPane jScrollPaneConditions;
    private javax.swing.JScrollPane jScrollPaneReview;
    private javax.swing.JScrollPane jScrollPanelSearchesFound;
    private javax.swing.JSlider jSliderQualification;
    private javax.swing.JTextArea jTextAreaReview;
    private javax.swing.JTextArea jTextAreaTermns;
    private javax.swing.JTextField jTextFieldSearcher;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
