package java8;

 interface powerstar{
 default void a1 () {
	 System.out.println("default keyword is using");
 }
 default void a2() {
	 System.out.println("default method");
 }
 }
 class defaultm1 implements powerstar{
	 public static void main(String[] args) {
		 defaultm1 b= new defaultm1();
		b.a1();
		b.a2();
	}
 }