package lambda;

public class ThreeQuotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		this introduce in java 15 and confirmed in java 17
		String msg = """
								package lambda;

				@FunctionalInterface
				interface Calc{
				//	void add(int n1,int n2);
					int add(int n1,int n2);

				}
				public class MainLambda2 {

					public static void main(String[] args) {
						// TODO Auto-generated method stub

				//		Calc sum=(int n1,int n2)->{
				//			System.out.println("sum=");
				//			System.out.println((n1+n2));
				//		};
				//		sum.add(32, 34);
				//
				//		Calc sum1=(int n1,int n2)->System.out.println((n1+n2));
				//		sum1.add(23, 34);

						Calc sum=(int n1,int n2)->{
							System.out.println("sum is");
							int s=n1+n2;
							return  s;
						};

						Calc sum2=(n1,n2)->n1+n2;


					}

				}

								""";
		// these three quotes are textblock

	}

}
