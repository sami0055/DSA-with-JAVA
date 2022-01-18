package ConditionalLoopProblem;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int p=sc.nextInt();
		int result=1;
		if(n>1 && p==0) {
			result=1;
		}
		else if(n==0 && p>=1) {
			result=0;
		}
		else {
			for(int i=1; i<=p; i++) {
				result=result*n;
			}
		}
      System.out.println(result);
	}

}
