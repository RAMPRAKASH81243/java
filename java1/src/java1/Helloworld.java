package java1;

class Student{
	int rollno;
	String name;
	int marks;
	public void show() {
		System.out.println(rollno+": "+name+" - "+marks);
	}
	public static void show1() {
		System.out.println(" is static varible");
	}
}

public class Helloworld {
	public static void main(String[] args)
	{
		Student s1 = new Student();
		s1.rollno = 1;
		s1.name = "Ram";
		s1.marks = 77;
		
		Student s2 = new Student();
		s2.rollno = 2;
		s2.name = "Prakash";
		s2.marks = 53;
		
		Student s3 = new Student();
		s3.rollno = 3;
		s3.name = "Rani";
		s3.marks = 65;

		s1.show();
		Student.show1();
		/*for(int i=0;i<students.length;i++) {
			System.out.println(students[i].rollno+": "+students[i].name+" - "+students[i].marks);
		}
		
		  for(Student stud : students) {
		  System.out.println(stud.rollno+": "+stud.name+" - "+stud.marks); 
		  }*/
		 
	}
}
