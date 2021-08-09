package level1;

public class SumBtw2Ints {

	public static void main(String[] args) {
		// 두 정수 사이의 합
		int a = 5;
		int b = 3;
		System.out.println(solution(a, b));
	}

	public static long solution(int a, int b) {
		int start = Math.max(a, b);
		int end = Math.min(a, b);
		// 시그마 활용 sum(1:end) - sum(1:start-1) (단, end > start)
		return end * (end + 1) / 2 - start * (start - 1) / 2;
	}

}
