package requests;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import models.Cast;
import models.Movie;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.ParseException;
//import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;

public class Requests {
    
    final ObjectMapper mapper = new ObjectMapper();
    
    // Movies
    public boolean createMovie(Movie movie) {
        
        final JSONObject movieJson = movie.toJson();
        
        final boolean response = this.saveMovie(movieJson);
        
        return response;
    }
    
    public boolean saveMovie(JSONObject movieJson) {

        try (FileWriter file = new FileWriter("movies.json")) {
            
            List<Movie> moviesList = this.getMovies();
            
            if(moviesList == null) {
                moviesList = new ArrayList<>();
            }
            
            final Movie movie = (Movie) movieJson;
            
            moviesList.add(movie);

            file.write(moviesList.toString());
            file.flush();

        } catch (IOException e) {
            return false;
        }
        
        return true;
    }
    
    public List<Movie> getMovies() {

        DefaultListModel<Movie> movies = new DefaultListModel<Movie>();
        
        try {
            
            movies = mapper.readValue(new FileReader("movies.json"), new TypeReference<DefaultListModel<Movie>>(){});

        } catch (IOException ex) {
            return null;
        }
        
        return movies;
    }
    
//    public DefaultListModel<Movie> getAllMovies() {
//        
//        List<Movie> moviesList = this.getMovies();
//        
//        DefaultListModel<Movie> moviesModels = new DefaultListModel<>();
//        
//        int counter = -1;
//        for (Movie movie : moviesList) {
//            counter++;
////            moviesModels.add((Movie) movie);
//            moviesModels.add(counter, (Movie) movie);
//        }
//        
//        return moviesModels;
//    }
    

    
    // Casts
    public boolean createCast(Cast cast) {
        
        final JSONObject movieJson = cast.toJson();
        
        final boolean response = this.saveMovie(movieJson);
        
        return response;
    }
    
    public boolean saveCast(JSONObject castJson) {

        try (FileWriter file = new FileWriter("casts.json")) {
            
            JSONArray jsonArray = this.getMovies();
            
            if(jsonArray == null) {
                jsonArray = new JSONArray();
            }
            
            jsonArray.add(castJson);

            file.write(jsonArray.toString());
            file.flush();

        } catch (IOException e) {
            return false;
        }
        
        return true;
    }
    
    public JSONArray getCast() {
        
        JSONArray casts = new JSONArray();
        
        try {

            JSONParser parser = new JSONParser();
            
            casts = (JSONArray) parser.parse(
                new FileReader("casts.json")
            );

        } catch (IOException | ParseException ex) {
            return null;
        }
        
        return casts;
    }
    
    public DefaultListModel<Cast> getAllCasts() {
        
        JSONArray casts = new JSONArray();
        
        try {

            JSONParser parser = new JSONParser();
            
            casts = (JSONArray) parser.parse(
                new FileReader("casts.json")
            );

        } catch (IOException | ParseException ex) {
            return null;
        }
        
        DefaultListModel<Cast> castsModels = new DefaultListModel<>();
        
        int counter = -1;
        for (Object cast : casts) {
            counter++;
//            moviesModels.add((Movie) movie);
            castsModels.add(counter, (Cast) cast);
        }
        
        return castsModels;
    }
}
