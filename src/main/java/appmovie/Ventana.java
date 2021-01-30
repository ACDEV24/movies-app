package appmovie;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame {
    
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    
    FondoPanel fondo = new FondoPanel();
    
    public class FondoPanel extends JPanel {
        
        private Image image;
        
        @Override
        public void paint(Graphics g) {
            
//            image = new ImageIcon(getClass().getResource("/imagenes/fondos-de-pantalla-canalapps.jpg")).getImage();
//            
//            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            
            setOpaque(false);
            
            super.paint(g);
            
        }
        
    }
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Ventana() {
        
        this.setContentPane(fondo);
        
        setTitle("MOVIES APP");
        
        MostrarElementos();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    private void MostrarElementos() {

        //Generando otro panel
        JPanel panel = (JPanel) this.getContentPane();

        //Modificamos el panel
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(null);
        
        label1 = new JLabel("PRIMERA PELICULA");
        label1.setForeground(Color.WHITE);
        label1.setBounds(20, 428, 800, 100);
        
        label2 = new JLabel("SEGUNDA PELICULA");
        label2.setForeground(Color.WHITE);
        label2.setBounds(170, 428, 800, 100);
        
        label3 = new JLabel("TERCERA PELICULA");
        label3.setForeground(Color.WHITE);
        label3.setBounds(340, 428, 800, 100);
        
        label4 = new JLabel("CUARTA PELICULA");
        label4.setForeground(Color.WHITE);
        label4.setBounds(500, 428, 800, 100);
        
        label5 = new JLabel("QUINTA PELICULA");
        label5.setForeground(Color.WHITE);
        label5.setBounds(670, 428, 800, 100);
       
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);
        panel.add(label5);
        
       
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setVisible(rootPaneCheckingEnabled);
        this.setResizable(false);
        
    }
    
}
