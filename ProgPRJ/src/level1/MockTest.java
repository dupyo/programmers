package level1;

import java.util.Arrays;

public class MockTest {

	public static void main(String[] args) {
		// 모의고사
		int[] answers = { 1, 3, 2, 4, 2 };
		System.out.println(Arrays.toString(solution(answers)));
	}

	// 두 점수를 비교하여 더 큰 값을 반환
	public static int compare(int a, int b) {
		return Math.max(a, b);
	}

	// 모의고사
	public static int[] solution(int[] answers) {
		int[] scoreboard = new int[3];
		int[][] supojas = { { 1, 2, 3, 4, 5 }, { 2, 1, 2, 3, 2, 4, 2, 5 }, { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 } };
		int max = 0;
		int winnerSize = 0;
		// 리스트를 만들어서 배열로 바꾸는 방법은 되도록 쓰지 말자.
		// 생성할 배열의 길이를 구하고 배열을 생성.

		for (int i = 0; i < scoreboard.length; i++) {
			for (int j = 0; j < answers.length; j++) {
				if (supojas[i][(j % supojas[i].length)] == answers[j])
					scoreboard[i]++;
			}
			max = compare(max, scoreboard[i]);
		}

		for (int i = 0; i < scoreboard.length; i++) {
			if (scoreboard[i] == max)
				winnerSize++;
		}

		int[] answer = new int[winnerSize];
		for (int i = 0; i < scoreboard.length; i++) {
			if (scoreboard[i] == max)
				answer[answer.length - (winnerSize--)] = i + 1;
		}
		
		return answer;
	}
}
