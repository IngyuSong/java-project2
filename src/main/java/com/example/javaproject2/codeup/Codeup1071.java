package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        for (;;) {
            num = sc.nextInt();
            if (num == 0) {
                break;
            }
            System.out.println(num);
        }
    }
}
