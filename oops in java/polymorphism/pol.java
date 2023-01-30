//POLYMORPHISM : variables ,methods ,and objects acts as different form
class account{
	public void m1(){
		System.out.println("welcome to bank");
	}
}
class saving_account extends account{
	public void m1(){
		System.out.println("savings account");
	}
}
 class current_account{
	 public void m1(){
		System.out.println("current account");
	}
 }
 
 class bank{
	 public static void main(String[] args){
	account	 a=new account();
	saving_account b= new saving_account();
	current_account c=new current_account();
	b.m1();
	a.m1();
	c.m1();
	 }
 }