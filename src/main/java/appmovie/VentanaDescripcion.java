package appmovie;

    
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.Document;
import models.Movie;


public class VentanaDescripcion extends JFrame implements ActionListener{
    
    //componentes de la ventana
    private JButton btnvd;
    private JButton comentar;
    private JButton atras;
    private JTextArea resumenPeli;
    private JTextArea recibirComentario;
    private JTextArea cajaActores;
    private JTextArea cajaDirector;
    private JTextField tituloPeli; 
    private JTextField enviarComentario;
    private JScrollPane desplazar;
    private JLabel genero;
    private JLabel idiomaOriginal;
    private JLabel añoProduccion;
    private JLabel id;
    private JLabel ciudadOrigen;
    private JLabel tituloOriginal;
    private JLabel actores;
    private JLabel directores;
    private JLabel clasificacion;
    private JLabel duracion;
    private JLabel fechaEstreno;
    private JLabel comentarios;
    
    //Agregamos el actionListener de los objetos
    ActionListener accionAtras;
    ActionListener accionComentario;

    //Instancia de la peli para ue los atributos la reciban, 
    //y el tipo de dato String para la accion del boton atras
    Movie peli;
    String texto = "";
    
    public VentanaDescripcion(Movie cartelera){
    
        this.peli = peli;
    }
    public VentanaDescripcion(){
        
        setLayout(null);
        
        atras = new JButton("←");
        atras.setBounds(20,20,48,35);
        add(atras);
        
        btnvd = new JButton("getImageIcon(peli.getPicture())");
        btnvd.setBounds(142,40,90,135); 
        add(btnvd);
           
        tituloPeli = new JTextField (peli.getTitle());
        tituloPeli.setBounds(252,40,200,25);
        add(tituloPeli);
        
        resumenPeli = new JTextArea (peli.getDescription());
        resumenPeli.setBounds(252,82,330,95);
        resumenPeli.setBackground(Color.LIGHT_GRAY);
        add(resumenPeli);
        
        genero = new JLabel(peli.getGender());
        genero.setBounds(251,60,200,25);
        add(genero);
        
        idiomaOriginal = new JLabel(peli.getOriginal_language());
        idiomaOriginal.setBounds(301,60,200,25);
        add(idiomaOriginal);
        
        clasificacion = new JLabel(peli.getClassification());
        clasificacion.setBounds(347,60,200,25);
        add(clasificacion);
        
        duracion = new JLabel(peli.getDuration());
        duracion.setBounds(426,60,200,25);
        add(duracion);
        
        añoProduccion = new JLabel(peli.getProduction_date());
        añoProduccion.setBounds(422,177,200,25);
        add(añoProduccion);
        
        fechaEstreno = new JLabel(peli.getRelease_date());
        fechaEstreno.setBounds(422,215,200,25);
        add(fechaEstreno);
        
        id = new JLabel(peli.getId());
        id.setBounds(142,177,200,25);
        add(id); 
        
        tituloOriginal = new JLabel(peli.getOriginal_title());
        tituloOriginal.setBounds(142,196,200,25);
        add(tituloOriginal); 
        
        ciudadOrigen = new JLabel(peli.getOrigin_country());
        ciudadOrigen.setBounds(142,215,200,25);
        add(ciudadOrigen); 
        
        actores = new JLabel("Actores");
        actores.setBounds(209,245,200,25);
        add(actores);
        
        cajaActores = new JTextArea((Document) peli.getCasts());
        desplazar = new JScrollPane(cajaActores);
        desplazar.setBounds(142,269,180,110);
        cajaActores.setBackground(Color.LIGHT_GRAY);
        add(desplazar);
        
        directores = new JLabel();
        directores.setBounds(465,245,200,25);
        add(directores);
        
        cajaDirector = new JTextArea((Document) peli.getCasts());
        desplazar = new JScrollPane(cajaDirector);
        desplazar.setBounds(402,269,180,110);
        cajaDirector.setBackground(Color.LIGHT_GRAY);
        add(desplazar);   
        
        comentarios = new JLabel("comentarios: ");
        comentarios.setBounds(142,391,200,25);
        add(comentarios);
        
        enviarComentario = new JTextField();
        enviarComentario.setBounds(142,416,390,29);
        enviarComentario.setBackground(Color.LIGHT_GRAY);
        add(enviarComentario); 
        
        recibirComentario = new JTextArea();
        desplazar = new JScrollPane(recibirComentario);
        desplazar.setBounds(142,446,390,80);
        add(desplazar);
        
        comentar = new JButton("✔");
        comentar.setBounds(534,416,46,30);       
        add(comentar);
     
        //Accion del boton que lleva devuelta  a la ventanaPelicula 
        accionAtras = new ActionListener(){
            @Override 
            public void actionPerformed(ActionEvent e) {
              
                VentanaPelicula vp = new VentanaPelicula();
                vp.setBounds(0,0,700, 600);
                vp.setVisible(true);
                vp.setResizable(false);
                vp.setBackground(Color.LIGHT_GRAY);
                vp.setLocationRelativeTo(null);
                setVisible(false);                 
            }  
        };
        
        atras.addActionListener(accionAtras);
        
        //Accion del boton comentar, como su nombre lo dice valida el comentario 
        //que esta en el JTextField y lo pasa al JTextArea
        accionComentario = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(ae.getSource() == comentar){
                texto += enviarComentario.getText() + "\n";
                recibirComentario.setText(texto);
                enviarComentario.setText("");
                } 
            }
        };
        comentar.addActionListener(accionComentario);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    //Metodo para pasarle la rul al boton, al final devuelve un imageIcon
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

    @Override
    public void actionPerformed(ActionEvent ae) {}
}