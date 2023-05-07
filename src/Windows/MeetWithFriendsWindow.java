package Windows;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JList;
import proyectocine.*;

/**
 *
 * @author Juan Diego Suarez Londoño
 */
public class MeetWithFriendsWindow extends javax.swing.JFrame {

    public MeetWithFriendsWindow() throws IOException, FileNotFoundException, ClassNotFoundException {
        programmer=Programmer.getInstance();
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public MeetWithFriendsWindow(Profiles normal) throws IOException, FileNotFoundException, ClassNotFoundException {
        programmer=Programmer.getInstance();
        initComponents();
        this.normal=normal;
        jButtonRemove.setEnabled(false);
        this.setLocationRelativeTo(null); 
        listFriends=new String[this.normal.counter[2]];
        for(int i=0;;i++) {
            if(this.normal.getFriends()[i]!=null) {
                listFriends[i]=this.normal.getFriends()[i];           
            }
            else {
                break;
            }
        }
        jComboBoxFriends.setModel(new javax.swing.DefaultComboBoxModel<>(listFriends)); 
        if((String)jComboBoxFriends.getSelectedItem()==null) {
            jButtonAdd.setEnabled(false);
        }
        else {
            jButtonAdd.setEnabled(true);
        }  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxFriends = new javax.swing.JComboBox<>();
        jScrollPanelFriendsAdded = new javax.swing.JScrollPane();
        jListPanelFriendsAdded = new javax.swing.JList<>();
        jButtonExit = new javax.swing.JButton();
        jButtonReturn = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jButtonRemove = new javax.swing.JButton();
        jButtonDone = new javax.swing.JButton();
        jLabelMeetWithFriendsWindowBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBoxFriends.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFriendsActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxFriends, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 180, -1));

        jScrollPanelFriendsAdded.setViewportView(jListPanelFriendsAdded);

