/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grademanagement;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Student extends Person {

    static String generateStudentReport(ArrayList<Student> students) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private double grade;

    public Student(String name, double grade) {
        super(name);
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public boolean hasPassed(double passingGrade) {
        return this.grade >= passingGrade;
    }

    @Override
    public String toString() {
        return super.toString() + ", Grade: " + grade;
    }
}