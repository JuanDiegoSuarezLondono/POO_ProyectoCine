package proyectocine;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;

/**
 *
 * @author Juan Diego Suarez Londoño
 */
public abstract class AudiovisualWork implements Serializable {
    private int length;
    private String title;
    private String genere;
    private String rating;
    private String direct;
    private String[] reviews;
    private int[] qualification;    
    private float averagequalification;
    private int avwnumber;

    public AudiovisualWork(String title, String genere, String rating, String direct, int avwnumber) throws IOException, FileNotFoundException, ClassNotFoundException {
        length=50;
        this.title = title;
        this.genere= genere;
        this.rating = rating;
        this.direct = direct;
        this.avwnumber = avwnumber;
        reviews = new String [length];
        qualification= new int [length];
    }
    
    public float getAverageQualification() {
        int totalqualifications=0;
        int promedio=0;
        for(int i=0;i<qualification.length;i++) {
            if(qualification[i]!=0) {
                promedio+=qualification[i];
                totalqualifications++;
            }                   
        }
        if(totalqualifications!=0) {
            promedio/=totalqualifications;
        }
        else {
            promedio=5;
        }                    
        return promedio;
    }
    
    public void setReview(String review, int usernumber) {
        this.reviews[usernumber] = review;
    } 

    public void setQualify(int qualify, int usernumber) {
        this.qualification[usernumber] = qualify;
    }   

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setDirect(String direct) {
        this.direct = direct;
    }

    public void setAvWNumber(int avwnumber) {
        this.avwnumber = avwnumber;
    }  

    public String getTitle() {
        return title;
    }

    public String getGenere() {
        return genere;
    }

    public String getRating() {
        return rating;
    }

    public String getDirect() {
        return direct;
    }

    public String[] getReview() {
        return reviews;
    }
    
    public void setReviews(String[] reviews) {
        this.reviews=reviews;
    }
    
    public int[] getQualfication() {
        return qualification;
    }
    
    public void setQualification(int[] qualification) {
        this.qualification=qualification;
    }

    public int getAvWNumber() {
        return avwnumber;
    }       
    
    public abstract int getDurationmin();
    
    public abstract int getEpisodes();
    
    public abstract int getSeason();
    
    public abstract String whatAvW();
  }
