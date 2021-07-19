package level1;

public class IsIntegerSquareRoot {

	public static void main(String[] args) {
		// 정수 제곱근 판별
		long n = 9;
		System.out.println(new IsIntegerSquareRoot().solution(n));
	}

	// 정수 제곱근 판별
	public long solution(long n) {
		long sqrt = (long) Math.sqrt(n);
		if (sqrt * sqrt == n)
			return (sqrt + 1) * (sqrt + 1);
		return -1;
	}

}
