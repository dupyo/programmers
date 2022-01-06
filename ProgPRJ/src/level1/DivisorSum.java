package level1;

public class DivisorSum {

	public static void main(String[] args) {
		// 약수의 합
		int n = 25;
		System.out.println(solution(n));
	}

	public static int solution(int n) {
		if (n == 1)
			return n;
		int sum = 0;
		double sqrt = Math.sqrt(n);
		for (int i = 1; i <= sqrt; i++) {
			if (n % i == 0)
				sum += (i == sqrt) ? i : i + (n / i);
		}
		return sum;
	}

}
