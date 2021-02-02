
package view;

import model.Film;

public interface FilmDisplay extends Film.Observer{
    
    void display(Film film);

}
