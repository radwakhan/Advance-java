package JavaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeQuestion {
	public static void main(String[] args) {
//		List<Integer> data = Arrays.asList(10, 15, 20, 25, 30, 11, 17, 16);
//		ArrayList<Integer> list = new ArrayList<>();
//		list.addAll(data);
//		list.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.println(n));

//		program 2
//		List<String> data2 = Arrays.asList("Amit", "ravi", "vikas", "Ashok", "Rahul");
//		ArrayList<String> list = new ArrayList<>();
//		list.addAll(data2);
//		list.stream().filter(n -> n.startsWith("A")).forEach(n -> System.out.println(n));

//		program 3
//
//		List<Integer> data3 = Arrays.asList(10, 60, 45, 90, 30, 24, 50, 76);
//		ArrayList<Integer> list3 = new ArrayList<>();
//		list3.addAll(data3);
//		list3.stream().filter(n -> n >= 50 && n <= 60).forEach(n -> System.out.println(n));

//		program 4
//		List<String> data4 = Arrays.asList("Amit", "ravi", "vikas", "Ashok", "Rahul");
//		ArrayList<String> list4 = new ArrayList<>();
//		list4.addAll(data4);
//		list4.stream().filter(n -> n.length() > 4).forEach(n -> System.out.println(n));

//		program 5
		List<String> data5 = Arrays.asList("Amit", "ravi", null, "vikas", null, "Ashok", "Rahul");
		ArrayList<String> list5 = new ArrayList<>();
		list5.addAll(data5);
//		list5.stream().filter(n -> n != null).forEach(n -> System.out.println(n));

//		program 6
		List<Integer> data6 = Arrays.asList(10, 15, 20, 25, 30, 11, 17, 16);
		ArrayList<Integer> list6 = new ArrayList<>();
		list6.addAll(data6);
//		list6.stream().filter(n -> n % 2 != 0).forEach(n -> System.out.println(n));

//		program 7
		List<Integer> data7 = Arrays.asList(10, 15, 20, 25, 30, 11, 17, 16);
		ArrayList<Integer> list7 = new ArrayList<>();
		list7.addAll(data7);
//		list7.stream().filter(n -> n % 5 != 0).forEach(n -> System.out.println(n));

//		program 8
		List<String> data8 = Arrays.asList("Amit", "ravi", "", "vikas", "", "Ashok", "Rahul");
		ArrayList<String> list8 = new ArrayList<>();
		list8.addAll(data8);
//		list8.stream().filter(n -> n != "").forEach(n -> System.out.println(n));  //can use isempty or length==0

//		program 9
		List<Integer> data9 = Arrays.asList(10, 20, 20, 30, 30);
		ArrayList<Integer> list9 = new ArrayList<>();
		list9.addAll(data9);
//		list9.stream().distinct().filter(n -> n > 20).forEach(n -> System.out.println(n));

//		program 10

		List<String> data10 = Arrays.asList("Amit", "rovi", "vikas", "", "Ashok", "Rahul");
		ArrayList<String> list10 = new ArrayList<>();
		list10.addAll(data10);
		list10.stream().filter(n -> n.contains("o")).forEach(n -> System.out.println(n));

//		program 11
		List<Integer> data11 = Arrays.asList(10, 20, 20, 30, 30);
		ArrayList<Integer> list11 = new ArrayList<>();
		list11.addAll(data11);
		list11.stream().filter(n -> n % 2 == 0).filter(n -> n > 15).forEach(n -> System.out.println(n));

	}
}
