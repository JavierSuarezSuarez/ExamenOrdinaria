
package model;

import java.util.ArrayList;
import java.util.List;
import persistence.FilmLoader;

public class Film {
    
    private String cover;
    private String title;
    private String year;
    private String dir;
    private String actors;
    private String genre;
    private String rating;
    private String duration;
    private String views;
    private List<Observer> observers;
    private FilmLoader filmLoader;

    public Film() {
        this.cover = "";
        this.title = "";
        this.year = "";
        this.dir = "";
        this.actors = "";
        this.genre = "";
        this.rating = "";
        this.duration = "";
        this.views = "";
        this.observers = new ArrayList<>();
        load("All");
    }

    public Film(String cover, String title, String year, String dir, String actors, String genre, String rating, String duration, String views) {
        this.cover = cover;
        this.title = title;
        this.year = year;
        this.dir = dir;
        this.actors = actors;
        this.genre = genre;
        this.rating = rating;
        this.duration = duration;
        this.views = views;
    }
    public FilmLoader getFilmLoader() {
        return filmLoader;
    }
    public void load(String mode) {
        this.filmLoader = new FilmLoader(mode);
        this.update();
    }
    public void show() {
        System.out.println("Film: " + this.cover + ", " + this.title + ", " 
                           + this.year + ", " + this.dir + ", "
                           + this.actors + "; " + this.genre + ", "
                           + this.rating + ", " + this.duration + ", "
                           + this.views + ", ");
    }
    
    public void registerObservers(Observer ob) {
        this.observers.add(ob);
    }
    
    private void update() {
        for (Observer observer : observers) {
            observer.changed();
        }
    }

    public String getCover() {
        return cover;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    public String getDir() {
        return dir;
    }

    public String getActors() {
        return actors;
    }

    public String getGenre() {
        return genre;
    }

    public String getRating() {
        return rating;
    }

    public String getDuration() {
        return duration;
    }
    
    public interface Observer {
        void changed();
    }
    
    

}
