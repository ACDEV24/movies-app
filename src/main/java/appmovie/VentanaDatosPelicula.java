package appmovie;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import models.Movie;
import requests.Requests;

public class VentanaDatosPelicula extends JFrame {
    
    final Requests requests = new Requests();

    //Etiquetas
    private JLabel labelAlmacenajeDatos;
    private JLabel labelTitulo;
    private JLabel labelGéneroPeli;
    private JLabel labelIdiomaOriginal;
    private JLabel labelFechaProdu;
    private JLabel labelUrlPeli;
    private JLabel labelClasificar;
    private JLabel labelFechaEstreno;
    private JLabel labelResumen;
    private JLabel labelIdentificar;
    private JLabel labelListaDirector;

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
    private JTextField cjaIdentificador;
    private JTextField cjaListaReparto;

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

        labelUrlPeli = new JLabel("URL de la película");
        labelUrlPeli.setForeground(Color.BLACK);
        labelUrlPeli.setBounds(360, 19, 800, 100);

        labelUrlPeli = new JLabel("Duración (horas y minutos)");
        labelUrlPeli.setForeground(Color.BLACK);
        labelUrlPeli.setBounds(360, 90, 800, 100);

        labelClasificar = new JLabel("Clasificación ");
        labelClasificar.setForeground(Color.BLACK);
        labelClasificar.setBounds(360, 19, 800, 100);

        labelFechaEstreno = new JLabel("Fecha de estreno");
        labelFechaEstreno.setForeground(Color.BLACK);
        labelFechaEstreno.setBounds(360, 150, 800, 100);

        labelResumen = new JLabel("Resumen");
        labelResumen.setForeground(Color.BLACK);
        labelResumen.setBounds(360, 210, 800, 100);

        labelIdentificar = new JLabel("Identificador");
        labelIdentificar.setForeground(Color.BLACK);
        labelIdentificar.setBounds(20, 280, 800, 100);

        labelListaDirector = new JLabel("Lista de directores y reparto");
        labelListaDirector.setForeground(Color.BLACK);
        labelListaDirector.setBounds(20, 350, 800, 100);

        //Botones
        btonGuardarInfo = new JButton("GUARDAR INFOMACIÓN");
        btonGuardarInfo.setBounds(20, 480, 160, 60);

        btonBorrarInfo = new JButton("BORRAR INFORMACIÓN");
        btonBorrarInfo.setBounds(190, 480, 160, 60);

        btonRegresar = new JButton("REGRESAR");
        btonRegresar.setBounds(560, 480, 100, 60);

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

        cjaIdentificador = new JTextField();
        cjaIdentificador.setBounds(20, 340, 300, 40);

        cjaListaReparto = new JTextField();
        cjaListaReparto.setBounds(20, 420, 300, 40);

        panel.add(labelAlmacenajeDatos);
        panel.add(labelTitulo);
        panel.add(labelGéneroPeli);
        panel.add(labelIdiomaOriginal);
        panel.add(labelFechaProdu);
        panel.add(labelUrlPeli);
        panel.add(labelClasificar);
        panel.add(labelFechaEstreno);
        panel.add(labelResumen);
        panel.add(labelIdentificar);
        panel.add(labelListaDirector);

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
        panel.add(cjaIdentificador);
        panel.add(cjaListaReparto);

        //Datos de la ventana
        this.setSize(700, 600);
        this.setLocationRelativeTo(null);
        this.setVisible(rootPaneCheckingEnabled);
        this.setResizable(false);

        oyente1 = (ActionEvent e) -> {
            final Movie movie = new Movie();
            
            movie.setTitle(cjaTituloOriginal.getText());
            movie.setGender(cjaGénero.getText());
            
            requests.saveMovie(movie);
        };

        btonGuardarInfo.addActionListener(oyente1);

        oyente2 = (ActionEvent e) -> {
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
