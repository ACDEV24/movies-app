package models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class Cinema {
    
    public final String name;
    public final long rooms;
    public final String direction;
    public final String phone_number;
    public final Billboard billboard[];

    @JsonCreator
    public Cinema(
        @JsonProperty("name") String name,
        @JsonProperty("rooms") long rooms,
        @JsonProperty("direction") String direction,
        @JsonProperty("phone_number") String phone_number,
        @JsonProperty("billboard") Billboard[] billboard
    ){
        this.name = name;
        this.rooms = rooms;
        this.direction = direction;
        this.phone_number = phone_number;
        this.billboard = billboard;
    }
}