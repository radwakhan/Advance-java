package calc;

class Sum {
	int num1, num2;

	Sum(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	Sum() { // user define default constructor
		this(34, 45);
	}

	void getSum() {
		System.out.println("sum: " + (num1 + num2));
	}

}

class Subtract {
	int getSub(int a, int b) {
		return a - b;
	}
}

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Sum s1; //object declaration
//		s1= new Sum(23, 34); //object instantiation 
//		s1.getSum();
//		new Sum().getSum();

		Subtract obj = new Subtract();
		System.out.println(obj.getSub(24, 10));

	}
}
