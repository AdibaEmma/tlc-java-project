package com.university;

import java.util.List;

public class NaughtyStudent extends Student {

    public NaughtyStudent(String studentID, String name, Level level) {
        super(studentID, name, level);
    }

    public NaughtyStudent(String studentID, List<Double> grades) {
        super(studentID, grades);
    }

    @Override
    public Double getAverageGrade() {
        return Math.floor(super.getAverageGrade() * 1.1);
    }
}
