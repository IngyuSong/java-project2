package com.example.javaproject2.week3.day3;

import java.util.Scanner;

public class EvenNumberInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        do {
            System.out.print("짝수를입력하세요:");
            input = scanner.nextInt();
        } while (input % 2 != 0);
        System.out.println("올바른짝수가입력되었습니다:" + input);
    }
}

