package com.example;

import java.util.ArrayList;

public class Class {
       Integer year;
    String section;
    String room;
    ArrayList<Student> students = new ArrayList<>();
    public Class(Integer year, String section, String room) {
        this.year = year;
        this.section = section;
        this.room = room;
    }

    public Class() { }
    public Integer getYear() {
        return year;
    }
    public void setYear(Integer year) {
        this.year = year;
    }
    public String getSection() {
        return section;
    }
    public void setSection(String section) {
        this.section = section;
    }
    public String getRoom() {
        return room;
    }
    public void setRoom(String room) {
        this.room = room;
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    public void addStudent(Student s) {
        this.students.add(s);
    }
    
}
