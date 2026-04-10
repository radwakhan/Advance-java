package lambda;

import java.util.Comparator;
import java.util.concurrent.Callable;

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("this is run method anonymous class");
			}
		};
//		answer 1
		Runnable r2 = () -> System.out.println("this is run method lambda expression");
		r2.run();

		Comparator<Integer> comp = new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				return a - b;
			}
		};
// answer 2
		Comparator<Integer> comp2 = (Integer a, Integer b) -> a - b;
		System.out.println(comp2.compare(3, 4));
	}

	Callable<Integer> c = new Callable<Integer>() {
		@Override
		public Integer call() {
			return 100;
		}
	};

}
