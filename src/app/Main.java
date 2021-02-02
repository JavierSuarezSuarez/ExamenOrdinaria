
package app;

import control.Command;
import control.ExitCommand;
import control.GenreSortCommand;
import control.NewsSortCommand;
import control.NullCommand;
import control.RateSortCommand;
import control.ViewSortCommand;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import model.Film;
import view.FilmDisplay;
import view.FilmPanel;


public class Main {

    
    public static void main(String[] args) {
        System.out.println("Bienvenido al catalogo de peliculas: \n"
                + "\"g\" para mostrar por genero \n"
                + "\"v\" para mostrar por visualizaciones \n"
                + "\"n\" para mostrar por novedades \n"
                + "\"r\" para mostrar por calificacion \n"
                + "\"e\" para salir");
        
        Scanner scanner = new Scanner(System.in);
        Film film = new Film();
        FilmDisplay filmDisplay = new FilmPanel();
        filmDisplay.display(film);
        film.registerObservers(filmDisplay);
        Map<String,Command> commands = initCommands(film);
        while(true) {
            commands.getOrDefault(scanner.next(), NullCommand.Instance).execute();  
        }
    }

    private static Map<String, Command> initCommands(Film film) {
        HashMap<String,Command> result = new HashMap<>();
        result.put("g", new GenreSortCommand(film));
        result.put("v", new ViewSortCommand(film));
        result.put("n", new NewsSortCommand(film));
        result.put("r", new RateSortCommand(film));
        result.put("e", new ExitCommand());
        return result;
    }
    
}
