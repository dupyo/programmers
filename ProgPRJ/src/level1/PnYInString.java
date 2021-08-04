package level1;

public class PnYInString {

	public static void main(String[] args) {
		// 문자열 내 p와 y의 개수
		String s = "pPoooyY";
		System.out.println(solution(s));
	}
	// 글자를 제외한 길이 반환 메소드로 분리
	public static int countout(String str, String match) {
		return str.replaceAll(match, "").length();
	}
	public static boolean solution(String s) {
		s = s.toLowerCase();
		return (countout(s, "p") == countout(s, "y"));	// 문자열에서 p의 개수와 y의 개수를 비교
	}

}
