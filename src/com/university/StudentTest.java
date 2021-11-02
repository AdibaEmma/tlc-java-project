package com.university;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getAverageGrade() {

        var studentGrades = Arrays.asList(100.0, 100.0, 100.0, 100.0, 100.0);
        Student emma = new Student("20016016", studentGrades);
        assertEquals(100.0, emma.getAverageGrade(), 0);
    }
}