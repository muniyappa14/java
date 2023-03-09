//functional interface :has only one abstract method.
//to achieve single abstract method we are using @FI

package java8;
@FunctionalInterface
interface testing{
 void add(int a,int b);
}
class funInter{
	public static void main(String[] args) {
		testing i=(int a,int b)->{
		System.out.println(a+b);
		};
		i.add(258, 25);
		
	}
}
