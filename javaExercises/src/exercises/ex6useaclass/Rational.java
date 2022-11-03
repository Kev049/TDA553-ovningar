package exercises.ex6useaclass;

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

public class Rational {

    private final int num;    // rational =  num / denom
    private final int denom;

    // TODO
    Rational(int num) {
        this.num = num;
        this.denom = 1;
    }

    Rational(int num, int denom) {
        int gcd = gcd(Math.abs(num), Math.abs(denom));

        if (denom < 0) {
            gcd *= -1;
        }

        this.num = num/gcd;
        this.denom = denom/gcd;
    }

    Rational(Rational r) {
        this.num = r.num;
        this.denom = r.denom;
    }

    public int getNum() {
        return this.num;
    }

    public int getDenom() {
        return this.denom;
    }


    private int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;    
        }
        return a;
    }

    public Rational add(Rational r) {
        int lcm = lcm(this.denom, r.denom);
        int num1 = this.num*(lcm/this.denom);
        int num2 = r.getNum()*(lcm/r.getDenom());
        
        return new Rational(num1 + num2, lcm);
    }

    public Rational sub(Rational r) {
        int lcm = lcm(this.denom, r.denom);
        int num1 = this.num*(lcm/this.denom);
        int num2 = r.getNum()*(lcm/r.getDenom());
        
        return new Rational(num1 - num2, lcm);
    }

    public Rational mul(Rational r) {
        return new Rational(this.num * r.num, this.denom * r.denom);
    }

    public Rational div(Rational r) {
        Rational invertedR = new Rational(r.getDenom(), r.getNum());
        return new Rational(this.num * invertedR.num, this.denom * invertedR.denom);
    }

    private int lcm(int a, int b) {
        for (int i = Math.min(a, b); i < a*b; i++) {
            if (i % a == 0 && i % b == 0) {
                return i;
            }
        }
        return a*b;
    }

    public boolean lessThan(Rational r) {
        double val = this.num*1.0 / this.denom;
        double rVal = r.num*1.0 / r.denom;

        if (val < rVal) {
            return true;
        }
        return false;
    }

    public double toDouble(){
        return this.num*1.0 / this.denom;
    }

    public boolean equals(Rational r) {
        if (this == r) {
            return true;
        }
        if (this.num == r.num && this.denom == r.denom) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.num + " / " + this.denom;
    }

}

