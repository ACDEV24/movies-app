package models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.json.simple.JSONObject;

public final class Billboard {

    private String id;
    private String details;
    private String weekday;
    private String start_at;
    private String room;
    private String movie;
    private String[] chairs;
    private String name;
    private String cinema_id;
    private String promotions;

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
        @JsonProperty("cinema_id") String cinema_id,
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
        this.cinema_id = cinema_id;
        this.promotions = promotions;
    }
    
    public Billboard() {}
    
    public JSONObject toJson() {
        
        final JSONObject billboard = new JSONObject();
        
        billboard.put("details", this.details);
        billboard.put("weekday", this.weekday);
        billboard.put("start_at", this.start_at);
        billboard.put("room", this.room);
        billboard.put("movie", this.movie);
        billboard.put("chairs", this.chairs);
        billboard.put("name", this.name);
        billboard.put("cinema_id", this.cinema_id);
        billboard.put("promotions", this.promotions);
        
        return billboard;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

    public String getStart_at() {
        return start_at;
    }

    public void setStart_at(String start_at) {
        this.start_at = start_at;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String[] getChairs() {
        return chairs;
    }

    public void setChairs(String[] chairs) {
        this.chairs = chairs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPromotions() {
        return promotions;
    }

    public void setPromotions(String promotions) {
        this.promotions = promotions;
    }

    public String getCinema_id() {
        return cinema_id;
    }

    public void setCinema_id(String cinema_id) {
        this.cinema_id = cinema_id;
    }
}