package java1;

import tools.VeryAdvCalc;

public class inheritance {

	public static void main(String[] args) 
	{
		VeryAdvCalc obj = new VeryAdvCalc();
		int r1 = obj.add(5, 5);
		int r2 = obj.sub(6, 4);
		int r3 = obj.multi(7, 3);
		int r4 = obj.div(8, 2);
		double r5 = obj.power(4, 2);
		System.out.println(r1 +" "+ r2+" "+ r3+" "+ r4+" "+ r5);
	}

}
