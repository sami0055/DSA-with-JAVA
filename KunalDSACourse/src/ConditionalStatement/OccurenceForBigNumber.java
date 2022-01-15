package ConditionalStatement;

import java.util.Scanner;

public class OccurenceForBigNumber {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")		
		Scanner sc=new Scanner(System.in);
		
	System.out.println("Enter a Number : ");
	int n=sc.nextInt();
	
	int temp=n;
	int r;
	int count=0;
	
	while(temp!=0) {
		r=temp%10;
		if(r==5)
			count++;
		temp=temp/10;
			
	}
     System.out.println(count);
	}

}
