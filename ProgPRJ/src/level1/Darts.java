package level1;

public class Darts {

	public static void main(String[] args) {
		// [1차] 다트 게임
		String dartResult = "1S2D*3T";
		System.out.println(solution(dartResult));
	}

	public static int solution(String dartResult) {
		int answer = 0;
		int range = 0;
		int set = -1;
		int[] arr = new int[3];
		for (int i = 0; i < dartResult.length(); i++) {
			if (dartResult.charAt(i) == 'S' || dartResult.charAt(i) == 'D' || dartResult.charAt(i) == 'T') {
				arr[++set] = (int) bonus(Integer.parseInt(dartResult.substring(i - range, i)), dartResult.charAt(i));
				range = 0;
				continue;
			}
			if (dartResult.charAt(i) == '*') {
				arr[set] *= 2;
				if (set > 0) arr[set - 1] *= 2;
				continue;
			}
			if (dartResult.charAt(i) == '#') {
				arr[set] *= -1;
				continue;
			}
			range++;
		}
		for (int j = 0; j < 3; j++) {
			System.out.println(arr[j]);
			answer += arr[j];
		}
		System.out.println("----");
		return answer;
	}

	public static double bonus(int score, char type) {
		return type == 'D' ? Math.pow(score, 2) : type == 'T' ? Math.pow(score, 3) : score;
	}
}
