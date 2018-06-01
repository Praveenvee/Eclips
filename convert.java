package one;

public class convert {
     
	public static void main(String[] args) {
    	  double b=celsius(100);
    	  System.out.println("Celsius :"+ b);
    	  double d =faranheat(600);
    	  System.out.println("Faranheat :"+ d);
      }

	
public static double celsius(double a) {
      double c= (5.0/9.0)*(a-32);
      return c;
}
public static double faranheat(double a) {
	double f=(9.0 / 5.0 * a+ 32);
	return f;
}

}