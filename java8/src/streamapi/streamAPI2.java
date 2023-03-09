package streamapi;

import java.util.ArrayList;
import java.util.List;

public class streamAPI2 {

	public static void main(String[] args) {
		List<String> emp=new ArrayList();
		emp.add("muni");
		emp.add("rahul");
		emp.add("chethu");
		emp.add("sanjeev");
		emp.add("chiru");
		emp.add("darshu");
		emp.add("dingrii");
		emp.add("manjuu");
		emp.add("velu");
		emp.add("poochi");
		System.out.println(emp);
		
		for(int i=0;i<=emp.size()-1;i++) {
			if(emp.get(i).startsWith("m")) {
				System.out.println(emp.get(i));
			}
		}
		
		//to UPPERCASE
		emp.forEach(ab->{System.out.println(ab.toUpperCase());});

	}

}
