package appmovie;

import javax.swing.DefaultListModel;
import javax.swing.ListSelectionModel;
import models.Movie;

public class ListBox {
    
    DefaultListModel<Movie> movies = new DefaultListModel<>();

    public ListBox(DefaultListModel<Movie> movies) {
        if(movies == null) this.movies = new DefaultListModel<>();
        else this.movies = movies;
    }
    
    javax.swing.JList list;
    javax.swing.JScrollPane scrollPane;

    public void viewComponents() {
        this.list = new javax.swing.JList(movies);
        this.list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        this.scrollPane = new javax.swing.JScrollPane(list);
        this.scrollPane.setBounds(500, 70, 200, 150);
    }
}