//what is palindrome in java give an example
//a string or a number is said to be palindrome just if the reverse of stiring or number is same 
//example:sts  or tmt 

class test{
	public static void main(String[] args){
		
		/*StringBuilder b= new StringBuilder ("muniyappa");
		 StringBuilder c=b.reverse();
		 if(b==c){
			 System.out.println(" it is palindrome");
		 }
		System.out.println(b);*/
		 
  int r,sum=0,temp;    
  int n=454;//It is the number variable to be checked for palindrome  
  
  temp=n;    
  while(n>0){ 
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
     }  
     } 