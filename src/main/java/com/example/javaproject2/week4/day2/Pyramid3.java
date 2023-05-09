package com.example.javaproject2.week4.day2;

public class Pyramid3 {

    private String spaceChar = "0";
    public String makeALine(int height, int i) {
        return String.format("%s%s\n", spaceChar.repeat(height - i - 1), "*".repeat(2 * i + 1));
    }

    public void printPyramidWithSpaceChar(int height) {
        for (int i = 0; i < height; i++) {
            System.out.print(makeALine(height, i));
        }
    }

    public static void main(String[] args) {
        Pyramid3 pyramid3 = new Pyramid3();
        pyramid3.printPyramidWithSpaceChar(4);
    }
}
