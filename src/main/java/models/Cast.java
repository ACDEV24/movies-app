package models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class Cast {

    public final boolean adult;
    public final long gender;
    public final long id;
    public final String known_for_department;
    public final String name;
    public final String original_name;
    public final double popularity;
    public final String profile_path;
    public final long cast_id;
    public final String character;
    public final String credit_id;
    public final long order;

    @JsonCreator
    public Cast(
        @JsonProperty("adult") boolean adult,
        @JsonProperty("gender") long gender,
        @JsonProperty("id") long id,
        @JsonProperty("known_for_department") String known_for_department,
        @JsonProperty("name") String name,
        @JsonProperty("original_name") String original_name,
        @JsonProperty("popularity") double popularity,
        @JsonProperty("profile_path") String profile_path,
        @JsonProperty("cast_id") long cast_id,
        @JsonProperty("character") String character,
        @JsonProperty("credit_id") String credit_id,
        @JsonProperty("order") long order
    ){
        this.adult = adult;
        this.gender = gender;
        this.id = id;
        this.known_for_department = known_for_department;
        this.name = name;
        this.original_name = original_name;
        this.popularity = popularity;
        this.profile_path = profile_path;
        this.cast_id = cast_id;
        this.character = character;
        this.credit_id = credit_id;
        this.order = order;
    }
}
