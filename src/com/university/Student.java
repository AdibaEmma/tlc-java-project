package com.university;

import java.util.List;

public class Student implements Nameable, HasLevel {
    private String name;
    private final String studentID;
    private Level level;
    private List<Double> grades;

    public Student( String studentID, String name,  Level level) {
        this.name = name;
        this.studentID = studentID;
        this.level = level;
    }

    public Student(String studentID, List<Double> grades) {
        this.studentID = studentID;
        this.grades = grades;
    }

    public Double getAverageGrade() {
        Double sum = getGrades().stream().reduce(0.0, Double::sum);
        return sum / grades.size();
    }

    public List<Double> getGrades() {
        return grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public Level getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentID=" + studentID +
                ", level=" + level +
                '}';
    }


}
