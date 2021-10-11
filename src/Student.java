import org.jetbrains.annotations.NotNull;

import java.util.List;

public class Student implements Nameable {
    public String name;

    protected List<Double> studentGrades;

    public Student(String name) {
        this.name = name;
    }

    protected void setStudentGrades(List<Double> studentGrades) {
        this.studentGrades = studentGrades;
    }

    public double getAverageGrade(@NotNull List<Double> grades) {
        double average = 0.00;

        for ( double grade : grades ) average += grade;
        return average / grades.size();
    }

    @Override
    public String getName() {
        return name;
    }
}
