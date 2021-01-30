package models;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;

public class Movie {
    private Boolean adult;
    private String backdropPath;
    private long[] genreIDS;
    private Long id;
    private String originalLanguage;
    private String originalTitle;
    private String overview;
    private Double popularity;
    private String posterPath;
    private Date releaseDate;
    private String title;
    private Boolean video;
    private Double voteAverage;
    private Long voteCount;

    @JsonProperty("adult")
    public Boolean getAdult() { return adult; }
    @JsonProperty("adult")
    public void setAdult(Boolean value) { this.adult = value; }

    @JsonProperty("backdrop_path")
    public String getBackdropPath() { return backdropPath; }
    @JsonProperty("backdrop_path")
    public void setBackdropPath(String value) { this.backdropPath = value; }

    @JsonProperty("genre_ids")
    public long[] getGenreIDS() { return genreIDS; }
    @JsonProperty("genre_ids")
    public void setGenreIDS(long[] value) { this.genreIDS = value; }

    @JsonProperty("id")
    public Long getID() { return id; }
    @JsonProperty("id")
    public void setID(Long value) { this.id = value; }

    @JsonProperty("original_language")
    public String getOriginalLanguage() { return originalLanguage; }
    @JsonProperty("original_language")
    public void setOriginalLanguage(String value) { this.originalLanguage = value; }

    @JsonProperty("original_title")
    public String getOriginalTitle() { return originalTitle; }
    @JsonProperty("original_title")
    public void setOriginalTitle(String value) { this.originalTitle = value; }

    @JsonProperty("overview")
    public String getOverview() { return overview; }
    @JsonProperty("overview")
    public void setOverview(String value) { this.overview = value; }

    @JsonProperty("popularity")
    public Double getPopularity() { return popularity; }
    @JsonProperty("popularity")
    public void setPopularity(Double value) { this.popularity = value; }

    @JsonProperty("poster_path")
    public String getPosterPath() { return posterPath; }
    @JsonProperty("poster_path")
    public void setPosterPath(String value) { this.posterPath = value; }

    @JsonProperty("release_date")
    public Date getReleaseDate() { return releaseDate; }
    @JsonProperty("release_date")
    public void setReleaseDate(Date value) { this.releaseDate = value; }

    @JsonProperty("title")
    public String getTitle() { return title; }
    @JsonProperty("title")
    public void setTitle(String value) { this.title = value; }

    @JsonProperty("video")
    public Boolean getVideo() { return video; }
    @JsonProperty("video")
    public void setVideo(Boolean value) { this.video = value; }

    @JsonProperty("vote_average")
    public Double getVoteAverage() { return voteAverage; }
    @JsonProperty("vote_average")
    public void setVoteAverage(Double value) { this.voteAverage = value; }

    @JsonProperty("vote_count")
    public Long getVoteCount() { return voteCount; }
    @JsonProperty("vote_count")
    public void setVoteCount(Long value) { this.voteCount = value; }
}
