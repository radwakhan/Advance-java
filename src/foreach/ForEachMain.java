package foreach;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ForEachMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = new int[] { 12, 23, 34, 45, 65, 67 };
//		List<Integer> listdata=Arrays.stream(data).boxed().toList();
		List<Integer> listdata = Arrays.stream(data).boxed().collect(Collectors.toList());
//		listdata.forEach((item)->System.out.println(item));
		listdata.forEach(System.out::println);
//		in stream it will do hashing so we will do boxing
	}

}
