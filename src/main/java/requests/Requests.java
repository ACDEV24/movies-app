/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package requests;

import com.google.gson.Gson;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import models.Movie;

/**
 *
 * @author ac
 */
public class Requests {
    
    public static List<Movie> getAllMovies() throws IOException {
        
        List<Movie> movies = new ArrayList<>();
        
        try (
            java.util.Scanner s = new java.util.Scanner(
                new java.net.URL("https://api.themoviedb.org/3/movie/now_playing?api_key=df44aabf39ca1b52f3ba3b1512396fdd&language=es-ES&page=1").openStream()
            )
        ) {
            
            final String response = s.useDelimiter("\\A").next();
            
            final HashMap<String, Object> map = new Gson().fromJson(response, HashMap.class);

            movies = (List) map.get("results");
            
            System.out.println(movies.get(2));
          }
        
        return movies;
    }
}
