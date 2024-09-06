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
public class GradeUtils {

    // Constant for passing grade
    public static final double PASSING_GRADE = 50.0;

    // Method to generate a report
    public static String generateStudentReport(ArrayList<Student> students) {
        StringBuilder report = new StringBuilder("Student Report:\n");

        double totalGrade = 0;

        for (Student student : students) {
            String status = student.hasPassed(PASSING_GRADE) ? "Passed" : "Failed";
            report.append(student.toString()).append(" - ").append(status).append("\n");
            totalGrade += student.getGrade();
        }

        double averageGrade = totalGrade / students.size();
        report.append("\nAverage Grade: ").append(String.format("%.2f", averageGrade));

        return report.toString();
    }

    // Method to get a valid integer input (mock this during testing)
    public static int getValidIntegerInput(String input) throws NumberFormatException {
        int value = Integer.parseInt(input);
        if (value <= 0) {
            throw new IllegalArgumentException("Number of students must be positive.");
        }
        return value;
    }

    // Method to get a valid double input for grade (mock this during testing)
    public static double getValidDoubleInput(String input) throws NumberFormatException {
        double value = Double.parseDouble(input);
        if (value < 0 || value > 100) {
            throw new IllegalArgumentException("Grade must be between 0 and 100.");
        }
        return value;
    }
}