package level1;

import java.util.Arrays;

public class ArrangeStrByDesc {

	public static void main(String[] args) {
		// 문자열 내림차순으로 배치하기
		String s = "Zbcdefg";
		System.out.println(solution(s));
	}
	
	public static String solution(String s) {
		String answer = "";
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		for (int i = arr.length - 1; i >= 0; i--) {
			answer += arr[i];
		}
		return answer;
	}

}
