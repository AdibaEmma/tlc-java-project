import java.util.*;

public class Register {

    private List<String> students;
    Map<HasLevel.Level, ArrayList<String>> studentsWithLevels;

    public Register(List<String>  students) {
        this.students = students;
    }
    public Register(Map<HasLevel.Level, ArrayList<String>> studentsWithLevels) {
        this.studentsWithLevels = studentsWithLevels;
    }


    public List<String> getRegister() {
        return students;
}

    public void getRegisterByLevel(HasLevel.Level level) {

        switch (level) {
            case LEVEL_100:
                System.out.println(
                        studentsWithLevels.get(HasLevel.Level.LEVEL_100)
                );

                break;
            case LEVEL_200:
                System.out.println(
                        studentsWithLevels.get(HasLevel.Level.LEVEL_200)
                );
                break;
            case LEVEL_300:
                System.out.println(
                        studentsWithLevels.get(HasLevel.Level.LEVEL_300)
                );
                break;
            case LEVEL_400:
                System.out.println(
                        studentsWithLevels.get(HasLevel.Level.LEVEL_400)
                );
                break;
            default: System.out.println("No students found for that level");
        }
    }
}
