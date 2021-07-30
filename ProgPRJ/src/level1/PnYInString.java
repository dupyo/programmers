package level1;

public class PnYInString {

	public static void main(String[] args) {
		// 문자열 내 p와 y의 개수
		String s = "pPoooyY";
		System.out.println(new PnYInString().solution(s));
	}
	// 글자 빈도수 구하는 메소드
	public int count(String str, String match) {
		return str.length() - str.replaceAll(match, "").length();
	}
	public boolean solution(String s) {
		int cnt = 0;
		s = s.toLowerCase();
		// 문자열에서 p의 개수와 y의 개수의 차를 이용
		cnt = count(s, "p");
		cnt -= count(s, "y");
		return (cnt == 0);
	}

}
