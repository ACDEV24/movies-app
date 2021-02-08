package models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class Billboard {

    public final String details;
    public final String weekday;
    public final String start_at;
    public final long room;
    public final String movie;
    public final String chairs;
    public final String name;
    public final String promotions;

    @JsonCreator
    public Billboard(
        @JsonProperty("details") String details,
        @JsonProperty("weekday") String weekday,
        @JsonProperty("start_at") String start_at,
        @JsonProperty("room") long room,
        @JsonProperty("movie") String movie,
        @JsonProperty("chairs") String chairs,
        @JsonProperty("name") String name,
        @JsonProperty("promotions") String promotions
    ){
        this.details = details;
        this.weekday = weekday;
        this.start_at = start_at;
        this.room = room;
        this.movie = movie;
        this.chairs = chairs;
        this.name = name;
        this.promotions = promotions;
    }
}