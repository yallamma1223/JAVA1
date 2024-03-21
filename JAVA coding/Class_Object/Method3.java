package com.Objects.Classses;
//Java Program to demonstrate the working of a banking-system  
public class Method3 {
	int Acc_nu;
	String name;
	Float amount;
	
	
void CreatAcoount(int a, String b, float amt) {
	Acc_nu=a;
	name=b;
	amount=amt;
	
	System.out.println(a + " "+ " "+  b+ " " + amt);
}
//Deposite amount

void DepositeAcoount(Float amt) {
	amount = amount+amt;
	System.out.println(amt+ " deposited ");
}
void CheckBalance() {
	System.out.println(amount);
}

void WithdrawAcoount(Float amt) {
	if(amount<amt) {
		System.out.println("Amount is Insuffient");
	}
	else {
	amount=amount-amt;
	System.out.println(amt);
	}
}
	public static void main(String[] args) {
Method3 s1= new Method3();
Method3 s2= new Method3();
Method3 s3= new Method3();
s1.CreatAcoount(12345, "Seena",1000);
s1.DepositeAcoount(500.00f);
s1.CheckBalance();
s1.WithdrawAcoount(677.0f);
s1.CheckBalance();
s1.CreatAcoount(12345, "Seena",1000);
s1.DepositeAcoount(500.00f);
s1.CheckBalance();
s1.WithdrawAcoount(200.0f);
s1.CheckBalance();
	}

}
