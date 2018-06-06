package one;


class aal{
	static String fname;
	String sname;
	static double salary;
	static double incre;
	
	public aal() {
		
	}
	public static String getFname() {
		return fname;
	}
	public static void setFname(String fname) {
		aal.fname = fname;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public static double getSalary() {
		return salary;
	}
	public static void setSalary(double salary) {
		aal.salary = salary;
		
	}public static double getIncre() {
		return incre;
	}
	public static void setIncre(double incre) {
		aal.incre =(incre +(incre/10));
	}
	
}


public class Employee{
		public static void main(String[] args) {
		
		aal obj = new aal();
		obj.setFname("Praveen");
		obj.setSname("Vee");
		obj	.setSalary(1000);
		obj.setIncre(1000);
		
		System.out.println("Employee 1 :\n   Name   : "+obj.getFname()+" "+obj.getSname()+"\n   Salary : " +obj.getSalary()+"\n   Incre  : "+obj.getIncre());
	
		aal abc = new aal();
		abc.setSalary(2000);
		abc.setFname("Selva");
		abc.setSname("Rakesh");
		abc.setIncre(2000);

		System.out.println("\nEmployee 2 :\n   Name   : "+ abc.getFname()+" "+abc.getSname()+"\n   Salary : "+abc.getSalary()+"\n   Incre  : "+abc.getIncre());
		
		
		
	} 

}
