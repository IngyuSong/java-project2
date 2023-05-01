package com.example.javaproject2.programmers;

public class DiceGame {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int condition = 0;
        if (((a != b) && (b != c)) && (a != c)) condition = 1;
        else if ((a == b) && (b == c)) condition = 2;

        switch (condition) {
            case 1:
                answer = a + b + c;
                break;
            case 2:
                answer = (a + b + c) * (int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)) * (int) (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
                break;
            default:
                answer = (a + b + c) * (int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        }
        return answer;
    }
}
