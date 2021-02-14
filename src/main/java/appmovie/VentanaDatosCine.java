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

public class VentanaDatosCine extends JFrame {

    //Etiquetas
    private JLabel labelDatosdelCine;
    private JLabel labelNombre;
    private JLabel labelNúmeroSalas;
    private JLabel labelNúmeroSillas;
    private JLabel labelDirección;
    private JLabel labelTeléfono;

    //Botones
    private JButton btonGuardarInfo;

    private JButton btonBorrarInfo;
    private JButton btonRegresar;

    public JTextField cjaNombreCine;
    private JTextField cjaNúmeroSala;
    private JTextField cjaNúmeroSilla;
    private JTextField cjaDirección;
    private JTextField cjaTeléfono;

    private ActionListener oyente1;
    private ActionListener oyente2;
    private ActionListener oyente3;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public VentanaDatosCine() {

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
        labelDatosdelCine = new JLabel("ALMACENA LOS DATOS DEL CINE");
        labelDatosdelCine.setForeground(Color.BLACK);
        labelDatosdelCine.setBounds(220, -18, 800, 100);

        labelNombre = new JLabel("Nombre");
        labelNombre.setForeground(Color.BLACK);
        labelNombre.setBounds(20, 19, 800, 100);

        labelNúmeroSalas = new JLabel("Número de sala");
        labelNúmeroSalas.setForeground(Color.BLACK);
        labelNúmeroSalas.setBounds(20, 90, 800, 100);

        labelNúmeroSillas = new JLabel("Número de silla");
        labelNúmeroSillas.setForeground(Color.BLACK);
        labelNúmeroSillas.setBounds(20, 150, 800, 100);

        labelDirección = new JLabel("Dirección");
        labelDirección.setForeground(Color.BLACK);
        labelDirección.setBounds(20, 210, 800, 100);

        labelTeléfono = new JLabel("Teléfono");
        labelTeléfono.setForeground(Color.BLACK);
        labelTeléfono.setBounds(360, 19, 800, 100);

        //Botones
        btonGuardarInfo = new JButton("GUARDAR INFORMACIÓN");
        btonGuardarInfo.setBounds(20, 480, 160, 60);

        btonBorrarInfo = new JButton("BORRAR INFORMACIÓN");
        btonBorrarInfo.setBounds(360, 480, 160, 60);

        btonRegresar = new JButton("REGRESAR");
        btonRegresar.setBounds(560, 480, 100, 60);

        cjaNombreCine = new JTextField();
        cjaNombreCine.setBounds(20, 80, 300, 40);

        cjaNúmeroSala = new JTextField();
        cjaNúmeroSala.setBounds(20, 150, 300, 40);

        cjaNúmeroSilla = new JTextField();
        cjaNúmeroSilla.setBounds(20, 210, 300, 40);

        cjaDirección = new JTextField();
        cjaDirección.setBounds(20, 276, 300, 40);

        cjaTeléfono = new JTextField();
        cjaTeléfono.setBounds(350, 80, 300, 40);

        panel.add(labelDatosdelCine);
        panel.add(labelNombre);
        panel.add(labelNúmeroSalas);
        panel.add(labelNúmeroSillas);
        panel.add(labelDirección);
        panel.add(labelTeléfono);

        panel.add(btonGuardarInfo);

        panel.add(btonBorrarInfo);
        panel.add(btonRegresar);

        panel.add(cjaNombreCine);
        panel.add(cjaNúmeroSala);
        panel.add(cjaNúmeroSilla);
        panel.add(cjaDirección);
        panel.add(cjaTeléfono);

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
