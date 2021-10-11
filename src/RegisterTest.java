import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {

    @Test
    void getRegister() {

        ArrayList<String> students = new ArrayList<>();
        Student isaac = new Student("Isaac");
        Student emma = new Student("Emma");
        Student jane = new Student("Jane");
        Student michael = new Student("Michael");

        students.add(isaac.name);
        students.add(emma.name);
        students.add(jane.name);
        students.add(michael.name);

        Register register = new Register(students);
        List<String> studentsRegister = register.getRegister();
        assertEquals("Emma", studentsRegister.get(1));
    }
}