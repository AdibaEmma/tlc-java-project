package com.university;

import java.util.List;

public class Lecture {

    protected void enter(Student student) {

    }

    public double getHighestAverageGrade(List<Double> averageStudentGrades) {
        double highestAverage = 0.00;
        for (double averageGrade : averageStudentGrades) {
            if (averageGrade > highestAverage) {
                highestAverage = averageGrade;
            }
        }

        return highestAverage;
    }
}
