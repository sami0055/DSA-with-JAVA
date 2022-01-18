package ConditionalLoopProblem;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base and height: ");
		int b=sc.nextInt();
		int h=sc.nextInt();
	    double area=(0.5*h*b);
		System.out.println(area);

	}

}
