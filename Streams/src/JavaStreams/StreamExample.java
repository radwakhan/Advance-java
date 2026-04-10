package JavaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> data = Arrays.asList(23, 34, 45, 56, 67, 87);
		ArrayList<Integer> list = new ArrayList<>();
		list.addAll(data);
//		System.out.println(list);
		list.stream().filter(n -> n > 60 && n < 50).forEach((value) -> System.out.print(value + " ")); // inside foreach
																										// we are using
																										// consumer
																										// which will
																										// just accept
																										// the value

	}

}
