package appmovie;

    
import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import models.Movie;

public class VentanaDescripcion extends JFrame{
    
    private JButton btnvd;
    private JTextArea resumenPeli;
    private JTextField tituloPeli;
    private JTextField cajaActores;
    private JTextField cajaDirector;
    private JLabel genero;
    private JLabel idiomaOriginal;
    private JLabel añoProduccion;
    private JLabel actores;
    private JLabel directores;
    private JLabel clasificacion;
    private JLabel duracion;
    private JLabel fechaEstreno;
    
    
    Movie peli;
    
    public VentanaDescripcion(Movie peli){
    
        this.peli = peli;
    }
    public VentanaDescripcion(){
        
        setLayout(null);
        
        btnvd = new JButton(getImageIcon(peli.getPicture()));
        btnvd.setBounds(70,60,90,135); 
        add(btnvd);
           
        tituloPeli = new JTextField ("Titulo");
        tituloPeli.setBounds(180,60,200,25);
        add(tituloPeli);
        
        resumenPeli = new JTextArea ("resumen");
        resumenPeli.setBounds(180,102,330,95);
        resumenPeli.setBackground(Color.LIGHT_GRAY);
        add(resumenPeli);
        
        genero = new JLabel("genero /");
        genero.setBounds(180,80,200,25);
        add(genero);
        
        idiomaOriginal = new JLabel("idioma /");
        idiomaOriginal.setBounds(230,80,200,25);
        add(idiomaOriginal);
        
        clasificacion = new JLabel("clasificacion /");
        clasificacion.setBounds(280,80,200,25);
        add(clasificacion);
        
        duracion = new JLabel("duracion");
        duracion.setBounds(360,80,200,25);
        add(duracion);
        
        añoProduccion = new JLabel("Fecha Produccion: 00/00/0000 -- ");
        añoProduccion.setBounds(75,207,200,25);
        add(añoProduccion);
        
        fechaEstreno = new JLabel("Fecha Extreno: 00/00/0000");
        fechaEstreno.setBounds(260,207,200,25);
        add(fechaEstreno);
        
        actores = new JLabel("Actores");
        actores.setBounds(195,230,200,25);
        add(actores);
        
        cajaActores = new JTextField();
        cajaActores.setBounds(169,255,100,180);
        cajaActores.setBackground(Color.LIGHT_GRAY);
        add(cajaActores);
        
        directores = new JLabel("Directores");
        directores.setBounds(380,230,200,25);
        add(directores);
        
        cajaDirector = new JTextField();
        cajaDirector.setBounds(360,255,100,180);
        cajaDirector.setBackground(Color.LIGHT_GRAY);
        add(cajaDirector);
     
    //    VentanaDescripcion vd = new VentanaDescripcion();
    //    vd.setBounds(0, 0, 605, 500);
    //    vd.setVisible(true);
    //    vd.setResizable(true);
    //    vd.setLocationRelativeTo(null);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public ImageIcon getImageIcon(String picture) {
        URL url = null;
        try {
            url = new URL(picture);
        } catch (MalformedURLException ex) {
            return null;
        }

        BufferedImage c = null;
        try {
            c = ImageIO.read(url);
        } catch (IOException ex) {
            return null;
        }

        ImageIcon image= new ImageIcon(c);
        return null;
    }
       
}