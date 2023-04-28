package com.example.javaproject2.programmers;

import java.util.*;

class HallOfFame {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            if (i < k) {
                list.add(score[i]);
            } else {
                if (list.get(0) < score[i]) {
                    list.set(0, score[i]);
                } else {
                    answer[i] = list.get(0);
                }
            }
            Collections.sort(list);
            answer[i] = list.get(0);
        }

        return answer;
    }
}