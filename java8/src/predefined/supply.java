package predefined;
//supplier:
import java.util.function.Supplier;

public class supply {

	public static void main(String[] args) {
		Supplier<Double> a=()->Math.random();
		System.out.println(a.get());

	}

}
