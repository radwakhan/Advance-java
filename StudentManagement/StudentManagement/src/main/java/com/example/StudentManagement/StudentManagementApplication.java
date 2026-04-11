package com.example.StudentManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class StudentManagementApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(StudentManagementApplication.class, args);
		Student obj=new Student();
		obj.setRollno(6);
		obj.setName("radwa");
		obj.setMarks(35);
		Service service=context.getBean(Service.class);
		service.addStudent(obj);
		List<Student> list=service.getStudents();
		System.out.println(list);
	}

}
