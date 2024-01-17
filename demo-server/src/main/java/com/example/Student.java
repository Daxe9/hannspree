package com.example;

public class Student {
    String name;
    String surname;
    String birthday;
    
    public Student(String name, String surname, String biirthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = biirthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
