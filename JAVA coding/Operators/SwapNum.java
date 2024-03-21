package Operators;

public class SwapNum {

	public static void main(String[] args) {

		int a=5;
		int b=4;
		System.out.println("original value:"+  a +","+ b);

		a=a+b; //9 5+4
		b= a-b; //1 9-4=5
		a=a-b; // 9-5=4
	System.out.println("After swaping:" + a + " , " + b);
	}

}
