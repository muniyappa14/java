//EXCEPTIONAL HANDLING:is one of the mechanism to handle run time errors so that normal flow of application is maintained
class test{
	public static void main(String[] args){
		
		try{
			System.out.println(10/0);
		}
		catch(Exception e){
		System.out.println("nothing is divided by zero");	
		}
	}
}