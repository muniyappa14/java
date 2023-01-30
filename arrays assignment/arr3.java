//inner looping
//How many ways to find duplicate element in an array
//using inner loop and outer loop
//example
class arr{
	public static void main(String[] args){
		int a[]={5,10,15,20,5,20};
		for( int i=0;i<a.length;i++){
			//System.out.println(i);
			for(int j=i+1;j<a.length;j++){
				//System.out.println(j);
				if(a[i]==a[j]&& i!=j ){
					System.out.println(a[i]);
				}
			}
		}
	}
}