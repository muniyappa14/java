//WAP to print the numbers between 1 to 100 which is divisble by 3 and 5 and both
class loop{
	public static void main(String[] args){
		for(int i=0;i<=100;i++){
			if (i%3==0 && i%5==0){
             System.out.println(i);			
			}
		}
		for (int a=0;a<=100;a++){
			if(a%3==0){
			System.out.println(a +"divisble by 3");
			}
		}
				
		for(int b=0;b<=50;b++){
		 if(b%5==0){
			System.out.println(b + "is divided b 5");
				}
			}
			
				
		
	}
}