package asignment;

import java.util.HashSet;

public class tak1 {

	public static void main(String[] args) {
		int[] a= {10,10,20,20,10};
	HashSet	b=new HashSet();
	for( int ele:a) {
		b.add(ele);
	
	}
System.out.println(b);
 Object c=b.toArray();
System.out.println(c);

	}

}
