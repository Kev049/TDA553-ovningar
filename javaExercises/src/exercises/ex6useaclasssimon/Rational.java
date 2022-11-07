package exercises.ex6useaclasssimon;

import static java.lang.Math.abs;

/*
 *    A class representing a rational number
 *
 *    NOTE: No IO here, this is just the logical concept.
 *
 *    Test the class by running Ex1TestRational.
 *
 * See:
 * - useaclass/
 * - UseAMap
 */
//https://stackoverflow.com/questions/965690/how-do-i-use-optional-parameters-in-java 
public class Rational {
    private final int numerator;
    private final int denominator;

        Rational(int num) {
            this.numerator = num;
            this.denominator = 1;
        }

        public int getNum() {
            return numerator;
        }

        public int getDenom() {
            return denominator;
        }
    //private final int num;    // rational =  num / denom
    //private final int denom;

    // TODO

}

