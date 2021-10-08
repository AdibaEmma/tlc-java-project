import java.util.List;

public class Student {
    protected List<Double> studentGrades;

    public List<Double> getStudentGrades() {
        return studentGrades;
    }

    public void setStudentGrades(List<Double> studentGrades) {
        this.studentGrades = studentGrades;
    }

    public double getAverageGrade(List<Double> grades) {
        double average = 0;

        for ( double grade : grades ) {
            average = average + grade;

            double averageGrade = average / grades.size();
        }
        return average;
    }
}
