package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ReceiveReportResult {

	public static void main(String[] args) {
		// 신고 결과 받기
		String[] id_list = { "muzi", "frodo", "apeach", "neo" };
		String[] report = { "muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi" };
		int k = 2;
		System.out.println(Arrays.toString(solution(id_list, report, k)));
	}

	public static int[] solution(String[] id_list, String[] report, int k) {
		// 각 유저가 받은 결과 메일 수를 담을 배열
		int[] answer = new int[id_list.length];
		// 신고 정보 중복 제거한 목록
		Set<String> reportSet = new HashSet<String>();
		for (String repo : report) {
			reportSet.add(repo);
		}
		// 자신을 신고한 유저의 목록(키: 신고 당한 유저, 값: 자신을 신고한 유저 목록)
		Map<String, List<String>> map = new HashMap<>();
		// 각 유저가 받은 결과 메일 수를 담은 맵
		Map<String, Integer> receiveMail = new HashMap<>();
		for (String id : id_list) {
			map.put(id, new ArrayList<>());
			receiveMail.put(id, 0);
		}
		// 자신을 신고한 유저 추가
		Iterator<String> add = reportSet.iterator();
		while (add.hasNext()) {
			String[] repo = add.next().split(" ");
			map.get(repo[1]).add(repo[0]);
		}
		// 신고 당한 유저가 정지 기준 횟수 이상 신고 당하여 정지 처리되면 해당 유저를 신고한 유저가 받을 메일 수 처리
		Iterator<String> suspend = map.keySet().iterator();
		while (suspend.hasNext()) {
			String key = suspend.next();
			List<String> reporters = map.get(key);
			if (reporters.size() >= k) {
				for(int i = 0; i < reporters.size(); i++)
					receiveMail.put(reporters.get(i), receiveMail.get(reporters.get(i)) + 1);  
			}
		}
		for(int i = 0; i < answer.length; i++) {
			answer[i] = receiveMail.get(id_list[i]);
		}
		return answer;
	}

}
