package ru.algo.lection1;

import ru.algo.lection1.largest.in.array.LargestFinder;


public class App {

    public static void main(String[] args) {
        LargestFinder lf = new LargestFinder();
        System.out.println(lf.findLargestInArray(new int[]{12, 33, 23,3,123,654,12,1,346,234,55,34,534,532,12,4,634,4}));
    }

}