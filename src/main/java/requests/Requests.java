package requests;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.DefaultListModel;
import models.Movie;
import org.json.JSONArray;
import org.json.JSONObject;

public class Requests {

    public boolean saveMovie(Movie movie) {
        
        final JSONObject movieJson = movie.toJson();

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

        String myJson = "";
        
        try {
            myJson = new Scanner(new File("movies.json")).useDelimiter("\\Z").next();
        } catch (FileNotFoundException ex) {
            return null;
        }
        
        movies = new JSONArray(myJson);
        
        return movies;
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