        getContentPane().add(jScrollPanelFriendsAdded, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 164, 300, 210));

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

        jButtonAdd.setBackground(new java.awt.Color(0, 90, 81));
        jButtonAdd.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 75, -1));

        jButtonRemove.setBackground(new java.awt.Color(73, 0, 73));
        jButtonRemove.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRemove.setText("Remove");
        jButtonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 75, -1));

        jButtonDone.setBackground(new java.awt.Color(0, 102, 153));
        jButtonDone.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDone.setText("Done");
        jButtonDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDoneActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDone, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, -1, -1));

        jLabelMeetWithFriendsWindowBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picks/Fondo Azul.png"))); // NOI18N
        getContentPane().add(jLabelMeetWithFriendsWindowBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 342, 423));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReturnActionPerformed
        try {
            MainWindow MW = new MainWindow(normal);
            this.setVisible(false);
            MW.setVisible(true);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonReturnActionPerformed

    private void jComboBoxFriendsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFriendsActionPerformed
        jButtonAdd.setEnabled(true);
        jButtonRemove.setEnabled(false);
        if (listFriendsAdded!=null) {
            for(int i=0;i<listFriendsAdded.length;i++) {
                if(listFriendsAdded[i].equalsIgnoreCase((String)jComboBoxFriends.getSelectedItem())) {
                    jButtonAdd.setEnabled(false);
                    jButtonRemove.setEnabled(true);
                }               
            }
        }
    }//GEN-LAST:event_jComboBoxFriendsActionPerformed
  
    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        String[] temporalList;
        boolean go=false;
        if (listFriendsAdded!=null) {
            temporalList=listFriendsAdded;
            listFriendsAdded=new String[listFriendsAdded.length+1];
            for(int i=0;i<temporalList.length;i++) {
                listFriendsAdded[i]=temporalList[i];
            }
             listFriendsAdded[temporalList.length]=(String)jComboBoxFriends.getSelectedItem();
        }
        else {
            listFriendsAdded=new String[1];
            listFriendsAdded[0]=(String)jComboBoxFriends.getSelectedItem();
        }
        jListPanelFriendsAdded=new JList<String>(listFriendsAdded);  
        jScrollPanelFriendsAdded.setViewportView(jListPanelFriendsAdded); 
        
        temporalList=listFriends;
        listFriends=new String[temporalList.length-1];
        for(int i=0;i<temporalList.length;i++) {
            if(go==true) {
                temporalList[i-1]=temporalList[i];
            }
            if(temporalList[i].equalsIgnoreCase((String)jComboBoxFriends.getSelectedItem())) {
                go=true;
                if(i==temporalList.length-1) {
                    temporalList[i]=null;
                }
            }            
        }
        for(int i=0;i<listFriends.length;i++) {
            listFriends[i]=temporalList[i];           
        }
        jComboBoxFriends.setModel(new javax.swing.DefaultComboBoxModel<>(listFriends));
        if((String)jComboBoxFriends.getSelectedItem()==null) {
            jButtonAdd.setEnabled(false);
        }
        else {
            jButtonAdd.setEnabled(true);
        }
        
        jListPanelFriendsAdded.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) { 
                if(jListPanelFriendsAdded.getSelectedValue()==null) {
                    jButtonRemove.setEnabled(false);
                }
                else {
                    jButtonRemove.setEnabled(true);
                }
            }
        });       
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveActionPerformed
        String[] temporalList;
        boolean go=false;
        if (listFriends!=null) {
            temporalList=listFriends;
            listFriends=new String[listFriends.length+1];
            for(int i=0;i<temporalList.length;i++) {
                listFriends[i]=temporalList[i];
            }
             listFriends[temporalList.length]=jListPanelFriendsAdded.getSelectedValue();
        }
        else {
            listFriends=new String[1];
            listFriends[0]=jListPanelFriendsAdded.getSelectedValue();
        }
        jComboBoxFriends.setModel(new javax.swing.DefaultComboBoxModel<>(listFriends));       
        
        temporalList=listFriendsAdded;
        listFriendsAdded=new String[temporalList.length-1];
        for(int i=0;i<temporalList.length;i++) {
            if(go==true) {
                temporalList[i-1]=temporalList[i];
            }
            if(temporalList[i].equalsIgnoreCase(jListPanelFriendsAdded.getSelectedValue())) {
                go=true;
                if(i==temporalList.length-1) {
                    temporalList[i]=null;
                }
            }            
        }
        for(int i=0;i<listFriendsAdded.length;i++) {
            listFriendsAdded[i]=temporalList[i];           
        }
        
        jListPanelFriendsAdded=new JList<String>(listFriendsAdded);  
        jScrollPanelFriendsAdded.setViewportView(jListPanelFriendsAdded); 
                
        if(listFriendsAdded.length==0 || jListPanelFriendsAdded.getSelectedValue()==null) {
            jListPanelFriendsAdded.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) { 
                if(jListPanelFriendsAdded.getSelectedValue()==null) {
                    jButtonRemove.setEnabled(false);
                }
                else {
                    jButtonRemove.setEnabled(true);
                }
            }
        });
            jButtonRemove.setEnabled(false);
        }
        else {
            jButtonRemove.setEnabled(true);
        }
            jButtonAdd.setEnabled(true);
    }//GEN-LAST:event_jButtonRemoveActionPerformed

    private void jButtonDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDoneActionPerformed
        int[] zize={0,0};
        int[] counterList={0,0};
        String[] list;
        Movie[] ourMovies;
        Series[] ourSeries;
        String[] temporalListMovies;
        String[] temporalListSeries;
        String[] listMovies=new String[0];
        String[] listSeries=new String[0];
        Profiles[] friends;
        if(listFriendsAdded!=null && listFriendsAdded.length!=0) {
            friends=new Profiles[listFriendsAdded.length+1];
            
            for(int i=0;i<friends.length-1;i++) {
                friends[i]=programmer.whatUser(listFriendsAdded[i]);
            }
            friends[friends.length-1]=normal;
            
            for(int i=0;i<friends.length;i++) {
                ourMovies=new Movie[friends[i].counter[0]];
                ourSeries=new Series[friends[i].counter[1]];
                for(int j=0;j<friends[i].counter[0];j++) {
                    ourMovies[j]=programmer.getEqualMovie(friends[i].getMoviesQualified()[j])[0];
                }
                for(int j=0;j<friends[i].counter[1];j++) {
                    ourSeries[j]=programmer.getEqualSeries(friends[i].getSeriesQualified()[j])[0];
                }
                
                temporalListMovies=listMovies;
                temporalListSeries=listSeries;
                int LPM=0;
                int LPS=0;
                listMovies=new String[programmer.moviesRecommended(ourMovies,friends[i]).length+temporalListMovies.length];
                listSeries=new String[programmer.seriesRecommended(ourSeries, friends[i]).length+temporalListSeries.length];
                for(int j=0;j<listMovies.length;j++){
                        listMovies[j]="";
                    }
                for(int j=0;j<listSeries.length;j++){
                        listSeries[j]="";
                    }
                for(int j=0;j<temporalListMovies.length;j++) {
                    listMovies[LPM]=temporalListMovies[j];
                    LPM++;
                }
                for(int j=0;j<programmer.moviesRecommended(ourMovies, friends[i]).length;j++) {
                    listMovies[LPM]="Movie: "+programmer.moviesRecommended(ourMovies, friends[i])[j];
                    LPM++;
                } 
                for(int j=0;j<temporalListSeries.length;j++) {
                    listSeries[LPS]=temporalListSeries[j];  
                    LPS++;
                }
                for(int j=0;j<programmer.seriesRecommended(ourSeries, friends[i]).length;j++) {
                    listSeries[LPS]="Series: "+programmer.seriesRecommended(ourSeries, friends[i])[j];
                    LPS++;
                }
            }
            int LP=0;
            list=new String[programmer.eraseRepeated(listMovies).length+programmer.eraseRepeated(listSeries).length];
            for(int i=0;i<programmer.eraseRepeated(listMovies).length;i++) {
                list[LP]=programmer.eraseRepeated(listMovies)[i];
                LP++;
            }
            for(int i=0;i<programmer.eraseRepeated(listSeries).length;i++) {
                list[LP]=programmer.eraseRepeated(listSeries)[i];
                LP++;
            }
            list=programmer.eraseMSSeen(list,friends);            
            try {
                MainWindow MW = new MainWindow(normal,list);
                this.setVisible(false);
                MW.setVisible(true);
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButtonDoneActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MeetWithFriendsWindow().setVisible(true);
                } catch (IOException | ClassNotFoundException ex) {
                    Logger.getLogger(MeetWithFriendsWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    private Programmer programmer;
    private Profiles normal;
    private String[] listFriends;
    private String[] listFriendsAdded;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonDone;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JButton jButtonReturn;
    private javax.swing.JComboBox<String> jComboBoxFriends;
    private javax.swing.JLabel jLabelMeetWithFriendsWindowBackground;
    private javax.swing.JList<String> jListPanelFriendsAdded;
    private javax.swing.JScrollPane jScrollPanelFriendsAdded;
    // End of variables declaration//GEN-END:variables
}
