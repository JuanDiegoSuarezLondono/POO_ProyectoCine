package proyectocine;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juan Diego Suarez Londoño
 */
public final class Programmer extends User {   
    private static Programmer instance;
    
    private ReadWriteObject rwo=new ReadWriteObject(); 
    private ReadWriteData rwd=new ReadWriteData();    
    private static int length;
    private static Profiles[] users;
    private static AudiovisualWork[] avwm;
    private static AudiovisualWork[] avws;
    private Profiles admin[];
    private static int[] counters=new int[3];
    
    private File bin=new File("Bin");
    private File countersbin=new File("Bin","Counters.jdl");    
    private File usersbin=new File("Bin","Users.jdl");
    private File moviesbin=new File("Bin","Movies.jdl");
    private File seriesbin=new File("Bin","Series.jdl");
    private File adminbin=new File("Bin","Admin.jdl");
    
    public Programmer() throws IOException, FileNotFoundException, ClassNotFoundException {        
        super("admin","admin", -1); 
        length=50;
        admin=new Profiles[1];
        users=new Profiles[length];
        avwm=new Movie[length];
        avws=new Series[length];
        bin.mkdir();        
        if(adminbin.createNewFile()) {            
            admin[0]=new Profiles(getName(),getPassword(),getUserNumber());
            rwo.write(adminbin,false,admin);
        }       
        else {
            admin=(Profiles[])rwo.read(adminbin, admin);
            setName(admin[0].getName());
            setPassword(admin[0].getPassword());
        }        
        if(countersbin.createNewFile()) {
            rwd.writeInt(countersbin, true, counters);               
        }
        else {
            rwd.readInt(countersbin, counters);
        }
        
        if(usersbin.createNewFile()) {
            rwo.write(usersbin,false,users);
        }
        
        else {
            users=(Profiles[])rwo.read(usersbin, users);
        } 
        
        if(moviesbin.createNewFile()) {
            rwo.write(moviesbin, false, avwm);
        }
        else {
            avwm=(Movie[]) rwo.read(moviesbin, avwm);
        }        
        
        if(seriesbin.createNewFile()) {
            rwo.write(seriesbin, false, avws);
        }
        else{
            avws=(Series[]) rwo.read(seriesbin, avws);
        }
    }
    
    public static Programmer getInstance() throws IOException, FileNotFoundException, ClassNotFoundException {        
        if(instance==null) {
            instance=new Programmer();
        }        
        return instance;
    }
    
    public String getName() {
        return name;
    }
    
    public String getPassword() {
        return password;
    }

    public static int getLength() {
        return length;
    }    
    
    public void setAdminBin() throws IOException {
        admin[0]=new Profiles(getName(),getPassword(),getUserNumber());
        rwo.write(adminbin,false,admin);
    }
    
    public File getBin() {
        return bin;
    }

    public File getCountersBin() {
        return countersbin;
    }  
    
    public File getUsersBin() {
        return usersbin;
    }

    public void setUsersBin() throws IOException {           
        rwo.write(usersbin, false, users);
    }

    public File getMoviesBin() {
        return moviesbin;
    }

    public void setMoviesBin() throws IOException {
        rwo.write(moviesbin, false, avwm);
    }
    
    public File getSeriesBin() {
        return seriesbin;
    }

    public void setSeriesBin() throws IOException {
        rwo.write(seriesbin, false, avws);
    }
    
    public static int[] getCounters() {
        return counters;
    }
    
    public int getTotalCounters() {
        return counters[0]+counters[1]+counters[2];
    }
    
    public static Profiles[] getUsers() {
        return users;
    }
        
    public void setUser(Profiles user) throws IOException {
        this.users[counters[0]]= user;
        counters[0]++;
        rwd.writeInt(countersbin, false, counters);
    }
    
    public Profiles[] getEqualUser(String text) {
        Profiles[] equalsusers=new Profiles[length];
        int counter=0;        
        for(int i=0;;i++){
            if(users[i]!=null){                
                if(users[i].getName().toLowerCase().contains(text.toLowerCase())){                    
                    equalsusers[counter]=(Profiles) users[i];
                    counter++;
                }                
            }
            else {
                break;
            }
        }    
        return equalsusers;       
    }
    
