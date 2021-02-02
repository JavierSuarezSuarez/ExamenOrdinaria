
package control;

import model.Film;

public class ViewSortCommand implements Command{

    private Film film;

    public ViewSortCommand(Film film) {
        this.film = film;
    }
    
    @Override
    public void execute() {
        this.film.load("Views");
    }

}
