package models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.json.simple.JSONObject;

public final class Cast {

    private String id;
    private String role;
    private String name;
    private String movie_id;
    private String nationality;
    private int acted_movies;
    private int diriged_movies;
    private String character;

    @JsonCreator
    public Cast(
        @JsonProperty("id") String id,
        @JsonProperty("role") String role,
        @JsonProperty("name") String name,
        @JsonProperty("movie_id") String movie_id,
        @JsonProperty("nationality") String nationality,
        @JsonProperty("acted_movies") int acted_movies,
        @JsonProperty("diriged_movies") int diriged_movies,
        @JsonProperty("character") String character
    ){
        this.id = id;
        this.role = role;
        this.name = name;
        this.movie_id = movie_id;
        this.nationality = nationality;
        this.acted_movies = acted_movies;
        this.diriged_movies = diriged_movies;
        this.character = character;
    }
    
    public Cast(){}
    
    public JSONObject toJson() {
        
        final JSONObject cast = new JSONObject();
        
        cast.put("id", this.id);
        cast.put("role", this.role);
        cast.put("name", this.name);
        cast.put("movie_id", this.movie_id);
        cast.put("nationality", this.nationality);
        cast.put("acted_movies", this.acted_movies);
        cast.put("diriged_movies", this.diriged_movies);
        cast.put("character", this.character);
        
        return cast;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(String movie_id) {
        this.movie_id = movie_id;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public int getActed_movies() {
        return acted_movies;
    }

    public void setActed_movies(int acted_movies) {
        this.acted_movies = acted_movies;
    }

    public int getDiriged_movies() {
        return diriged_movies;
    }

    public void setDiriged_movies(int diriged_movies) {
        this.diriged_movies = diriged_movies;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    
    @Override
    public String toString() {
        return this.name + ". Rol: " + this.role;
    }
}
