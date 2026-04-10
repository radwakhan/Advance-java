package newjava;

interface Message {
	void displayMsg();

	default void displayMsg(String msg) {
		System.out.println(msg);
	}

	private void privmethod() {
		System.out.println("this is private method");
	}

	static void staticMethod() {
		System.out.println("this is static method");
	}
}

public class MainInter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
