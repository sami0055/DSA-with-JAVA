package ConditionalLoopProblem;

import java.util.Scanner;

public class AreaOfisoscelesTriangle {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		double area=0.5*b*Math.sqrt((a*a)-(b*b)/4);
         System.out.println(area);
	}

}
