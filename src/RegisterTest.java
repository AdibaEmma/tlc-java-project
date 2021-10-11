import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {

    @Test
    void getRegister() {

        ArrayList<String> students = new ArrayList<>();
        Student isaac = new Student("Isaac", HasLevel.Level.LEVEL_200);
        Student emma = new Student("Emma", HasLevel.Level.LEVEL_100);
        Student jane = new Student("Jane", HasLevel.Level.LEVEL_200);
        Student michael = new Student("Michael", HasLevel.Level.LEVEL_100);

        students.add(isaac.name);
        students.add(emma.name);
        students.add(jane.name);
        students.add(michael.name);

        Register register = new Register(students);
        List<String> studentsRegister = register.getRegister();
        assertEquals("Emma", studentsRegister.get(1));
    }
}