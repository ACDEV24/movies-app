package appmovie;

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
import models.Movie;

public class VentanaPelicula extends JFrame implements ActionListener{
    
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    
    Movie peli1;
    Movie peli2;
    Movie peli3;
    Movie peli4;
    Movie peli5;
    
    public VentanaPelicula(Movie peli1, Movie peli2, Movie peli3, Movie peli4, Movie peli5){
    
        this.peli1 = peli1;
        this.peli2 = peli2;
        this.peli3 = peli3;
        this.peli4 = peli4;
        this.peli5 = peli5;
        
        setLayout(null);
        
        if(this.peli1 != null) {
            btn1 = new JButton(getImageIcon(peli1.getPicture()));
            btn1.setBounds(100,50,90,135); 
            btn1.addActionListener(this);
            add(btn1);
        }
        if(this.peli3 != null) {
            btn2 = new JButton(getImageIcon(peli2.getPicture()));
            btn2.setBounds(100,270,90,135); 
            btn2.addActionListener(this);
            add(btn2);
        }
        if(this.peli3 != null) {
            btn3 = new JButton(getImageIcon(peli3.getPicture()));
            btn3.setBounds(385,50,90,135); 
            btn3.addActionListener(this);
            add(btn3);
        }
        if(this.peli4 != null) {
            btn4 = new JButton(getImageIcon(peli4.getPicture()));
            btn4.setBounds(385,270,90,135); 
            btn4.addActionListener(this);
            add(btn4);
        }
        if(this.peli5 != null) {
            btn5 = new JButton(getImageIcon(peli5.getPicture()));
            btn5.setBounds(245,164,90,135); 
            btn5.addActionListener(this);
            add(btn5);
        }
        
        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }
    
    public VentanaPelicula() {}
    
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

        final ImageIcon imageIcon = new ImageIcon(c);

        return imageIcon;
    }
    // Acion del boton que llevara a la descripcion de la pelicula 
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        //VentanaDescripcion vm = new VentanaDescripcion();
        //this.setSize(700, 600);
        //this.setLocationRelativeTo(null);
        //this.setVisible(false);
        //this.setResizable(false);
        
    }
    
    public static void main(String []args){
    
        VentanaPelicula v = new VentanaPelicula();
        v.setBounds(0,0,605,500);
        v.setVisible(true);
        v.setResizable(true);
        v.setLocationRelativeTo(null);
    }
}