package weeklychallenge;

import java.util.Arrays;
import java.util.Comparator;

public class Week06 {

	public static void main(String[] args) {
		// 복서 정렬하기
		int[] weights = { 60, 70, 60 };
		String[] head2head = { "NNN", "NNN", "NNN" };
		System.out.println(Arrays.toString(solution(weights, head2head)));
	}

	public static int[] solution(int[] weights, String[] head2head) {
		// 1. 각 선수들의 승룰 구하기
		// 2. 자신보다 무거운 복서를 이긴 횟수 구하기
		// 3. { "[승률] [자신보다 무거운 복서를 이긴 횟수] [자기 몸무게]", "[순번]" } 형식으로 2차원 배열 만들어서 내림차순 정렬
		int[] answer = new int[weights.length];
		String[][] boxerInfos = new String[weights.length][2];
		for (int i = 0; i < weights.length; i++) {
			int winHeavier = 0;
			int winCount = 0;
			float winRate = 0f;
			// 승리가 없다면 반복문을 실행하지 않음
			if (head2head[i].contains("W")) {
				for (int j = 0; j < weights.length; j++) {
					if (head2head[i].charAt(j) == 'W') {
						winCount++;
						winHeavier += (weights[i] < weights[j]) ? 1 : 0;
					}
				}
			}
			int match = head2head[i].replaceAll("N", "").length();
			// 단 한번도 경기한 적이 없는 선수라면 경기 수 +1 처리( 0/0의 값을 구할 수 없기 때문에 )
			if (match == 0)
				match++;

			winRate = (float) winCount / match;
			boxerInfos[i][0] = String.format("%1.11f", winRate) + " " + String.format("%03d", winHeavier) + " "
					+ String.format("%03d", weights[i]);
			boxerInfos[i][1] = String.format("%04d", i + 1);
		}
		// 첫번째로 [승률], 두번째로 [자신보다 무거운 복서를 이긴 횟수], 세번째로 [자기 몸무게] 순으로 내림차순하고
		// 그래도 같으면 [순번] 순으로 오름차순
		Arrays.sort(boxerInfos, new Comparator<String[]>() {
			@Override
			public int compare(String[] arr1, String[] arr2) {
				if (arr1[0].compareTo(arr2[0]) == 0)
					return arr1[1].compareTo(arr2[1]);
				if (arr2[0].compareTo(arr1[0]) > 0)
					return 1;
				return -1;
			}
		});
		for (int i = 0; i < weights.length; i++)
			answer[i] = Integer.parseInt(boxerInfos[i][1]);

		return answer;
	}

}
