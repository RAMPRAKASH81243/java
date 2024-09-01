package java1;

public class Exceptions {

	public static void main(String[] args) {
		int i =20;
		int j =0;
		//int nums[] = new int[5];
		//String str  = null;
		try 
		{
			j = 18/i;
			if(j==0)
				throw new ArithmeticException("I don't wnt to print Zero");
			//System.out.println(str.length());
			//System.out.println(nums[1]);
			//System.out.println(nums[5]);
		} 
		catch (ArithmeticException e)
		{
			j = 18/1;
			System.out.println("thats the default output "+ e);
			//System.out.println("Cannot divide by Zero");
		}
		/*
		 * catch(ArrayIndexOutOfBoundsException e) {
		 * System.out.println("Index is out of bounds for given Array length "); }
		 */
		catch(Exception e) {
			System.out.println("Something went worng.. "+e);
		}
		System.out.println(j);
		System.out.println("bye");
	}

}
