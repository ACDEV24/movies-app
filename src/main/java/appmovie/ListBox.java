package appmovie;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import models.Movie;

public class ListBox {
    
    DefaultListModel<Movie> movies = new DefaultListModel<>();
    
    private final JLabel label;

    public ListBox(DefaultListModel<Movie> movies, JLabel label) {
        this.label = label;
        if(movies == null) this.movies = new DefaultListModel<>();
        else this.movies = movies;
    }
    
    JList list;
    JScrollPane scrollPane;

    public void viewComponents() {

        this.list = new javax.swing.JList(movies);
        this.list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        list.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent evt) {

                JList list = (JList) evt.getSource();
            
                int index = list.locationToIndex(evt.getPoint());
                
                label.setText(movies.get(index).getTitle());

                System.out.println(movies.get(index).getTitle());
            }
        });

        this.scrollPane = new javax.swing.JScrollPane(list);
        this.scrollPane.setBounds(500, 70, 200, 150);
    }
}