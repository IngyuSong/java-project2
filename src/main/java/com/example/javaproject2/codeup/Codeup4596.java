package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup4596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int row = 0;
        int col = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int num = sc.nextInt();
                if (num > max) {
                    max = num;
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println(max);
        System.out.printf("%d %d\n", ++row, ++col);
    }
}
