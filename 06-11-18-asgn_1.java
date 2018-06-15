//to calculate roots of quad
import java.math.*;
class Quad{
	public static void main (String args[]){
		double a=4.0,b=4.0,c=1;
		double root1=0.0, root2=0.0;
		double det= (b*b)-(4*a*c);
		if(det < 0.0){
			System.out.println("Imaginary Roots");
		}
		else if(det==0.0){
			System.out.println("Equal Roots");
			System.out.println("Roots = "+ ((-b)/(2*a)));
		}
		else{
			root1=((-b)-(Math.sqrt(det)))/(2*a);
			root1=((-b)+(Math.sqrt(det)))/(2*a);
			System.out.println ("Root 1 = "+root1);
			System.out.println ("Root 2 = "+root2);
		}
	}
}