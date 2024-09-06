/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.grademanagement;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class GradeManagement {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        // Get number of students
        String numStudentsInput = JOptionPane.showInputDialog("Enter the number of students:");
        int numStudents = GradeUtils.getValidIntegerInput(numStudentsInput);

        // Collect student data
        for (int i = 0; i < numStudents; i++) {
            String name = JOptionPane.showInputDialog("Enter the name of student " + (i + 1) + ":");

            String gradeInput = JOptionPane.showInputDialog("Enter the marks(%) of " + name + ":");
            double grade = GradeUtils.getValidDoubleInput(gradeInput);

            students.add(new Student(name, grade));
        }

        // Generate and display report
        String report = GradeUtils.generateStudentReport(students);
        JOptionPane.showMessageDialog(null, report, "Grade Report", JOptionPane.INFORMATION_MESSAGE);
    }
}