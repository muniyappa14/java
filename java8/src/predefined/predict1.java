package predefined;
import java.util.function.Predicate;
public class predict1 {

	public static void main(String[] args) {
		Predicate<Integer> a=(b)->{return b<1000;};
		System.out.println(a.test(999));
}
	}
//predicate function:we pass wrapper class as data type.
//it contains inbuilt .test(); method for to receive arguments.
//import the predicate function package.
//we predicate keyword compulsory.
