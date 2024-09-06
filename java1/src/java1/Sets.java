package java1;
import java.util.*;
public class Sets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Set<Integer> nums=new HashSet<Integer>();
		Set<Integer> nums=new TreeSet<Integer>();
    	nums.add(68);
    	nums.add(52);
    	nums.add(87);
    	nums.add(24);
    	
    	Iterator<Integer> values = nums.iterator();
    	while(values.hasNext()) {
    		System.out.println(values.next());
    	}
//    	for(Object n:nums)
//    	{
//    		System.out.println(n);	
//    	}
	}

}
