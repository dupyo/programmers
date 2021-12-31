package level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RectangleStars {

	public static void main(String[] args) throws IOException {
		// 직사각형 별찍기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = 0;
		String val = "";
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
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
