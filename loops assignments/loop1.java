// loops assignments
//WAP RO print first 5 values which are divisible by 2,3,5
//nested if statements are used
class loop{
	public static void main(String[] args){
		for ( int i=0;i<=250;i++){
			 if (i%2==0){
				 if(i%3==0 && i%5==0){
					 System.out.println(i);
				 }
			 }
			
		}
	}
}