package requests;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import models.Actor;
import models.Movie;

public class Requests {
    
    public List<Movie> getAllMovies(String page) throws IOException {
        
        List<Movie> tempMovies = new ArrayList<>();

        final ObjectMapper mapper = new ObjectMapper();
        
        try (
            java.util.Scanner s = new java.util.Scanner(
                new java.net.URL("https://api.themoviedb.org/3/movie/now_playing?api_key=df44aabf39ca1b52f3ba3b1512396fdd&language=es-ES&page=" + page).openStream()
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
    
    public List<Actor> getAllActors(String id) throws IOException {
        
        List<Actor> tempActors = new ArrayList<>();

        final ObjectMapper mapper = new ObjectMapper();
        
        try (
            java.util.Scanner s = new java.util.Scanner(
                new java.net.URL("https://api.themoviedb.org/3/movie/" + id +"/credits?api_key=df44aabf39ca1b52f3ba3b1512396fdd&language=es&page=1").openStream()
            )
        ) {
            
            final String response = s.useDelimiter("\\A").next();
            
            final Map<String, Object> map = mapper.readValue(response, Map.class);
            
            tempActors = (List<Actor>) map.get("cast");
          }
        
        List<Actor> movies = new ArrayList<Actor>();

        for (int i = 0; i < 10; i++) {
            
            final Actor movie = mapper.convertValue(
                tempActors.get(i),
                Actor.class
            );
            
            movies.add(movie);
        }
        
        return movies;
    }
}
