package java1;
import java.io.*;
import java.util.Scanner;
public class User_Input {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter the number");
//		InputStreamReader in = new InputStreamReader(System.in);
//		BufferedReader bf = new BufferedReader(in);
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(num); 
		
		sc.close();
	}

}
