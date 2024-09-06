package java1;
import java.util.*;
public class StreamEx {

	public static void main(String[] args) {
		int size = 100;
		List<Integer> nums = new ArrayList<>(size);
		
		Random ran = new Random();
		for(int i=1;i<=size;i++) {
			nums.add(ran.nextInt(100));
		}
		int sum = nums.stream()
				.map(i -> i*2)
				.reduce(0,(c,e)->c+e);
		int sum2 = nums.stream()
				.map(i -> i*2)
				.mapToInt(i -> i)
				.sum();
		System.out.println(sum + " " + sum2);
	}

}
