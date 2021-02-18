package requests;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.DefaultListModel;
import models.Billboard;
import models.Cast;
import models.Cinema;
import models.Movie;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Requests {
    
    // Movies
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
        
        JSONArray jsonArray = this.getCasts();

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
        
        DefaultListModel<Cast> castsModels = new DefaultListModel<>();
        
        int counter = -1;
        for (Object castJson : movies) {

            counter++;

            Cast cast = new Cast();
            
            final ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            
            try {
                cast = mapper.readValue(castJson.toString(), Cast.class);
            } catch (IOException ex) {
                continue;
            }
            
            castsModels.add(counter, cast);
        }
        
        return castsModels;
    }
    
    
    // Cinema
    public boolean saveCinema(Cinema cinema) {
        
        final JSONObject cinemaJson = cinema.toJson();
        
        JSONArray jsonArray = this.getCinemas();

        if(jsonArray == null) {
            jsonArray = new JSONArray();
        }

        jsonArray.add(cinemaJson);

        try (FileWriter file = new FileWriter("cinemas.json")) {

            file.write(jsonArray.toString());
            file.flush();

        } catch (IOException e) {
            return false;
        }
        
        return true;
    }
    
    public JSONArray getCinemas() {
        
        try {
            
            JSONArray cinemas = new JSONArray();
            
            final JSONParser parser = new JSONParser();
            
            cinemas = (JSONArray) parser.parse(new FileReader("cinemas.json"));
            
            return cinemas;
        } catch (IOException | ParseException ex) {
            return null;
        }
    }
    
    public DefaultListModel<Cinema> getAllCinemas() {
        
        JSONArray cinemas = this.getCinemas();
        
        if(cinemas == null) return null;
        
        DefaultListModel<Cinema> cinemasModels = new DefaultListModel<>();
        
        int counter = -1;
        for (Object cinemaJson : cinemas) {

            counter++;

            Cinema cinema = new Cinema();
            
            final ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            
            try {
                cinema = mapper.readValue(cinemaJson.toString(), Cinema.class);
            } catch (IOException ex) {
                continue;
            }
            
            cinemasModels.add(counter, cinema);
        }
        
        return cinemasModels;
    }
    
    
    // Billboard
    public boolean saveBillboard(Billboard billboard) {
        
        final JSONObject billboardJson = billboard.toJson();
        
        JSONArray jsonArray = this.getBillboard();

        if(jsonArray == null) {
            jsonArray = new JSONArray();
        }

        jsonArray.add(billboardJson);

        try (FileWriter file = new FileWriter("billboards.json")) {

            file.write(jsonArray.toString());
            file.flush();

        } catch (IOException e) {
            return false;
        }
        
        return true;
    }
    
    public JSONArray getBillboard() {
        
        try {
            
            JSONArray billboards = new JSONArray();
            
            final JSONParser parser = new JSONParser();
            
            billboards = (JSONArray) parser.parse(new FileReader("billboards.json"));
            
            return billboards;
        } catch (IOException | ParseException ex) {
            return null;
        }
    }
    
    public DefaultListModel<Billboard> getAllBillboards() {
        
        JSONArray billboards = this.getBillboard();
        
        if(billboards == null) return null;
        
        DefaultListModel<Billboard> billboardsModels = new DefaultListModel<>();
        
        int counter = -1;
        for (Object billboardJson : billboards) {

            counter++;

            Billboard billboard = new Billboard();
            
            final ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            
            try {
                billboard = mapper.readValue(billboardJson.toString(), Billboard.class);
            } catch (IOException ex) {
                continue;
            }
            
            billboardsModels.add(counter, billboard);
        }
        
        return billboardsModels;
    }
}
