//setter getter//

class Date{
	private int date,month,year;
	Date(){}
	Date(int date, int month, int year){
		this.date=date;
		this.month=month;
		this.year=year;
	}
	public int getDate(){
		return date;
	}
	public int getMonth(){
		return month;
	}
	public int getYear(){
		return year;
	}
	
}
class Test{
	public static void main(String args[]){
		Date ob = new Date(7,10,2000);
		System.out.println("Date::"+ob.getDate()+"/"+ob.getMonth()+"/"+ob.getYear());
	}
}
