package requests;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import models.Movie;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Requests {
    
    public boolean createMovie(Movie movie) {
        
        final JSONObject movieJson = movie.toJson();
        
        final boolean response = this.saveMovie(movieJson);
        
        return response;
    }
    
    public boolean saveMovie(JSONObject movieJson) {

        try (FileWriter file = new FileWriter("movies.json")) {
            
            JSONArray jsonArray = this.getMovies();
            
            if(jsonArray == null) {
                jsonArray = new JSONArray();
            }
            
            jsonArray.put(movieJson);

            file.write(jsonArray.toString());
            file.flush();

        } catch (IOException e) {
            return false;
        }
        
        return true;
    }
    
    public JSONArray getMovies() {
        
        JSONArray movies = new JSONArray();
        
        try {
            JSONParser parser = new JSONParser();
            
            movies = (JSONArray) parser.parse(
                new FileReader("movies.json")
            );
        } catch (IOException | ParseException ex) {
            return null;
        }
        
        return movies;
    }
    
    public List<Movie> getAllMovies() {
        
        JSONArray movies = new JSONArray();
        
        try {

            JSONParser parser = new JSONParser();
            
            movies = (JSONArray) parser.parse(
                new FileReader("movies.json")
            );

        } catch (IOException | ParseException ex) {
            return null;
        }
        
        List<Movie> moviesModels = new ArrayList<>();
        
        for (Object movie : movies) {
            moviesModels.add((Movie) movie);
        }
        
        return moviesModels;
    }
}
