package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int col = 1;

        loop:
        for (int i = 1; i < 10; i++) {
            for (int j = col; j < 10; j++) {
                if (arr[i][j] == 2) {
                    arr[i][j] = 9;
                    break loop;
                }
                if (arr[i][j] == 1) {
                    col--;
                    break;
                } else {
                    arr[i][j] = 9;
                    col++;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
