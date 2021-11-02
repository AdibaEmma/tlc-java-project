package com.university;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LecturerTest {

    @Test
    void getHighestAverageGrade() {
//        var emmaGrades = Arrays.asList(100.0, 100.0, 100.0, 100.0);
//        Student emma = new Student("20016016", emmaGrades);

        var isaacGrade = Arrays.asList(50.0, 50.0, 100.0, 100.0);
        Student isaac = new Student("20016416", isaacGrade);

        var israelGrades = Arrays.asList(50.0, 50.0, 50.0, 100.0);
        Student israel = new Student("20016033", israelGrades);

        var elormGrades = Arrays.asList(50.00, 50.0, 50.0, 50.0);
        Student elorm = new Student("20016056", elormGrades);

        Lecturer lecturer = new Lecturer("Yaw", Subject.PHYSICS);
        var averageGrades = List.of(
//                emma.getAverageGrade(),
                isaac.getAverageGrade(),
                israel.getAverageGrade(),
                elorm.getAverageGrade()
        );

        assertEquals(75.0, lecturer.getHighestAverageGrade(averageGrades));
    }
}