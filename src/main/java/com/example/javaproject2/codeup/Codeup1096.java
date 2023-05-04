package com.example.javaproject2.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1096 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[19][19];
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String xy = br.readLine();
            String[] str = xy.split(" ");
            arr[Integer.parseInt(str[0]) - 1][Integer.parseInt(str[1]) - 1] = 1;
        }
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
