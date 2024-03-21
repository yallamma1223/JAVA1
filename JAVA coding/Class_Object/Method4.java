package com.Objects.Classses;

public class Method4 {
String name;
int id;
float amount;
void CreateAccount(String Name, int i, float amt) {
	name=Name;
	id=i;
	amount=amt;
	System.out.println(name+ " " +id+ " "+amount);
}
void DepositeAmount(float amt) {
	amount=amount+amt;
	System.out.println(amt);
	System.out.println( "Deposited amount :" +amount);
}
void CheckBalance() {
	System.out.println("Balance left:" +amount);
}

void Withdraw(float amt) {
	if(amount<amt) {
		System.out.println("Insuffient");
	}
	else {
		amount=amount-amt;
		System.out.println(amt);
	}
}


	public static void main(String[] args) {
Method4 s1= new Method4();
s1.CreateAccount("Seena", 100, 1000.0f);
		s1.DepositeAmount(50000.0f);
		s1.CheckBalance();
		s1.Withdraw(4500);
		s1.CheckBalance();
	}

}
