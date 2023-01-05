//FINAL:it can  be accessed in class
//cannot be accessed outside the package
package pack1;
 class fin{
	public static void main(String[] args){
		fin a=new fin();
		a.p1();
	}
	final static void p1(){
		System.out.println("final method");
	}
}