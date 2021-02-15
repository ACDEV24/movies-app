package models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.json.JSONObject;

public final class Cast {

    private String id;
    private String role;
    private String name;
    private String original_name;
    private String movie_id;
    private double popularity;
    private String profile_picture;
    private String character;

    @JsonCreator
    public Cast(
        @JsonProperty("id") String id,
        @JsonProperty("role") String role,
        @JsonProperty("name") String name,
        @JsonProperty("original_name") String original_name,
        @JsonProperty("movie_id") String movie_id,
        @JsonProperty("popularity") double popularity,
        @JsonProperty("profile_picture") String profile_picture,
        @JsonProperty("cast_id") long cast_id,
        @JsonProperty("character") String character
    ){
        this.id = id;
        this.role = role;
        this.name = name;
        this.original_name = original_name;
        this.movie_id = movie_id;
        this.popularity = popularity;
        this.profile_picture = profile_picture;
        this.character = character;
    }
    
    public JSONObject toJson() {
        
        final JSONObject cast = new JSONObject();
        
        cast.put("id", this.id);
        cast.put("role", this.role);
        cast.put("original_name", this.original_name);
        cast.put("movie_id", this.movie_id);
        cast.put("popularity", this.popularity);
        cast.put("profile_picture", this.profile_picture);
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

    public String getOriginal_name() {
        return original_name;
    }

    public void setOriginal_name(String original_name) {
        this.original_name = original_name;
    }

    public String getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(String movie_id) {
        this.movie_id = movie_id;
    }

    public double getPopularity() {
        return popularity;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    public String getProfile_picture() {
        return profile_picture;
    }

    public void setProfile_picture(String profile_picture) {
        this.profile_picture = profile_picture;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }
}
