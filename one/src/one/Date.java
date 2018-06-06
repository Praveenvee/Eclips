package one;

class done{
	static int day;
	static int month;
	static int year;
	
	public done() {
		
	}
	public done(int day,int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public static int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public static int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public static int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void display() {
		System.out.println( done.getDay()+"/"+done.getMonth()+"/"+done.getYear());
	}
		
}
public class Date {
	public static void main(String[] args) {
		done obj = new done();
		obj.setDay(30);
		obj.setMonth(03);
		obj.setYear(1998);
		obj.display();
		done that = new done(31,05,2018);
		that.display();
		
	}

}
