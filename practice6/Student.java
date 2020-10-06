package ru.mirea.practice6;

public class Student implements Comparable<Student>{
private String studentName;
private int IDNumber;
private int grade;
Student(int IDNumber,String studentName,int grade){
    this.IDNumber= IDNumber;
    this.studentName=studentName;
    this.grade=grade;
}

    public void setIDNumber(int IDNumber) {
        this.IDNumber = IDNumber;
    }

    public int getIDNumber() {
        return IDNumber;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }
//ЗАДАНИЕ 1 и 3
    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.IDNumber,o.IDNumber);
    }

    @Override
    public String toString() {
        return "Student{" +
                "IDNumber=" + IDNumber +
                '}';
    }
//ЗАДАНИЕ2
  /*  public String toString() {
        return "Student{" +
                "Grade=" + grade +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.grade,o.grade);
    }*/
}