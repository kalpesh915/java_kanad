package com.example;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//@Entity(name="Student")
//@Table(name="myStudents")
@Entity
public class Student {
    @Id
    private int roll;
    //@Column(name="firstName")
    private String fname;
    private String lname;
    private String city;
    private String phone;
    private String email;

    public Student() {}

    public Student(int roll, String fname, String lname, String city, String phone, String email) {
        this.roll = roll;
        this.fname = fname;
        this.lname = lname;
        this.city = city;
        this.phone = phone;
        this.email = email;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", fname= " + fname + ' ' +
                ", lname= " + lname + ' ' +
                ", city= " + city + ' ' +
                ", phone= " + phone + ' ' +
                ", email= " + email + ' ' +
                '}';
    }
}
