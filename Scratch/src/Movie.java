class Movie {
// fields or instance variables
    private String title;
    private Integer releaseYear;
    private Double revenue;
    private Rating rating;
    private Genre genre;

    // constructors
    public Movie(String title) {
        setTitle(title);
    }

    public Movie(String title, Genre genre) {
        this(title);
        setGenre(genre);
    }

    public Movie(String title, Integer releaseYear) {
        this(title);
        setReleaseYear(releaseYear);
    }

    public Movie(String title, Integer releaseYear, Double revenue) {
        this(title, releaseYear);
        setRevenue(revenue);
    }

    public Movie(String title, Integer releaseYear, Double revenue, Rating rating) {
        this(title, releaseYear, revenue);
        setRating(rating);
    }

    private Movie(String title, Integer releaseYear, Double revenue, Rating rating, Genre genre) {
        this(title, releaseYear, revenue, rating);
        setGenre(genre);
    }


    // business or action methods - not shown
    // pause() play() rewind() fastforward()

    // accessor methods - provide "controlled access" to objects fields - revenue cant be negative
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Double getRevenue() {
        return revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String toString() {
        return String.format("Movie: title=%s, releaseYear=%.2f, rating=%s, genre=%s",
                getTitle(), getReleaseYear(), getRevenue(), getRating(), getGenre());

        //        return "Movie: title=" + getTitle() +
//                ", releaseYear= " + getReleaseYear() +
//                ", revenue=" + getRevenue() +
//                ", rating=" + getRating() +
//                ", genre is:" + getGenre();
    }
}