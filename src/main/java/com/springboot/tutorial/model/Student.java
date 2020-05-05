package com.springboot.tutorial.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static java.util.Arrays.asList;

public class Student {
    private String name;
    private int id;
    public static List<Student> studentList;

    static{
        studentRepository();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Student(int id, String name) {
        this.name = name;
        this.id = id;
    }
    public Student() {
    }

    private static void studentRepository(){
        studentList = new ArrayList<>(asList(new Student(1,"Todoroki"), new Student(2, "Doku")));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
