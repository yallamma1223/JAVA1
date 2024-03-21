package com.oops;

class Animal12{  
void eat(){System.out.println("eating...");}  
}
class Dogi extends Animal12{  
void bark(){System.out.println("barking...");}  
}  
class BabyDog extends Dogi{  
void weep(){System.out.println("weeping...");}  
}
class Animal2{  
public static void main(String args[]){  
BabyDog d=new BabyDog();  
d.weep();  
d.bark();  
d.eat();  
}} 
