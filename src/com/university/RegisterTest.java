package com.university;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {

    @Test
    void getRegister() {
        Student s1 = new Student("1234", "Emma", Level.FIRST);
        Student s2 = new Student("2433", "Bright", Level.SECOND);
        Student s3 = new Student("777", "Tom", Level.FOURTH);
        Student s4 = new Student("108", "Riddle", Level.THIRD);
        var studentNames = List.of(s1.getName(),s2.getName(), s4.getName(), s3.getName());

        Register register = new Register(studentNames);

        assertTrue(register.getRegister().contains("Tom"));
    }
}