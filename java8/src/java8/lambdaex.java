package java8;
@FunctionalInterface
interface f1{
	 void m2(int a,int b,int c);
}
//lambda expression is used for consizes the code.
class lambdaex{
	public static void main(String[] args) {
	f1	d=(a,b,c)->{System.out.println(a+" "+b+" "+c);};
     d.m2(10, 20, 20);
	}
}