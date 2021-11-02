package com.university;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NaughtyStudentTest {

    @Test
    void getAverageGrade() {
        var student1Grades = Arrays.asList(100.0, 100.0, 100.0, 100.0, 100.0);
        var student2Grades = Arrays.asList(90.0, 45.0, 55.5, 67.25, 35.75);
        var student3Grades = Arrays.asList(60.5, 32.0, 80.0, 21.25, 40.5);
        var student4Grades = Arrays.asList(50.0, 50.0, 50.0, 50.0, 50.0);
        NaughtyStudent naughtyStudent1 = new NaughtyStudent("11111", student1Grades);
        NaughtyStudent naughtyStudent2 = new NaughtyStudent("24244", student2Grades);
        NaughtyStudent naughtyStudent3= new NaughtyStudent("133431111", student3Grades);
        NaughtyStudent naughtyStudent4 = new NaughtyStudent("11154511", student4Grades);

        assertEquals(110.0, naughtyStudent1.getAverageGrade());
    }
}