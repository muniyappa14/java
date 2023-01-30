//how can we get a character array from string?
import java.util.*;
class test{
	public static void main(String[] args){
		String a="darshan";
		char[] b=new  char[a.length()];
		for(int i=0;i<a.length();i++){
			b[i]=a.charAt(i);
		}
		/*int i=0;
		while(i<b.length){
			System.out.println(b[i]);
			i++;
		}*/
		//for each method
		for( char ele:b){
			System.out.println(ele);
		}
	}
}
	