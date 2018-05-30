package one;

public class conBREAK {
	public static void main(String[] args) {
		int a=10, b=20;
		while(a<=b) {
			System.out.println(a);
			a++;
			if(a==13)
			{  
				System.out.println("-------------------------------------------------");
				continue;
			}
			System.out.println("Continue works here");
			 if(a==18)
			{
				break;
			}
		}
		
	}

}
