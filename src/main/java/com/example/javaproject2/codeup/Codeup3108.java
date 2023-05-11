package com.example.javaproject2.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//public class Codeup3108 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        TreeMap<Integer, String> map = new TreeMap<>();
//        ArrayList<String> list = new ArrayList<>();
//        int n = sc.nextInt();
//        while (n-- > 0) {
//            String code = sc.next();
//            int num = sc.nextInt();
//            String name = sc.next();
//            if (!map.containsKey(num) && code.equals("I")) map.put(num, name);
//            else map.remove(num);
//        }
//        map.forEach((key, value) -> list.add(key + " " + value));
//        for (int i = 0; i < 5; i++) {
//            System.out.println(list.get(sc.nextInt() - 1));
//        }
//    }
//}

class Student {

    private String code;
    private int testId;
    private String name;

    public Student(String code, int testId, String name) {
        this.code = code;
        this.testId = testId;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public int getTestId() {
        return testId;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object object){
        if (object == this) return true;
        if (!(object instanceof Student)) return false;
        Student student = (Student) object;
        return testId == student.testId;
    }
}

public class Codeup3108 {

    List<Student> students = new ArrayList<>();

    public Student makeAStudent(String code, int testId, String name){
        return new Student(code, testId, name);
    }

    private boolean isExist(Student student){
        for(Student s : students){
            if(student.getTestId() == s.getTestId()) return true;
        }
        return false;
    }

    public void process(Student student) {
        switch (student.getCode()){
            case "I" -> addAStudent(student);
            case "D" -> deleteAStudent(student);
        }
    }

    private void addAStudent(Student student){
        if(!isExist(student)) students.add(student);
    }
    private void deleteAStudent(Student student){
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getTestId() == student.getTestId()) deleteAStudent(student);
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Codeup3108 codeup3108 = new Codeup3108();
        while ( n --> 0){
            String[] splitted = br.readLine().split(" ");
            Student student = codeup3108.makeAStudent(splitted[0], Integer.parseInt(splitted[1]), splitted[2]);
        }
    }
}
