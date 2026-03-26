package lambda;

class Circle {
	Circle() {
		System.out.println("constructor in circle");
	}

	Circle(String msg) {
		System.out.println("constructor in circle" + msg);
	}

	static double area(int r) {
		return Math.PI * r * r;
	}
}

@FunctionalInterface
interface CircleInfo {
	void getInfo(String info);
}

@FunctionalInterface
interface Area {
	double getArea(int num);
}

public class MethodRefrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
//Area ca=c::area;  //the address of Area interface will go to the area method of circle class
		Area ca = Circle::area;
// this above method reference is equivalent to below lambda expression
		Area ca2 = n -> Circle.area(n);
		ca2.getArea(34);

		System.out.println("Area=" + ca.getArea(34));

		CircleInfo obj = Circle::new; // constructor reference
		obj.getInfo("hello constructor");
// method reference decide by the signature of the method inside the functional interface if the
//signature do not match then it will show error and we cannot use method reference

	}

}