    public void editUser(Profiles user) throws IOException {
        user.setMovies(users[user.getUserNumber()].getMoviesQualified());
        user.setSeries(users[user.getUserNumber()].getSeriesQualified());
        user.setFriends(users[user.getUserNumber()].getFriends());
        user.setCounter(users[user.getUserNumber()].counter);
        user.setWhatOther(users[user.getUserNumber()].getWhat());
        if(!users[user.getUserNumber()].getName().equalsIgnoreCase(user.getName())) {
            for(int i=0;i<users.length;i++) {
                if(users[i]!=null) {
                    for(int j=0;j<users[i].getFriends().length;j++) {
                        if(users[i].getFriends()[j]!=null){
                            if(users[i].getFriends()[j].equalsIgnoreCase(users[user.getUserNumber()].getName())) {
                                users[i].getFriends()[j]=user.getName();
                                    break;
                            }
                        }
                        else {
                            break;
                        }
                    }
                }  
                else {
                    break;
                }
            }
        }
        setUsersBin();
        this.users[user.getUserNumber()]=user;
        rwo.write(usersbin, false, users); 
    }
    
    public void deleteUser(int usernumber) throws IOException {
        for(int i=0;i<length;i++) {
                    if(avwm[i]!=null) {
                        avwm[i].setQualify(0,usernumber);
                        avwm[i].setReview(null, usernumber);
                    }
                    if(avws[i]!=null) {
                        avws[i].setQualify(0,usernumber);
                        avws[i].setReview(null, usernumber);
                    }
                    if(avwm[i]==null && avws[i]==null){
                        break;
                    }
                }
        setMoviesBin();
        setSeriesBin();
        for(int i=usernumber;;i++){
            if(users[i+1]!=null) {
                users[i]=users[i+1];
                users[i].setUserNumber(i);
            }
            else {
                users[i]=null;
                break;
            }
        }
        counters[0]--;
        rwd.writeInt(countersbin, false, counters);        
    }    
    
    public static Movie[] getMovies() {
        return (Movie[]) avwm;
    }
    
    public void setMovie(Movie movie) throws IOException {
        avwm[counters[1]]=movie;
        counters[1]++;
        rwd.writeInt(countersbin, false, counters);
    }
        
    public Movie[] getEqualMovie(String text){
        Movie[] equalsmovies=new Movie[length];
        int counter=0;        
        for(int i=0;;i++){
            if(avwm[i]!=null){                
                if(avwm[i].getTitle().toLowerCase().contains(text.toLowerCase())){                    
                    equalsmovies[counter]=(Movie) avwm[i];
                    counter++;
                }                
            }
            else {
                break;
            }
        }
        return equalsmovies;
    }
    
    public void editMovie(Movie movie) throws IOException {
        movie.setQualification(avwm[movie.getAvWNumber()].getQualfication());
        movie.setReviews(avwm[movie.getAvWNumber()].getReview());
        movie.getAverageQualification();
        if(!avwm[movie.getAvWNumber()].getTitle().equalsIgnoreCase(movie.getTitle())) {
            for(int i=0;i<users.length;i++) {
                if(users[i]!=null) {
                    for(int j=0;j<users[i].getMoviesQualified().length;j++) {
                        if(users[i].getMoviesQualified()[j]!=null){
                            if(users[i].getMoviesQualified()[j].equalsIgnoreCase(avwm[movie.getAvWNumber()].getTitle())) {
                                users[i].getMoviesQualified()[j]=movie.getTitle();
                                    break;
                            }
                        }
                        else {
                            break;
                        }
                    }
                }  
                else {
                    break;
                }
            }
        }
        setUsersBin();
        avwm[movie.getAvWNumber()]=movie;        
        rwo.write(moviesbin, false, avwm);        
    }    
    
