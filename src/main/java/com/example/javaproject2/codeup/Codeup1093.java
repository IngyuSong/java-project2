package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[23];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[sc.nextInt() - 1]++;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
