package appmovie;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import models.Movie;

public class Ventana extends JFrame {

    JLabel label1;
    List<Movie> movies = new ArrayList<>();
    int index = 0;
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Ventana(List<Movie> movies) {
        
        this.movies = movies;
        
        final FondoPanel fondo = new FondoPanel(
            movies.get(index).picture
        );
        
        this.setContentPane(fondo);
        
        setTitle("MOVIES APP");
        
        MostrarElementos();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public class FondoPanel extends JPanel {
        
        final String imageURL;

        FondoPanel(String url) {
            this.imageURL = url;
        }
        
        private Image image;
        private final String basePath = "https://image.tmdb.org/t/p/original";
        
        @Override
        public void paint(Graphics g) {
            
            URL url = null;
            try {
                url = new URL(basePath + imageURL);
            } catch (MalformedURLException ex) {
                Logger.getLogger(Ventana.class.getName())
                    .log(Level.SEVERE, null, ex);
            }
            
            BufferedImage c = null;
            try {
                c = ImageIO.read(url);
            } catch (IOException ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            ImageIcon imageIcon = new ImageIcon(c);
            
            this.image = imageIcon.getImage();
            g.drawImage(this.image, 0, 0, getWidth(), getHeight(), this);
            
            setOpaque(false);
            
            super.paint(g);
        }
        
    }
    
    private void MostrarElementos() {

        //Generando otro panel
        JPanel panel = (JPanel) this.getContentPane();

        //Modificamos el panel
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(null);
        
        label1 = new JLabel("PRIMERA PELICULA");
        label1.setForeground(Color.WHITE);
        label1.setBounds(20, 428, 800, 100);
//        
//        label2 = new JLabel("SEGUNDA PELICULA");
//        label2.setForeground(Color.WHITE);
//        label2.setBounds(170, 428, 800, 100);
//        
//        label3 = new JLabel("TERCERA PELICULA");
//        label3.setForeground(Color.WHITE);
//        label3.setBounds(340, 428, 800, 100);
//        
//        label4 = new JLabel("CUARTA PELICULA");
//        label4.setForeground(Color.WHITE);
//        label4.setBounds(500, 428, 800, 100);
//        
//        label5 = new JLabel("QUINTA PELICULA");
//        label5.setForeground(Color.WHITE);
//        label5.setBounds(670, 428, 800, 100);
//       
        panel.add(label1);
//        panel.add(label2);
//        panel.add(label3);
//        panel.add(label4);
//        panel.add(label5);
       
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setVisible(rootPaneCheckingEnabled);
        this.setResizable(false);
    }
}

class MovieTitle extends JFrame {
    
    public String text;
    
    public MovieTitle(String text) {
        this.text = text;
        this.create();
    }
    
    JLabel label;

    public void create() {
        this.label = new javax.swing.JLabel(this.text);
        label.setBounds(175, 100, 200, 100);
    }
}
