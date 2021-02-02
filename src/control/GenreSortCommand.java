
package control;

import model.Film;

public class GenreSortCommand implements Command {

    private Film film;

    public GenreSortCommand(Film film) {
        this.film = film;
    }
    
    @Override
    public void execute() {
        this.film.load("Genre");
    }

}
