package service;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    public static void main(String... args){


    }

    public void addStudent(){
        Student student=new Student();
        List<Student>studentlist=new ArrayList<Student>();
        student.setStudentId("001");
        student.setName("name");
        student.setStartDate("2023-05-02");
        student.setEndDate("2026-05-04");

    }

    public List<Student> getStudents(){
        return new ArrayList<Student>();
    }
}
