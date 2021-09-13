package weeklychallenge;

import java.util.Arrays;

public class Week07 {

	public static void main(String[] args) {
		// 입실 퇴실
		int[] enter = { 3, 2, 1 };
		int[] leave = { 2, 1, 3 };
		System.out.println(Arrays.toString(solution(enter, leave)));
	}

	public static int[] solution(int[] enter, int[] leave) {
		// 1. 퇴실 순서 기준으로 여부를 확인한다.
		// 2. 퇴실하는 사람의 입실 이전 정보를 확인한다.
		// 3. 자기보다 먼저 입실한 사람이 자기보다 먼저 퇴실했는지 확인한다.
		// 4. 반드시 만나는 사람은 만난 횟수를 서로 +1 증가시킨다.
		int[] answer = {};
		return answer;
	}

}
