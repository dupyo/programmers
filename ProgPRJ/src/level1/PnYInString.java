package level1;

public class PnYInString {

	public static void main(String[] args) {
		// 문자열 내 p와 y의 개수
		String s = "pPoooyY";
		System.out.println(new PnYInString().solution(s));
	}

	// 문자열 내 p와 y의 개수
	public boolean solution(String s) {
		int cnt = 0;
		s = s.toLowerCase();
		// 문자열에서 p의 개수와 y의 개수의 차를 이용
		cnt = s.length() - s.replaceAll("p", "").length();
		cnt -= s.length() - s.replaceAll("y", "").length();
		return (cnt == 0);
	}

}
