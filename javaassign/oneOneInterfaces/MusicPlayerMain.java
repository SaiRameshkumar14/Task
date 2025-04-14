package javaassign.oneOneInterfaces;

import java.util.Scanner;

interface Playable {

    void play();

    void pause();

    void stop();
}

class MP3Player implements Playable {

    public void play() {
        System.out.println("Playing MP3...");
    }

    public void pause() {
        System.out.println("Pausing MP3...");
    }

    public void stop() {
        System.out.println("Stopping MP3...");
    }
}

class CDPlayer implements Playable {

    public void play() {
        System.out.println("Playing CD...");
    }

    public void pause() {
        System.out.println("Pausing CD...");
    }

    public void stop() {
        System.out.println("Stopping CD...");
    }
}

class StreamingPlayer implements Playable {

    public void play() {
        System.out.println("Streaming music...");
    }

    public void pause() {
        System.out.println("Pausing stream...");
    }

    public void stop() {
        System.out.println("Stopping stream...");
    }
}

public class MusicPlayerMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Playable player;

        System.out.println("Select Player Type: 1-MP3Player  2-CDPlayer  3-StreamingPlayer");
        int choice = sc.nextInt();

        if (choice == 1) {
            player = new MP3Player();
        } else if (choice == 2) {
            player = new CDPlayer();
        } else {
            player = new StreamingPlayer();
        }

        int action;
        do {
            System.out.println("Choose action: 1-Play 2-Pause 3-Stop 0-Exit");
            action = sc.nextInt();

            switch (action) {
                case 1:
                    player.play();
                    break;
                case 2:
                    player.pause();
                    break;
                case 3:
                    player.stop();
                    break;
            }
        } while (action != 0);

        System.out.println("Music session ended.");
    }
}
