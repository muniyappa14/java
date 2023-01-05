//setter and getter
public class set1{
	private int id;
	public void setid(int id){
		this.id=id;
		
	}
	public int getid(){
		return id;
	}
}
 class test1 {
 public static void main(String[] args){
	set1 a=new set1();
	a.setid(101);
	System.out.println(a.getid());
 }
 }