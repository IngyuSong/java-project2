package com.example.javaproject2.week4.day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileEx {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("./hospital_info_0920.csv"));
        System.out.println(br.readLine());
    }
}
