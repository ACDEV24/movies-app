
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

public class VentanaSalaInfo extends JFrame{
    
    //Etiquetas
    private JLabel labelSala;
    private JLabel labelNombreDeSala;

    //Botones
    private JButton btonGuardarInfo;
    private JButton btonBorrarInfo;
    private JButton btonRegresar;
    
    public JTextField cjaIDsala;

    private ActionListener oyente1;
    private ActionListener oyente2;
    private ActionListener oyente3;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public VentanaSalaInfo() {

        setTitle("ALMACENAJE DEL CIN");

        Componentes4();

        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void Componentes4() {

        //Panel
        JPanel panel = (JPanel) this.getContentPane();
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(null);

        //Etiquetas
        labelSala = new JLabel("ALMACENA LOS DATOS DE LA SALA");
        labelSala.setForeground(Color.BLACK);
        labelSala.setBounds(220, -18, 800, 100);

        labelNombreDeSala = new JLabel("IDENTIFICADOR DE SALA");
        labelNombreDeSala.setForeground(Color.BLACK);
        labelNombreDeSala.setBounds(20, 19, 800, 100);

        
        //Botones
        btonGuardarInfo = new JButton("GUARDAR INFORMACIÓN");
        btonGuardarInfo.setBounds(20, 480, 160, 60);

        btonBorrarInfo = new JButton("BORRAR INFORMACIÓN");
        btonBorrarInfo.setBounds(360, 480, 160, 60);

        btonRegresar = new JButton("REGRESAR");
        btonRegresar.setBounds(560, 480, 100, 60);

       
         cjaIDsala = new JTextField();
         cjaIDsala.setBounds(20, 80, 300, 40);

        panel.add(labelSala);
        panel.add(labelNombreDeSala);
        panel.add(btonGuardarInfo);
        panel.add(btonBorrarInfo);
        panel.add(btonRegresar);
        panel.add(cjaIDsala);
       

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
        btonGuardarInfo.addActionListener(oyente1);

        oyente2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
        btonBorrarInfo.addActionListener(oyente2);

        oyente3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                VentanaInicial ventan = new VentanaInicial();

                ventan.setVisible(true);
                setVisible(false);
            }
        };
        btonRegresar.addActionListener(oyente3);

    }

}
    
    
    
    

