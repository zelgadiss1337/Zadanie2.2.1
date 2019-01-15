package com.company;

public class Main {

    public static void main(String[] args) {
        Fraction fr1 = new Fraction(1, 4);
        Fraction fr2 = new Fraction(2, 5);

        System.out.println("(" + fr1 + ")" + " + "  + "(" + fr2 + ")" + " = " + Fraction.sumFraction(fr1, fr2));
        System.out.println("(" + fr1 + ")" + " - "  + "(" + fr2 + ")" + " = " + Fraction.subFraction(fr1, fr2));
        System.out.println("(" + fr1 + ")" + " * "  + "(" + fr2 + ")" + " = " + Fraction.multiplyFraction(fr1, fr2));
        System.out.println("(" + fr1 + ")" + " / "  + "(" + fr2 + ")" + " = " + Fraction.divFraction(fr1, fr2));
    }
}
