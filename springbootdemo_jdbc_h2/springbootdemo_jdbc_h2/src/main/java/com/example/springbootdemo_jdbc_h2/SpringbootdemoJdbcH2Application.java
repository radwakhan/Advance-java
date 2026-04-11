package com.example.springbootdemo_jdbc_h2;

import com.example.springbootdemo_jdbc_h2.model.Student;
import com.example.springbootdemo_jdbc_h2.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringbootdemoJdbcH2Application {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(SpringbootdemoJdbcH2Application.class, args);
		Student s=context.getBean(Student.class);
		s.setName("radwa");
		s.setRollno(1);
		s.setMarks(50);
		StudentService service=context.getBean(StudentService.class);
		service.addStudent(s);
		List<Student> list=service.getStudents();
		System.out.println(list);
	}



}
