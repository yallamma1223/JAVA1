import java.util.*;

public class VectorPractice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Vector v =new Vector();
 v.add("seeba");
 System.out.println(v);
 Vector v1 =new Vector();
v1.add("suma");
v1.add("shiva");
v.addAll(v1);
System.out.println(v);
v.removeAll(v1);
v1.clear();
System.out.println(v1.containsAll(v1));
v.set(0, "basee");
System.out.println(v);
System.out.println(v1.indexOf("seeba"));
 Object[] arr = v1.toArray();
 System.out.println(arr);
	}}