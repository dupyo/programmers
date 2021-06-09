package patternMatching;

public class RemoveUnmatchedCode {

	public static void main(String[] args) {
		String p = "101";
		String s = "10100010101101100";
		System.out.println(new RemoveUnmatchedCode().solution(p, s));
	}
	
	public int solution(String p, String s) {
		int answer = 0;
		String res = "";
		String tmp = "";
		int pIdx = 0;
		for(int i = 0; i < s.length(); i++) {
			if(p.charAt(pIdx%p.length()) == s.charAt(i)) {
				tmp+=p.charAt(pIdx%p.length());
				pIdx++;
				if(tmp.equals(p)) {
					tmp="";
				}
			} else {
				answer++;
				res+=s.charAt(i);
			}
		}
		if(tmp.length() > 0 && !tmp.equals(p)) {
			answer+=tmp.length();
			res+=tmp;
		}
		if(s.length() == res.length())
			return -1;
		else
			return answer;
	}
}
