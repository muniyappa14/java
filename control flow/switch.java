//switch:to check and executes the multilple conditions
//break keyword used after every case
class switchst{
	public static void main(String[] args){
		String day="saturday";
		switch(day){
			case "sunday":
			System.out.println("day is sunday");
			break;
			case "monday":
			System.out.println("day is monday");
			break;
			default :
			System.out.println("out of range");
			break;
		} 
	}
}