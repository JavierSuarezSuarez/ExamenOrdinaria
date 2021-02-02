
package control;

import model.Film;

public class RateSortCommand implements Command{

    private Film film;

    public RateSortCommand(Film film) {
        this.film = film;
    }
    
    @Override
    public void execute() {
        this.film.load("Rate");
    }

}
