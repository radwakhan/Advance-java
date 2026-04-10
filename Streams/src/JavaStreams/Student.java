package JavaStreams;

import java.util.ArrayList;
import java.util.List;

public class Student {
	String name;
	int marks;

	Student(String names, int marks) {
		this.name = name;
		this.marks = marks;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = new ArrayList();
		list.add(new Student("radwa", 95));
		list.add(new Student("khushi", 67));
		list.add(new Student("pranay", 35));
		list.add(new Student("mohit", 85));
		list.add(new Student("rishabh", 65));
		ArrayList<Student> listt = new ArrayList<>();
		listt.addAll(list);

		listt.stream().filter(n -> n.marks > 60).forEach(n -> System.out.println(n));

	}

}
