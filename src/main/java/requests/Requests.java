package requests;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import models.Cast;
import models.Movie;

public class Requests {
    
    public List<Movie> getMovies(String page) throws IOException {
        
        List<Movie> tempMovies = new ArrayList<>();

        final ObjectMapper mapper = new ObjectMapper();
        
        try (
            java.util.Scanner s = new java.util.Scanner(
                new java.net.URL("https://api.themoviedb.org/3/movie/now_playing?api_key=df44aabf39ca1b52f3ba3b1512396fdd&language=es-ES&page=" + page).openStream()
//                new java.net.URL("http://192.168.1.2:3000/movies" + page).openStream()
            )
        ) {
            
            final String response = s.useDelimiter("\\A").next();
            
            final Map<String, Object> map = mapper.readValue(response, Map.class);
            
            tempMovies = (List<Movie>) map.get("results");
          }
        
        List<Movie> movies = new ArrayList<Movie>();

        for (int i = 0; i < 10; i++) {
            
            final Movie movie = mapper.convertValue(
                tempMovies.get(i),
                Movie.class
            );
            
            movies.add(movie);
        }
        
        return movies;
    }
    
    public List<Cast> getCast(String id) throws IOException {
        
        List<Cast> tempActors = new ArrayList<>();

        final ObjectMapper mapper = new ObjectMapper();
        
        try (
            java.util.Scanner s = new java.util.Scanner(
                new java.net.URL("https://api.themoviedb.org/3/movie/" + id +"/credits?api_key=df44aabf39ca1b52f3ba3b1512396fdd&language=es&page=1").openStream()
            )
        ) {
            
            final String response = s.useDelimiter("\\A").next();
            
            final Map<String, Object> map = mapper.readValue(response, Map.class);
            
            tempActors = (List<Cast>) map.get("cast");
          }
        
        List<Cast> movies = new ArrayList<Cast>();

        for (int i = 0; i < 10; i++) {
            
            final Cast movie = mapper.convertValue(
                tempActors.get(i),
                Cast.class
            );
            
            movies.add(movie);
        }
        
        return movies;
    }
}
