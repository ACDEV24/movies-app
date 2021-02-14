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

public class Ventana3 extends JFrame {
    
    final Requests requests = new Requests();

    //Etiquetas
    private JLabel letra1;
    private JLabel letra2;
    private JLabel letra3;
    private JLabel letra4;
    private JLabel letra5;
    private JLabel letra6;
    private JLabel letra7;
    private JLabel letra8;
    private JLabel letra9;
    private JLabel letra10;
    private JLabel letra11;

    //Botones
    private JButton buton1;
    private JButton buton2;
    private JButton buton3;
    private JButton buton4;

    public JTextField cja1;
    private JTextField cja2;
    private JTextField cja3;
    private JTextField cja4;
    private JTextField cja5;
    private JTextField cja6;
    private JTextField cja7;
    private JTextField cja8;
    private JTextField cja9;
    private JTextField cja10;

    private ActionListener oyente1;
    private ActionListener oyente2;
    private ActionListener oyente3;
    private ActionListener oyente4;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Ventana3() {

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
        letra1 = new JLabel("ALMACENA LOS DATOS DE LA PELÍCULA");
        letra1.setForeground(Color.BLACK);
        letra1.setBounds(220, -18, 800, 100);

        letra2 = new JLabel("Título original");
        letra2.setForeground(Color.BLACK);
        letra2.setBounds(20, 19, 800, 100);

        letra3 = new JLabel("Género");
        letra3.setForeground(Color.BLACK);
        letra3.setBounds(20, 90, 800, 100);

        letra4 = new JLabel("Idioma original");
        letra4.setForeground(Color.BLACK);
        letra4.setBounds(20, 150, 800, 100);

        letra5 = new JLabel("Año de la producción");
        letra5.setForeground(Color.BLACK);
        letra5.setBounds(20, 210, 800, 100);

        letra6 = new JLabel("URL de la película");
        letra6.setForeground(Color.BLACK);
        letra6.setBounds(360, 19, 800, 100);

        letra6 = new JLabel("Duración (horas y minutos)");
        letra6.setForeground(Color.BLACK);
        letra6.setBounds(360, 90, 800, 100);

        letra7 = new JLabel("Clasificación ");
        letra7.setForeground(Color.BLACK);
        letra7.setBounds(360, 19, 800, 100);

        letra8 = new JLabel("Fecha de estreno");
        letra8.setForeground(Color.BLACK);
        letra8.setBounds(360, 150, 800, 100);

        letra9 = new JLabel("Resumen");
        letra9.setForeground(Color.BLACK);
        letra9.setBounds(360, 210, 800, 100);

        letra10 = new JLabel("Identificador");
        letra10.setForeground(Color.BLACK);
        letra10.setBounds(20, 280, 800, 100);

        letra11 = new JLabel("Lista de directores y reparto");
        letra11.setForeground(Color.BLACK);
        letra11.setBounds(20, 350, 800, 100);

        //Botones
        buton1 = new JButton("GUARDAR INFOMACIÓN");
        buton1.setBounds(20, 480, 160, 60);

        buton2 = new JButton("BORRAR INFORMACIÓN");
        buton2.setBounds(190, 480, 160, 60);

        buton4 = new JButton("REGRESAR");
        buton4.setBounds(560, 480, 100, 60);

        cja1 = new JTextField();
        cja1.setBounds(20, 80, 300, 40);

        cja2 = new JTextField();
        cja2.setBounds(20, 150, 300, 40);

        cja3 = new JTextField();
        cja3.setBounds(20, 210, 300, 40);

        cja4 = new JTextField();
        cja4.setBounds(20, 276, 300, 40);

        cja5 = new JTextField();
        cja5.setBounds(350, 80, 300, 40);

        cja6 = new JTextField();
        cja6.setBounds(350, 150, 300, 40);

        cja7 = new JTextField();
        cja7.setBounds(350, 210, 300, 40);

        cja8 = new JTextField();
        cja8.setBounds(350, 276, 300, 40);

        cja9 = new JTextField();
        cja9.setBounds(20, 340, 300, 40);

        cja10 = new JTextField();
        cja10.setBounds(20, 420, 300, 40);

        panel.add(letra1);
        panel.add(letra2);
        panel.add(letra3);
        panel.add(letra4);
        panel.add(letra5);
        panel.add(letra6);
        panel.add(letra7);
        panel.add(letra8);
        panel.add(letra9);
        panel.add(letra10);
        panel.add(letra11);

        panel.add(buton1);
        panel.add(buton2);
        
        panel.add(buton4);

        panel.add(cja1);
        panel.add(cja2);
        panel.add(cja3);
        panel.add(cja4);
        panel.add(cja5);
        panel.add(cja6);
        panel.add(cja7);
        panel.add(cja8);
        panel.add(cja9);
        panel.add(cja10);

        //Datos de la ventana
        this.setSize(700, 600);
        this.setLocationRelativeTo(null);
        this.setVisible(rootPaneCheckingEnabled);
        this.setResizable(false);

        oyente1 = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                final Movie movie = new Movie();
                movie.setTitle(cja1.getText());
                
                requests.createMovie(movie);
            }
        };

        buton1.addActionListener(oyente1);

        oyente2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };

        buton2.addActionListener(oyente2);

        oyente4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Ventana venta = new Ventana();
                
                venta.setVisible(true);
                setVisible(false);
              

            }
        };
        buton4.addActionListener(oyente4);

    }

}
