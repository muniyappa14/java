//METHOD OVERRIDING:
 public class method{
	public void m1(){
		System.out.println("m1 main method");
	}
}
class m2 extends  method {
	public void m1(){
		System.out.println("m1 child mthod");
	}
	public static void main(String[] args){
		 method a=new method();
		m2 b=new m2();
		 a.m1();
		 b.m1();
		// System.out.println();
	}
}
