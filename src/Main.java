import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<String>();
        Student isaac = new Student("Isaac", HasLevel.Level.LEVEL_200);
        Student emma = new Student("Emma", HasLevel.Level.LEVEL_100);
        Student jane = new Student("Jane", HasLevel.Level.LEVEL_200);
        Student michael = new Student("Michael", HasLevel.Level.LEVEL_100);
        Student chester = new Student("Chester", HasLevel.Level.LEVEL_300);
        Student romeo = new Student("Romeo", HasLevel.Level.LEVEL_400);

//        System.out.println(emma.toString());

        students.add(isaac.name);
        students.add(emma.name);
        students.add(jane.name);
        students.add(michael.name);

        // Create students list for a particular level
        ArrayList<String> studentsAtLevel100 = new ArrayList<String>();
        studentsAtLevel100.add(isaac.name);
        studentsAtLevel100.add(jane.name);

        ArrayList<String> studentsAtLevel200 = new ArrayList<String>();
        studentsAtLevel200.add(emma.name);
        studentsAtLevel200.add(michael.name);

        ArrayList<String> studentsAtLevel300 = new ArrayList<String>();
        studentsAtLevel300.add(chester.name);

        ArrayList<String> studentsAtLevel400 = new ArrayList<String>();
        studentsAtLevel400.add(romeo.name);

        Map<HasLevel.Level, ArrayList<String>> studentsWithLevel = new HashMap<>();
        studentsWithLevel.put(HasLevel.Level.LEVEL_200, studentsAtLevel200);
        studentsWithLevel.put(HasLevel.Level.LEVEL_100, studentsAtLevel100);
        studentsWithLevel.put(HasLevel.Level.LEVEL_300, studentsAtLevel300);
        studentsWithLevel.put(HasLevel.Level.LEVEL_400, studentsAtLevel400);

//        System.out.println(emma.toString());

        Register register = new Register(students);
        Register registerWithLevels = new Register(studentsWithLevel);

        registerWithLevels.getRegisterByLevel(HasLevel.Level.LEVEL_100);
    }
}
