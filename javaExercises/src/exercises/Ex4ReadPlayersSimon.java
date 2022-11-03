package exercises;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/*
 *  Utilities to input/output player data for a command line game
 *
 *  See:
 *  - UseAConstructor
 *  - ObjectArrMeth
 *
 */
public class Ex4ReadPlayersSimon {
    public static void main(String[] args) {
        new Ex4ReadPlayersSimon().program();
    }

    final Scanner sc = new Scanner(in);

    void program() {
        Player[] players = inputPlayers();
        outPlayers(players);
    }

    // This class captures the concept of a Player
    class Player {
        String name; // A Player has a name and...
        int points; // ... and points

        Player(String name) {
            this.name = name;
            this.points = 0;
        }

        // Getter
        public String getName() {
            return name;
        }

        // Setter
        public void setName(String newName) {
            this.name = newName;
        }

        // Player newPlayer = new Player();

        // TODO Add a constructor

    }

    // ---------- Methods -------------------

    Player[] inputPlayers() {
        // TODO
        System.out.println("How many players?");
        int playerAmount = sc.nextInt();
        sc.nextLine();

        Player[] playerList = new Player[playerAmount];

        for (int i = 0; i < playerAmount; i++) {
            System.out.printf("Name for player %d? >", i);
            String name = sc.nextLine();
            Player newPlayer = new Player(name);
            playerList[i] = newPlayer;
        }

        return playerList; // For now
    }

    void outPlayers(Player[] players) {
        // TODO
        System.out.println("Players are:\n");
        for (int i = 0; i < players.length; i++) {
            System.out.printf("Name %s points %d\n", players[i].name, players[i].points);
        }

    }

}
