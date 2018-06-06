package one;

public class cmdpass {
	public static void main(String args[]) {
		double z = 0;
		for (int i = 0; args.length > i; i++) {
			double x = Double.parseDouble(args[i]);

			z = z + x;

			System.out.println(z);
		}
	}
}