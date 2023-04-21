package com.example.javaproject2.week1.day5;

public class SpaceInvadersMemberVariable {
    int location;
    public void moveLeft(){
        location = location - 1;
    }
    public void moveLeftAndPrint(){
        location = location - 1;
        System.out.println("moveLeft = " + location);
    }
    public void moveRight(){
        location = location + 1;
    }

    public void moveRightAndPrint(){
        location = location + 1;
        System.out.println("moveRight = " + location);
    }

    public static void main(String[] args) {
        SpaceInvadersMemberVariable simv = new SpaceInvadersMemberVariable();
        simv.moveLeft();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();

        System.out.println("최종 위치: " + simv.location);
    }
}
