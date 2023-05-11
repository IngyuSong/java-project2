package com.example.javaproject2.week4.day4;

public class User {
    private String name;
    private String phoneNumber;
    private String password;
    private int age;

    boolean isAdult() {
        return age >= 18;
    }

    public User(String phoneNumber, int age) {
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public User(String name, String phoneNumber, String password, int age) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.age = age;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
