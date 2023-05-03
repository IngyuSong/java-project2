package com.example.javaproject2.programmers;

import java.util.TreeSet;

public class PrimeFactorization {
    public TreeSet<Integer> solution(int n) {
        TreeSet<Integer> set = new TreeSet<>();
        int min = 2;
        while (n > 1) {
            if (n % min == 0) {
                n /= min;
                set.add(min);
            } else {
                min++;
            }
        }
        return set;
    }
}
