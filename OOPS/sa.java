package pack1;
public class sa extends account{
	public void get_balance(){
		System.out.println(getid()+" your minimum balance is "+getmin_balance());
	}
	private double min_balance;
	 public double setmin_balance(double a){
		 this.min_balance=a;
		 return min_balance;
	 }
	public double getmin_balance(){
		return min_balance;
	}
	
}