import java.util.*;

public class VectorPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Vector v =new Vector();
 v.add("seeba");
 System.out.println(v);
 Vector v1 =new Vector();
v1.add("yallu");
v1.add("yallu");
v.addAll(0, v1);
System.out.println(v);
	}}