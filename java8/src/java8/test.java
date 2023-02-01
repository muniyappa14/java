package java8;
//1.creating an interface.
 interface test1 {
  void m1();
  void m2();
    }
//2.implementing the methods from the interface.
class test2 implements test1{
	
	public void m1() {
		System.out.println("main m1 method");
	}
	public void m2() {
		System.out.println("m2 implement");
	}
	
	
	
}

//creating a object for the iplemented classes.
class test{
	public static void main(String[] args) {
		test2 a=new test2();
		a.m1();
		a.m2();
		
		}
	}
 
