//sum of even nos in given range
class Assign_3{
	public static void main(String arg[]){
		int a=20,b=100,sum=0;
		for(int i=a;i<=b;i++){
			if(i%2==0)	//check even
				sum+=i;
		}
		System.out.println("Sum="+sum);
	}
}