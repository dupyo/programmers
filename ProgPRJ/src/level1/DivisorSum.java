package level1;

public class DivisorSum {

	public static void main(String[] args) {
		// 약수의 합
		int n = 2;
		System.out.println(solution(n));
	}

	public static int solution(int n) {
		if (n == 1)
			return n;
		int sum = 0;
		int tmp = n;
		for (int i = 1; i < tmp; i++) {
			if (n % i == 0) {
				sum += (i * i == n) ? i : i + (n / i);
				tmp = n / i;
			}
		}
		return sum;
	}

}
