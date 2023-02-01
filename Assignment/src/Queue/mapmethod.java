package Queue;

import java.util.HashMap;
import java.util.Iterator;
//for adding using put(args,key value) method.
//keySet():it is used to show only keys .
//entrySet():it shows the entered, key value pairs.
//containsKey:it shows where the key object is present or not.
//remove():it used to remove the specific keys.
public class mapmethod {

	public static void main(String[] args) {
	HashMap a=new HashMap();
	a.put(100,"ids");
	a.put(101, "ids");
	a.put("muni", 17);
	a.put(102, "ids");
	a.put("ids", 104);
	System.out.println(a);

	System.out.println(a.size());
	
	System.out.println(a.keySet());
	
	System.out.println(a.entrySet());
	

	System.out.println(a.containsKey(1000));
	
	System.out.println(a.remove("muni"));
	
	//a.clear();
	//System.out.println(a);
	
//	for(Object ele : a.entrySet()) {
	//	System.out.println(ele);
//	}
	
	//Iterator  b=a.entrySet().iterator();
	//while(b.hasNext()) {
	//	System.out.println(b.next());
	
	 HashMap   b=new HashMap();
	b.putAll(a);
	System.out.println(b);
	
	}
	
	


}
