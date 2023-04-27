package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1056 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag1 = sc.nextInt();
        int flag2 = sc.nextInt();
        System.out.println((flag1 == 1 && flag2 != 1) || (flag1 != 1 && flag2 == 1) ? 1 : 0);
    }
}
