package com.Encapsulation;

public class Test2 {
	private long acc_no;  
	private String name,email;  
	private float amount;  
	

	public long getAcc_no() {
		return acc_no;
	}


	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public float getAmount() {
		return amount;
	}


	public void setAmount(float amount) {
		this.amount = amount;
	}


	public static void main(String[] args) {

		Test2 t= new Test2();
		t.setName("Akila");
		t.getName();
		t.setEmail("@akila.com");
		t.getName();
		t.setAcc_no(5265654646l);
		t.getAcc_no()
;
		t.setAmount(543534.45f);
		t.getAmount();
		System.out.println(t.name+ " "+ t.email+ t.acc_no+ t.amount);
		}

}
