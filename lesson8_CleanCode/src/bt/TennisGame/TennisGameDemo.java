package bt.TennisGame;

public class TennisGameDemo {
    public static void main(String[] args) {
        TennisGame game = new TennisGame("Alice", "Bob");

        game.wonPoint("Alice");
        game.wonPoint("Alice");
        game.wonPoint("Bob");
        game.wonPoint("Bob");
        game.wonPoint("Bob");

        System.out.println("Current score: " + game.getScore());
    }
}

