package SwitchStatement;

import java.util.Scanner;

public class NestedSwitchCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int empID;
	    String dept;
	    empID=sc.nextInt();
	    dept=sc.next();
	    switch(empID) {
	    case 1:
	    	System.out.println("Samiul ALim");
	    	break;
	    case 2:
	    	System.out.println("Sami");
	    	break;
	    case 3:
	    	switch(dept) {
	    	case "CSE":
	    		System.out.println("IT dept");
	    		break;
	    	case "Management":
	    		System.out.println("Management dept");
	    		break;
	    		default:
	    			System.out.println("Management dept");	    			
	    	}
	    	break;
	    	default:
	    		System.out.println("Invalid input");
	    }
	}

}
