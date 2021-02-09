package models;

import com.fasterxml.jackson.annotation.*;
import org.json.JSONObject;

public final class Movie {
    
    public final boolean adult;
    public final String picture;
    public final String id;
    public final String original_language;
    public final String original_title;
    public final String overview;
    public final double popularity;
    public final String poster_picture;
    public final String release_date;
    public final String title;
    public final double vote_average;
    public final long vote_count;
    public final String url;
    public final boolean has_subtitles;
    public final String origin_country;
    public final String duration;
    public final String production_date;
    public final String classification;

    @JsonCreator
    public Movie(
        @JsonProperty("adult") boolean adult,
        @JsonProperty("picture") String picture,
        @JsonProperty("id") String id,
        @JsonProperty("original_language") String original_language,
        @JsonProperty("original_title") String original_title,
        @JsonProperty("overview") String overview,
        @JsonProperty("popularity") double popularity,
        @JsonProperty("poster_picture") String poster_picture,
        @JsonProperty("release_date") String release_date,
        @JsonProperty("title") String title,
        @JsonProperty("vote_average") double vote_average,
        @JsonProperty("vote_count") long vote_count,
        @JsonProperty("url") String url,
        @JsonProperty("has_subtitles") boolean has_subtitles,
        @JsonProperty("origin_country") String origin_country,
        @JsonProperty("duration") String duration,
        @JsonProperty("production_date") String production_date,
        @JsonProperty("classification") String classification
    ){
        this.adult = adult;
        this.picture = picture;
        this.id = id;
        this.original_language = original_language;
        this.original_title = original_title;
        this.overview = overview;
        this.popularity = popularity;
        this.poster_picture = poster_picture;
        this.release_date = release_date;
        this.title = title;
        this.vote_average = vote_average;
        this.vote_count = vote_count;
        this.url = url;
        this.has_subtitles = has_subtitles;
        this.origin_country = origin_country;
        this.duration = duration;
        this.production_date = production_date;
        this.classification = classification;
    }
    
    public JSONObject toJson() {
        
        final JSONObject movie = new JSONObject();
        
        movie.put("adult", this.adult);
        movie.put("picture", this.picture);
        movie.put("id", this.id);
        movie.put("original_language", this.original_language);
        movie.put("original_title", this.original_title);
        movie.put("overview", this.overview);
        movie.put("popularity", this.popularity);
        movie.put("poster_picture", this.poster_picture);
        movie.put("release_date", this.release_date);
        movie.put("title", this.title);
        movie.put("vote_average", this.vote_average);
        movie.put("vote_count", this.vote_count);
        movie.put("url", this.url);
        movie.put("has_subtitles", this.has_subtitles);
        movie.put("origin_country", this.origin_country);
        movie.put("duration", this.duration);
        movie.put("production_date", this.production_date);
        movie.put("classification", this.classification);
        
        return movie;
    }
}
