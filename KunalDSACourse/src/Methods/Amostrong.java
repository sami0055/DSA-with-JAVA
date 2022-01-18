package Methods;

import java.util.Scanner;

public class Amostrong {

	static boolean isArmstrong(int n) {
		int original=n;
		int sum=0;
		int r;
		while(n>0) {
			r=n%10;
			sum=sum+r*r*r;
			n=n/10;
		}
		return sum==original;
	}
	public static void main(String[] args) {
		
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
//      boolean ans=isArmstrong(n);
//      System.out.println(ans);
    for(int i=1; i<=n; i++) {
    	if(isArmstrong(i)) {
    		System.out.println(i+" ");
    	}
    }
	}

}
