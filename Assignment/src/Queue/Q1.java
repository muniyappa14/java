package Queue;

import java.util.PriorityQueue;

public class Q1 {
  public static void main(String[] args) {
	PriorityQueue    a= new PriorityQueue();
	a.add("java");
	a.add("marathalli");
	a.add("hemanth nagar");
	a.add("pro stack");
	
	//a.remove("pro stack");
	//a.removeAll(a);
	
	
	//poll():it removes the head of the element.
	//head means storing the 1st value in the array list
	//a.poll();
	
	
	//peek():it shows the head of the priority queue.
	//System.out.println(a.peek());
	
	
	//a.clear();
	//System.out.println(a);
	
	
	System.out.println(a.size());
	System.out.println(a.isEmpty());
	
//	System.out.println(a.element());shows the first element.
//	System.out.println(a);
	
	
	for(Object  ele : a) {
		System.out.println(ele);
		
		
	}
	
  }
}
