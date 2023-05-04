package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[19][19];
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int temp = arr[n - 1][m - 1];
            for (int j = 0; j < 19; j++) {
                arr[n - 1][j] = arr[n - 1][j] == 1 ? 0 : 1;
                arr[j][m - 1] = arr[j][m - 1] == 1 ? 0 : 1;
            }
            arr[n - 1][m - 1] = temp;
        }
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
