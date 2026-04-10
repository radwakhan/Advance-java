package area;

class Area {
	Area(String msg) {
//		System.out.println("this is area constructor");
		System.out.println(msg);
	}

	int r, l, b;

	void getArea() {
		System.out.println("This is area class");
	}
}

class Circle extends Area {
	final double pi = 3.12;

	Circle(int r) {
		super("this is super class constructor");
		super.r = r;
	}

	void getCircleArea() {
		double result = pi * super.r * this.r;
		System.out.println("Area of circle: " + result);
	}
}

public class AreaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle(24);
		circle.getArea();
		circle.getCircleArea();
//		Area a = new Circle(34);

//		Circle c=(Circle)new Area("sd");  this is downcasting which java do not allow;

	}

}
