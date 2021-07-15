package level1;

import java.util.Arrays;

public class IntervalDigits {

	public static void main(String[] args) {
		// x만큼 간격이 있는 n개의 숫자
		int x = 19, n = 19;
		System.out.println(Arrays.toString(solution(x, n)));
	}

	// x만큼 간격이 있는 n개의 숫자
	public static long[] solution(int x, int n) {
		long[] answer = new long[n];
		for (int i = 0; i < n; i++)
			answer[i] = (long) x * (i + 1);
		return answer;
	}

}
