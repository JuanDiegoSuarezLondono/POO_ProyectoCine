package proyectocine;

import java.io.*;

/**
 *
 * @author Juan Diego Suarez Londoño
 */
public class Profiles extends User implements Serializable {    
    int zize;
    private String[] moviesqualified;
    private String[] seriesqualified;
    private String[] friends;
    public int counter[];
    private String what;

    public Profiles(String name, String password, int usernumber) {        
        super(name, password, usernumber);        
        zize=50;
        moviesqualified=new String[zize];
        seriesqualified=new String[zize];
        friends=new String[zize];
        counter=new int[3];
        counter[0]=0;
        counter[1]=0;
        counter[2]=0;
        what="User";
    }
       
    public String[] genresRecomendation(Object[] object) {
        int[] favorite=new int[11];
        int temporal=0;
        int genres=1;
        boolean stop=false;
        String[] genreslist={"Action","Adventure","Comedy","Crime & Gangster","Drama","Historical"
                            ,"Horror","Musical","Sience fiction","War","Westerns"};
        String temporalgenres;
        String[] list;
        for(int i=0;i<object.length;i++) {       
            if(((AudiovisualWork)object[i]).getQualfication()[getUserNumber()]>=3) {
                switch(((AudiovisualWork)object[i]).getGenere()) {
                    
                    case "Action":
                        favorite[0]++;
                    break;
                    
                    case "Adventure":
                        favorite[1]++;
                    break;
                    
                    case "Comedy":
                        favorite[2]++;
                    break;
                    
                    case "Crime & Gangster":
                        favorite[3]++;
                    break;
                    
                    case "Drama":
                        favorite[4]++;
                    break;
                    
                    case "Historical":
                        favorite[5]++;
                    break;
                    
                    case "Horror":
                        favorite[6]++;
                    break;
                    
                    case "Musical":
                        favorite[7]++;
                    break;
                    
                    case "Sience fiction":
                        favorite[8]++;
                    break;
                    
                    case "War":
                        favorite[9]++;
                    break;
                    
                    case "Westerns":
                        favorite[10]++;
                    break;                    
                }
            }
        }
        for(int i=0;i<10;i++) {
            if(favorite[i+1]>favorite[i]) {                
                temporal=favorite[i];
                favorite[i]=favorite[i+1];
                favorite[i+1]=temporal;
                temporalgenres=genreslist[i];
                genreslist[i]=genreslist[i+1];
                genreslist[i+1]=temporalgenres;
                i=-1;
                genres=0;
                stop=false;
            }
            else if(favorite[i+1]<favorite[i]) {
                stop=true;                
            }
            if (stop==false) {
                genres++;                
            }             
        }
        list=new String[genres];
        for(int i=0;i<genres;i++) {            
            list[i]=genreslist[i];
        }
        return list;
    } 
    
    public void setMoviesQualified(String moviesqualified) {
        this.moviesqualified[counter[0]]= moviesqualified;
        counter[0]++;
    }    
    
    public String[] getMoviesQualified() {
        return moviesqualified;
    }
    
    public boolean moviesQualifiedExist(String text) {        
        for(int i=0;i<counter[0];i++) {
            if(moviesqualified[i].equalsIgnoreCase(text)) {
                return true;
            }
        }
        return false;
    }
    
    public void deleteMovies(String text) {
         boolean change=false;
        for(int i=0;i<counter[0];i++) {
            if(moviesqualified[i].equalsIgnoreCase(text)) {                
                change=true;
            }
            if(change==true) {
                if(this.moviesqualified[i+1]!=null) {
                    this.moviesqualified[i]=this.moviesqualified[i+1];
                }
                else {
                    this.moviesqualified[i]=null;
                }                
            }
        }
        counter[0]--;
    }
    
    public void setSeriesQualified(String seriesqualified) {
        this.seriesqualified[counter[1]] = seriesqualified;
        counter[1]++;
    }    
    
    public String[] getSeriesQualified() {
        return seriesqualified;
    }
    
    public boolean seriesQualifiedExist(String text) {        
        for(int i=0;i<counter[1];i++) {
            if(seriesqualified[i].equalsIgnoreCase(text)) {
                return true;
            }
        }
        return false;
    }
    
    public void deleteSeries(String text) {
         boolean change=false;
        for(int i=0;i<counter[1];i++) {
            if(seriesqualified[i].equalsIgnoreCase(text)) {                
                change=true;
            }
            if(change==true) {
                if(this.seriesqualified[i+1]!=null) {
                    this.seriesqualified[i]=this.seriesqualified[i+1];
                }
                else {
                    this.seriesqualified[i]=null;
                }                
            }
        }
        counter[1]--;
    }   
    
    public void setFriend(String text) {
        this.friends[counter[2]]=text;
        counter[2]++;
    }
    
    public String[] getFriends() {
        return friends;
    }
    
    public boolean friendExist(String text) {        
        for(int i=0;i<counter[2];i++) {
            if(friends[i].equalsIgnoreCase(text)) {
                return true;
            }
        }
        return false;
    }
    
    public void deleteFriend(String text) {
        boolean change=false;
        for(int i=0;i<counter[2];i++) {
            if(friends[i].equalsIgnoreCase(text)) {                
                change=true;
            }
            if(change==true) {
                if(this.friends[i+1]!=null) {
                    this.friends[i]=this.friends[i+1];
                }
                else {
                    this.friends[i]=null;
                }                
            }
        }
        counter[2]--;
    }
   
    public void setWhat() {
        this.what = "Critic";
    }

    public String getWhat() {
        return what;
    }
    
    public int getTotalQualifications() {
        return counter[0]+counter[1];
    }
    
    public void setMovies(String[] movies) {
        this.moviesqualified=movies;
    }
    
    public void setSeries(String[] series) {
        this.seriesqualified=series;
    }
    
    public void setFriends(String[] friends) {
        this.friends=friends;
    }
    
    public void setCounter(int[] counter) {
        this.counter=counter;
    }
    
    public void setWhatOther(String what) {
        this.what=what;
    }
}
