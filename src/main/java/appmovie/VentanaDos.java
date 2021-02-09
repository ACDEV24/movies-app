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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import models.Movie;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JScrollPane;

class VentanaDos extends JFrame{
    
    private JButton bton1;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JScrollPane barra;
    private final List<Movie> movies;
    
    List<Movie> movies1 = new ArrayList<>();
    int index = 0;
    
    public VentanaDos(List<Movie> movies){
    
        this.movies = movies;
        
        final VentanaDos.FondoPanel fondo = new VentanaDos.FondoPanel(
            movies.get(index).picture
        );
        
        setContentPane(fondo);
        
        setTitle("MOVIES APP");
        
        MostrarElementos();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
     public class FondoPanel extends JPanel {
        
        final String imageURL;

        FondoPanel(String url) {
            imageURL = url;
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
            
            image = imageIcon.getImage();
            g.drawImage(this.image, 0, 0, getWidth(), getHeight(), this);
            
            setOpaque(false);
            
            super.paint(g);
        }
    }
     
    private void MostrarElementos() {

        //Generando otro panel
        JPanel panel = (JPanel) this.getContentPane();

        //
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(null);
        
        label1 = new JLabel("LA MUJER MARAVILLA");
        label1.setForeground(Color.WHITE);
        label1.setBounds(325, 200, 800, 100);
        
        label2 = new JLabel("La acción se traslada a mediados de la década de los años 80, donde Diana enfrenta nuevos peligros y aliados.");
        label2.setForeground(Color.BLACK);
        label2.setBounds(100, 250, 800, 100);
        
        label3 = new JLabel("Casting");
        label3.setForeground(Color.WHITE);
        label3.setBounds(110, 428, 800, 100);
        
        JButton bton1 = new JButton();
        bton1.setBounds(20, 20, 89 ,48);
        ImageIcon back = new ImageIcon("back.png");
        bton1.setIcon(new ImageIcon(back.getImage().getScaledInstance(bton1.getWidth(), bton1.getHeight(), Image.SCALE_SMOOTH)));
//        bton1.setBackground(Color.gray);
        
        barra = new JScrollPane();
        barra.setBounds(20, 20, 80,30);
            
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(bton1);
        panel.add(barra);
        
        setBounds(0, 0,800,600);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }
}
