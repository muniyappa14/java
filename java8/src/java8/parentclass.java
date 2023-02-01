package java8;

 interface parent1 {

	void m1();
	void m2();
 }
  
class child1 implements parent1{
	public void m1() {
		System.out.println("child1 m1 method");
	};
	public void m2() {
		System.out.println("child1 m2 method");
	};
	
}
class child2 implements parent1{
	public void m1() {
		System.out.println("child2 implements parent");
	};
	public void m2() {
		System.out.println("child2 is dubakor");
	};
	
}
class parentclass{
	public static void main(String[] args) {
	child1	a=new child1();
	a.m1();
	a.m2();
	
	child2 b=new child2();
	b.m1();
	b.m2();
	}
}


