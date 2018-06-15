//containment || Aggregation//

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
