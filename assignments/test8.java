//WAP to print the given 3 numbers in ascending order
// ascending is inbuilt method
//arrays.sort()
//then convert arrays to struing to print the statement

import java.util.Arrays;
class test{
	public static void main(String[] args){
		int arr[] = {46,47,12,23,34,56,90};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
}