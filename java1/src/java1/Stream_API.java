package java1;
import java.util.*;
public class Stream_API {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(4,6,7,3,8);
		
		/*
		 * Stream<Integer> s1 = nums.stream(); Stream<Integer> s2 = s1.filter(n -> n%2
		 * == 0); Stream<Integer> s3 = s2.map(n -> n*2); int result = s3.reduce(0, (c,e)
		 * -> c+e);
		 */
		int result =nums.stream().filter(n -> n%2==0).map(n -> n*2).reduce(0, (c,e) -> c+e);
		System.out.println(result);
		nums.forEach(n -> System.out.println(n));
		/*int sum = 0;
		for(int n:nums) {
			if(n%2==0) {
			
				sum = sum + n;
			}
		}
		System.out.println(sum);*/
	}

}
