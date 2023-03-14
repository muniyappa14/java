package streamapi;

import java.util.ArrayList;
import java.util.List;

public class streamApi3 {

	public static void main(String[] args) {
		List<Integer> emp_id=new ArrayList();
		emp_id.add(100);
		emp_id.add(101);
		emp_id.add(102);
		emp_id.add(103);
		emp_id.add(104);
		emp_id.add(105);
		emp_id.add(106);
		emp_id.add(107);
		emp_id.add(108);
		emp_id.add(109);
		emp_id.add(110);
		
		
		for(int i=0;i<=emp_id.size()-1;i++) {
			if(emp_id.get(i)<105) {
				System.out.println(emp_id.get(i));
			}
		}
	

	}

}
