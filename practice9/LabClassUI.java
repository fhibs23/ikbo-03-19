package ru.mirea.practice9;

import ru.mirea.practice6.Student;
public interface LabClassUI {
    Student getStudent(String name) throws StudentNotFoundException;
    void addStudent(Student student);
    void sortStudent();
}
