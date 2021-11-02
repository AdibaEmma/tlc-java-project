package com.university;

import java.util.List;

import static java.util.Collections.max;

public class Lecturer {
    private String name;
    private Subject courseLecturing;
    private List<Student> studentList;

    public Lecturer(String name, Subject courseLecturing) {
        this.name = name;
        this.courseLecturing = courseLecturing;
    }

    public void Enter(Student s) {
        studentList.add(s);
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public Double getHighestAverageGrade(List<Double> averageGrades) {
        return  max(averageGrades);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject getCourseLecturing() {
        return courseLecturing;
    }

    public void setCourseLecturing(Subject courseLecturing) {
        this.courseLecturing = courseLecturing;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "name='" + name + '\'' +
                ", courseLecturing=" + courseLecturing +
                ", studentList=" + studentList +
                '}';
    }
}
