package level1;

public class ReverseTernary {

	public static void main(String[] args) {
		// 3진법 뒤집기
		int n = 125;
		System.out.println(solution(n));
	}
	public static int solution(int n) {
		String ternary = "";
		while(n > 0) {
			ternary += (n % 3);
			n /= 3;
		}
		return Integer.parseInt(ternary, 3);
	}
}
