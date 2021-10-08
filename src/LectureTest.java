import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LectureTest {

    @Test
    void getHighestAverageGrade() {
        // Students objects
        Student isaac = new Student();
        Student michael = new Student();
        Student jane = new Student();

        // Students grades
        // Isaac's grades
        ArrayList<Double> isaacsGrades = new ArrayList<Double>();
        isaacsGrades.add(100.00);
        isaacsGrades.add(100.00);
        isaacsGrades.add(100.00);

        double isaacsAverage = isaac.getAverageGrade(isaacsGrades);

        // Michael's grades
        ArrayList<Double> michaelsGrades = new ArrayList<Double>();
        michaelsGrades.add(100.00);
        michaelsGrades.add(100.00);
        michaelsGrades.add(50.00);

        double michaelsAverage = michael.getAverageGrade(michaelsGrades);

        // Jane's grades
        ArrayList<Double> janesGrades = new ArrayList<Double>();
        janesGrades.add(100.00);
        janesGrades.add(50.00);
        janesGrades.add(50.00);

        double janesAverage = jane.getAverageGrade(janesGrades);

        // Add all Isaac's, Michael's and Jane's averages
        ArrayList<Double> averageStudentsGrades = new ArrayList<Double>();
        averageStudentsGrades.add( isaacsAverage );
        averageStudentsGrades.add( michaelsAverage );
        averageStudentsGrades.add( janesAverage );

        Lecture lecture = new Lecture();

        double highestAverage = lecture.getHighestAverageGrade(averageStudentsGrades);
        assertEquals(100.00, highestAverage);

    }
}