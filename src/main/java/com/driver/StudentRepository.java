package com.driver;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository {
    void addStudent(Student student);

    Student getStudentByName(String name);
}
