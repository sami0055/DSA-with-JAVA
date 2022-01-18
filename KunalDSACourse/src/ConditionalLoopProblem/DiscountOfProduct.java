package ConditionalLoopProblem;

import java.util.Scanner;

public class DiscountOfProduct {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("What is the market price");
		double marketprice=sc.nextDouble();
	    System.out.println("Enter discount in percientage: ");
	    double dis=sc.nextDouble();
	    double discountPrice=marketprice-marketprice*(dis/100);
	    System.out.println(discountPrice);
		

	}

}
