package requests;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.DefaultListModel;
import models.Movie;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Requests {

    public boolean saveMovie(Movie movie) {
        
        final JSONObject movieJson = movie.toJson();
        
        JSONArray jsonArray = this.getMovies();
            if(jsonArray == null) {
            jsonArray = new JSONArray();
        }

        jsonArray.add(movieJson);

        try (FileWriter file = new FileWriter("movies.json")) {

            file.write(jsonArray.toString());
            file.flush();

        } catch (IOException e) {
            return false;
        }
        
        return true;
    }
    
    public JSONArray getMovies() {
        
        try {
            
            JSONArray movies = new JSONArray();
            
            final JSONParser parser = new JSONParser();
            
            movies = (JSONArray) parser.parse(new FileReader("movies.json"));
            
            return movies;
        } catch (IOException | ParseException ex) {
            return null;
        }
    }
    
    public DefaultListModel<Movie> getAllMovies() {        
        
        JSONArray movies = this.getMovies();
        
        if(movies == null) return null;
        
        DefaultListModel<Movie> moviesModels = new DefaultListModel<>();
        
        int counter = -1;
        for (Object movieJson : movies) {

            counter++;

            Movie movie = new Movie();
            
            try {
                movie = new ObjectMapper().readValue(movieJson.toString(), Movie.class);
            } catch (IOException ex) {
                continue;
            }
            
            moviesModels.add(counter, movie);
        }
        
        return moviesModels;
    }
}
