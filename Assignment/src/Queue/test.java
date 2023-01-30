package Queue;

import java.util.HashSet;

public abstract class test {

	public static void main(String[] args) {
	  HashSet a=new HashSet();
   a.add(10);
   a.add("twenty");
   a.add("true");
   a.add(45.5);
  
   System.out.println(a);
   //duplicate values does not allows
   
   HashSet b=new HashSet();
   b.add(10);
   b.add(10);
   b.add(10);
   b.add(120);
   System.out.println(b);
   
   a.addAll(b);//adding the both sets
   System.out.println(a);
   
// b.removeAll(b);
 //System.out.println(b);
 a.retainAll(b);
 System.out.println(a);
 
	}
}
