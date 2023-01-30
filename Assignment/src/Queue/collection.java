package Queue;
//Arraylist methods
import java.util.ArrayList;

public class collection {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		System.out.println(a);
		a.isEmpty();//to check whether array is empty or not.
		System.out.println(a.isEmpty());
	//a.size();//to check the size of an array
		System.out.println(a.size());
		//a.contains:it checks the specified element present in array list.
		//conatinsAll:we passing the whole object
		System.out.println(a.contains(10));
		
		//remove:to remove the specific element.through passing index
		//a.remove(0);
		//System.out.println(a);
		
		//retainAll():
		a.retainAll(a);
		System.out.println(a);
		
		//clear():to remove all the elements.
		//a.clear();
		//System.out.println(a);
		
	//get:to get the value of specified index
		System.out.println(a.get(1));
		
		//set:to change the value in array using index concept.
		a.set(0, 25);
		System.out.println(a);

	}
}
