/* Question 1*/
class MyDate{
	private int day,month,year;
	void initDate(){
		day=5;
		month=10;
		year=2000;
		System.out.println("Date:"+day+"/"+month+"/"+year);
	}
}
/* Question 2*/
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
/* Question 3*/
class MyDate{
	private int day,month,year;
	MyDate(){}
	MyDate(int day, int month, int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
}
/* Question 4*/
class Employee{
	private int id;
	private String name;
	private double basicSalary,hra,da,medical,ta;
	Employee(int id,String name,double basicSalary){
		this.id=id;
		this.name=name;
		this.basicSalary=basicSalary;
		this.hra=(.05*basicSalary);
		this.da=(0.027*basicSalary);
		this.medical=(0.015*basicSalary);
		this.ta=2000.0;
	}
	double grossSalary(){
		return (basicSalary+hra+da+med+ta);
	}
	double netSalary(){
		return (grossSalary()-(.010*grossSalary()))
	}
}
/* Question 5*/
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
/* Question 6*/
class MathClass{
	int add(int...a){
		int sum=0;
		for(int i : a)
			sum+=i;
	return sum;
	}
}
/* Question 7*/
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
/* Question 8*/
class Employee{
	static public int id=0;
	public String name;
	public double basicSalary,hra,da,medical,ta;
	Employee(String name,double basicSalary){
		id++;
		this.name=name;
		this.basicSalary=basicSalary;
		this.hra=(.05*basicSalary);
		this.da=(0.027*basicSalary);
		this.medical=(0.015*basicSalary);
		this.ta=2000.0;
	}
	double grossSalary(){
		return (basicSalary+hra+da+medical+ta);
	}
	double netSalary(){
		return (grossSalary()-(.010*grossSalary()));
	}
}
class Test {
	public static void main(String[] args) {
		Employee emp[] = new Employee[2];
		emp[0]=new Employee("abc",10000);
		emp[1]=new Employee("cde",20000);
		System.out.println(emp[0].id+" "+emp[0].name+" "+emp[0].grossSalary()+" "+emp[0].netSalary());
		System.out.println(emp[1].id+" "+emp[1].name+" "+emp[1].grossSalary()+" "+emp[1].netSalary());
	}
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
		System.out.println(ob);
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
class MyDate{
	private int day,month,year;
	MyDate(){}
	MyDate(int day, int month, int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public MyDate clone() throws CloneNotSupportedException{
		MyDate date=new MyDate(this.day,this.month,this.year);
		return date;
	}
}
/* Question 17*/
class Account {
	private int acctId;
	private int acctType;
	private String acctHolderName;
	Account(int acctId, int acctType, String acctHolderName){
		this.acctId=acctId;
		this.acctType=acctType;
		this.acctHolderName=acctHolderName;
	}
	class Locker{
		private int lockerId;
		Locker(int lockerId){
			this.lockerId=lockerId;
		}
		void printAccountDetails(){
			System.out.println("Account Numebr = "+acctId);
			System.out.println("Account Type = "+acctType);
			System.out.println("Name = "+acctHolderName);
			System.out.println("Locker Id= "+lockerId);
		}
	}	
}
class Test{
	public static void main(String[] args) {
		Account ac = new Account(12345,2,"ABC");
		Account.Locker ob = ac.new Locker(54);
		ob.printAccountDetails();
	}
}