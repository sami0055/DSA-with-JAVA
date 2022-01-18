package Methods;

import java.util.Scanner;

public class Q1MinMax {
    static void max(int a,int b,int c) {
    	int max=0;
    	if(a>b&& a>c)
    		max=a;
    	else if(b>a && b>c)
    		max=b;
    	else
    		max=c;
    	System.out.println("Max: "+max);
    }
    
    static void min(int a,int b,int c) {
       int min=0;
    	if(a<b && a<c)
    		min=a;
    	else if(b<a && b<c)
    		min=b;
    	else
    		min=c;
    	System.out.println("Min "+min);
    		
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		max(a,b,c);
		min(a,b,c);

	}

}
