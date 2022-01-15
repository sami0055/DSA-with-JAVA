package ConditionalStatement;

import java.util.Scanner;

public class OccuringNumber {

	public static void main(String[] args) {

     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int x;
     int count=1;
     int c=0;
     int y;
     System.out.println("Which number u want to search: ");
     y=sc.nextInt();
     while(count<=n) {
    	 x=sc.nextInt();
    	 if(x==y) {
    		c++; 
    	 }
    	 count++;
     }
     System.out.println(y+" Occurs "+c+" Times");
     

	}

}
