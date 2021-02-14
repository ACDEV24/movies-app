package models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.json.JSONObject;

public final class Cast {

    public final String id;
    public final String role;
    public final String name;
    public final String original_name;
    public final double popularity;
    public final String profile_picture;
    public final String character;

    @JsonCreator
    public Cast(
        @JsonProperty("id") String id,
        @JsonProperty("role") String role,
        @JsonProperty("name") String name,
        @JsonProperty("original_name") String original_name,
        @JsonProperty("popularity") double popularity,
        @JsonProperty("profile_picture") String profile_picture,
        @JsonProperty("cast_id") long cast_id,
        @JsonProperty("character") String character
    ){
        this.id = id;
        this.role = role;
        this.name = name;
        this.original_name = original_name;
        this.popularity = popularity;
        this.profile_picture = profile_picture;
        this.character = character;
    }
    
    public JSONObject toJson() {
        
        final JSONObject cast = new JSONObject();
        
        cast.put("id", this.id);
        cast.put("role", this.role);
        cast.put("original_name", this.original_name);
        cast.put("popularity", this.popularity);
        cast.put("profile_picture", this.profile_picture);
        cast.put("character", this.character);
        
        return cast;
    }
}
