package exercises;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/*
 *  Using class objects to represent heroes
 *  https://en.wikipedia.org/wiki/Gladiators_(1992_UK_TV_series)
 *
 * See:
 * - ClassObjects
 * - MethodsArrObj
 */
public class Ex3ClassesObjects {

    public static void main(String[] args) {
        new Ex3ClassesObjects().program();
    }

    final Scanner sc = new Scanner(in);

    void program() {
        Hero hero1;
        Hero hero2;

        System.out.print("What's the name of the hero 1? > ");
        String name1 = sc.nextLine();

        System.out.printf("How strong is %s > ", name1);
        int strength1 = sc.nextInt();
        sc.nextLine();
        
        System.out.print("What's the name of the hero 2? > ");
        String name2 = sc.nextLine();

        System.out.printf("How strong is %s > ", name2);
        int strength2 = sc.nextInt();
        
        hero1 = new Hero(name1, strength1);
        hero2 = new Hero(name2, strength2);

        if (hero1.strength > hero2.strength) {
            System.out.printf("%s is stronger", hero1.name);
        } else if (hero1.strength < hero2.strength) {
            System.out.printf("%s is stronger", hero2.name);
        } else {
            System.out.println("They are equally strong");
        }

    }

    // ------ The class to use  -----------
    // A class for objects that describes a Hero
    class Hero {
        String name;
        int strength;

        Hero(String name, int strength) {
            this.name = name;
            this.strength = strength;
        }
    }


}
