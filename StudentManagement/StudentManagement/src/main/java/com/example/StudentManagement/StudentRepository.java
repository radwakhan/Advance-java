package com.example.StudentManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
@org.springframework.stereotype.Repository
public class StudentRepository {
    @Autowired
    JdbcTemplate jdbc;

    public  void save(Student s){
        String query="insert into Student values (?,?,?)";
        jdbc.update(query,s.getRollno(),s.getName(),s.getMarks());
    }
    public List<Student> findAll(){
String query="select * from student";
return  jdbc.query(query,(rs, rowNum) -> {
    Student s=new Student();
    s.setRollno(rs.getInt("rollno"));
    s.setName(rs.getString("name"));
    s.setMarks(rs.getInt("marks"));
    return s;

});
    }

}
