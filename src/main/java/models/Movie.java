package models;

import com.fasterxml.jackson.annotation.*;
import org.json.JSONObject;

public final class Movie {
    
    private boolean adult;
    private String picture;
    private String id;
    private String original_language;
    private String original_title;
    private String overview;
    private String gender;
    private double popularity;
    private String poster_picture;
    private String release_date;
    private String title;
    private double vote_average;
    private long vote_count;
    private String url;
    private boolean has_subtitles;
    private String origin_country;
    private String duration;
    private String production_date;
    private String classification;

    @JsonCreator
    public Movie(
        @JsonProperty("adult") boolean adult,
        @JsonProperty("picture") String picture,
        @JsonProperty("id") String id,
        @JsonProperty("original_language") String original_language,
        @JsonProperty("original_title") String original_title,
        @JsonProperty("overview") String overview,
        @JsonProperty("gender") String gender,
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
        this.gender = gender;
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
        movie.put("gender", this.gender);
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
    
    public Movie() {}

    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public double getPopularity() {
        return popularity;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    public String getPoster_picture() {
        return poster_picture;
    }

    public void setPoster_picture(String poster_picture) {
        this.poster_picture = poster_picture;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getVote_average() {
        return vote_average;
    }

    public void setVote_average(double vote_average) {
        this.vote_average = vote_average;
    }

    public long getVote_count() {
        return vote_count;
    }

    public void setVote_count(long vote_count) {
        this.vote_count = vote_count;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isHas_subtitles() {
        return has_subtitles;
    }

    public void setHas_subtitles(boolean has_subtitles) {
        this.has_subtitles = has_subtitles;
    }

    public String getOrigin_country() {
        return origin_country;
    }

    public void setOrigin_country(String origin_country) {
        this.origin_country = origin_country;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getProduction_date() {
        return production_date;
    }

    public void setProduction_date(String production_date) {
        this.production_date = production_date;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    @Override
    public String toString() {
        return this.getTitle();
    }
}
