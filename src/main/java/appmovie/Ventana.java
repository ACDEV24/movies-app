package appmovie;

//Importaciones
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

public class Ventana extends JFrame {

    //Atributos gráficos
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;

    //Action listener objetos
    private ActionListener oyente1;
    private ActionListener oyente2;
    private ActionListener oyente3;
    private ActionListener oyente4;

    /*
    List<Movie> movies = new ArrayList<>();
    int index = 0;

    public Ventana(List<Movie> movies) {

        this.movies = movies;

        if (!this.movies.isEmpty()) {

            final FondoPanel fondo = new FondoPanel(movies.get(index).getPicture());

            this.setContentPane(fondo);
        }
     */
    //Elementos de la ventana
    public Ventana() {
        setTitle("MOVIES APP");

        MostrarElementos();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /*
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
     */
    //Metodo mostrar elementos gráficos
    private void MostrarElementos() {

        //Generando otro panel
        JPanel panel = (JPanel) this.getContentPane();

        //Modificamos el panel
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(null);

        //Botones
        button1 = new JButton("DATOS PELICULAS");
        button1.setForeground(Color.BLACK);
        button1.setBounds(20, 480, 160, 60);

        button2 = new JButton("DATOS ACTORES");
        button2.setForeground(Color.BLACK);
        button2.setBounds(190, 480, 160, 60);

        button3 = new JButton("MUESTRA DE DATOS");
        button3.setForeground(Color.BLACK);
        button3.setBounds(600, 480, 160, 60);

        button4 = new JButton("DATOS CINE");
        button4.setForeground(Color.BLACK);
        button4.setBounds(370, 480, 160, 60);

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
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
//         panel.add(label2);
//         panel.add(label3);
//         panel.add(label4);
//         panel.add(label5);

        //Datos de ventana
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setVisible(rootPaneCheckingEnabled);
        this.setResizable(false);

        //Action listener para los botones
        oyente1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Ventana3 vent = new Ventana3();

                vent.setVisible(true);

                setVisible(false);

            }
        };
        button1.addActionListener(oyente1);

        oyente2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Ventana4 vent4 = new Ventana4();

                vent4.setVisible(true);

                setVisible(false);
            }
        };
        button2.addActionListener(oyente2);

        oyente3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
        button3.addActionListener(oyente3);
        
        
         oyente4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Ventana5 vent5 = new Ventana5();
                
                vent5.setVisible(true);
                setVisible(false);
                
            }
        };
        button4.addActionListener(oyente4);

    }
}


/*
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
 */
