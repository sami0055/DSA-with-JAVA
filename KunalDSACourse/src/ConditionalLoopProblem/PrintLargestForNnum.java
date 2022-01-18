package ConditionalLoopProblem;

import java.util.Scanner;

public class PrintLargestForNnum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		int max=0;
		while(true) {
			n=sc.nextInt();
			if(n>max)
				max=n;
			if(n==0)
				break;
		}
		System.out.println(max);

	}

}
