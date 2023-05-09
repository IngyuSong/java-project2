package com.example.javaproject2.week4.day2;

public class ReversePyramid {
    private String spaceChar = "0";
    public String makeALine(int height, int i) {
        return String.format("%s%s\n", spaceChar.repeat(height - i), "*".repeat(2 * i - 1));
    }

    public void printPyramidWithSpaceChar(int height) {
        for (int i = height; i > 0; i--) {
            System.out.print(makeALine(height, i));
        }
    }

    public static void main(String[] args) {
        ReversePyramid reversePyramid = new ReversePyramid();
        reversePyramid.printPyramidWithSpaceChar(6);
    }
}
