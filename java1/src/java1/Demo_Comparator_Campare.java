package java1;
import java.util.*;

class Pepole 
{
	int age;
	String name;
	
	public Pepole(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
}
	


public class Demo_Comparator_Campare {

	public static void main(String[] args) {
    	Comparator<Integer> com=(i, j) -> {
			if(i%10 >j%10)
				return 1;
			else
				return -1;
		};	
    	
    	List<Integer> nums= new ArrayList<>();
    	nums.add(43);
    	nums.add(31);
    	nums.add(72);
    	nums.add(29);
    	
    	Collections.sort(nums,com);;
    	System.out.println(nums);
    	
    	
    	Comparator<Pepole> c = (i,j) -> i.age > j.age ? 1:-1;
		 
    	List<Pepole> studs= new ArrayList<>();
    	studs.add(new Pepole(21,"Navin"));
    	studs.add(new Pepole(12,"John"));
    	studs.add(new Pepole(18,"Parul"));
    	studs.add(new Pepole(20,"Kiran"));
    	
    	Collections.sort(studs,c);
    	for(Pepole s:studs)
    		System.out.println(s);
    	

	}

}
