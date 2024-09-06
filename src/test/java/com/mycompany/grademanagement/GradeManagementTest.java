/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.grademanagement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class GradeManagementTest {
    
    @Test
    public void testGenerateStudentReport() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 65));
        students.add(new Student("Bob", 45));

        String expectedReport = "Student Report:\n"
                + "Name: Alice, Grade: 65.0 - Passed\n"
                + "Name: Bob, Grade: 45.0 - Failed\n"
                + "\nAverage Grade: 55.00";

        String report = Student.generateStudentReport(students);
        assertEquals(expectedReport, report, "The report should correctly show student grades and average.");
    }

    @Test
    public void testGetValidIntegerInput() {
        // Test valid input
        assertEquals(5, GradeUtils.getValidIntegerInput("5"));

        // Test invalid input (non-number)
        assertThrows(NumberFormatException.class, () -> {
            GradeUtils.getValidIntegerInput("abc");
        });

        // Test invalid input (negative number)
        assertThrows(IllegalArgumentException.class, () -> {
            GradeUtils.getValidIntegerInput("-3");
        });
    }

    @Test
    public void testGetValidDoubleInput() {
        // Test valid input
        assertEquals(75.5, GradeUtils.getValidDoubleInput("75.5"));

        // Test invalid input (non-number)
        assertThrows(NumberFormatException.class, () -> {
            GradeUtils.getValidDoubleInput("xyz");
        });

        // Test invalid input (out of range)
        assertThrows(IllegalArgumentException.class, () -> {
            GradeUtils.getValidDoubleInput("105");
        });

        // Test invalid input (negative number)
        assertThrows(IllegalArgumentException.class, () -> {
            GradeUtils.getValidDoubleInput("-5");
        });
    }

    @Test
    public void testStudentPassFail() {
        Student passingStudent = new Student("Alice", 65);
        Student failingStudent = new Student("Bob", 45);

        assertTrue(passingStudent.hasPassed(GradeUtils.PASSING_GRADE), "Alice should pass.");
        assertFalse(failingStudent.hasPassed(GradeUtils.PASSING_GRADE), "Bob should fail.");
    }
}