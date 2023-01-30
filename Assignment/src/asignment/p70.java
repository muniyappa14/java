package asignment;
import java.util.ArrayList;
//write a program to convert linkedlist to arraylist.
import java.util.LinkedList;

public class p70 {

	public static void main(String[] args) {
	LinkedList	a=new LinkedList();
       
	a.add(101);
	a.add(1033);
	//System.out.println(a);
	ArrayList   b=new ArrayList(a);
	System.out.println(b);
	
	

	}

}
