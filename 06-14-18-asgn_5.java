//interface//
interface NumOperation{
	int operation(int a, int b);
}
class Arithmetic implements NumOperation{
	public int operation(int a, int b){
		System.out.println(a+b);
		return 0;
	}
}
class Logical implements NumOperation{
	public int operation(int a, int b){
		boolean _a=(a!=0)?true:false;
		boolean _b=(b!=0)?true:false;
		System.out.println(_a || _b);
		return 0;
	}
}
class Test{
	public static void main(String args[]){
		NumOperation ob;
		ob = new Arithmetic();
		ob.operation(4,5);
		ob=new Logical();
		ob.operation(1,0);
	}
}