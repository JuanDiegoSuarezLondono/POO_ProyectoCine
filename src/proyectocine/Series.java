package proyectocine;

import java.io.*;

/**
 *
 * @author Juan Diego Suarez Londoño
 */
public class Series extends AudiovisualWork implements Serializable {
    private int episodes;
    private int season;

    public Series(int episodes, int season, String title, String genere, String rating, String direct, int avWNumber) throws IOException, FileNotFoundException, FileNotFoundException, ClassNotFoundException{
        super(title, genere, rating, direct, avWNumber);
        this.episodes = episodes;
        this.season = season;    
    }
    
    

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public int getEpisodes() {
        return episodes;
    }

    public int getSeason() {
        return season;
    }  

    
    public int getDurationmin() {
        return -1;
    }
   
    public String whatAvW() {
        return "Series";
    }
}
