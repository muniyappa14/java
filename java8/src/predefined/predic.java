package predefined;
import java.util.function.Predicate;
public class predic {

	public static void main(String[] args) {
		Predicate<Integer> i=(a)->{return a>100;};
		System.out.println(i.test(10));
	}

}
