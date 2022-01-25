package level1;

public class FindRemainderOne {

	public static void main(String[] args) {
		// 나머지가 1이 되는 수 찾기
		int n = 12;
		System.out.println(solution(n));
	}

	public static int solution(int n) {
		for (int i = 2; i <= Math.sqrt(n) + 1; i++) {
			if (n % i == 1)
				return i;
		}
		return n - 1;
	}
}
