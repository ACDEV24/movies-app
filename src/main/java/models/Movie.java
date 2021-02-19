package models;

import com.fasterxml.jackson.annotation.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.DefaultListModel;
import org.json.simple.JSONObject;

public final class Movie {
    
    private String id;
    private String picture;
    private String original_language;
    private String description;
    private String gender;
    private String release_date;
    private String title;
    private boolean has_subtitles;
    private String origin_country;
    private String duration;
    private DefaultListModel<Cast> casts;
    private DefaultListModel<String> comments;
    public String production_date;
    private String classification;

    @JsonCreator
    public Movie(
        @JsonProperty("id") String id,
        @JsonProperty("picture") String picture,
        @JsonProperty("original_language") String original_language,
        @JsonProperty("description") String description,
        @JsonProperty("gender") String gender,
        @JsonProperty("release_date") String release_date,
        @JsonProperty("title") String title,
        @JsonProperty("has_subtitles") boolean has_subtitles,
        @JsonProperty("origin_country") String origin_country,
        @JsonProperty("duration") String duration,
        @JsonProperty("casts") DefaultListModel<Cast> casts,
        @JsonProperty("comments") String[] comments,
        @JsonProperty("production_date") String production_date,
        @JsonProperty("classification") String classification
    ){
        this.id = id;
        this.picture = picture;
        this.original_language = original_language;
        this.description = description;
        this.gender = gender;
        this.release_date = release_date;
        this.title = title;
        this.has_subtitles = has_subtitles;
        this.origin_country = origin_country;
        this.duration = duration;
        this.casts = casts;
        this.setComments(comments);
        this.production_date = production_date;
        this.classification = classification;
    }
    
    public JSONObject toJson() {
        
        final JSONObject movie = new JSONObject();
        
        movie.put("id", this.id);
        movie.put("picture", this.picture);
        movie.put("original_language", this.original_language);
        movie.put("title", this.title);
        movie.put("description", this.description);
        movie.put("gender", this.gender);
        movie.put("release_date", this.release_date);
        movie.put("title", this.title);
        movie.put("has_subtitles", this.has_subtitles);
        movie.put("origin_country", this.origin_country);
        movie.put("duration", this.duration);
        movie.put("production_date", this.production_date);
        
        List<String> commentsString = new ArrayList<>();
        
        if(this.comments != null) {
            for(int i = 0; i < this.comments.size(); i++) {
                commentsString.add(this.comments.get(i));
            }
        }

        movie.put("comments", commentsString);
        movie.put("classification", this.classification);
        
        return movie;
    }
    
    public Movie() {}

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public DefaultListModel<Cast> getCasts() {
        return casts;
    }

    public void setCasts(DefaultListModel<Cast> casts) {
        this.casts = casts;
    }
    
    public DefaultListModel<String> getComments() {
        return comments;
    }

    public void setComments(String[] commentsArray) {
        DefaultListModel<String> comments = new DefaultListModel<>();
        
        int counter = -1;
        for (String comment : commentsArray) {
            counter++;
            comments.add(counter, comment);
        }
        
        this.comments = comments;
    }
    
    public Movie addComment(String comment) {

        this.comments.add(this.comments.getSize(), comment);
        
        return this;
    }
    
    static <T> T[] append(T[] arr, T element) {
        final int N = arr.length;
        arr = Arrays.copyOf(arr, N + 1);
        arr[N] = element;
        return arr;
    }
    
    @Override
    public String toString() {
        return this.getTitle();
    }
}
