class Point{
	int x, y;
	Point(){}
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	static void swap(Point []p){
		Point temp = p[0];
		p[0]=p[1];
		p[1]=temp;
	}
	public String toString(){
		return ("x="+x+"y="+y);
	}
}
class Test{
	public static void main(String args[]){
		Point [] p=new Point[2];
		p[0]=new Point(1,4);
		p[1]=new Point(2,3);
		Point.swap(p);
		System.out.println(p[0]);
		System.out.println(p[1]);
	}
}