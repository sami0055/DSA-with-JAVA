package ConditionalLoopProblem;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length and breadth ");
		int l=sc.nextInt();
		int b=sc.nextInt();
		int area=l*b;
		System.out.println(area);
	}

}
