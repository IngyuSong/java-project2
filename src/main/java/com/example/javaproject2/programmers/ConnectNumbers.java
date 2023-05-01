package com.example.javaproject2.programmers;

public class ConnectNumbers {
    public int solution(int[] num_list) {
        int answer = 0;
        String odd = "";
        String even = "";
        for (int num : num_list) {
            if (num % 2 == 1) odd += Integer.toString(num);
            else even += Integer.toString(num);
        }
        answer = Integer.parseInt(odd) + Integer.parseInt(even);
        return answer;
    }
}
