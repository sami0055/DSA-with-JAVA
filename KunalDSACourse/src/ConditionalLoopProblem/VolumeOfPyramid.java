package ConditionalLoopProblem;

import java.util.Scanner;

public class VolumeOfPyramid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int b=sc.nextInt();
		int h=sc.nextInt();
		double V=(l*b*h)/3;
		System.out.println(V);

	}

}
