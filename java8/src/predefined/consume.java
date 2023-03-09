package predefined;
//it only receives the value and does not returns. 
import java.util.function.Consumer;

public class consume {

	public static void main(String[] args) {
		Consumer<Integer> a=(b)->{System.out.println(b);};
          a.accept(20);
	}
}
