package Methods;

public class Shadowing {
     static int x=90;
	 public static void main(String[] args) {
		 System.out.println(x);//90
		int x;
		x=49;//the class variable at line 4 is shadowed by this
	System.out.println(x);//49
	fun();

	}
     static void fun() {
    	 System.out.println(x);
     }
}
