package models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.json.JSONObject;

public final class Billboard {

    public final String id;
    public final String details;
    public final String weekday;
    public final String start_at;
    public final String room;
    public final String movie;
    public final String[] chairs;
    public final String name;
    public final String promotions;

    @JsonCreator
    public Billboard(
        @JsonProperty("id") String id,
        @JsonProperty("details") String details,
        @JsonProperty("weekday") String weekday,
        @JsonProperty("start_at") String start_at,
        @JsonProperty("room") String room,
        @JsonProperty("movie") String movie,
        @JsonProperty("chairs") String[] chairs,
        @JsonProperty("name") String name,
        @JsonProperty("promotions") String promotions
    ){
        this.id = id;
        this.details = details;
        this.weekday = weekday;
        this.start_at = start_at;
        this.room = room;
        this.movie = movie;
        this.chairs = chairs;
        this.name = name;
        this.promotions = promotions;
    }
    
    public JSONObject toJson() {
        
        final JSONObject billboard = new JSONObject();
        
        billboard.put("details", this.details);
        billboard.put("weekday", this.weekday);
        billboard.put("start_at", this.start_at);
        billboard.put("room", this.room);
        billboard.put("movie", this.movie);
        billboard.put("chairs", this.chairs);
        billboard.put("name", this.name);
        billboard.put("promotions", this.promotions);
        
        return billboard;
    }
}