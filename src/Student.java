import org.jetbrains.annotations.NotNull;

import java.util.List;

public class Student {
    protected List<Double> studentGrades;

    public List<Double> getStudentGrades() {
        return studentGrades;
    }

    public void setStudentGrades(List<Double> studentGrades) {
        this.studentGrades = studentGrades;
    }

    public double getAverageGrade(@NotNull List<Double> grades) {
        double average = 0.00;

        for ( double grade : grades ) average += grade;
        return average / grades.size();
    }
}
