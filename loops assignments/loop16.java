//WAP to check the given number is armstrong number or not
class loop{
	public static void main(String[] args){
		int a=421;
		int reminder=0;
		int result=0;
		int b=a;
		while(a>0){
			reminder=a%10;
			result=reminder*reminder*reminder+result;
			System.out.println(result);
			a=a/10;
		}
		
		if(b==result){
			System.out.println("is a armstrong number");
		
		}
		else{System.out.println("is a not armstrong number");
		}
		
	}
}