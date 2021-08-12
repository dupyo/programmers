package weeklychallenge;

public class Week02 {

	public static void main(String[] args) {
		// 상호 평가
		int[][] scores = { { 100, 90, 98, 88, 65 }, { 50, 45, 99, 85, 77 }, { 47, 88, 95, 80, 67 },
				{ 61, 57, 100, 80, 65 }, { 24, 90, 94, 75, 65 } };
		System.out.println(solution(scores));
	}

	public static String solution(int[][] scores) {
		// 1. 점수의 평균을 구한다.(자신이 부여한 점수가 유일한 최대 또는 최소라면 제외한다.)
		// 2. 범위에 맞는 성적을 찾아 결과에 추가한다.(메소드 분리)
		String answer = "";
		for (int i = 0; i < scores.length; i++) {
			int people = scores.length;
			int[] scorecount = new int[101]; // 0~100점까지 101개의 점수를 가리키는 배열
			int sum = 0;
			for (int j = 0; j < scores.length; j++) {
				scorecount[scores[j][i]]++;
				sum += scores[j][i];
			}
			if (isMin(scores[i][i], scorecount) || isMax(scores[i][i], scorecount)) {
				sum -= scores[i][i];
				people--;
			}
			answer += credit(sum / people);
		}
		return answer;
	}

	public static boolean isMin(int myscore, int[] scorecount) {
		for (int i = 0; i < scorecount.length; i++) {
			if (scorecount[i] > 0) {
				if (scorecount[i] == 1 && myscore == i)
					return true;
				return false;
			}
		}
		return false;
	}

	public static boolean isMax(int myscore, int[] scorecount) {
		for (int i = scorecount.length - 1; i >= 0; i--) {
			if (scorecount[i] > 0) {
				if (scorecount[i] == 1 && myscore == i)
					return true;
				return false;
			}
		}
		return false;
	}

	public static String credit(int average) {
		if (average >= 90)
			return "A";
		if (average >= 80)
			return "B";
		if (average >= 70)
			return "C";
		if (average >= 50)
			return "D";
		return "F";
	}

}
