// wap to count number of objects created

class Assgn{
	static int count=0;
	Assgn(){
		count++;
	}

}
class Test{
	public static void main(String args[]){
		Assgn o1=new Assgn();
		Assgn o2=new Assgn();
		Assgn o3=new Assgn();
		System.out.println("Number of ojects="+Assgn.count);
	}
}