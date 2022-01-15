package ConditionalStatement;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int first=0,second=1;
		int count=2;
		int fib = 0;
		while(count<=n) {
			fib=first+second;
			first=second;
			second=fib;
			count++;
		}
        System.out.println(fib);
	}

}
