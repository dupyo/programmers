package patternMatching;

public class RemoveUnmatchedCode {

	public static void main(String[] args) {
		String p = "101";
		String s = "10100010101101100";
		System.out.println(new RemoveUnmatchedCode().solution(p, s));
	}

	public int solution(String p, String s) {
		int answer = 0;
		String removed = "";
		String tmp_pattern = "";
		int p_i = 0;
		for (int i = 0; i < s.length(); i++) {
			if (p.charAt(p_i % p.length()) == s.charAt(i)) {
				tmp_pattern += p.charAt(p_i % p.length());
				p_i++;
				if (tmp_pattern.equals(p))
					tmp_pattern = "";
			} else {
				answer++;
				removed += s.charAt(i);
			}
		}
		if (tmp_pattern.length() > 0 && !tmp_pattern.equals(p)) {
			answer += tmp_pattern.length();
			removed += tmp_pattern;
		}
		if (s.length() == removed.length())
			return -1;
		else
			return answer;
	}
}
