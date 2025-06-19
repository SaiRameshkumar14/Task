package javaassign.tenAbstract;

abstract class Movie {

    String title;
    String director;

    Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }

    abstract void play();

    abstract String getGenre();

    void showDetails() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Genre: " + getGenre());
    }
}

class ActionMovie extends Movie {

    ActionMovie(String title, String director) {
        super(title, director);
    }

    void play() {
        System.out.println("Playing action scenes...");
    }

    String getGenre() {
        return "Action";
    }
}

class ComedyMovie extends Movie {

    ComedyMovie(String title, String director) {
        super(title, director);
    }

    void play() {
        System.out.println("Playing comedy scenes...");
    }

    String getGenre() {
        return "Comedy";
    }
}

public class MovieMain {

    public static void main(String[] args) {
        Movie m1 = new ActionMovie("Fast & Furious", "Justin Lin");
        Movie m2 = new ComedyMovie("The Mask", "Chuck Russell");

        m1.showDetails();
        m1.play();

        System.out.println();

        m2.showDetails();
        m2.play();
    }
}
