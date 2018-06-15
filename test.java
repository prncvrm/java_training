abstract class Shape{
	abstract double area();
}
class Rectangle extends Shape{
	private double length=50, breadth=100;
	double area(){
		return length*breadth;
	}
}
class Circle extends Shape{
	private double radius=10;
	double area(){
		return 3.14*radius*radius;
	}
}
class TestQue14{
	public static void main(String[] args) {
		Shape ob;
		ob=new Rectangle();
		System.out.println("Rectangle area="+ob.area());
		ob=new Circle();
		System.out.println("Circle area="+ob.area());
	}
}