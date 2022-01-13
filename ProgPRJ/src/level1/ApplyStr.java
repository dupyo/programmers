package level1;

public class ApplyStr {

	public static void main(String[] args) {
		// 문자열 다루기 기본
		String s = "1234";
		System.out.println(solution(s));
	}

	public static boolean solution(String s) {
		if (!(s.length() == 4 || s.length() == 6)) {
			return false;
		}
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) > '9') {
				return false;
			}
		}
		return true;
	}

}
