package models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import org.json.simple.JSONObject;

public final class Cinema {
    
    private String id;
    private String name;
    private int rooms;
    private String direction;
    private String phone_number;
    private DefaultListModel<Billboard> billboards;

    @JsonCreator
    public Cinema(
        @JsonProperty("id") String id,
        @JsonProperty("name") String name,
        @JsonProperty("rooms") int rooms,
        @JsonProperty("direction") String direction,
        @JsonProperty("phone_number") String phone_number
    ){
        this.id = id;
        this.name = name;
        this.rooms = rooms;
        this.direction = direction;
        this.phone_number = phone_number;
    }
    
    public Cinema() {}
    
    public JSONObject toJson() {
        
        final JSONObject cinema = new JSONObject();
        
        final ArrayList<JSONObject> billboards = new ArrayList<>();
        
        cinema.put("id", this.id);
        cinema.put("name", this.name);
        cinema.put("rooms", this.rooms);
        cinema.put("direction", this.direction);
        cinema.put("phone_number", this.phone_number);
        
        return cinema;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public DefaultListModel<Billboard> getBillboards() {
        return billboards;
    }

    public void setBillboards(DefaultListModel<Billboard> billboards) {
        this.billboards = billboards;
    }
}