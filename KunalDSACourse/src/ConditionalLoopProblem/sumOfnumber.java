package ConditionalLoopProblem;

import java.util.Scanner;

public class sumOfnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int n;
		while(true) {
			n=sc.nextInt();
			sum=sum+n;
			if(n==0)
				break;
		}
		System.out.println(sum);

	}

}
