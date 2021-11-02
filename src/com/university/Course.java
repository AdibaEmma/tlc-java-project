package com.university;

import java.util.List;

public class Course {
    public Lecturer lecturer;
    public List<Student> students;
    public Level courseLevel;

    public Course(Lecturer lecturer, Level courseLevel) {
        this.lecturer = lecturer;
        this.courseLevel = courseLevel;
    }

    public Level getCourseLevel() {
        return courseLevel;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Course{" +
                "lecturer=" + lecturer +
                ", students=" + students +
                ", courseLevel=" + courseLevel +
                '}';
    }
}
