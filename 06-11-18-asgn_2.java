// display primes from 1-100
import java.math.*;
class Assign_2{
	public static void main(String args[]){
		for(int i=1;i<=100;i++){
			if(isPrime(i)){
				System.out.println(i+"is Prime");
			}
		}
	}
	public static boolean isPrime(int num){
		for (int i=2;i<=Math.sqrt(num);i++){
			if(num % i==0){
				return false;
			}
		}
		return true;
		
	}
}