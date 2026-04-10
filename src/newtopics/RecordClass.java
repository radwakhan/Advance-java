package newtopics;

//class Student{
//	int sid;
//	String name;
//	int rollno;
//}
record Student(int sid, String name, int rollno) {
};

public class RecordClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s = new Student(1, "radwa", 1);

		System.out.println(s.sid());
		System.out.println(s.name());
		System.out.println(s.rollno());

	}

}
