/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package requests;

import java.io.IOException;

/**
 *
 * @author ac
 */
public class Requests {
    
    public static void getAllMovies() throws IOException {
        
        try (
            java.util.Scanner s = new java.util.Scanner(
                new java.net.URL("https://api.themoviedb.org/3/movie/now_playing?api_key=df44aabf39ca1b52f3ba3b1512396fdd&language=en-US&page=1").openStream()
            )
        ) {
            System.out.println(s.useDelimiter("\\A").next());
          }
    }
}
