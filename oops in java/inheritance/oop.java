//OBJECT ORIENTED PROGRAMMING IN JAVA 
//1.INHERITANCE 2.ENCAPSULATION 3.ABSTRACT 4.POLYMORPHISM 5.METHOD OVERLOADING
//INHERITANCE:inheriting the existing functionality and add new features.
 class parent{
	public static void m1(){
		System.out.println("creating m1 method");
	}
	public static void m2(){
		System.out.println("creating m2 method");
	}
}

class child extends parent{
	public static void main(String[] args){
	 parent a=new parent();
	  a.m1();
	  a.m2();
	   child b=new child();
	   b.m1();
	   b.m2();
	 System.out.println(a);
	 System.out.println(b);
	}
}