package sixClassAndObjects;

import java.util.ArrayList;
import java.util.List;

public class PlayerDTO {

    public static void main(String[] args) {
        Team team = new Team("Warriors", "San Francisco", "West Division");
        Player player1 = new Player("John Doe", "Forward", 10);
        Player player2 = new Player("Mike Smith", "Goalkeeper", 1);

        team.addPlayer(player1);
        team.addPlayer(player2);

        team.playGame();
        player1.playGame();
        player2.train();
        team.hireCoach();
    }
}

class Team {

    private String name;
    private String city;
    private String division;
    private List<Player> players;

    public Team(String name, String city, String division) {
        this.name = name;
        this.city = city;
        this.division = division;
        this.players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getDivision() {
        return division;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void playGame() {
        System.out.println(name + " is playing a game.");
    }

    public void hireCoach() {
        System.out.println("A new coach has been hired for " + name);
    }
}

class Player {

    private String name;
    private String position;
    private int jerseyNumber;

    public Player(String name, String position, int jerseyNumber) {
        this.name = name;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void playGame() {
        System.out.println(name + " is playing in their position: " + position);
    }

    public void train() {
        System.out.println(name + " is training.");
    }
}
