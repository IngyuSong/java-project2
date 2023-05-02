package com.example.javaproject2.programmers;

import java.util.ArrayList;
import java.util.Collections;

public class SequenceAndRangeQuery2 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (arr[j] > queries[i][2]) {
                    list.add(arr[j]);
                }
            }
            if (!list.isEmpty()) {
                Collections.sort(list);
                answer[i] = list.get(0);
            } else {
                answer[i] = -1;
            }
        }
        return answer;
    }
}
