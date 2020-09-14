package kakao;

import java.util.Arrays;
import java.util.HashMap;

public class Level2 {
	static HashMap<String, Integer> map = new HashMap<String,Integer>();
	public static void main(String[] args) {
		String [] order = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
		int [] course = {2,3,4};
		System.out.println("result : " + Arrays.toString(new Level2().solution(order, course)));
	}

	private String[] solution(String[] order, int[] course) {
		int i=0;
		String orderzip = "";
		for(int j=0; j < order.length; j++) {
			orderzip+=order[j];
		}
		System.out.println("start : " + orderzip);
		while(i < orderzip.length()) {
			orderzip=orderzip.charAt(i)+ orderzip.replaceAll(""+orderzip.charAt(i), "");
			System.out.println(orderzip);
			i++;
		}
		char[] arr = orderzip.toCharArray();
		Arrays.sort(arr);
		orderzip=String.valueOf(arr);
		System.out.println("orderzip: " + orderzip);
		
		i=0;
		while(i < course.length) {
			char[] set = new char[course[i]];
			System.out.println("---------------------"+course[i]+" start");
			nCr(arr,set,0,0,course[i++]);
		}
		//System.out.println(map.size());
        String[] answer = {};
		return answer;
	}
	public void nCr(char[] arr, char[] set, int setidx, int k, int r) { // 조합
		if (setidx == r) {
			System.out.println(String.valueOf((set)));
			map.put(String.valueOf(set), 0);
			return;
		}
		for (int i = k; i < arr.length; i++) {
			set[setidx] = arr[i];
			nCr(arr, set, setidx+1, i+1, r);
		}
	}
	
	
}
