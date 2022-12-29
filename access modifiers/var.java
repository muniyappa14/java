// ACCESS MODIFIERS
//variable level modifiers
//public:it access anywhere within the class and outside the class and within the package
class acc{
	   public int a=10;
		private int b=20;
		 int c=25;
		static int d=30;
	public static void main(String[] args){
		 acc a1=new acc();
		 System.out.println(a1.a);
		 System.out.println(c);
	}
}