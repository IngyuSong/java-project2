package com.example.javaproject2.week3.day1;

public class MultiplicationTables {
    public static void main(String[] args) {
        for (int i = 2; i <= 4; i++) {
            multiplication(i);
        }
    }

    public static void multiplication(int dan){
        System.out.printf("%d단\n", dan);
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d * %d = %d\n", dan, i, dan * i);
        }
        System.out.println("---------------------------");
    }
}
