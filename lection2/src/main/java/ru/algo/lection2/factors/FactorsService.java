package ru.algo.lection2.factors;


import lombok.extern.slf4j.Slf4j;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Service allows to find simple factors
 */

@Slf4j
public class FactorsService {

    /**
     * Simple algorithm to find factors for a number. One cycle depends on input number => O(N).
     *
     * @param number
     * @return
     */
    public Collection<Integer> factoringSimple(Integer number) {
        final var factors = new ArrayList<Integer>();
        int i = 2;
        while (i < number) {
            if (number % i == 0) {
                factors.add(i);
                number = number / i;
            }
            i = i + 1;
        }
        if (number > 1) {
            factors.add(number);
        }
        log.info("Amount of steps in simple algorithm: " + i);
        return factors;
    }

    /**
     * 1) We need no to check dividing by even numbers, it is checked by dividing by 2,
     * so continue with dividing by odd numbers. It allows to reduce amount of steps almost twice: O(N/2) => O(N)
     * 2) number = a * b, it means, that a AND b must be less than sqrt(number). If not, a*b > number. So, we have to
     * check factors up to sqrt(number) instead of number. It reduces amount of step up to O(sqrt(N)).
     * 2-1)The best way is using array of prime numbers instead of odd numbers for dividing, but I have no array of
     * prime numbers and generating/counting of it will increase amount of steps.
     * 3) According to 2nd, we should renew limit of factors each step.
     *
     * @param number
     * @return
     */
    public Collection<Integer> factoringModified(Integer number) {
        final var factors = new ArrayList<Integer>();
        int i = 2;
        if (number % i == 0) {
            factors.add(i);
        }
        i = 3;
        double max_factor = Math.sqrt(number);
        while (i <= max_factor) {
            if (number % i == 0) {
                factors.add(i);
                number = number / i;
                max_factor = Math.sqrt(number);
            }
            i = i + 2;
        }
        if (number > 1) {
            factors.add(number);
        }
        log.info("Amount of steps in modified algorithm: " + i);
        return factors;
    }

    public <T> void printCollection(Collection<T> collection) {
        if (CollectionUtils.isEmpty(collection)) {
            log.error("EMPTY COLLECTION");
        } else {
            collection.forEach(t -> log.info(String.valueOf(t)));
        }
    }

}
