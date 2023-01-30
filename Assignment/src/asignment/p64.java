package asignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//write a program to print array to list.
public class p64 {

	public static void main(String[] args) {
 int[] a= {10,20,30};
    ArrayList  b= new ArrayList();
    //b=Arrays.asList(a);
   // Collections.addAll(b, a);
    System.out.println(b);
    
    for( int ele:a) {
    	b.add(ele);
    }
    System.out.println(b);
	}

}
