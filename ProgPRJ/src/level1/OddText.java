package level1;

public class OddText {

	public static void main(String[] args) {
		// 이상한 문자 만들기
		String s = "try hello world";
		System.out.println(solution(s));
	}

	// 이상한 문자 만들기
	public static String solution(String s) {
		s = s.toUpperCase(); // 모든 문자를 대문자로 변환
		char[] arr = s.toCharArray(); // String -> char[]
		int idx = 0; // 홀짝 구하는 인덱스
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ' ') { // 공백 나오면 홀짝 구하는 인덱스 초기화
				idx = 0;
				continue;
			}
			if (idx++ % 2 == 1)
				arr[i] = (char) (arr[i] + 32); // 아스키 코드 대문자->소문자 변환
		}
		return String.valueOf(arr); // char[] -> String
	}
}
