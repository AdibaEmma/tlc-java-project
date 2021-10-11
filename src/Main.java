import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> students = new ArrayList<String>();
        Student issac = new Student("Isaac");
        Student emma = new Student("Emma");
        Student jane = new Student("Jane");
        Student michael = new Student("Michael");

        students.add(issac.name);
        students.add(emma.name);
        students.add(jane.name);
        students.add(michael.name);

        System.out.println(students.toString());
    }
}
