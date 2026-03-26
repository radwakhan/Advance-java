package lambda;

class Message {
	void getMessage() {
		System.out.println("this called by var!");
	}
}

interface Mes {
	void hello();
}

public class VarClass {
//	var r=0; not allowed in instance  as this is local variable type inference

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		var s; it is not possible with var initialization is must
		var n1 = 10.50; // only local variable can be declared by var and cannot be used with instance
						// variable
		var n2 = 20;
		var s = n1 + n2;
		System.out.println("sum=" + s);
		var m = new Message();
		var obj = new Mes() {

			@Override
			public void hello() {
				// TODO Auto-generated method stub

			}

			void print() {
				System.out.println("hello print method");
			}
		};
		obj.print();
	}

}
