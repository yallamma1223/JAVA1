package com.polymerphism;
//Bank is a class that provides a method to get the rate of interest. However, the rate of interest may differ according to banks. For example, SBI, ICICI, and AXIS banks are providing 8.4%, 7.3%, and 9.7% rate of interest.

class  Bank{
	float getrateofintered() {
		return 0;
	}
}
class SBI extends Bank{
	float getrateofintered() {
return 7.0f;
}
}

class ICIC extends Bank{
	float getrateofintered() {
		return 8.0f;

	}
}

class AXIS extends Bank{
	float getrateofintered() {
		return 8.0f;
	}
}


public class ploy2 {
	
	public static void main(String[] args) {
		Bank b;
		b= new AXIS();
System.out.println("the interset on bNK" + b.getrateofintered());
 b= new ICIC();
System.out.println("the interset on bNK" + b.getrateofintered());

 b= new SBI();
System.out.println("the interset on bNK" + b.getrateofintered());

	}

}
