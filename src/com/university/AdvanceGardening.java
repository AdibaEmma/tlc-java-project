package com.university;

import java.util.List;

public class AdvanceGardening extends Course {

    public AdvanceGardening(Lecturer lecturer, Level courseLevel) {
        super(lecturer, courseLevel);
    }

    @Override
    public Level getCourseLevel() {
        return super.getCourseLevel();
    }

    @Override
    public List<Student> getStudents() {
        return super.getStudents();
    }

    @Override
    public void setStudents(List<Student> students) {
        super.setStudents(students);
    }

    @Override
    public String toString() {
        return "AdvanceGardening{" +
                "lecturer=" + lecturer +
                ", students=" + students +
                ", courseLevel=" + courseLevel +
                '}';
    }
}