    public void deleteMovie(int movienumber) throws IOException {
        for (int i=0;i<counters[0];i++) {
                    users[i].deleteMovies(avwm[movienumber].getTitle());
                }
        for(int i=movienumber;;i++){
            if(avwm[i+1]!=null) {
                avwm[i]=avwm[i+1];
                avwm[i].setAvWNumber(i);
            }
            else {
                avwm[i]=null;
                break;
            }
        }
        setUsersBin();
        counters[1]--;
        rwd.writeInt(countersbin, false, counters);
    }
    
    public String[] moviesRecommended(Movie[] mymovies, Profiles normal) {
        String[] genres=normal.genresRecomendation(mymovies);
        String[] list=new String[counters[1]-mymovies.length];
        String[] listtruelength;
        int listcounter=0;
        boolean belongs=false;
        
        for(int i=0;;i++) {
            belongs=false;
            if(avwm[i]!=null) {
                for(int j=0;j<mymovies.length;j++) {
                    if(avwm[i]==mymovies[j]) { 
                        belongs=true;
                    }                    
                } 
                if(belongs==false) {                    
                    for(int j=0;j<genres.length;j++) {                        
                        if(avwm[i].getGenere().equalsIgnoreCase(genres[j]) && avwm[i].getAverageQualification()>=3) {
                            list[listcounter]=avwm[i].getTitle();
                            listcounter++;
                        }                        
                    }                 
                }
            }
            else{
                break;
            }
        }
        listtruelength=new String[listcounter];
        for(int i=0;i<listcounter;i++) {
            listtruelength[i]=list[i];            
        }
        return listtruelength;
    }
    
    public static Series[] getSeries() {
        return (Series[]) avws;
    }
    
    public void setSeries(Series series) throws IOException {
        avws[counters[2]]=series;
        counters[2]++;
        rwd.writeInt(countersbin, false, counters);
    }  
    
     public Series[] getEqualSeries(String text){
        Series[] equalsseries=new Series[length];
        int counter=0;        
        for(int i=0;;i++){
            if(avws[i]!=null){                
                if(avws[i].getTitle().toLowerCase().contains(text.toLowerCase())){                    
                    equalsseries[counter]=(Series) avws[i];
                    counter++;
                }                
            }
            else {
                break;
            }
        }
        return equalsseries;
    }
    
    public void editSeries(Series series) throws IOException {
        series.setQualification(avws[series.getAvWNumber()].getQualfication());
        series.setReviews(avws[series.getAvWNumber()].getReview());
        series.getAverageQualification();
        if(!avws[series.getAvWNumber()].getTitle().equalsIgnoreCase(series.getTitle())) {
            for(int i=0;i<users.length;i++) {
                if(users[i]!=null) {
                    for(int j=0;j<users[i].getSeriesQualified().length;j++) {
                        if(users[i].getSeriesQualified()[j]!=null){
                            if(users[i].getSeriesQualified()[j].equalsIgnoreCase(avws[series.getAvWNumber()].getTitle())) {
                                users[i].getSeriesQualified()[j]=series.getTitle();
                                    break;
                            }
                        }
                        else {
                            break;
                        }
                    }
                }  
                else {
                    break;
                }
            }
        }
        setUsersBin();
        avws[series.getAvWNumber()]=series;
        rwo.write(seriesbin, false, avws);        
    }
    
    public void deleteSeries(int seriesnumber) throws IOException {
        for (int i=0;i<counters[0];i++) {
                    users[i].deleteSeries(avws[seriesnumber].getTitle());
                }
        for(int i=seriesnumber;;i++){
            if(avws[i+1]!=null) {
                avws[i]=avws[i+1];
                avws[i].setAvWNumber(i);
            }
            else {
                avws[i]=null;
                break;
            }
        }
        setUsersBin();
        counters[2]--;
        rwd.writeInt(countersbin, false, counters);
    }
    
