//WAP to factors of 24 using while loop
//WAP TO sum of factors pf 24 using while loop
class loop{
	public static void main(String[] args){
		int i=1;
		int sum=0;
		while (i<=24){
			if(24%i==0){
				sum=sum+i;
				System.out.println( " "+i);
				//factors of 24 
			}
			i++;
		}
					System.out.println(sum);
					//sum of factors of 24

		
	}
}