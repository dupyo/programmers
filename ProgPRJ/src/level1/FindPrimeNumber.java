package level1;

public class FindPrimeNumber {

	public static void main(String[] args) {
		// 소수 찾기
		int n = 10;
		System.out.println(solution(n));
	}

	public static int solution(int n) {
		if (n == 2) {
			return 1;
		}
		int answer = 2;
		for (int i = 5; i <= n; i += 2) {
			int j = 3;
			while (j < Math.sqrt(i)) {
				if (i % j == 0) {
					break;
				}
				j += 2;
			}
			if (j > Math.sqrt(i)) {
				answer++;
			}
		}
		return answer;
	}
}
