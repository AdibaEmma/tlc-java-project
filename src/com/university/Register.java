package com.university;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Register {
    List<Student> nameables;

    public Register(List<Student> nameables) {
        this.nameables = nameables;
    }

    public List<String> getRegister() {
        return this.nameables
                .stream()
                .map(Student::getName)
                .collect(Collectors.toList());
    }

//    public Student getStudentByName(String name) throws StudentNotFoundException {
//        boolean studentExists = getRegister().contains(name);
//        if(! studentExists) {
//            throw new StudentNotFoundException("No student with name " + name + "found.");
//        } else {
//            return nameables
//                    .stream()
//                    .filter(s -> s.getName().equals(name))
//                    .findFirst()
//                    .get();
//        }
//    }

    public Optional<Student> getStudentByName(String name) {
        return this.nameables
                .stream()
                .filter(s -> s.getName().equals(name))
                .findFirst();
    }

    public List<Student> getStudentsByName(List<String> names){
        return this.nameables.stream()
                .filter(student -> names.contains(student.getName()))
                .collect(Collectors.toList());
    }

    public HashMap<Level, List<Student>> getRegisterByLevel(Level level) {
        HashMap<Level, List<Student>> registerWithLevel = new HashMap<>();
        registerWithLevel.put(level, nameables
                .stream()
                .filter( s -> s.getLevel() == level)
                .collect(Collectors.toList()));
        return registerWithLevel;
    }

    public List<Student> sort(Comparator<Student> comparator) {
        return nameables
                .stream()
                .sorted(comparator)
                .collect(Collectors.toList());
    }

    public List<String> PrintReport() {
        return nameables
                .stream()
                .sorted(Comparator.comparing(Student::getLevel))
                .map(s -> "Level " + s.getLevel() + " : " + s.getName())
                .collect(Collectors.toList());
    }
}
