package appmovie;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.UUID;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import models.Movie;
import requests.Requests;

public class VentanaDatosPelicula extends JFrame {

    final Requests requests = new Requests();

    private JCheckBox checkbox;
    //Etiquetas
    private JLabel labelAlmacenajeDatos;
    private JLabel labelTitulo;
    private JLabel labelGéneroPeli;
    private JLabel labelIdiomaOriginal;
    private JLabel labelFechaProdu;
    private JLabel labelClasificar;
    private JLabel labelFechaEstreno;
    private JLabel labelResumen;
    private JLabel labelimsgenURL;
    private JLabel labelDuracion;
    

    //Botones
    private JButton btonGuardarInfo;
    private JButton btonBorrarInfo;
    private JButton buton3;
    private JButton btonRegresar;

    public JTextField cjaTituloOriginal;
    private JTextField cjaGénero;
    private JTextField cjaIdioma;
    private JTextField cjaAñoProduct;
    private JTextField cjaClasificación;
    private JTextField cjaDuraciónHoras;
    private JTextField cjaFechaEstreno;
    private JTextField cjaResumenPeli;
    private JTextField cjaURLimagen;

    private ActionListener oyente1;
    private ActionListener oyente2;
    private ActionListener oyente3;
    private ActionListener oyente4;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public VentanaDatosPelicula() {

        setTitle("ALMACENAJE DE DATOS DE LA PELICULA");

        Componentes3();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void Componentes3() {

        //Panel
        JPanel panel = (JPanel) this.getContentPane();
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(null);

        //Etiquetas
        labelAlmacenajeDatos = new JLabel("ALMACENA LOS DATOS DE LA PELÍCULA");
        labelAlmacenajeDatos.setForeground(Color.BLACK);
        labelAlmacenajeDatos.setBounds(220, -18, 800, 100);

        labelTitulo = new JLabel("Título original");
        labelTitulo.setForeground(Color.BLACK);
        labelTitulo.setBounds(20, 19, 800, 100);

        labelGéneroPeli = new JLabel("Género");
        labelGéneroPeli.setForeground(Color.BLACK);
        labelGéneroPeli.setBounds(20, 90, 800, 100);

        labelIdiomaOriginal = new JLabel("Idioma original");
        labelIdiomaOriginal.setForeground(Color.BLACK);
        labelIdiomaOriginal.setBounds(20, 150, 800, 100);

        labelFechaProdu = new JLabel("Año de la producción");
        labelFechaProdu.setForeground(Color.BLACK);
        labelFechaProdu.setBounds(20, 210, 800, 100);

        labelDuracion = new JLabel("Duración (horas y minutos)");
        labelDuracion.setForeground(Color.BLACK);
        labelDuracion.setBounds(360, 90, 800, 100);

        labelClasificar = new JLabel("Clasificación ");
        labelClasificar.setForeground(Color.BLACK);
        labelClasificar.setBounds(360, 19, 800, 100);

        labelFechaEstreno = new JLabel("Fecha de estreno");
        labelFechaEstreno.setForeground(Color.BLACK);
        labelFechaEstreno.setBounds(360, 150, 800, 100);

        labelResumen = new JLabel("Resumen");
        labelResumen.setForeground(Color.BLACK);
        labelResumen.setBounds(360, 210, 800, 100);

        labelimsgenURL = new JLabel("URL imagen");
        labelimsgenURL.setForeground(Color.BLACK);
        labelimsgenURL.setBounds(20, 280, 800, 100);

        
        //Botones
        btonGuardarInfo = new JButton("GUARDAR INFOMACIÓN");
        btonGuardarInfo.setBounds(20, 480, 160, 60);

        btonBorrarInfo = new JButton("BORRAR INFORMACIÓN");
        btonBorrarInfo.setBounds(190, 480, 160, 60);

        btonRegresar = new JButton("REGRESAR");
        btonRegresar.setBounds(560, 480, 100, 60);

        checkbox = new JCheckBox("¿TIENE SUBTITLOS EN ESPAÑOL?");
        checkbox.setBounds(340, 340, 800, 100);

        cjaTituloOriginal = new JTextField();
        cjaTituloOriginal.setBounds(20, 80, 300, 40);

        cjaGénero = new JTextField();
        cjaGénero.setBounds(20, 150, 300, 40);

        cjaIdioma = new JTextField();
        cjaIdioma.setBounds(20, 210, 300, 40);

        cjaAñoProduct = new JTextField();
        cjaAñoProduct.setBounds(20, 276, 300, 40);

        cjaClasificación = new JTextField();
        cjaClasificación.setBounds(350, 80, 300, 40);

        cjaDuraciónHoras = new JTextField();
        cjaDuraciónHoras.setBounds(350, 150, 300, 40);

        cjaFechaEstreno = new JTextField();
        cjaFechaEstreno.setBounds(350, 210, 300, 40);

        cjaResumenPeli = new JTextField();
        cjaResumenPeli.setBounds(350, 276, 300, 40);

        cjaURLimagen = new JTextField();
        cjaURLimagen.setBounds(20, 340, 300, 40);

        panel.add(labelAlmacenajeDatos);
        panel.add(labelTitulo);
        panel.add(labelGéneroPeli);
        panel.add(labelIdiomaOriginal);
        panel.add(labelFechaProdu);
        panel.add(labelClasificar);
        panel.add(labelFechaEstreno);
        panel.add(labelResumen);
        panel.add(labelimsgenURL);
        panel.add(labelDuracion);
        
        
        panel.add(btonGuardarInfo);
        panel.add(btonBorrarInfo);

        panel.add(btonRegresar);

        panel.add(cjaTituloOriginal);
        panel.add(cjaGénero);
        panel.add(cjaIdioma);
        panel.add(cjaAñoProduct);
        panel.add(cjaClasificación);
        panel.add(cjaDuraciónHoras);
        panel.add(cjaFechaEstreno);
        panel.add(cjaResumenPeli);
        panel.add(cjaURLimagen);
        panel.add(checkbox);

        //Datos de la ventana
        this.setSize(700, 600);
        this.setLocationRelativeTo(null);
        this.setVisible(rootPaneCheckingEnabled);
        this.setResizable(false);

        oyente1 = (ActionEvent e) -> {

            final DefaultListModel<Movie> movies = this.requests.getAllMovies();
            
            if(movies != null && movies.size() == 4) {
                // TODO: COLOCAR ALERTA DE QUE MAXIMO 5 PELICULAS
                return;
            }

            final Movie movie = new Movie();
            final String uuid = UUID.randomUUID().toString().replace("-", "");

            movie.setId(uuid);
            movie.setTitle(cjaTituloOriginal.getText());
            movie.setGender(cjaGénero.getText());
            movie.setOriginal_language(cjaIdioma.getText());
            movie.setDuration(cjaDuraciónHoras.getText());
            movie.setRelease_date(cjaFechaEstreno.getText());
            movie.setDescription(cjaResumenPeli.getText());
            movie.setPicture(cjaURLimagen.getText());
            movie.setHas_subtitles(checkbox.isSelected());

            this.requests.saveMovie(movie);
            
            // TODO: COLOCAR ALERTA DE PELICULA GUARDADA

        };

        btonGuardarInfo.addActionListener(oyente1);

        oyente2 = (ActionEvent e) -> {
            cjaTituloOriginal.setText("");
            cjaGénero.setText("");
            cjaIdioma.setText("");
            cjaAñoProduct.setText("");
            cjaClasificación.setText("");
            cjaDuraciónHoras.setText("");
            cjaFechaEstreno.setText("");
            cjaResumenPeli.setText("");
            cjaURLimagen.setText("");
            checkbox.setSelected(false);
        };

        btonBorrarInfo.addActionListener(oyente2);

        oyente4 = (ActionEvent e) -> {
            VentanaInicial venta = new VentanaInicial();

            venta.setVisible(true);
            setVisible(false);
        };

        btonRegresar.addActionListener(oyente4);
    }

}