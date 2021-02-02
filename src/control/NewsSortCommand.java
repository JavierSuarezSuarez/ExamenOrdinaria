
package control;

import model.Film;

public class NewsSortCommand implements Command{

    private Film film;

    public NewsSortCommand(Film film) {
        this.film = film;
    }
    
    @Override
    public void execute() {
        this.film.load("News");
    }

}
