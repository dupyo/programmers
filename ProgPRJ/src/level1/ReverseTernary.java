package level1;

public class ReverseTernary {

	public static void main(String[] args) {
		//3진법 뒤집기
		int n = 125;
		System.out.println(new ReverseTernary().solution(n));
	}
	
	public int solution(int n) {
		int answer = 0;
		String ternaries = "";
		while(n > 0) {
			ternaries=(n%3)+ternaries;
			n=n/3;
		}
		for(int i = 0; i < ternaries.length(); i++)
			answer+=Math.pow(3, i)*(int)(ternaries.charAt(i)-'0');
		return answer;
	}
}
