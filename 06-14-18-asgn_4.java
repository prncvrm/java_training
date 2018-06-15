//abstract class//

abstract class RBI{
	abstract double callInterest(float principle, float roi, int period);
}
class SBI extends RBI{
	double callInterest(float principle, float roi, int period){
		return (principle*(roi+1)*period)/100;
	}
}
class HDFC extends RBI{
	double callInterest(float principle, float roi, int period){
		return (principle*roi*period)/100;
	}	
}
class Test{
	public static void main (String args[]){
	SBI usr1 = new SBI();	
	HDFC usr2 =new HDFC();
	System.out.println("Sbi Interest = "+usr1.callInterest(1000,5,2));
	System.out.println("HDFC Interest = "+usr2.callInterest(1000,5,2));
	}

}