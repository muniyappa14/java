//how to create an object in java
//using new key word and declaring the type and object name it should be class name
class test{
	int a=10; 
	int b=20;
	static int c=45;
	public static void main(String[] args){
		  test obj=new test();
		  test abc=new test();
		  
		  System.out.println(obj.a);
		  obj.a=12;
		  System.out.println(obj.a);
		  System.out.println(abc.c);
	}
}