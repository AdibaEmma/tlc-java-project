import org.jetbrains.annotations.NotNull;
import java.util.List;

public class Student implements Nameable, HasLevel {
    public String name;
    private Level studentLevel;
    protected List<Double> studentGrades;

    public Student(String name, Level level) {
        this.name = name;
        this.studentLevel = level;

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

    @Override
    public Level getLevel() {
        return studentLevel;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentLevel=" + studentLevel +
                '}';
    }
}
