class MovieClient {

    public static void main(String[] args) {
        Movie movie1 = new Movie("Clone Wars");
        movie1.setReleaseYear(2098);
        movie1.setRevenue(240_000_000_000.0);
        movie1.setRating(Rating.PG_13);
        movie1.setGenre(Genre.ACTION);
        System.out.println(movie1);

        Movie movie2 = new Movie("Iron Man", 2008, 29_000_000_000_000.0, Rating.PG_13);
        System.out.println(movie2);

        Movie movie3 = new Movie("Jay: Java in Chernobyl ", Genre.SPORTS_ROMANCE);
        System.out.println(movie3);

    }
}