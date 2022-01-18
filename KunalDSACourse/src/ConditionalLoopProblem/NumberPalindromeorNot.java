package ConditionalLoopProblem;

import java.util.Scanner;

public class NumberPalindromeorNot {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   int temp=n;
	   int r,sum=0;
	   while(temp>0) {
		   r=temp%10;
		   sum=sum*10+r;
		   temp=temp/10;
		   
	   }
	   if(sum==n) {
		   System.out.println("Palindrome");
	   }
	   else {
		   System.out.println("Not Palindrome");
	   }
	   

	}

}
