package one;

public class SplitArray {

	public static void main(String args[]) {
		int i = 0;
		int n = 4321;
		int t = n;
		int a[] = new int[10];

		while (t > 0) {
			int reminder = t % 10;
			a[i] = reminder;
			i++;
			t = t / 10;

		}
		for (i = 0; i < 10; i++) {
			System.out.println(a[i]);
		}

	}
}
