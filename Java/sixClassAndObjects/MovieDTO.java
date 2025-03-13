package sixClassAndObjects;

public class MovieDTO {

    private String title;
    private String director;
    private String genre;
    private int releaseYear;
    private int durationInMinutes;
    private double rating;

    private static final double MAX_RATING = 10.0;
    private static final String DEFAULT_GENRE = "Unknown";

    public MovieDTO(String title, String director, String genre, int releaseYear, int durationInMinutes, double rating) {
        this.title = title;
        this.director = director;
        this.genre = (genre != null && !genre.isEmpty()) ? genre : DEFAULT_GENRE;
        this.releaseYear = releaseYear;
        this.durationInMinutes = durationInMinutes;
        this.rating = (rating >= 0 && rating <= MAX_RATING) ? rating : 0.0;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (rating >= 0 && rating <= MAX_RATING) {
            this.rating = rating;
        }
    }

    public static boolean isValidRating(double rating) {
        return rating >= 0 && rating <= MAX_RATING;
    }

    @Override
    public String toString() {
        return "MovieDTO{"
                + "title='" + title + '\''
                + ", director='" + director + '\''
                + ", genre='" + genre + '\''
                + ", releaseYear=" + releaseYear
                + ", durationInMinutes=" + durationInMinutes
                + ", rating=" + rating
                + '}';
    }
}
