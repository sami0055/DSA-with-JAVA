package ConditionalLoopProblem;

import java.util.Scanner;

public class CalculateAverageOfn {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		
		double sum=0;
		for(int i=0; i<n; i++) {
			sum=sum+a[i];
		}
		
		double avg=sum/n;
		System.out.println(avg);
		

	}

}
