package weeklychallenge;

public class Week02 {

	public static void main(String[] args) {
		// 상호 평가
		int[][] scores = { { 100, 90, 98, 88, 65 }, { 50, 45, 99, 85, 77 }, { 47, 88, 95, 80, 67 },
				{ 61, 57, 100, 80, 65 }, { 24, 90, 94, 75, 65 } };
		System.out.println(solution(scores));
	}
	public static String credit(int score) {
		return "";
	}
	public static String solution(int[][] scores) {
		// 1. 점수의 평균을 구한다.(자신이 부여한 점수가 유일한 최대 또는 최소라면 제외한다.)
		// 2. 범위에 맞는 성적을 찾아 결과에 추가한다.(메소드 분리)
		String answer = "";
		int people = scores.length;
		for(int i = 0; i < scores[0].length; i++) {
			int sum = 0;
			int myscore = scores[i][i];
			int min = 100;
			int max = 0;
			for(int j = 0; j < scores.length; j++) {
				min = Math.min(min, scores[j][i]);
				max = Math.max(max, scores[j][i]);
				if(myscore == scores[j][i])
					sum += scores[j][i];
			}
		}
		return answer;
	}

}
