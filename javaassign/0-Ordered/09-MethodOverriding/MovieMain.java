package javaassign.nineMethodOverriding;

class Movie {

    public void showMovieDetails() {
        System.out.println("Movie details: Default");
    }
}

class RomComMovie extends Movie {

    @Override
    public void showMovieDetails() {
        System.out.println("Romantic Comedy Movie details");
    }
}

class ThrillerMovie extends Movie {

    @Override
    public void showMovieDetails() {
        System.out.println("Thriller Movie details");
    }
}

public class MovieMain {

    public static void main(String[] args) {
        Movie m1 = new RomComMovie();
        Movie m2 = new ThrillerMovie();

        m1.showMovieDetails();
        m2.showMovieDetails();
    }
}
