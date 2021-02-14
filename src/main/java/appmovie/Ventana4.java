package appmovie;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import models.Movie;
import requests.Requests;

public class Ventana4 extends JFrame {
    
    final Requests requests = new Requests();

    //Etiquetas
    private JLabel letra1;
    private JLabel letra2;
    private JLabel letra3;
    private JLabel letra4;
    private JLabel letra5;
    

    //Botones
    private JButton buton1;
   
    private JButton buton3;
    private JButton buton4;

    public JTextField cja1;
    private JTextField cja2;
    private JTextField cja3;
    private JTextField cja4;

   

    private ActionListener oyente1;
    private ActionListener oyente2;
    private ActionListener oyente3;


    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Ventana4() {

        setTitle("ALMACENAJE DE DATOS DE PARTICIPANTES EN LA PELÍCULA");

        Componentes3();

        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void Componentes3() {
        
        final DefaultListModel<Movie> movies = requests.getAllMovies();
        
        final ListBox listBox = new ListBox(movies);
        
        listBox.viewComponents();

        //Panel
        JPanel panel = (JPanel) this.getContentPane();
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(null);

        //Etiquetas
        letra1 = new JLabel("ALMACENA LOS DATOS DE LOS ACTORES");
        letra1.setForeground(Color.BLACK);
        letra1.setBounds(220, -18, 800, 100);

        letra2 = new JLabel("Nombre");
        letra2.setForeground(Color.BLACK);
        letra2.setBounds(20, 19, 800, 100);

        letra3 = new JLabel("Nacionalidad");
        letra3.setForeground(Color.BLACK);
        letra3.setBounds(20, 90, 800, 100);

        letra4 = new JLabel("Cantidad de películas en que actuó ");
        letra4.setForeground(Color.BLACK);
        letra4.setBounds(20, 150, 800, 100);

        letra5 = new JLabel("Cantidad de películas que dirigió");
        letra5.setForeground(Color.BLACK);
        letra5.setBounds(20, 210, 800, 100);

        
        

      

     

        //Botones
        buton1 = new JButton("GUARDAR INFORMACIÓN");
        buton1.setBounds(20, 480, 160, 60);

      
        buton3 = new JButton("BORRAR INFORMACIÓN");
        buton3.setBounds(360, 480, 160, 60);

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


        
        panel.add(letra1);
        panel.add(letra2);
        panel.add(letra3);
        panel.add(letra4);
        panel.add(letra5);
        

        panel.add(buton1);
       
        panel.add(buton3);
        panel.add(buton4);

        panel.add(cja1);
        panel.add(cja2);
        panel.add(cja3);
        panel.add(cja4);
        panel.add(listBox.scrollPane);
      
        

        //Datos de la ventana
        this.setSize(700, 600);
        this.setLocationRelativeTo(null);
        this.setVisible(rootPaneCheckingEnabled);
        this.setResizable(false);

        oyente1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
        buton1.addActionListener(oyente1);

        oyente2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
        buton3.addActionListener(oyente2);

        oyente3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Ventana ventan = new Ventana();
                
                ventan.setVisible(true);
                setVisible(false);
            }
        };
        buton4.addActionListener(oyente3);

        

    }

}
