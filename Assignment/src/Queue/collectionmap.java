package Queue;

import java.util.HashMap;

public class collectionmap {

	public static void main(String[] args) {
		HashMap a=new HashMap();
		a.put(100,"ids");
		a.put(101, "ids");
		a.put("muni", 17);
		a.put(102, "ids");
		a.put("ids", 104);
		
		a.replace(100,"pp");
		System.out.println(a);
		
		//a.remove();
		//System.out.println(a);
		

		System.out.println(a.containsValue(104));
		
		System.out.println(a.get("muni"));
		
		

	}

}