    public String[] seriesRecommended(Series[] myseries, Profiles normal) {
        String[] genres=normal.genresRecomendation(myseries);
        String[] list=new String[counters[2]-myseries.length];
        String[] listtruelength;
        int listcounter=0;
        boolean belongs=false;
        
        for(int i=0;;i++) {
            belongs=false;
            if(avws[i]!=null) {
                for(int j=0;j<myseries.length;j++) {
                    if(avws[i]==myseries[j]) { 
                        belongs=true;
                    }                    
                } 
                if(belongs==false) {                    
                    for(int j=0;j<genres.length;j++) {                        
                        if(avws[i].getGenere().equalsIgnoreCase(genres[j])&& avws[i].getAverageQualification()>=3) {
                            list[listcounter]=avws[i].getTitle();
                            listcounter++;
                        }                        
                    }                 
                }
            }
            else{
                break;
            }
        }
        listtruelength=new String[listcounter];
        for(int i=0;i<listcounter;i++) {
            listtruelength[i]=list[i];            
        }
        return listtruelength;
    }
    
    public AudiovisualWork whatAvW(String text) {
        for(int i=0;;i++) {
            if(text.startsWith("Movie:")) {
                if(avwm[i]!=null) {
                    if(text.toLowerCase().contains(avwm[i].getTitle().toLowerCase())) {
                        return avwm[i];
                    }
                }
            }
            if(text.startsWith("Series:")) {
                if(avws[i]!=null) {
                    if(text.toLowerCase().contains(avws[i].getTitle().toLowerCase())) {
                        return avws[i];
                    }
                }
            }
        }
    }
    
    public Profiles whatUser(String text) {
        for(int i=0;;i++) {            
            if(users[i]!=null) {
                if(text.toLowerCase().contains(users[i].getName().toLowerCase())) {
                    return users[i];
                }
            }            
        }
    }
    
    public boolean thereIsUser(String name){
        for(int i=0;i<length;i++){
            if(users[i]!=null){
                if(name.trim().equalsIgnoreCase(users[i].getName())){
                    return true;
                }
            }
            else {
                break;
            }
        }        
        return false;
    }
    
    public Profiles login(String name,String password) {
        for(int i=0;i<length;i++){
            if(users[i]!=null){
                if(name.equalsIgnoreCase(users[i].getName())&& password.equals(users[i].getPassword())){
                    return users[i];
                }
            } 
            else {
                break;
            }
        }
        return null;
    }    
    
    public String[] eraseRepeated(String[] text) {
        String[] temporallist;
        int counterlist=0;
        for(int i=0;i<text.length;i++) {
            if(text[i]!=null) {
                for(int j=i+1;j<text.length;j++) {
                    if(text[j]!=null) {
                        if(text[i].equalsIgnoreCase(text[j])) {
                            for(int k=j+1;k<text.length;k++) {
                                text[k-1]=text[k];
                                if(k==text.length-1) {
                                    text[k]=null;
                                }
                            }
                            if(j==text.length-1) {
                                    text[j]=null;
                                }
                            j=i;                           
                        }  
                    }
                    else {
                        break;
                    }
                }
                counterlist++;
            } 
            else {
                break;
            }
        }
        temporallist=new String[counterlist];   
        for(int i=0;i<counterlist;i++) {
              temporallist[i]=text[i];
        }   
        return temporallist;
    }
    
    public String[] eraseMSSeen(String[] text, Profiles[] friends) {
        int counterlist=0;
        String[] list;
        for(int i=0;i<friends.length;i++) {
            for(int j=0;j<friends[i].counter[0];j++) {
                for(int k=0;k<text.length;k++) {
                    if(("Movie: "+(friends[i].getMoviesQualified()[j])).equalsIgnoreCase(text[k])) {
                        for(int l=k+1;l<text.length;l++) {
                                text[l-1]=text[l];                                
                            }
                        if(k==text.length-1) {
                                    text[k]=null;
                                }
                        counterlist++;
                    }
                }
            }
            for(int j=0;j<friends[i].counter[1];j++) {
                for(int k=0;k<text.length;k++) {
                    if(("Series: "+(friends[i].getSeriesQualified()[j])).equalsIgnoreCase(text[k])) {
                        for(int l=k+1;l<text.length;l++) {
                                text[l-1]=text[l];                                
                            }
                        if(k==text.length-1) {
                                    text[k]=null;
                                }
                        counterlist++;
                    }
                }
            }
        }
        list=new String[text.length-counterlist];
        for(int i=0;i<list.length;i++) {
            list[i]=text[i];
        }
        return list;
    }
}
