package level1;

import java.util.Arrays;

public class GCDLCM {

	public static void main(String[] args) {
		// 최대공약수와 최소공배수
		int n = 42, m = 12;
		System.out.println(Arrays.toString(solution2(n, m)));
	}

	// 최대공약수와 최소공배수
	public static int[] solution(int n, int m) {
		if (n > m) { // n은 m보다 작거나 같도록 한다.
			int sw = n;
			n = m;
			m = sw;
		}
		int[] answer = { n, m }; // 최종 결과 : answer[0](최대공약수) <= answer[1](최소공배수)
		while (!(n % answer[0] == 0 && m % answer[0] == 0)) answer[0]--; // 최대공약수 구하는 방법
		while (!(answer[1] % m == 0 && answer[1] % n == 0)) answer[1]++; // 최소공배수 구하는 방법

		return answer;
	}

	public static int[] solution2(int n, int m) { // 유클리드 호제법 응용 - 두 수를 곱한 뒤 최대공약수를 나누면 최소공배수
		int[] answer = new int[2];
		if (n > m) { // n은 m보다 작거나 같도록 한다.
			int sw = n;
			n = m;
			m = sw;
		}
		answer[0] = n;
		while (!(n % answer[0] == 0 && m % answer[0] == 0)) answer[0]--; // 최대공약수 구하는 방법
		answer[1] = n * m / answer[0]; // 최소공배수 구하는 방법
		return answer;

	}

}
