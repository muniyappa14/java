//ABSTRACT:process of hiding certain details and showing only essential information to the user
//abstract is a keyword .it does not contain body.
//object cannot be created in abstract.
//
 abstract class abc{
	 abstract void m1();
	 abstract void m2();
 }
 class child extends abc{
	 void m1(){
		 System.out.println("child class");
	 }
	 void m2(){
		 System.out.println("new method in child class");
	 }
	 public static void main(String args[]){
     abc a= new child();
	 child b=new child();
	 a.m1();
	 b.m2();
	 }
 }