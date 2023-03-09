package java8;
@FunctionalInterface
 interface fun1 {
 public void m1(String a);
}

class fun{
	public static void main(String[] args) {
		fun1 b=(a)->{System.out.println(a);};
		b.m1("hello java");
		b.m1("loojii");
	}
}