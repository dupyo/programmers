package kakao2022blindRecruitment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution01 {

	public static void main(String[] args) {
		String[] id_list = { "muzi", "frodo", "apeach", "neo" };
		String[] report = { "muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi" };
		int k = 2;
		System.out.println(Arrays.toString(solution(id_list, report, k)));
	}

	public static int[] solution(String[] id_list, String[] report, int k) {
		// 각 유저가 받은 결과 메일 수를 담을 배열
		int[] answer = new int[id_list.length];
		// 신고 정보 중복 제거한 목록
		Set<String> validReport = new HashSet<String>();
		for (String repo : report) {
			validReport.add(repo);
		}
		
		// 자신이 신고한 대상의 목록
		Map<String, List<String>> map = new HashMap<>();
		// 각 유저가 받은 결과 메일 수를 담은 맵
		Map<String, Integer> receiveMail = new HashMap<>();
		for (String id : id_list) {
			map.put(id, new ArrayList<>());
			receiveMail.put(id, 0);
		}
		// 신고 정보 처리
		Iterator<String> it = validReport.iterator();
		while (it.hasNext()) {
			String[] reportCase = it.next().split(" ");
			map.get(reportCase[1]).add(reportCase[0]);
		}
		Iterator<String> iter = map.keySet().iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			List<String> reportingList = map.get(key);
			if (reportingList.size() >= k) {
				for(int i = 0; i < reportingList.size(); i++) {
					receiveMail.put(reportingList.get(i), receiveMail.get(reportingList.get(i)) + 1);  
				}
			}
		}
		for(int i = 0; i < answer.length; i++) {
			answer[i] = receiveMail.get(id_list[i]);
		}

		return answer;
	}

}
