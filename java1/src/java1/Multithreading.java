package java1;

class D /* extends Thread */ implements Runnable{
	public void  run() 
	{
		for(int i=1;i<=5;i++) 
		{
			System.out.println("hi");
			try {
				Thread.sleep(4);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class E /* extends Thread */ implements Runnable{
	public void  run() 
	{
		for(int i=1;i<=5;i++) 
		{
			System.out.println("hello");
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Multithreading {

	public static void main(String[] args) {
		/*
		 * D obj1 = new D(); E obj2 = new E();
		 * 
		 * System.out.println(obj1.getPriority());
		 * obj2.setPriority(Thread.MIN_PRIORITY);
		 * System.out.println(obj2.getPriority()); obj1.start(); try { Thread.sleep(4);
		 * } catch (InterruptedException e) { e.printStackTrace(); } obj2.start();
		 */
		Runnable obj1 = new D();
		Runnable obj2 = new E();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
	}

}
