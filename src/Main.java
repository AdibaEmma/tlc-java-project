import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> students = new ArrayList<String>();
        Student issac = new Student("Isaac", HasLevel.Level.LEVEL_200);
        Student emma = new Student("Emma", HasLevel.Level.LEVEL_100);
        Student jane = new Student("Jane", HasLevel.Level.LEVEL_200);
        Student michael = new Student("Michael", HasLevel.Level.LEVEL_100);

        students.add(issac.name);
        students.add(emma.name);
        students.add(jane.name);
        students.add(michael.name);

        System.out.println(emma.toString());
    }
}
