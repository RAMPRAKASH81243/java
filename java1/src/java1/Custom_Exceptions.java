package java1;



@SuppressWarnings("serial")
class RamException extends RuntimeException{
	public RamException(String string)
	{
		super(string);
	}
	
}

class C{
	public void show() throws ClassNotFoundException
	{
		
			Class.forName("Custom_Exceptions");
		
	}
}
public class Custom_Exceptions{

	public static void main(String[] args) {
		C obj = new C();
		try {
			obj.show();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		int i =20;
		int j =0;
		try 
		{
			j = 18/i;
			if(j==0)
				throw new RamException("I don't wnt to print Zero");
		} 
		catch (RamException e)
		{
			j = 18/1;
			System.out.println("thats the default output "+ e);
		}
		catch(Exception e) {
			System.out.println("Something went worng.. "+e);
		}
		System.out.println(j);
		System.out.println("bye");

	}

}
