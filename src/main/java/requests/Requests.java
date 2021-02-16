package requests;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.DefaultListModel;
import models.Cast;
import models.Movie;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Requests {
    
    // Movies
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
            
            final ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            
            try {
                movie = mapper.readValue(movieJson.toString(), Movie.class);
            } catch (IOException ex) {
                continue;
            }
            
            moviesModels.add(counter, movie);
        }
        
        final DefaultListModel<Cast> casts = this.getAllCasts();
        
        if(casts == null) return moviesModels;
        
        for (int i = 0; i < moviesModels.size(); i++) {
            
            DefaultListModel<Cast> movieCasts = new DefaultListModel<>();
            
            counter = -1;

            for (int j = 0; j < casts.size(); j++) {
                if(casts.get(j).getMovie_id() == null) continue;
                if(casts.get(j).getMovie_id().equals(moviesModels.get(i).getId())) {
                    counter++;
                    movieCasts.add(counter, casts.get(j));
                }
            }
            
            if(movieCasts.size() > 0) {
                moviesModels.get(i).setCasts(movieCasts);
            }
           
        }
        
        return moviesModels;
    }
    
    
    
    // Casts
    public boolean saveCast(Cast cast) {
        
        final JSONObject castJson = cast.toJson();
        
        JSONArray jsonArray = this.getMovies();
            if(jsonArray == null) {
            jsonArray = new JSONArray();
        }

        jsonArray.add(castJson);

        try (FileWriter file = new FileWriter("casts.json")) {

            file.write(jsonArray.toString());
            file.flush();

        } catch (IOException e) {
            return false;
        }
        
        return true;
    }
    
    public JSONArray getCasts() {
        
        try {
            
            JSONArray casts = new JSONArray();
            
            final JSONParser parser = new JSONParser();
            
            casts = (JSONArray) parser.parse(new FileReader("casts.json"));
            
            return casts;
        } catch (IOException | ParseException ex) {
            return null;
        }
    }
    
    public DefaultListModel<Cast> getAllCasts() {        
        
        JSONArray movies = this.getCasts();
        
        if(movies == null) return null;
        
        DefaultListModel<Cast> moviesModels = new DefaultListModel<>();
        
        int counter = -1;
        for (Object movieJson : movies) {

            counter++;

            Cast cast = new Cast();
            
            final ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            
            try {
                cast = mapper.readValue(movieJson.toString(), Cast.class);
            } catch (IOException ex) {
                continue;
            }
            
            moviesModels.add(counter, cast);
        }
        
        return moviesModels;
    }
}
