package level1;

import java.util.Arrays;

public class NoSameNumber {

	public static void main(String[] args) {
		// 같은 숫자는 싫어
		// 미션 1. else 예약어 쓰지 않기
		// 미션 2. 리스트 타입 쓰지 않기
		int[] arr = { 1, 1, 3, 3, 0, 1, 1 };
		System.out.println(Arrays.toString(solution(arr)));
	}

	public static int[] solution(int[] arr) {

		// 중복 없는 배열을 생성하기 위해 중복 없는 배열의 길이를 먼저 구하라
		// 길이를 구하면 입력된 배열에서 이전 값을 기억하여 중복 없는 배열을 완성하라
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
