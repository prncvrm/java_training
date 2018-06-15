class MyDate{
	private int day,month,year;
	void initDate(){
		day=5;
		month=10;
		year=2000;
		System.out.println("Date:"+day+"/"+month+"/"+year);
	}
}

class MyDate{
	private int day,month,year;
	public void setDay(int day){
		this.day=day;
	}
	public void setMonth(int month){
		this.month=month;
	}
	public void setYear(int year){
		this.year=year;
	}
	public int getDay(){
		return day;
	}
	public int getMonth(){
		return month;
	}
	public int getYear(){
		return year;
	}
}

class MyDate{
	private int day,month,year;
	MyDate(){}
	MyDate(int day, int month, int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
}
class Employee{
	private int id;
	private String name;
	private double basicSalary,hra,da,medical,ta=2000.0;

}
class MathClass{
	void add(int x, int y){
		System.out.prinltn(x+y);
	}
	void add(float x, float y){
		System.out.prinltn(x+y);
	}
	void add(double x, double y){
		System.out.prinltn(x+y);	
	}
}
class MyDate{
	private int day,month,year;
	Date(){
		this(5,10,2000);
	}
	Date(int day, int month, int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
}
class Employee{
	private int id;
	private String name;
	private double basicSalary,hra,da,medical,ta=2000.0;

}
/* Question 9*/
class MyDate{
	private int day,month,year;
	MyDate(){}
	MyDate(int day, int month, int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public String toString(){
		return ("Date:"+day+"/"+month+"/"+year);	
	}
}
class TestQue9{
	public static void main(String[] args) {
		MyDate ob = new MyDate(5,5,2000);
		System.out.println(ob.toString());
	}
}
/* Question 10*/
class MyDate{
	private int day,month,year;
	MyDate(){}
	MyDate(int day, int month, int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	void swap(Object ob1, Object ob2){
		Object temp;
		temp=ob1;
		ob1=ob2;
		ob2=temp;
	}
	void showDate(){
		System.out.println("Date:"+day+"/"+month+"/"+year);
	}	
}
class TestQue10{
	public static void main(String[] args) {
		MyDate ob1 = new MyDate(5,5,2000);
		MyDate ob2 = new MyDate(10,10,2000);
		ob1.swap(ob1,ob2);
		System.out.println(ob1.showDate());
		System.out.println(ob2.showDate());
	}
}
/* Question 11*/
class Date{
	private int date, month, year;
	Date(){}
	Date(int date, int month, int year){
		this.date=date;
		this.month=month;
		this.year=year;
	}
	public void showDate(){
		System.out.println("date "+date+" month "+ month + " year "+year);
	}
}
class Employee{
	private int eid;
	private String ename;
	private Date doj;
	Employee(){
	}
	Employee(int eid, String ename, Date doj){
		this.eid=eid;
		this.ename=ename;
		this.doj=doj;
	}
	public void showEmployeeDetails(){
		System.out.println(eid+ " "+ename);
		doj.showDate();
	}
	public static void main (String args[]){
		Employee em = new Employee(1,"Name",new Date(1,1,2000));
		em.showEmployeeDetails();
	}
}

/* Question 12 */

class Employee{
	class Date{
		private int date, month, year;
		Date(){}
		Date(int date, int month, int year){
			this.date=date;
			this.month=month;
			this.year=year;
		}
		public void showDate(){
			System.out.println("date "+date+" month "+ month + " year "+year);
		}
	}
	private int eid;
	private String ename;
	Employee(){
	}
	Employee(int eid, String ename){
		this.eid=eid;
		this.ename=ename;
	}
	public void showEmployeeDetails(){
		System.out.println(eid+ " "+ename);
	}
	public static void main (String args[]){
		Employee em = new Employee(1,"Name");
		Employee.Date doj = em.new Date(1,1,2000);
		em.showEmployeeDetails();
		doj.showDate();
	}
}
/* Question 13*/
/* Question 14*/
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
/*Question 15*/
interface Printable{
	void print();
}
class Employee implements Printable{
	public void print(){
		System.out.println("Employee");
	}
}
class Shape implements Printable{
	public void print(){
		System.out.println("Shape");
	}
}
class Date implements Printable{
	public void print(){
		System.out.println("Date");
	}
}
/*Question 16*/
