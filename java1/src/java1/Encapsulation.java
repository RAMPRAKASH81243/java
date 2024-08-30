package java1;

class Human{
	 private int age;
	 private String name;
	 
	 public Human() {
		 age =11;
		 name = "bob";
	 }
	public Human(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 
	 
}
public class Encapsulation {

	public static void main(String[] args) {
		Human obj = new Human();
		Human obj1 = new Human(13,"prakash");
		System.out.println(obj.getName()+" - "+obj.getAge());
		System.out.println(obj1.getName()+" - "+obj1.getAge());
		obj.setAge(12);
		obj.setName("Ramprakash");;
		
		System.out.println(obj.getName()+" - "+obj.getAge());
	}

}
