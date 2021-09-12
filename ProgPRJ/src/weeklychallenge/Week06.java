package weeklychallenge;

import java.util.Arrays;
import java.util.Comparator;

public class Week06 {

	public static void main(String[] args) {
		// 복서 정렬하기
		int[] weights = { 50, 82, 75, 120 };
		String[] head2head = { "NLWL", "WNLL", "LWNW", "WWLN" };
		System.out.println(Arrays.toString(solution(weights, head2head)));
	}

	public static int[] solution(int[] weights, String[] head2head) {
		// 1. 각 선수들의 승룰 구하기
		// 2. 자신보다 무거운 복서를 이긴 횟수 구하기
		// 3. { "[승률] [자신보다 무거운 복서를 이긴 횟수] [자기 몸무게]", "[순번]" } 형식으로 2차원 배열 만들어서 내림차순 정렬
		int[] answer = new int[weights.length];
		String[][] boxerInfos = new String[weights.length][2];
		for (int i = 0; i < weights.length; i++) {
			int winAgainstHeavier = 0;
			int winCount = 0;
			for (int j = 0; j < weights.length; j++) {
				if (head2head[i].charAt(j) == 'W') {
					winCount++;
					winAgainstHeavier += (weights[i] < weights[j]) ? 1 : 0;
				}
			}
			boxerInfos[i][0] = String.format("%03d", winCount) + " " + String.format("%03d", winAgainstHeavier) + " "
					+ String.format("%03d", weights[i]);
			boxerInfos[i][1] = String.format("%04d", i + 1);
		}
		// [승률] [자신보다 무거운 복서를 이긴 횟수] [자기 몸무게] 순으로 내림차순하고, [순번] 순으로 오름차순
		Arrays.sort(boxerInfos, new Comparator<String[]>() {
			@Override
			public int compare(String[] arr1, String[] arr2) {
				if (arr1[0].compareTo(arr2[0]) == 0)
					return arr1[1].compareTo(arr2[1]);
				else if (arr2[0].compareTo(arr1[0]) > 0)
					return 1;
				else
					return -1;
			}
		});
		for (int i = 0; i < weights.length; i++) {
			answer[i] = Integer.parseInt(boxerInfos[i][1]);
		}

		return answer;
	}

}
