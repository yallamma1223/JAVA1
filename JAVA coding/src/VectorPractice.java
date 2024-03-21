import java.util.*;

public class VectorPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Vector v =new Vector();
 //size no of elements in the list
 //capity capacity of list
 v.add("yadagiri");
 v.add("shiva");
 /*v.add("yamaha");
 v.add("jiju");
 v.add(0, "seena");
 v.add("yadagiri");
 v.add("yadagiri");
 v.add("yadagiri");
 v.add("yadagiri");
 v.add("null");
 v.add("null");*/
 Vector v1 =new Vector();
 v1.add("yallu");
 v1.add("seena");
 for (int i =0; i<v1.size(); i++) {
	 v.add(v1.get(i));
 }
 System.out.println(v);
 System.out.println(v1);

 System.out.println(v.size());

 System.out.println(v.capacity());

 
}

}
