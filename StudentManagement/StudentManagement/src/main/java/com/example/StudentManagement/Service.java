package com.example.StudentManagement;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@org.springframework.stereotype.Service
public class Service {
    @Autowired
    StudentRepository repo;
public void addStudent(Student s){
repo.save(s);

}

public List<Student> getStudents(){
return  repo.findAll();
}

}
