package java1;

@FunctionalInterface
interface A
{
	void show();
}

/*
 * class B implements A { public void show() { System.out.println("in Show"); }
 * }
 */
public class F_interface {

	public static void main(String[] args) {
		A obj = new A() {
			 public void show() 
			 { 
				 System.out.println("in Show");
			 }
		};
		obj.show();
	}

}
