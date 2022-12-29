class loop{
	public static void main(String[] args){
		int i=5678;
		int reminder=0;
		int result=0;
		while(i!=0){
			reminder=i%10;
			result=result*10+reminder;
			i=i/10;
			System.out.println(result);
		}
	}
  }