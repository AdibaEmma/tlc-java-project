import org.jetbrains.annotations.NotNull;

import java.util.List;

public class NaughtyStudent extends  Student {
    public double averageGradePercentIncrease = 1.1;

    @Override
    public double getAverageGrade(@NotNull List<Double> grades) {
        return super.getAverageGrade(grades) * averageGradePercentIncrease;
    }
}
