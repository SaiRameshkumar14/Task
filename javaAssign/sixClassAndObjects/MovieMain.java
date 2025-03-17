package sixClassAndObjects;

public class MovieMain {

    public static void main(String[] args) {
        MovieDTO movie = new MovieDTO("Inception", "Christopher Nolan", "Sci-Fi", 2010, 148, 8.8);

        movie.displayMovieDetails();
    }
}
