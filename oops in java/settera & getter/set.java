//setter
 public class set{
	private String name;
	 public String setname(String muni){
		 this.name=muni;
		 return muni;
	 }
	 public String getname(){
		 return name;
	 }
	 private double id;
	 public double setid(double id){
		 this.id=id;
		 return id;
	 }
	 public double getid(){
		 return id;
	 }
}

class test{
	public static void main(String[] args){
	set	a=new set();
	a.setname("mandya");
	a.setid(100);
	System.out.println(a.getname());
	System.out.println(a.getid());
	
	}
}