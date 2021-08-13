package weeklychallenge;

public class Week02 {

	public static void main(String[] args) {
		// 상호 평가
		int[][] scores = { { 100, 90, 98, 88, 65 }, { 50, 45, 99, 85, 77 }, { 47, 88, 95, 80, 67 },
				{ 61, 57, 100, 80, 65 }, { 24, 90, 94, 75, 65 } };
		System.out.println(solution(scores));
	}

	public static String solution(int[][] scores) {
		// 1. 자신에게 부여한 점수가 유일한 최대 또는 최소인지 판단(메소드 분리)하여 맞으면 평균 계산에서 제외한다.
		// 2. 점수의 평균을 구한다.
		// 3. 평균을 구하여 범위에 맞는 학점을 찾아(메소드 분리)낸 후 결과에 추가한다.
		String answer = "";
		for (int i = 0; i < scores.length; i++) {
			int people = scores.length;
			int sum = 0;
			int[] scoreboard = new int[101]; // 0~100점까지 101개의 점수를 가리키는 점수판 배열
			int myscore = scores[i][i]; // 자기 자신에게 부여한 점수
			for (int j = 0; j < scores.length; j++) {
				scoreboard[scores[j][i]]++;
				sum += scores[j][i];
			}
			if (isOnlyMin(myscore, scoreboard) || isOnlyMax(myscore, scoreboard)) {
				sum -= myscore;
				people--;
			}
			answer += credit(sum / people);
		}
		return answer;
	}
	// 자기 자신에게 부여한 점수가 유일한 최솟값인지 판단하는 메소드
	public static boolean isOnlyMin(int myscore, int[] scoreboard) {
		for (int score = 0; score < scoreboard.length; score++) {
			if (scoreboard[score] > 0)
				return isOnlyValue(myscore, scoreboard[score], score);
		}
		return false;
	}
	// 자기 자신에게 부여한 점수가 유일한 최댓값인지 판단하는 메소드
	public static boolean isOnlyMax(int myscore, int[] scoreboard) {
		for (int score = scoreboard.length - 1; score >= 0; score--) {
			if (scoreboard[score] > 0)
				return isOnlyValue(myscore, scoreboard[score], score);
		}
		return false;
	}
	// 자기 자신에게 부여한 점수가 유일한 값인지 판단하는 메소드
	public static boolean isOnlyValue(int myscore, int scoreboard, int score) {
		return (scoreboard == 1 && myscore == score);
	}
	// 평균을 구하여 최종 학점을 부여하는 메소드
	public static String credit(int average) {
		return (average >= 90) ? "A" : (average >= 80) ? "B" : (average >= 70) ? "C" : (average >= 50) ? "D" : "F";
	}

}
