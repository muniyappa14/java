package asignment;

import java.util.ArrayList;
import java.util.Collections;

//write a program to sort arraylist in descending order.
public class p67 {

	public static void main(String[] args) {
	ArrayList	  a=new ArrayList();
     a.add(5);
     a.add(10);
     a.add(15);
     a.add(20);
     a.add(25);
     Collections.reverse(a);
     System.out.println(a);

	}

}
