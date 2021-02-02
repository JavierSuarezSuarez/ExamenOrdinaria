
package view;

import model.Film;
import persistence.FilmLoader;

public class FilmPanel implements FilmDisplay{

    private Film film;
    private FilmLoader filmLoader;

    public FilmPanel() {
    }
    
    @Override
    public void display(Film film) {
        this.film = film;
        
    }

    @Override
    public void changed() {
        this.filmLoader = film.getFilmLoader();
        for (Film film : filmLoader.getFilmList()) {
            film.show();
        }
    }

}
