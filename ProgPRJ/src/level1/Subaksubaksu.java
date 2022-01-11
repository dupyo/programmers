package level1;

public class Subaksubaksu {

	public static void main(String[] args) {
		// 수박수박수박수박수박수?
		int n = 11;
		System.out.println(solution(n));
	}

	public static String solution(int n) {
		String answer = "";
		int remainder = (n % 2);
		for(int i = 0; i < (n + remainder) / 2; i++) {
			answer += "수박";
		}
		return answer.substring(0, n);
	}

}
