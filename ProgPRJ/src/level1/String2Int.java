package level1;

public class String2Int {

	public static void main(String[] args) {
		// 문자열을 정수로 바꾸기
		String s = "-31";
		System.out.println(solution(s));

	}

	public static int solution(String s) {
		// return Integer.parseInt(s);
		int res = (s.charAt(0) - '0' > 0) ? s.charAt(0) - '0' : 0;
		boolean sign = (s.charAt(0) == '-') ? false : true;
		for (int i = 1; i < s.length(); i++) {
			res = res * 10 + (s.charAt(i) - '0');
		}
		return sign ? res : -1 * res;
	}

}
