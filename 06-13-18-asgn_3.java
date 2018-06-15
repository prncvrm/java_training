//containment || Composition//


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
