package level1;

import java.util.Scanner;

public class RectangleStars {

	public static void main(String[] args) {
		// 직사각형 별찍기
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int i = 0;
		String val = "";

		int cnt = a * b;
		while (i++ < cnt) {
			val += "*";
			if (i % a == 0) {
				System.out.println(val);
				val = "";
			}
		}
	}

}
