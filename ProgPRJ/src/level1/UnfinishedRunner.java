package level1;

import java.util.HashMap;

public class UnfinishedRunner {

	public static void main(String[] args) {
		// 완주하지 못한 선수
		String[] participant = { "marina", "josipa", "nikola", "vinko", "filipa" };
		String[] completion = { "josipa", "filipa", "marina", "nikola" };
		System.out.println(solution(participant, completion));

	}

	public static String solution(String[] participant, String[] completion) {
		HashMap<String, Integer> runner = new HashMap<>();
		// key,value 형식으로 참가자 저장
		for (String n : participant)
			runner.put(n, runner.getOrDefault(n, 0) + 1);
		// key,value 형식으로 완주자 제거
		for (String n : completion)
			runner.put(n, runner.get(n) - 1);
		// 완주하지 못한 참가자의 value는 0이 아님
		for (String n : runner.keySet()) {
			if (runner.get(n) != 0) // 완주하지 못한 참가자
				return n;
		}
		return "";
	}
}
