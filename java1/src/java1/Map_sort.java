package java1;
import java.util.*;
import java.util.stream.Stream;
public class Map_sort {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(4,6,7,3,8);
		int result =nums.stream()
				.filter(n -> n%2==0)
				.map(n -> n*2)
				.reduce(0, (c,e) -> c+e);
		Stream<Integer> sortedvalues =nums.stream()
				.filter(n -> n%2==0)
				.sorted();
		System.out.println(result);
		sortedvalues.forEach(n -> System.out.println(n));
	}

}
