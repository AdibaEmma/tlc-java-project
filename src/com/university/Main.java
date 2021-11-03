package com.university;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Main {

    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer("Harry", Subject.PROGRAMMING);
        Course introToProgramming = new Course(lecturer, Level.FIRST);

        var students = List.of(
                new Student("211101206", "Emmanuel", Level.FIRST),
                new Student("18110001", "Isaac", Level.FOURTH),
                new Student("191102154", "Jane", Level.THIRD),
                new Student("201101445", "Michael", Level.SECOND),
                new Student("21080601", "Israel", Level.FIRST),
                new Student("21090609", "Elorm", Level.FIRST),
                new Student("181101211", "Daniel", Level.FOURTH),
                new Student("211101236", "Ben", Level.FIRST),
                new Student("211101240", "Carl", Level.FIRST),
                new Student("181101211", "Daniel", Level.FOURTH),
                new Student("211101236", "Ben", Level.FIRST),
                new Student("211101240", "Carl", Level.FIRST),
                new Student("201101200", "Barry", Level.SECOND),
                new Student("191101116", "Adams", Level.THIRD),
                new Student("201101200", "Barry", Level.SECOND),
                new Student("191101116", "Adams", Level.THIRD)
        );

        var firstYearsStudents = students.stream().filter(s -> s.getLevel() == Level.FIRST).toList();
        introToProgramming.setStudents(firstYearsStudents);

        Lecturer mac = new Lecturer("Mac-Nobel", Subject.GARDENING);
        AdvanceGardening advanceGardening = new AdvanceGardening( mac, Level.FOURTH );
        var advanceGardeningStudents = students.stream().filter(s -> s.getLevel() == Level.THIRD || s.getLevel() == Level.FOURTH).toList();

        advanceGardening.setStudents(advanceGardeningStudents);

        Lecturer gerald = new Lecturer("Gerald", Subject.PHYSICS);
        Course physics = new Course(gerald, Level.FOURTH);
        var filteredFinalYearStudents = students.stream().filter(s -> s.getLevel() == Level.FOURTH).toList();
        physics.setStudents(filteredFinalYearStudents);

        var student1Grades = Arrays.asList(100.0, 100.0, 100.0, 100.0, 100.0);
        var student2Grades = Arrays.asList(90.0, 45.0, 55.5, 67.25, 35.75);
        var student3Grades = Arrays.asList(60.5, 32.0, 80.0, 21.25, 40.5);
        var student4Grades = Arrays.asList(50.0, 50.0, 50.0, 50.0, 50.0);
        NaughtyStudent naughtyStudent1 = new NaughtyStudent("11111", student1Grades);
        NaughtyStudent naughtyStudent2 = new NaughtyStudent("24244", student2Grades);
        NaughtyStudent naughtyStudent3= new NaughtyStudent("133431111", student3Grades);
        NaughtyStudent naughtyStudent4 = new NaughtyStudent("11154511", student4Grades);
        Lecturer lecturer4 = new Lecturer("Kofi", Subject.GARDENING);

//        var naughtyStudents = List.of(naughtyStudent1,naughtyStudent2,naughtyStudent3,naughtyStudent4);
//        lecturer4.Enter(naughtyStudent1);
//        lecturer4.Enter(naughtyStudent2);
//        lecturer4.Enter(naughtyStudent3);
//        lecturer4.Enter(naughtyStudent4);
//
//        System.out.println(lecturer4);
//

//        BagOfStudents bagOfStudents = new BagOfStudents();
//
//        bagOfStudents.add( new Student("211101206", "Emmanuel", Level.FIRST) );
//        bagOfStudents.add( new Student("211101206", "Emmanuel", Level.FIRST) );
//        bagOfStudents.add(  new Student("191101116", "Adams", Level.THIRD) );
//        bagOfStudents.add( new Student("211101240", "Carl", Level.FIRST) );
//        bagOfStudents.add( new Student("201101445", "Michael", Level.SECOND) );
//
//
//        System.out.println(bagOfStudents.getElements());
//        bagOfStudents.remove( new Student("211101240", "Carl", Level.FIRST) );
//        System.out.println(bagOfStudents.getElements());
//        bagOfStudents.clear();
//        System.out.println(bagOfStudents.getElements());



        // Register Class
        var studentNames = List.of(
                new Student("1234", "Emma", Level.FIRST),
                new Student("2433", "Bright", Level.SECOND),
                new Student("777", "Tom", Level.FOURTH),
                new Student("108", "Riddle", Level.THIRD),
                new Student("00001", "Grovy", Level.SECOND)
        );

        Register register = new Register(studentNames);

        System.out.println("Register with Level: " + register.getRegisterByLevel(Level.THIRD));
        System.out.println(register.PrintReport());
        System.out.println(register.sort(Comparator.comparing(Student::getName)));
        System.out.println(register.sort(Comparator.comparing(Student::getLevel)));
        System.out.println(register.sort(Comparator.comparing(Student::getStudentID)));
        System.out.println("............");
//        try {
//            System.out.println(register.getStudentByName("Kofi"));
//        } catch (StudentNotFoundException snfe) {
//            System.out.println(snfe.getMessage());
//        }

        System.out.println(register.getStudentByName("Kofi"));

        var names = Arrays.asList("Emma", "Bright", "Riddle");

        System.out.println(register.getStudentsByName(names));
    }
}
