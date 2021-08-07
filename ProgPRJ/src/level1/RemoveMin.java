package level1;

import java.util.Arrays;

public class RemoveMin {

	public static void main(String[] args) {
		// 제일 작은 수 제거하기
		int[] arr = { 10, 11, 4, 7, 3 };
		System.out.println(Arrays.toString(solution(arr)));
	}
	public static int[] solution(int[] arr) {
		int i = 0, j = 0;
		if (arr.length == 1) {
			arr[0] = -1;
			return arr;
		}
		int min = arr[0];
		for (int k = 1; k < arr.length; k++) {
			if (arr[k] < min)
				min = arr[k];
		}
		int[] answer = new int[arr.length - 1];
		while (j < answer.length) {
			if (min != arr[i])
				answer[j++] = arr[i];
			i++;
		}
		return answer;
	}

}
