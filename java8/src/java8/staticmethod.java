package java8;

 interface staticmethod1 {
   static void m1() {
	   System.out.println("no need to implements");
   }
  static void m2() {
	  System.out.println("for static method");
  }
}

class staticmethod implements staticmethod1{
	static void m1() {
		System.out.println("calling the m1 methods");
	};
	static void m2() {
		System.out.println("call m2 ");
	};
	public static void main(String[] args) {
		staticmethod1.m1();
		staticmethod1.m2();
		
	staticmethod	a=new staticmethod();
	a.m1();
	a.m2();
	
	}
}
