package com.example.springbootdemo_jdbc_h2.repository;

import com.example.springbootdemo_jdbc_h2.model.Student;
import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
@Repository
public class StudentRepo {
    public JdbcTemplate getJdbc() {
        return jdbc;
    }
@Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    private JdbcTemplate jdbc;
    public void save(Student s){
        String query="insert into student (rollno,name,marks) values(?,?,?)";
        int rows= jdbc.update(query,s.getRollno(),s.getName(),s.getMarks());
        System.out.println(rows+" affected");
    }

    public List<Student> findAll() {
String query="select * from student";

        RowMapper<Student> mapper=
           (ResultSet rs, int rowNum) -> {
                Student s=new Student();
               s.setRollno(rs.getInt("rollno"));
               s.setName(rs.getString("name"));
               s.setMarks(rs.getInt("marks"));
return s;
            };

return jdbc.query(query,mapper);
    }
}
