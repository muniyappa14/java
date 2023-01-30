package asignment;

import java.util.ArrayList;
import java.util.Collections;

public class p71 {
//write a program to reverse arraylist in java.
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(9);
		a.add(8);
		a.add(7);
		a.add(6);
		System.out.println(a);
		Collections.reverse(a);
		System.out.println(a);

		

	}

}
