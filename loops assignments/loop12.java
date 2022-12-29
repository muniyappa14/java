//WAP to print reverse of digits of numbers
// store two values reminder,result ,1st take mod of 10,multipl result*10+reminder.3rd number a=a/10 
class loop{
	public static void main(String[] args){
		int a=123;
		int reminder=0;
		int result=0;
		while(a!=0){
			reminder=a%10;
			result=result*10+reminder;
		   // System.out.println(result);
			a=a/10;
			}
		System.out.println(result);
	}
}