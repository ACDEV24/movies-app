package models;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;

//
//public class Movie {
//    
//    private Boolean adult;
//    private String backdropPath;
//    private long[] genreIDS;
//    private Long id;
//    private String originalLanguage;
//    private String originalTitle;
//    private String overview;
//    private Double popularity;
//    private String posterPath;
//    private Date releaseDate;
//    private String title;
//    private Boolean video;
//    private Double voteAverage;
//    private Long voteCount;
//
//    @JsonProperty("adult")
//    public Boolean getAdult() { return adult; }
//    @JsonProperty("adult")
//    public void setAdult(Boolean value) { this.adult = value; }
//
//    @JsonProperty("backdrop_path")
//    public String getBackdropPath() { return backdropPath; }
//    @JsonProperty("backdrop_path")
//    public void setBackdropPath(String value) { this.backdropPath = value; }
//
//    @JsonProperty("genre_ids")
//    public long[] getGenreIDS() { return genreIDS; }
//    @JsonProperty("genre_ids")
//    public void setGenreIDS(long[] value) { this.genreIDS = value; }
//
//    @JsonProperty("id")
//    public Long getID() { return id; }
//    @JsonProperty("id")
//    public void setID(Long value) { this.id = value; }
//
//    @JsonProperty("original_language")
//    public String getOriginalLanguage() { return originalLanguage; }
//    @JsonProperty("original_language")
//    public void setOriginalLanguage(String value) { this.originalLanguage = value; }
//
//    @JsonProperty("original_title")
//    public String getOriginalTitle() { return originalTitle; }
//    @JsonProperty("original_title")
//    public void setOriginalTitle(String value) { this.originalTitle = value; }
//
//    @JsonProperty("overview")
//    public String getOverview() { return overview; }
//    @JsonProperty("overview")
//    public void setOverview(String value) { this.overview = value; }
//
//    @JsonProperty("popularity")
//    public Double getPopularity() { return popularity; }
//    @JsonProperty("popularity")
//    public void setPopularity(Double value) { this.popularity = value; }
//
//    @JsonProperty("poster_path")
//    public String getPosterPath() { return posterPath; }
//    @JsonProperty("poster_path")
//    public void setPosterPath(String value) { this.posterPath = value; }
//
//    @JsonProperty("release_date")
//    public Date getReleaseDate() { return releaseDate; }
//    @JsonProperty("release_date")
//    public void setReleaseDate(Date value) { this.releaseDate = value; }
//
//    @JsonProperty("title")
//    public String getTitle() { return title; }
//    @JsonProperty("title")
//    public void setTitle(String value) { this.title = value; }
//
//    @JsonProperty("video")
//    public Boolean getVideo() { return video; }
//    @JsonProperty("video")
//    public void setVideo(Boolean value) { this.video = value; }
//
//    @JsonProperty("vote_average")
//    public Double getVoteAverage() { return voteAverage; }
//    @JsonProperty("vote_average")
//    public void setVoteAverage(Double value) { this.voteAverage = value; }
//
//    @JsonProperty("vote_count")
//    public Long getVoteCount() { return voteCount; }
//    @JsonProperty("vote_count")
//    public void setVoteCount(Long value) { this.voteCount = value; }
//}

public final class Movie {
    
    public final boolean adult;
    public final String backdrop_path;
    public final int[] genre_ids;
    public final long id;
    public final String original_language;
    public final String original_title;
    public final String overview;
    public final double popularity;
    public final String poster_path;
    public final String release_date;
    public final String title;
    public final boolean video;
    public final double vote_average;
    public final long vote_count;

    @JsonCreator
    public Movie(
        @JsonProperty("adult") boolean adult,
        @JsonProperty("backdrop_path") String backdrop_path,
        @JsonProperty("genre_ids") int[] genre_ids,
        @JsonProperty("id") long id,
        @JsonProperty("original_language") String original_language,
        @JsonProperty("original_title") String original_title,
        @JsonProperty("overview") String overview,
        @JsonProperty("popularity") double popularity,
        @JsonProperty("poster_path") String poster_path,
        @JsonProperty("release_date") String release_date,
        @JsonProperty("title") String title,
        @JsonProperty("video") boolean video,
        @JsonProperty("vote_average") double vote_average,
        @JsonProperty("vote_count") long vote_count
    ){
        this.adult = adult;
        this.backdrop_path = backdrop_path;
        this.genre_ids = genre_ids;
        this.id = id;
        this.original_language = original_language;
        this.original_title = original_title;
        this.overview = overview;
        this.popularity = popularity;
        this.poster_path = poster_path;
        this.release_date = release_date;
        this.title = title;
        this.video = video;
        this.vote_average = vote_average;
        this.vote_count = vote_count;
    }
}
