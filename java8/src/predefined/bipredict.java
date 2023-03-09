package predefined;
//for passing the double values.we are using BiPredicate.
import java.util.function.BiPredicate;

public class bipredict {
public static void main(String[] args) {
    BiPredicate<Integer,Integer>  a=(c,d)->{return c>d;};
    System.out.println(a.test(35, 30));
}
}
