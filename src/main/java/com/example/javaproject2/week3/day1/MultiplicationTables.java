package com.example.javaproject2.week3.day1;

import java.util.Scanner;

public class MultiplicationTables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("종료하려면 0을 입력하세요. ");
            System.out.println("단 입력: ");
            int dan = sc.nextInt();
            if (dan == 0) return;
            multiplication(dan);
        }
    }

    public static void multiplication(int dan) {
        System.out.printf("%d단\n", dan);
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d * %d = %d\n", dan, i, dan * i);
        }
        System.out.println("---------------------------");
    }
}
