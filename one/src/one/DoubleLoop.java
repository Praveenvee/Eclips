package one;

public class DoubleLoop {
	public static void main(String[] args ) {
		
		int i,j;
outer :		for(i=0;i<=5;i++) {
		inner :       for(j=0;j<5;j++) {
					
		        	System.out.println("It is the INNER loop :"+i);
		        	if(j==3)
		        	break;
		        }
			System.out.println("its the OUTER looop:\n");
			continue outer;
			
		}
		
	}

}
