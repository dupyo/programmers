package level1;

public class CaesarCipher {

	public static void main(String[] args) {
		// 시저 암호
		String s = "a B z Z";
		int n = 4;
		System.out.println(solution(s, n));
	}

	public static String solution(String s, int n) {
		String answer = "";
		for (int i = 0; i < s.length(); i++) {
			char factor = s.charAt(i);
			if (factor == ' ')
				answer += ' ';
			else if (factor + n > 'z' || (factor + n > 'Z' && factor <= 'Z'))
				answer += (char) (factor + n - 26);
			else
				answer += (char) (factor + n);
		}
		return answer;
	}

}
