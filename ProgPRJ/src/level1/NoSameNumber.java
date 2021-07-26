package level1;

import java.util.Arrays;

public class NoSameNumber {

	public static void main(String[] args) {
		// 같은 숫자는 싫어
		int[] arr = { 1, 1, 3, 3, 0, 1, 1 };
		System.out.println(Arrays.toString(solution(arr)));
	}

	public static int[] solution(int[] arr) {

		// 제거된 후 남은 수를 저장할 배열을 생성하기 위해 중복 없는 배열의 길이를 구하라
		// 길이를 구하면 반복문에서 임시로 이전 값을 저장해서 중복을 허용하지 않도록 조건을 걸어라
		int pre = arr[0];
		int answer_size = 1;
		for (int value : arr) {
			if (pre == value)
				continue;
			answer_size++;
			pre = value;
		}
		int[] answer = new int[answer_size];
		pre = -1;
		for (int value : arr) {
			if (pre == value)
				continue;
			answer[answer.length - (answer_size--)] = value;
			pre = value;
		}

		return answer;
	}

}
