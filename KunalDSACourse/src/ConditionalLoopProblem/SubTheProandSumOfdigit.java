package ConditionalLoopProblem;

import java.util.Scanner;

public class SubTheProandSumOfdigit {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	int count=0;
	int sum=0;
	int pro=1;
	int sub;
	int r;
	while(n>0) {
		r=n%10;
		sum=sum+r;
		pro=pro*r;
		n=n/10;
	}
	System.out.println(pro-sum);

	}

}
