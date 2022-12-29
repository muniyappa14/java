//WAP to check the least number 
//comparing the value by index wise
class test{
	public static void main(String[] args){
		int arr []={10,20,30,40,5};
		int least =arr[0];
		for  ( int i=0;i<arr.length;i++){
			if(least>arr[i]){
				least =arr[i];
			}
		}
		System.out.println(least + "its the least number" );
	}
}