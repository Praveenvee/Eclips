package one;

public class maxmin {
	public static void main(String args[]) {
		int a[] = { 3, 4, 5, 2, 33, 24, 2 };
		int i = 0;
		int temp = 0;
		int max = a[i];
		for (i = 0; i < a.length; i++) {

			if (max < a[i]) {
				max = a[i];
				temp = max;
				
			}

			System.out.println(temp);

		}
	}
}
