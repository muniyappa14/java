package streamapi;
//for passing the multiple values.
import java.util.ArrayList;

public class stream5 {

	public static void main(String[] args) {
		ArrayList<streamApi4>  emp=new ArrayList();
		emp.add(new streamApi4("muni",101,25000));
		emp.add(new streamApi4("chiru",102,26000));
		emp.add(new streamApi4("darshu",103,27000));
		emp.add(new streamApi4("manjaa",104,28000));
		
		emp.forEach(ab->{System.out.println(ab.id + " "+ab.name +" "+ ab.salary);});
		

	}

}
