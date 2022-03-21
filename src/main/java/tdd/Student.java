package tdd;

import java.util.ArrayList;

public class Student {

    private static long id;
    private static String name;
    private static ArrayList<Integer> grades;

    public Student(long idNum, String name) {
        Student.name = name;
        id = idNum;
        grades = new ArrayList<>();
    }

    public static long getId() {
        return id;
    }

    public static void setId(long id) {
        Student.id = id;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Student.name = name;
    }

    public static ArrayList<Integer> getGrades() {
        return grades;
    }

    public static void setGrades(ArrayList<Integer> grades) {
        Student.grades = grades;
    }
}/// END OF CLASS
