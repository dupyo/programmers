package level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UnfinishedRunner {

	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		System.out.println(new UnfinishedRunner().solution(participant, completion));

	}
	
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> runner = new HashMap<>();
		for(String n : participant) runner.put(n, runner.getOrDefault(n, 0)+1);
		for(String n : completion) runner.put(n, runner.get(n)-1);
		for(String n : runner.keySet()) {
			if(runner.get(n) != 0) {	//완주하지 못한 참가자
				answer=n;
				break;
			}
		}
		
		return answer;
	}
}
