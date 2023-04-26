package com.example.javaproject2.week2.day8;

import java.util.Arrays;

public class TwoDimArrFill {
    public static void main(String[] args) {
        int[][] arr1 = new int[5][5];
        int[][] arr2 = new int[5][5];

        fillRow(arr1, 3);
        printArray(arr1);
        fillCol(arr2, 2);
        printArray(arr2);
    }
    public static void fillRow(int[][] arr, int idx){
        for(int i=0; i<arr.length; i++){
            arr[idx][i] = 1;
        }
    }

    public static void fillCol(int[][] arr, int idx){
        for(int i=0; i<arr.length; i++){
            arr[i][idx] = 1;
        }
    }

    public static void printArray(int[][] arr){
        for(int[] i: arr){
            System.out.println(Arrays.toString(i));
        }
        System.out.println("-----------------");
    }
}
