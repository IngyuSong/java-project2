package com.example.javaproject2.week1.day5;

public class UserTest {
    public static void main(String[] args) {
        User user1 = new User();
        user1.name = "홍길동";
        user1.phoneNumber = "010-1111-2222";
        user1.age = 20;

        User user2  = new User();
        user2.name = "이순신";
        user2.phoneNumber = "010-1111-3333";
        user2.age = 50;

        System.out.println(user1.name +"님은 성인입니까? " + user1.isAdult());
        System.out.println(user2.name +"님은 성인입니까? " + user1.isAdult());

    }
}
