package Methods;

import java.util.Arrays;

public class VarArgs {

	public static void main(String[] args) {
	fun(3,4,5,6,7,7,8,4,4,34,3);
		multiple(3,4,"Samiul alim");

	}
	static void multiple(int a ,int b,String ...v)
	{
		System.out.println(Arrays.toString(v));
	}
    static void fun(int ...V) {
    	System.out.println(Arrays.toString(V));
    }
}
