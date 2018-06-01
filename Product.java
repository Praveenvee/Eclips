package one;

public class Product{
	
	public Product() {
		
	}
	public Product(String brand) {
		System.out.println("brand name is :"+ brand);
	}
	
	
	public static void main(String[] args) {
		Product mine= new Product("Woodland");
	}
	
}