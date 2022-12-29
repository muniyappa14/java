//WAP to print the descending order  for given 3 numbers
 import java.util.*;
class test{
	public static void main(String args[]){
	Scanner input=  	 new Scanner (System.in);
	  System.out.print("enter the first number :");
		int a=input.nextInt();
		 System.out.print("enter the second number :");
		int b=input.nextInt();
		System.out.print("enter the  third number :");
		int c=input.nextInt();
		// a >b >c
		if (a>b && a>c){
			if(c>b){
				System.out.println(a +" "+c +" "+b);
			}
			else if(b>c){
				System.out.println(a +" "+b +" "+c);
			}
		} 
		else if(b>a && b>c){
			if(a>c){
			System.out.println(b +" "+a +" "+c);
			}
			else if (c>a){
				System.out.println(b +""+c+""+a);
			}
		}
		
	}
}