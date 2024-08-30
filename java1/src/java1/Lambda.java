package java1;

@FunctionalInterface
interface B
{
	//void show(int );
	int add(int i, int j);
}
public class Lambda {

	public static void main(String[] args) {
		/*
		 * B obj = (int ) -> System.out.println("in Show " + i); obj.show(5);
		 */
		B obj = (int i, int j) -> i+j;
	
		int result = obj.add(9,7);
		System.out.println(result);
	}

}
