package area;

interface Area2 {
	double PI = 3.14;

	void getArea();
//	 void print();
}

class Rectangle implements Area2 {
	int l, b;

	public Rectangle(int l, int b) {
		// TODO Auto-generated constructor stub
		this.l = l;
		this.b = b;
	}

	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		int area = l * b;

		System.out.println("the area of rectangle:" + area);
	}
}

public class AreaMainD2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Rectangle obj = new Rectangle(23, 2);
//		obj.getArea();
//
//		Area2 ob;
//		ob = new Rectangle(2, 3);
//		ob.getArea();
//		java do not support downcasting 

		Area2 circle = new Area2() {
			int r = 2;

			@Override
			public void getArea() {
				// TODO Auto-generated method stub
				double result = 3.14 * r * r;
				System.out.println("the area of circle is: " + result);
			}
		};

		Area2 square = () -> System.out.println("the area is");
		;
		square.getArea();
	}

}
