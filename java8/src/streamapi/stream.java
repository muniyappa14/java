package streamapi;

import java.util.ArrayList;
import java.util.stream.Stream;

public class stream {

	public static void main(String[] args) {
	 ArrayList<String>	a= new ArrayList();	
	a.add("muni");
	a.add("chiru");
	a.add("manjaa");
	a.add("drashu");
	a.add("velu");
	a.add("poochi");
	a.add("kavin");
	//System.out.println(a);
	//a.stream().forEach((names)->{System.out.println(names);});
//a.stream()a.filter((names)->{names.startsWith("m");});
//	 long c=a.stream().filter(x->x.contains("z")).count();
	// System.out.println(c);
	Stream d =a.stream().map(ele->ele.concat(" pubg"));
	 d.forEach((ab)->{System.out.println(ab);});

	}

}
