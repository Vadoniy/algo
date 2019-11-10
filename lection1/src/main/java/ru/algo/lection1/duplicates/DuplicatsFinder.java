package ru.algo.lection1.duplicates;

/**
 * Cycle and nested cycle. Every step of outer cycle going throw all steps of nested cycle. Each of cycles depends
 * on amount of elements of incoming array, so each of cycles is O(N). Means, common is O(N*N) = O(N^2).
 * Nested cycle contains two if() expressions and in most cases each of them acts, so we have O(N) + O(N) = O(2N).
 * If we increase 2N in 2 times, we get 2*(2N) = 4N, means algorithms running time increases twice. But if we use N instead
 * of 2N, we get 2*(N) = 2N. So, running time is increased twice too. It means, we can not use constants for describing
 * of algorithms behaviour.
 */

public class DuplicatsFinder {

    public boolean containsDuplicates(int[] array) {

        for (int i = 0; i < array.length; i++) {            //O(N)
            for (int j = 0; j < array.length; j++) {        //O(2N)
                if (i != j) {                                   //O(N)
                    if (array[i] == array[j]) {                 //O(N)
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
