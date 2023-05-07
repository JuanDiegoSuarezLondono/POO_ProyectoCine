package proyectocine;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;

/**
 *
 * @author Juan Diego Suarez Londoño
 */
public class Movie extends AudiovisualWork implements Serializable {
    private int durationmin;

    public Movie(int durationmin, String title, String genere, String rating, String direct, int avwnumber) throws IOException, FileNotFoundException, ClassNotFoundException {
        super(title, genere, rating, direct, avwnumber);
        this.durationmin = durationmin;
    }

   
    public int getDurationmin() {
        return durationmin;
    }

    public void setDurationmin(int durationmin) {
        this.durationmin = durationmin;
    }

    public int getEpisodes() {
        return -1;
    }

    public int getSeason() {
        return -1;
    }
    
    public String whatAvW() {
        return "Movie";
    }
}
