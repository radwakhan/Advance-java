package com.example.springbootdemo_jdbc_h2.service;

import com.example.springbootdemo_jdbc_h2.model.Student;
import com.example.springbootdemo_jdbc_h2.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private StudentRepo repo;

    public StudentRepo getRepo() {
        return repo;
    }

    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public void addStudent(Student s){
        repo.save(s);
        System.out.println("student added");

    }

    public List<Student> getStudents() {
        return repo.findAll();
    }
}
