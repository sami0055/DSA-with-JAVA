package ConditionalLoopProblem;

import java.util.Scanner;

class ncrNpr{
	double fact(double n){
		int i;
		double fact=1;
		for( i=1; i<=n; i++) {
			fact=fact*i;
		}
		return fact;
	}
	
	double permutation(int n,int r) {
		double per=fact(n)/fact(n-r);
		return per;
	}
	double combination(int n,int r) {
		double com=fact(n)/(fact(n-r)*fact(r));
		return com;
		
	}
}
public class NCRandNPR {

	public static void main(String[] args) {
	ncrNpr p=new ncrNpr();
	System.out.println("Enter the value of n and r");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int r=sc.nextInt();
	if(n>=r) {
		System.out.println("NPR"+p.permutation(n, r));
		System.out.println("NCR"+p.combination(n, r));
	}
	else {
		System.out.println("Value of n should be greater than or equal to r");
	}

	}

}
