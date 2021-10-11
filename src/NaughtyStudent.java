
import java.util.List;

public class NaughtyStudent extends  Student implements HasLevel {
    public double averageGradePercentIncrease = 1.1;
    private Level studentLevel;
    public NaughtyStudent(String name, Level level) {
        super(name, level);
    }

    @Override
    public double getAverageGrade(List<Double> grades) {
        return super.getAverageGrade(grades) * averageGradePercentIncrease;
    }

    @Override
    public Level getLevel() {
        return studentLevel;
    }
}
