package com.university;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {

    @Test
    void getRegister() {
        var studentNames = List.of(
                new Student("1234", "Emma", Level.FIRST),
                new Student("2433", "Bright", Level.SECOND),
                new Student("777", "Tom", Level.FOURTH),
                new Student("108", "Riddle", Level.THIRD)
        );

        Register register = new Register(studentNames);

        assertTrue(register.getRegister().contains("Tom"));
    }

    @Test
    void getRegisterByLevel() {
        var studentNames = List.of(
                new Student("1234", "Emma", Level.FIRST),
                new Student("2433", "Bright", Level.SECOND),
                new Student("777", "Tom", Level.FOURTH),
                new Student("108", "Riddle", Level.THIRD),
                new Student("00001", "Grovy", Level.SECOND)
        );

        Register register = new Register(studentNames);

        //assertTrue(register.getRegisterByLevel(Level.SECOND).contains("Bright"));
    }

    @Test
    void getStudentByName() throws StudentNotFoundException {
        var studentNames = List.of(
                new Student("1234", "Emma", Level.FIRST),
                new Student("2433", "Bright", Level.SECOND),
                new Student("777", "Tom", Level.FOURTH),
                new Student("108", "Riddle", Level.THIRD),
                new Student("00001", "Grovy", Level.SECOND)
        );

        Register register = new Register(studentNames);

        assertTrue(register.getStudentByName("Kofi").isPresent());
    }
}