package ConditionalLoopProblem;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int r;
     int sum=0;
    int  temp=n;
     while(temp>0) {
    	r=temp%10;
    	sum=sum+(r*r*r);
    	temp=temp/10;
     }
     if(sum==n)
    	 System.out.println("Armostrong number");
     else
    	 System.out.println("Not armostrong number");
     
	}

}
