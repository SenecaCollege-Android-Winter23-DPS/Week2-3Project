package com.example.w23_week2;

import java.util.ArrayList;

public class StudentCollection {

   static ArrayList<Student> allStudents = new ArrayList<>(0);

    void addNewStudent(Student s){
        allStudents.add(s);

    }
}
