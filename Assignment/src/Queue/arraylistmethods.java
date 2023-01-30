package Queue;

import java.util.ArrayList;
import java.util.List;

public class arraylistmethods {

	public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add("mandya");
	a.add("manglore");
	a.add("mysore");
	a.add("mysore");
	a.add("mysore");
	a.add("mysore");
	System.out.println(a);
     System.out.println(a.indexOf("mysore"));
     System.out.println(a.lastIndexOf("mysore"));
     //for null insertion we provide object data type
    Object b=a.toArray();
     System.out.println(b);
     
    List c=new ArrayList();
     c= a.subList(0, 4);
     System.out.println(c);
     
     Object d= a.clone();
     System.out.println(d);
     
	}
 
}
