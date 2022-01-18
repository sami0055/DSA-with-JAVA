package Methods;

import java.util.Scanner;

public class Demo {
    static int sum(int a,int b) {
    	int sum=a+b;
    	return sum;
    }
    static String greeting(String str) {
        str="hello "+str;
        return str;
    }
	static int sum() {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum1=a+b;
		return sum1;
	}
	public static void main(String[] args) {
	   
		int r=sum(4,5);
		System.out.println(r);
        String mgs=greeting("sami");
        System.out.println(mgs);
	}

}
