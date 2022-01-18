package ConditionalLoopProblem;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int first=0;
		int second=1;
		int n=sc.nextInt();
		int count=2;
		int fibo=0;
		System.out.println(first+"\n"+second);
		while(count<=n) {
		   fibo=first+second;
		   first=second;
		   second=fibo;
		   
		   System.out.println(fibo);
		   count++;
		}
	

	}

}
