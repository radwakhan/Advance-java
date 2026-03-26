package lambda;

interface Sub {
	int subtract(int a, int b);

	default int subt(int q) {
		return 2;
	}
}

public class MainLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub obj = new Sub() {

			@Override
			public int subtract(int a, int b) {
				// TODO Auto-generated method stub
				return a - b;
			}

		};
		int r = obj.subtract(5, 4);
		System.out.println(r);
	}

	Sub obj2 = (int n1, int n2) -> n1 - n2;
	int r2 = obj2.subtract(5, 4);

}
