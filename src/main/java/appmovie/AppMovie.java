package appmovie;

import java.io.IOException;
import java.util.List;
//import models.Cast;
import models.Movie;
import requests.Requests;

public class AppMovie {

    public static void main(String[] args) throws IOException {

        final Requests requests = new Requests();

        final List<Movie> movies = requests.getMovies("1");
        
//        for (Movie movie : movies) {
//            
//        }
        
//        final List<Cast> actors = requests.getAllCast("464052");

        final Ventana vent = new Ventana(movies);
        vent.setVisible(true);
    }
}