package appmovie;
    
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.text.Document;
import models.Movie;
import requests.Requests;


public final class VentanaDescripcion extends JFrame implements ActionListener{
    
    final Requests requests = new Requests();
    
    //componentes de la ventana
    private JButton btnvd;
    private JButton comentar;
    private JButton atras;
    private JTextArea resumenPeli;
//    private JTextArea cajaActores;
//    private JTextArea cajaDirector;
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
    
    JList listComments;
    JList listActors;
    JList listDirectors;
    JScrollPane scrollPaneComments;
    JScrollPane ScrollPaneActors;
    JScrollPane ScrollPaneDirectors;

    //Instancia de la peli para que los atributos la reciban, 
    //y el tipo de dato String para la accion del boton atras
    Movie peli;
    String texto = "";
    
    //Aqui tenemos el contructor junto con el parametro de la intancia tipo Movie
    public VentanaDescripcion(Movie peli){
    
        this.peli = peli;
        
        this.viewComponents();
    }
    
    //En este oro constructor veremos todo el corazon de esta venatana,
    //ya que tenemos la validacion de todos los componentenes, 
    //con la creacion de objetos tipo, JLAbel,JButton,JTextArea, JTextField, 
    //Ademas tenemos la accion del boton del aparatdo comentar,
    //el cual pasa el comentario del JTextField al JTextArea
    public void viewComponents() {
        
        this.listComments = new javax.swing.JList(this.peli.getComments());
        this.listComments.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        this.scrollPaneComments = new javax.swing.JScrollPane(listComments);
        this.scrollPaneComments.setBounds(142, 446, 390, 80);
        add(this.scrollPaneComments);

        this.listActors = new javax.swing.JList(this.peli.getCasts());
        this.listActors.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        this.ScrollPaneActors = new javax.swing.JScrollPane(listActors);
        this.ScrollPaneActors.setBounds(142,269,180,110);
        add(this.ScrollPaneActors);
        
        this.listDirectors = new javax.swing.JList(this.peli.getCasts());
        this.listDirectors.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        this.ScrollPaneDirectors = new javax.swing.JScrollPane(listDirectors);
        this.ScrollPaneDirectors.setBounds(402,269,180,110);
        add(this.ScrollPaneDirectors);
        
        setLayout(null);
        
        atras = new JButton("←");
        atras.setBounds(20,20,48,35);
        add(atras);
        
        btnvd = new JButton(getImageIcon(peli.getPicture()));
        btnvd.setBounds(142,40,90,135); 
        add(btnvd);
           
        tituloPeli = new JTextField ("Titulo: " + peli.getTitle());
        tituloPeli.setBounds(252,40,200,25);
        tituloPeli.setEditable(false);
        add(tituloPeli);
        
        resumenPeli = new JTextArea ("Descripcion: " + peli.getDescription());
        resumenPeli.setBounds(252,82,330,95);
        resumenPeli.setBackground(Color.LIGHT_GRAY);
        resumenPeli.setEditable(false);
        add(resumenPeli);
        
        genero = new JLabel("Genero: " + peli.getGender());
        genero.setBounds(251,60,200,25);
        add(genero);
        
        idiomaOriginal = new JLabel("Lenguaje original: " + peli.getOriginal_language());
        idiomaOriginal.setBounds(142,195,200,25);
        add(idiomaOriginal);
        
        clasificacion = new JLabel("Classificacion: " + peli.getClassification());
        clasificacion.setBounds(422,195,200,25);
        add(clasificacion);
        
        duracion = new JLabel("Duracion: " + peli.getDuration());
        duracion.setBounds(400,60,200,25);
        add(duracion);
        
        añoProduccion = new JLabel("Produccion: " + peli.getProduction_date());
        añoProduccion.setBounds(422,177,200,25);
        add(añoProduccion);
        
        fechaEstreno = new JLabel("Lanzamiento: " + peli.getRelease_date());
        fechaEstreno.setBounds(422,215,200,25);
        add(fechaEstreno);
        
        tituloOriginal = new JLabel("Titulo: " + peli.getOriginal_title());
        tituloOriginal.setBounds(142,176,200,25);
        add(tituloOriginal); 
        
        ciudadOrigen = new JLabel("Nacionalidad: " + peli.getOrigin_country());
        ciudadOrigen.setBounds(142,215,200,25);
        add(ciudadOrigen); 
        
        actores = new JLabel("Actores");
        actores.setBounds(209,245,200,25);
        add(actores);
        
        
/*      cajaActores = new JTextArea((Document) peli.getCasts());
        desplazar = new JScrollPane((Component) cajaActores);
        desplazar.setBounds(142,269,180,110);
        add(desplazar);   
*/        
        directores = new JLabel("Directores");
        directores.setBounds(465,245,200,25);
        add(directores);
        
/*      cajaDirector = new JTextArea((Document) peli.getCasts());
        desplazar = new JScrollPane(cajaDirector);
        desplazar.setBounds(402,269,180,110);
        cajaDirector.setBackground(Color.LIGHT_GRAY);
        cajaDirector.setEditable(false);
        add(desplazar);   
*/        
        comentarios = new JLabel("comentarios: ");
        comentarios.setBounds(142,391,200,25);
        add(comentarios);
        
        enviarComentario = new JTextField();
        enviarComentario.setBounds(142,416,390,29);
        enviarComentario.setBackground(Color.LIGHT_GRAY);
        add(enviarComentario);
        
//        recibirComentario = new JTextArea();
//        desplazar = new JScrollPane(recibirComentario);
//        desplazar.setBounds(142,446,390,80);
//        add(desplazar);
        
        comentar = new JButton("✔");
        comentar.setBounds(534,416,46,30);       
        add(comentar);
     
        //Accion del boton que lleva devuelta  a la ventanaPelicula 
        accionAtras = (ActionEvent e) -> {
//            VentanaPelicula vp = new VentanaPelicula();
//            vp.setBounds(0,0,700, 600);
//            vp.setVisible(true);
//            vp.setResizable(false);
//            vp.setBackground(Color.LIGHT_GRAY);
//            vp.setLocationRelativeTo(null);
            setVisible(false);  
        };
        
        atras.addActionListener(accionAtras);
        
        //Accion del boton comentar, como su nombre lo dice valida el comentario 
        //que esta en el JTextField y lo pasa al JTextArea
        accionComentario = (ActionEvent ae) -> {
            if(ae.getSource() == comentar){

                this.peli = this.peli.addComment(enviarComentario.getText());
                enviarComentario.setText("");
                
                this.requests.saveMovie(peli);
            }
        };
        comentar.addActionListener(accionComentario);
        
        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }

    public VentanaDescripcion() {}
    
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

        ImageIcon imageIcon = new ImageIcon(c);
        
        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(90, 135,  java.awt.Image.SCALE_SMOOTH);
        
        imageIcon = new ImageIcon(newimg);

        return imageIcon;
    }   

    @Override
    public void actionPerformed(ActionEvent ae) {}
}