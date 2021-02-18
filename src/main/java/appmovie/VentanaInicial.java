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

public class VentanaInicial extends JFrame {

    //Atributos gráficos
    JButton botonDatosPeli;
    JButton botonDatosActores;
    JButton botonMuestraDatos;
    JButton botonDatosCine;
    JButton botonDatosSala;

    //Action listener objetos
    private ActionListener oyente1;
    private ActionListener oyente2;
    private ActionListener oyente3;
    private ActionListener oyente4;
      private ActionListener oyente5;
    

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
    public VentanaInicial() {
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
        botonDatosPeli = new JButton("DATOS PELICULAS");
        botonDatosPeli.setForeground(Color.BLACK);
        botonDatosPeli.setBounds(20, 480, 160, 60);

        botonDatosActores = new JButton("DATOS ACTORES");
        botonDatosActores.setForeground(Color.BLACK);
        botonDatosActores.setBounds(190, 480, 160, 60);

        botonMuestraDatos = new JButton("MUESTRA DE DATOS");
        botonMuestraDatos.setForeground(Color.BLACK);
        botonMuestraDatos.setBounds(600, 480, 160, 60);

        botonDatosCine = new JButton("DATOS CINE");
        botonDatosCine.setForeground(Color.BLACK);
        botonDatosCine.setBounds(370, 480, 160, 60);

        botonDatosSala = new JButton("DATOS SALA");
        botonDatosSala.setForeground(Color.BLACK);
        botonDatosSala.setBounds(20, 20, 160, 60);

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
        panel.add(botonDatosPeli);
        panel.add(botonDatosActores);
        panel.add(botonMuestraDatos);
        panel.add(botonDatosCine);
        panel.add(botonDatosSala);
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

                VentanaDatosPelicula vent = new VentanaDatosPelicula();

                vent.setVisible(true);

                setVisible(false);

            }
        };
        botonDatosPeli.addActionListener(oyente1);

        oyente2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                VentanaActoresDirect vent4 = new VentanaActoresDirect();

                vent4.setVisible(true);

                setVisible(false);
            }
        };
        botonDatosActores.addActionListener(oyente2);

        oyente3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
        botonMuestraDatos.addActionListener(oyente3);

        oyente4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                VentanaDatosCine vent5 = new VentanaDatosCine();

                vent5.setVisible(true);
                setVisible(false);

            }
        };
        botonDatosCine.addActionListener(oyente4);
        
        
         oyente5 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                VentanaSalaInfo vent6 = new VentanaSalaInfo();
                
                vent6.setVisible(true);
                setVisible(false);
                
            }
        };
        botonDatosSala.addActionListener(oyente5);
        

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
