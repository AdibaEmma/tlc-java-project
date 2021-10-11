package generics;

import java.util.HashSet;
import java.util.Set;

public class BagOfStudents<Student> {
    Set<Student> bag = new HashSet<>();

    public void add(Student student) {
        bag.add(student);
    }

    public void remove(Student student) {
        bag.remove(student);
    }
}
