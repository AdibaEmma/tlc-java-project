import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class NaughtyStudentTest {

    @Test
    void getAverageGrade() {
        ArrayList<Double> grades = new ArrayList<Double>();
        NaughtyStudent naughtyStudent = new NaughtyStudent("Ben");

        // Add some grades to the grades collection
        grades.add(100.00);
        grades.add(100.00);
        grades.add(100.00);
        grades.add(100.00);

        naughtyStudent.setStudentGrades(grades);
        Double average = (double) Math.round(naughtyStudent.getAverageGrade(grades));
        assertEquals(110.00, average);
    }
}