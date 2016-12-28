package grade4;

import java.util.Scanner;

public class Problem1110 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N;
		do {
			N = scanner.nextInt();
		} while (!(N >= 0 && N <= 99));
		int a, b, c;
		int temp = N;
		int count = 0;
		do {
			a = temp / 10;
			b = temp % 10;
			c = a + b;
			c = c % 10;
			temp = b * 10+c;
			count++;
		} while (N != temp);
		System.out.println(count);
	}
}
