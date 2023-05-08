package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1671 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Codeup1671.play(sc.nextInt(), sc.nextInt()));
    }

    public static String play(int user, int computer) {
        // 바위=0, 가위=1, 보=2
        int flag = user - computer;
        switch (flag) {
            case 0: return "tie";
            case 1:
            case -2: return "lose";
            default: return "win";
        }
    }
}
