package com.oops;
public class Employee{  
	
	    private float salary = 40000;

	    public float getSalary() {
	        return salary;
	    }
	}

	class Programmer extends Employee {
	    int bonus = 10000;

	    public static void main(String args[]) {
	        Programmer p = new Programmer();
	        System.out.println("Programmer salary is:" + p.getSalary());
	        System.out.println("Bonus of Programmer is:" + p.bonus);
	    }
	}
	
