package weeklychallenge;

public class Week06 {

	public static void main(String[] args) {
		// 복서 정렬하기
		int[] weights = { 50, 82, 75, 120 };
		String[] head2head = { "NLWL", "WNLL", "LWNW", "WWLN" };
		System.out.println(solution(weights, head2head));
	}

	public static int[] solution(int[] weights, String[] head2head) {
		int[] answer = {};
		for(int i = 0; i < weights.length; i++) {
			double winningPercent = 0;
			int winAgainstHeavier = 0;
			double winCount = 0;
			for(int j = 0; j < weights.length; j++) {
				if(head2head[i].charAt(j) == 'W') {
					winCount++;
					winAgainstHeavier += (weights[i] < weights[j]) ? 1 : 0;
				}
			}
			winningPercent = winCount / (weights.length - 1);
			System.out.println(winningPercent + ", " + winAgainstHeavier);
		}
		return answer;
	}

}
