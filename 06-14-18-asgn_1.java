//setter getter//

class Date{
	private int date,month,year;
	public void setDate(int date){
		this.date=date;
	}
	public void setMonth(int month){
		this.month=month;
	}
	public void setYear(int year){
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
		Date ob = new Date();
		ob.setDate(07);
		ob.setMonth(10);
		ob.setYear(2000);
		System.out.println("Date::"+ob.getDate()+"/"+ob.getMonth()+"/"+ob.getYear());
	}
}
