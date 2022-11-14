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
public class Ex4ReadPlayers {
    public static void main(String[] args) {
        new Ex4ReadPlayers().program();
    }

    final Scanner sc = new Scanner(in);

    void program() {
        Player[] players = inputPlayers();
        outPlayers(players);
    }

    // This class captures the concept of a Player
    class Player {
        String name;   // A Player has a name and...
        int points;    // ... and points

        // TODO Add a constructor
        Player(String name) {
            this.name = name;
            points = 0;
        }
    }

    // ---------- Methods -------------------

     Player[] inputPlayers() {
        System.out.print("How many players? > ");
        int numOfPlayers = sc.nextInt();
        sc.nextLine();
        Player[] playerArray = new Player[numOfPlayers];

        for (int i = 1; i <= numOfPlayers; i++) {
            System.out.printf("Name for player %d > ", i);
            String name = sc.nextLine();
            playerArray[i-1] = new Player(name);
        }

        return playerArray;
    }

    void outPlayers(Player[] players){
        System.out.println("Players are:");
        for (Player player : players) {
            System.out.printf("Name %s points %d\n", player.name, player.points);
        }
    }

}
