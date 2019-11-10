package ru.algo.lection1.largest.in.array;

/**
 * Every step check one element only once and difficulty of step is independent of amount of arrays elements:
 * one step = one action with one element.
 * Amount of steps increases linearly in dependants with amount of arrays elements => difficulty is O(N).
 */
public class LargestFinder {

    public int findLargestInArray(int[] array) {
        int largest = array[0];                         //O(1)  -   one action, does not depends on amount of elements
        for (int i = 1; i < array.length; i++) {        //O(N)  -   depends on amount of elements
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        return largest;                                 //O(1)  -   one action, does not depends on amount of elements
    }

    //O(1) + O(N) + O(1) = O(1+N+1) = O(2+N)
    //If N increases, it exceeds constant 2 and we can accept O(2+N) <=> O(N)
}
