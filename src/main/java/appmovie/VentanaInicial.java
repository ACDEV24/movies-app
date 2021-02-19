package appmovie;

//Importaciones
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import models.Movie;
import requests.Requests;

public class VentanaInicial extends JFrame {
    
    final Requests requests = new Requests();

    //Atributos gráficos
    JButton botonDatosPeli;
    JButton botonDatosActores;
    JButton botonMuestraDatos;
    JLabel fondo1;

    //Action listener objetos
    private ActionListener oyente1;
    private ActionListener oyente2;
    private ActionListener oyente3;

    //Elementos de la ventana
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public VentanaInicial() {
        setTitle("MOVIES APP");

        MostrarElementos();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

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
        
        //Con el metodo ImageIcon le ponemos fondo a nuestra aplicacion mediante un JLabel, 
        //la imagen se encuentra deltro de la carpeta del proyecto para que sea mas facil llamarla
        fondo1 = new JLabel(new ImageIcon("Fondo.jpg"));
        fondo1.setBounds(0,0,800,600);
        add(fondo1);

        panel.add(botonDatosPeli);
        panel.add(botonDatosActores);
        panel.add(botonMuestraDatos);
        panel.add(fondo1);

        //Datos de ventana
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setVisible(rootPaneCheckingEnabled);
        this.setResizable(false);

        //Action listener para los botones
        oyente1 = (ActionEvent e) -> {
            VentanaDatosPelicula vent = new VentanaDatosPelicula();
            
            vent.setVisible(true);
            
            setVisible(false);
        };
        botonDatosPeli.addActionListener(oyente1);

        oyente2 = (ActionEvent e) -> {
            VentanaActoresDirect vent4 = new VentanaActoresDirect();
            
            vent4.setVisible(true);
            
            setVisible(false);
        };
        botonDatosActores.addActionListener(oyente2);

        oyente3 = (ActionEvent e) -> {
            
            final DefaultListModel<Movie> movies = this.requests.getAllMovies();
            
            VentanaPelicula vp = new VentanaPelicula();
            
            if(movies != null) {
                switch (movies.size()) {
                    case 0: vp = new VentanaPelicula();
                    break;
                    case 1: vp = new VentanaPelicula(
                        movies.get(0),
                        null,
                        null,
                        null,
                        null
                    );
                    break;
                    case 2: vp = new VentanaPelicula(
                        movies.get(0),
                        movies.get(1),
                        null,
                        null,
                        null
                    );
                    break;
                    case 3: vp = new VentanaPelicula(
                        movies.get(0),
                        movies.get(1),
                        movies.get(2),
                        null,
                        null
                    );
                    break;
                    case 4: vp = new VentanaPelicula(
                        movies.get(0),
                        movies.get(1),
                        movies.get(2),
                        movies.get(3),
                        null
                    );
                    break;
                    case 5: vp = new VentanaPelicula(
                        movies.get(0),
                        movies.get(1),
                        movies.get(2),
                        movies.get(3),
                        movies.get(4)
                    );
                    break;
                }
            }
            
            vp.setBounds(0,0,700, 600);
            vp.setVisible(true);
            vp.setResizable(false);
            vp.setBackground(Color.LIGHT_GRAY);
            vp.setLocationRelativeTo(null);
        };
        botonMuestraDatos.addActionListener(oyente3);
    }
}
