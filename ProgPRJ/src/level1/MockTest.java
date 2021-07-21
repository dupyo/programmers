package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MockTest {

	public static void main(String[] args) {
		// 모의고사
		int[] answers = { 3, 3, 2, 4, 5, 4, 4, 2, 4 };
		System.out.println(Arrays.toString(new MockTest().solution(answers)));
	}

	// 모의고사
	public int[] solution(int[] answers) {
		int[] sps = new int[3];
		List<Integer> spMax = new ArrayList<>();
		int[][] sp123 = { { 1, 2, 3, 4, 5 }, { 2, 1, 2, 3, 2, 4, 2, 5 }, { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 } };

		for (int i = 0; i < sps.length; i++) {
			for (int j = 0; j < answers.length; j++) {
				if (sp123[i][(j % sp123[i].length)] == answers[j]) {
					sps[i]++;
				}
			}
		}
		for (int i = 0; i < sps.length; i++) {
			if (sps[i] != 0) {
				for (int j = 0; j < sps.length; j++) {
					if (sps[j] != 0) {
						if (sps[i] > sps[j]) {
							sps[j] = 0;
						} else if (sps[i] < sps[j]) {
							sps[i] = 0;
							break;
						}
					}
				}
			}
		}
		for (int i = 0; i < sps.length; i++) {
			if (sps[i] != 0) {
				spMax.add(i + 1);
			}
		}
		int[] answer = new int[spMax.size()];
		for (int i = 0; i < spMax.size(); i++) {
			answer[i] = spMax.get(i);
		}
		return answer;
	}
}
