//abstract class and method//

abstract class NumOperation{
	abstract int operation(int a, int b);
}
class Arithmetic extends NumOperation{
	int operation(int a, int b){
		System.out.println(a+b);
		return 0;
	}
}
class Logical extends NumOperation{
	int operation(int a, int b){
		boolean _a=(a!=0)?true:false;
		boolean _b=(b!=0)?true:false;
		System.out.println(_a || _b);
		return 0;
	}
}
class Test{
	public static void main(String args[]){
		Arithmetic ar = new Arithmetic();
		Logical lo = new Logical();
		ar.operation(4,5);
		lo.operation(1,0);
	}
}