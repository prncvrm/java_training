class Test{
public static void main(String args[]){
int x = 100;
Integer newX=new Integer(x); 			//Boxing
x=newX.intValue();						//Unboxing

int y=100;
Integer newY=y;							//Autoboxing
y=newY;									//Autoboxing

System.out.println("x: "+x);
System.out.println("newX: "+newX);
System.out.println("y: "+y);
System.out.println("newY: "+newY);
}
}