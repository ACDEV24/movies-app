package appmovie;

import java.io.IOException;
import requests.Requests;

public class AppMovie {
   
    public static void main(String[] args) throws IOException {
       
        Ventana vent = new Ventana();
        
        vent.setVisible(true);
        
        Requests.getAllMovies();
    }
    
}