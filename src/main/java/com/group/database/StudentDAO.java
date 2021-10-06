package com.group.database;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
public class StudentDAO {
    private List<Student> studentRepo;

    public void initDB() {
        studentRepo = new ArrayList<>();

        Student student1 = Student.builder()
                .id("SE151329")
                .name("Quan")
                .majorId("SE")
                .build();
        Student student2 = Student.builder()
                .id("SE151722")
                .name("Trong")
                .majorId("SS")
                .build();
        studentRepo.add(student1);
        studentRepo.add(student2);
    }

    public boolean addStudent(Student student) {
        return studentRepo.add(student);
    }

    public boolean removeStudentByName(String name) {
        return studentRepo.removeIf(t -> t.getName().equals(name));
    }

    public void showAllStudent() {
        studentRepo.stream()
                .forEach(t -> System.out.println(t.toString()));
    }
}
