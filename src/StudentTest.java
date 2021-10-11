import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getAverageGrade() {
        ArrayList<Double> grades = new ArrayList<Double>();
        Student student = new Student();

        // Add some grades to the grades collection
        grades.add(100.00);
        grades.add(100.00);
        grades.add(100.00);
        grades.add(100.00);

        student.setStudentGrades(grades);

        assertEquals(100.00, student.getAverageGrade(grades));
    }
}