package one;


class sit{
	public void sit(int a, int b, int c ) {
		c=a+b;
		System.out.println(c);
	}
	
}

public class Fourteen {
public static void main(String[] args) {
	sit it = new sit();
	int a=4;
	int b=4;
	int c=a*b;
	it.sit(a,b,0);
	System.out.println(c);

}
}
