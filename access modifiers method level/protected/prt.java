//PROTECTED:it can be accessible within same package in different class
//it cannot be accessed different package
package pack1;
class prt{
	public static void main(String[] args){
		prt a=new prt();
		a.p1();
	}
	protected static void p1(){
		System.out.println("protected method");
	}
}