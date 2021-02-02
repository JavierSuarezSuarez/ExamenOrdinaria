
package persistence;

import java.util.ArrayList;
import java.util.List;
import model.Film;

public class FilmLoader {
    

    private List<Film> filmList;

    public FilmLoader(String mode) {
        this.filmList = new ArrayList<>();
        this.start(mode);
    }

    public List<Film> getFilmList() {
        return filmList;
    }
    
    private void start(String mode) {
        switch(mode) {
            
            case "Genre":
                loadByGenre();
            break;
            
            case "Rate":
                loadByRate();
            break;
            
            case "News":
                loadByNews();
            break;
            
            case "Views":
                loadByViews();
            break;
            
            case "All":
                loadAll();
            break;
        }
            
    }
    
    public void loadByGenre() {
        this.filmList.clear();
        this.filmList.add(new Film("Avatar.png", "Avatar", 
                          "2009", "James Cameron", "Ben Affleck, Margot Robbie",
                        "Adventure", "5", "1 hour","1000000"));
        this.filmList.add(new Film("SpiderMan 3.png", "Spiderman 3", 
                          "2008", "Steven Spielberg", "Tom Holland, Emma Watson",
                        "Adventure", "4", "1 hour","2000"));
        this.filmList.add(new Film("Joker.png", "Joker", 
                          "2019", "Amy Warlow", "Joaquin Phoenix",
                        "Horror", "5", "1 hour","100000"));
        this.filmList.add(new Film("IT.png", "IT", 
                          "2018", "Alejandro Bayona", "Adam Sandler, Tom Cruise",
                        "Horror", "3", "90 minutes","20000"));
        this.filmList.add(new Film("Bad Boys.png", "Bad Boys", 
                          "2020", "Alejandro Bayona", "Will Smith, Emma Watson",
                        "Sitcom", "2", "1 hour","50000"));
        this.filmList.add(new Film("Two boys.png", "Two boys", 
                          "2010", "Tim Burton", "Tom Hanks, Emma Watson, Emma Stone",
                        "Sitcom", "3", "1 hour","20000"));
        
    }
    public void loadByNews() {
        this.filmList.clear();
        this.filmList.add(new Film("Bad Boys.png", "Bad Boys", 
                          "2020", "Alejandro Bayona", "Will Smith, Emma Watson",
                        "Sitcom", "2", "1 hour","50000"));
        this.filmList.add(new Film("Joker.png", "Joker", 
                          "2019", "Amy Warlow", "Joaquin Phoenix",
                        "Horror", "5", "1 hour","100000"));
        this.filmList.add(new Film("IT.png", "IT", 
                          "2018", "Alejandro Bayona", "Adam Sandler, Tom Cruise",
                        "Horror", "3", "90 minutes","20000"));
        this.filmList.add(new Film("Two boys.png", "Two boys", 
                          "2010", "Tim Burton", "Tom Hanks, Emma Watson, Emma Stone",
                        "Sitcom", "3", "1 hour","20000"));
        this.filmList.add(new Film("Avatar.png", "Avatar", 
                          "2009", "James Cameron", "Ben Affleck, Margot Robbie",
                        "Adventure", "5", "1 hour","1000000"));
        this.filmList.add(new Film("SpiderMan 3.png", "Spiderman 3", 
                          "2008", "Steven Spielberg", "Tom Holland, Emma Watson",
                        "Adventure", "4", "1 hour", "2000"));
        
    }
    public void loadByViews() {
        this.filmList.clear();
        this.filmList.add(new Film("Avatar.png", "Avatar", 
                          "2009", "James Cameron", "Ben Affleck, Margot Robbie",
                        "Adventure", "5", "1 hour","1000000"));
        this.filmList.add(new Film("Joker.png", "Joker", 
                          "2019", "Amy Warlow", "Joaquin Phoenix",
                        "Horror", "5", "1 hour","100000"));
        this.filmList.add(new Film("Bad Boys.png", "Bad Boys", 
                          "2020", "Alejandro Bayona", "Will Smith, Emma Watson",
                        "Sitcom", "2", "1 hour","50000"));
        this.filmList.add(new Film("IT.png", "IT", 
                          "2018", "Alejandro Bayona", "Adam Sandler, Tom Cruise",
                        "Horror", "3", "90 minutes","20000"));
        this.filmList.add(new Film("Two boys.png", "Two boys", 
                          "2010", "Tim Burton", "Tom Hanks, Emma Watson, Emma Stone",
                        "Sitcom", "3", "1 hour","20000"));
        this.filmList.add(new Film("SpiderMan 3.png", "Spiderman 3", 
                          "2008", "Steven Spielberg", "Tom Holland, Emma Watson",
                        "Adventure", "4", "1 hour", "2000"));
        
        
    }
    public void loadByRate() {
        this.filmList.clear();
        this.filmList.add(new Film("Avatar.png", "Avatar", 
                          "2009", "James Cameron", "Ben Affleck, Margot Robbie",
                        "Adventure", "5", "1 hour","1000000"));
        this.filmList.add(new Film("Joker.png", "Joker", 
                          "2019", "Amy Warlow", "Joaquin Phoenix",
                        "Horror", "5", "1 hour","100000"));
        this.filmList.add(new Film("SpiderMan 3.png", "Spiderman 3", 
                          "2008", "Steven Spielberg", "Tom Holland, Emma Watson",
                        "Adventure", "4", "1 hour", "2000"));
        this.filmList.add(new Film("Two boys.png", "Two boys", 
                          "2010", "Tim Burton", "Tom Hanks, Emma Watson, Emma Stone",
                        "Sitcom", "3", "1 hour","20000"));
        this.filmList.add(new Film("IT.png", "IT", 
                          "2018", "Alejandro Bayona", "Adam Sandler, Tom Cruise",
                        "Horror", "3", "90 minutes","20000"));
        this.filmList.add(new Film("Bad Boys.png", "Bad Boys", 
                          "2020", "Alejandro Bayona", "Will Smith, Emma Watson",
                        "Sitcom", "2", "1 hour","50000"));
    }

    private void loadAll() {
        this.filmList.clear();
        this.filmList.add(new Film("Avatar.png", "Avatar", 
                          "2009", "James Cameron", "Ben Affleck, Margot Robbie",
                        "Adventure", "5", "1 hour","1000000"));
        this.filmList.add(new Film("SpiderMan 3.png", "Spiderman 3", 
                          "2008", "Steven Spielberg", "Tom Holland, Emma Watson",
                        "Adventure", "4", "1 hour","2000"));
        this.filmList.add(new Film("Joker.png", "Joker", 
                          "2019", "Amy Warlow", "Joaquin Phoenix",
                        "Horror", "5", "1 hour","100000"));
        this.filmList.add(new Film("IT.png", "IT", 
                          "2018", "Alejandro Bayona", "Adam Sandler, Tom Cruise",
                        "Horror", "3", "90 minutes","20000"));
        this.filmList.add(new Film("Bad Boys.png", "Bad Boys", 
                          "2020", "Alejandro Bayona", "Will Smith, Emma Watson",
                        "Sitcom", "2", "1 hour","50000"));
        this.filmList.add(new Film("Two boys.png", "Two boys", 
                          "2010", "Tim Burton", "Tom Hanks, Emma Watson, Emma Stone",
                        "Sitcom", "3", "1 hour","20000"));
    }

}
