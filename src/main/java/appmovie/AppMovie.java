package appmovie;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import models.Movie;
import requests.Requests;

public class AppMovie {

    public static void main(String[] args) throws IOException {
        
      /*  final Requests requests = new Requests();

        List<Movie> movies = requests.getAllMovies();
        
        if(movies == null) {
            movies = new ArrayList<>();
        }

        final Ventana vent = new Ventana(movies);

*/
        
      VentanaInicial vent1 = new VentanaInicial();
        vent1.setVisible(true);
    }
}