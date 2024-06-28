package com.example.a16prac;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Items {

    @SerializedName("kinopoiskId")
    private int id;
    private String imdbId;
    private String nameRu;
    private String nameEn;
    private String nameOriginal;
    private List<Countries> countries;
    private List<Genres> genres;
    private double  ratingKinopoisk;
    private double  ratingImdb;
    private String year;
    private String type;
    private String posterUrl;
    private String posterUrlPreview;

    private String logoUrl;
    private int reviewsCount;
    private String ratingGoodReview;
    private int ratingGoodReviewVoteCount;
    private int ratingKinopoiskVoteCount;
    private int ratingImdbVoteCount;
    private String ratingFilmCritics;
    private int ratingFilmCriticsVoteCount;
    private String ratingAwait;
    private int ratingAwaitCount;
    private String ratingRfCritics;
    private int ratingRfCriticsVoteCount;
    private String webUrl;
    private String filmLength;
    private String slogan;
    private String description;
    private String shortDescription;
    private String editorAnnotation;
    private boolean isTicketsAvailable;
    private String productionStatus;
    private String ratingMpaa;
    private String ratingAgeLimits;
    private String startYear;
    private String endYear;
    private boolean serial;
    private boolean shortFilm;
    private boolean completed;
    private boolean hasImax;
    private boolean has3D;
    private String lastSync;


    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public int getReviewsCount() {
        return reviewsCount;
    }

    public void setReviewsCount(int reviewsCount) {
        this.reviewsCount = reviewsCount;
    }

    public String getRatingGoodReview() {
        return ratingGoodReview;
    }

    public void setRatingGoodReview(String ratingGoodReview) {
        this.ratingGoodReview = ratingGoodReview;
    }

    public int getRatingGoodReviewVoteCount() {
        return ratingGoodReviewVoteCount;
    }

    public void setRatingGoodReviewVoteCount(int ratingGoodReviewVoteCount) {
        this.ratingGoodReviewVoteCount = ratingGoodReviewVoteCount;
    }

    public int getRatingKinopoiskVoteCount() {
        return ratingKinopoiskVoteCount;
    }

    public void setRatingKinopoiskVoteCount(int ratingKinopoiskVoteCount) {
        this.ratingKinopoiskVoteCount = ratingKinopoiskVoteCount;
    }

    public int getRatingImdbVoteCount() {
        return ratingImdbVoteCount;
    }

    public void setRatingImdbVoteCount(int ratingImdbVoteCount) {
        this.ratingImdbVoteCount = ratingImdbVoteCount;
    }

    public String getRatingFilmCritics() {
        return ratingFilmCritics;
    }

    public void setRatingFilmCritics(String ratingFilmCritics) {
        this.ratingFilmCritics = ratingFilmCritics;
    }

    public int getRatingFilmCriticsVoteCount() {
        return ratingFilmCriticsVoteCount;
    }

    public void setRatingFilmCriticsVoteCount(int ratingFilmCriticsVoteCount) {
        this.ratingFilmCriticsVoteCount = ratingFilmCriticsVoteCount;
    }

    public String getRatingAwait() {
        return ratingAwait;
    }

    public void setRatingAwait(String ratingAwait) {
        this.ratingAwait = ratingAwait;
    }

    public int getRatingAwaitCount() {
        return ratingAwaitCount;
    }

    public void setRatingAwaitCount(int ratingAwaitCount) {
        this.ratingAwaitCount = ratingAwaitCount;
    }

    public String getRatingRfCritics() {
        return ratingRfCritics;
    }

    public void setRatingRfCritics(String ratingRfCritics) {
        this.ratingRfCritics = ratingRfCritics;
    }

    public int getRatingRfCriticsVoteCount() {
        return ratingRfCriticsVoteCount;
    }

    public void setRatingRfCriticsVoteCount(int ratingRfCriticsVoteCount) {
        this.ratingRfCriticsVoteCount = ratingRfCriticsVoteCount;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public String getFilmLength() {
        return filmLength;
    }

    public void setFilmLength(String filmLength) {
        this.filmLength = filmLength;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getEditorAnnotation() {
        return editorAnnotation;
    }

    public void setEditorAnnotation(String editorAnnotation) {
        this.editorAnnotation = editorAnnotation;
    }

    public boolean isTicketsAvailable() {
        return isTicketsAvailable;
    }

    public void setTicketsAvailable(boolean ticketsAvailable) {
        isTicketsAvailable = ticketsAvailable;
    }

    public String getProductionStatus() {
        return productionStatus;
    }

    public void setProductionStatus(String productionStatus) {
        this.productionStatus = productionStatus;
    }

    public String getRatingMpaa() {
        return ratingMpaa;
    }

    public void setRatingMpaa(String ratingMpaa) {
        this.ratingMpaa = ratingMpaa;
    }

    public String getRatingAgeLimits() {
        return ratingAgeLimits;
    }

    public void setRatingAgeLimits(String ratingAgeLimits) {
        this.ratingAgeLimits = ratingAgeLimits;
    }

    public String getStartYear() {
        return startYear;
    }

    public void setStartYear(String startYear) {
        this.startYear = startYear;
    }

    public String getEndYear() {
        return endYear;
    }

    public void setEndYear(String endYear) {
        this.endYear = endYear;
    }

    public boolean isSerial() {
        return serial;
    }

    public void setSerial(boolean serial) {
        this.serial = serial;
    }

    public boolean isShortFilm() {
        return shortFilm;
    }

    public void setShortFilm(boolean shortFilm) {
        this.shortFilm = shortFilm;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public boolean isHasImax() {
        return hasImax;
    }

    public void setHasImax(boolean hasImax) {
        this.hasImax = hasImax;
    }

    public boolean isHas3D() {
        return has3D;
    }

    public void setHas3D(boolean has3D) {
        this.has3D = has3D;
    }

    public String getLastSync() {
        return lastSync;
    }

    public void setLastSync(String lastSync) {
        this.lastSync = lastSync;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getNameRu() {
        return nameRu;
    }

    public void setNameRu(String nameRu) {
        this.nameRu = nameRu;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getNameOriginal() {
        return nameOriginal;
    }

    public void setNameOriginal(String nameOriginal) {
        this.nameOriginal = nameOriginal;
    }

    public List<Countries> getCountries() {
        return countries;
    }

    public void setCountries(List<Countries> countries) {
        this.countries = countries;
    }

    public List<Genres> getGenres() {
        return genres;
    }

    public void setGenres(List<Genres> genres) {
        this.genres = genres;
    }

    public double getRatingKinopoisk() {
        return ratingKinopoisk;
    }

    public void setRatingKinopoisk(double ratingKinopoisk) {
        this.ratingKinopoisk = ratingKinopoisk;
    }

    public double getRatingImdb() {
        return ratingImdb;
    }

    public void setRatingImdb(double ratingImdb) {
        this.ratingImdb = ratingImdb;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    public String getPosterUrlPreview() {
        return posterUrlPreview;
    }

    public void setPosterUrlPreview(String posterUrlPreview) {
        this.posterUrlPreview = posterUrlPreview;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
