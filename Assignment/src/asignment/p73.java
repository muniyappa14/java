package asignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//how to synchronise arraylist in java.
public class p73 {

	public static void main(String[] args) {
		
	    ArrayList<String> fruitList = new ArrayList<String>();  
	    
        fruitList.add("Mango");  
        fruitList.add("Banana");  
        fruitList.add("Apple");  
        fruitList.add("Strawberry");  
        fruitList.add("Pineapple");  
        
         Collections.synchronizedList(fruitList);  
        synchronized (fruitList) {  
            Iterator <String> itr = fruitList.iterator(); 
            //hasNext is a methhod.for iterating.
            while (itr.hasNext()) {  
                System.out.println(itr.next());  
            }  
       
	}

}
	}
