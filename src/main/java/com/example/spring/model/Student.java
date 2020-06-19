package com.example.spring.model;
import com.fasterxml.jackson.annotation.JsonIgnore;


import javax.swing.*;
import javax.validation.constraints.NotBlank;
import java.applet.Applet;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Student {

    private Integer id;

    private String lname;

    private String fname;

    private String department;

    public Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", lastName='" + lname + '\'' +
                ", firstName='" + fname + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
