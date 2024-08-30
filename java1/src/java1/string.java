package java1;

public class string {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("navin");
		sb.append(" Reddy");
		sb.deleteCharAt(2);
		sb.insert(4," java ");
		System.out.println(sb);
		System.out.println();
	}

}
