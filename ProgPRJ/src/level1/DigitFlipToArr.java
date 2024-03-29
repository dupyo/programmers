package level1;

import java.util.Arrays;

public class DigitFlipToArr {

	public static void main(String[] args) {
		// 자연수 뒤집어 배열로 만들기
		long n = 999898;
		System.out.println(Arrays.toString(solution(n)));
	}

	// 자연수 뒤집어 배열로 만들기
	public static int[] solution(long n) {
		String nStr = Long.toString(n);
		int[] answer = new int[nStr.length()];
		for (int i = 0; i < nStr.length(); i++)
			answer[i] = nStr.charAt(nStr.length() - 1 - i) - 48;	// Integer.parseInt() 메소드 쓰지 않고 아스키 코드표 활용
		return answer;
	}

}
