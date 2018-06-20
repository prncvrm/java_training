import java.util.Scanner;
class Test{
	public static void main(String[] args) {
		int n;String bin="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Dec No");
		n=sc.nextInt();
		while(n>0){
			bin=Integer.toString(n%2)+bin;
			n/=2;
		}
		System.out.println(bin);
	}
}
