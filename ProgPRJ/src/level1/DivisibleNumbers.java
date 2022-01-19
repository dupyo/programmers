package level1;

import java.util.Arrays;

public class DivisibleNumbers {

	public static void main(String[] args) {
		// 나누어 떨어지는 숫자 배열
		int[] arr = { 5, 9, 7, 10 };
		int divisor = 5;
		System.out.println(Arrays.toString(solution(arr, divisor)));
	}

	public static int[] solution(int[] arr, int divisor) {
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				arr[cnt++] = arr[i];
			}
		}
		if (cnt == 0) {
			int[] minusone = {-1};
			return minusone;
		}
		int[] answer = new int[cnt];
		for (int i = 0; i < cnt; i++) {
			answer[i] = arr[i];
		}
		Arrays.sort(answer);
		return answer;
	}

}
