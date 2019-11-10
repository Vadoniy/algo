package ru.algo.lection1.gcd;

public class Gcd {

    //наименьший общий делитель
    public int gcd(int a, int b) {
        System.out.println("a = " + a + " b = " + b);
        int counter = 0;
        int c;
        while (b != 0) {
            System.out.println(counter);
            c = a%b;
            System.out.println("c = " + c);
            a = b;
            System.out.println("a = " + a);
            b = c;
            System.out.println("b = " + b);

        }
        return a;
    }

}
