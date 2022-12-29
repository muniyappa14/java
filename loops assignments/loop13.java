//WAP to print fibonocci series of number 17
//sum of last two numbers 
class loop{
	public static void main(String[] args){
		int i=17;//taking this number as reference
		int a=0;
		int b=1;
		int j=1; //initialization value
		System.out.println(a);
		System.out.println(b);
		while(j<=i-2){
			int sum=a+b;
			a=b;
			b=sum;
			j++;
			System.out.println(sum);
		}
		}
}
