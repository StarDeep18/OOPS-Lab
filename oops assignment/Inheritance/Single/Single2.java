class Game {
    String name;
    int players;

    void setGame(String name, int players) {
        this.name = name;
        this.players = players;
    }
}

class OnlineGame extends Game {
    int ping; // in ms

    void setPing(int ping) {
        this.ping = ping;
    }

    void showPerformance() {
        System.out.println("Game: " + name);
        System.out.println("Players Online: " + players);
        if (ping < 100)
            System.out.println("Ping: " + ping + "ms (Good)");
        else
            System.out.println("Ping: " + ping + "ms (Laggy)");
    }
}

public class Single2 {
    public static void main(String[] args) {
        OnlineGame og = new OnlineGame();
        og.setGame("Valorant", 9000);
        og.setPing(85);
        og.showPerformance();
    }
}
