package models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import org.json.JSONObject;

public final class Cinema {
    
    public final String name;
    public final long rooms;
    public final String direction;
    public final String phone_number;
    public final Billboard billboards[];

    @JsonCreator
    public Cinema(
        @JsonProperty("name") String name,
        @JsonProperty("rooms") long rooms,
        @JsonProperty("direction") String direction,
        @JsonProperty("phone_number") String phone_number,
        @JsonProperty("billboards") Billboard[] billboards
    ){
        this.name = name;
        this.rooms = rooms;
        this.direction = direction;
        this.phone_number = phone_number;
        this.billboards = billboards;
    }
    
    public JSONObject toJson() {
        
        final JSONObject cinema = new JSONObject();
        
        final ArrayList<JSONObject> billboards = new ArrayList<>();
        
        cinema.put("name", this.name);
        cinema.put("rooms", this.rooms);
        cinema.put("direction", this.direction);
        cinema.put("phone_number", this.phone_number);
        
        for (Billboard billboard : this.billboards) {
            billboards.add(billboard.toJson());
        }
        
        cinema.put("billboards", billboards);
        
        return cinema;
    }
}