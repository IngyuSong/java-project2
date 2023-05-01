package com.example.javaproject2.codeup;

import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1076 {
    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        char alpha = (char) is.read();
        for(int i = 97; i <= alpha; i++){
            System.out.print ((char)i + " ");
        }
    }
}
