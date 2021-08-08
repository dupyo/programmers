package level1;

public class SumBtw2Ints {

	public static void main(String[] args) {
		// 두 정수 사이의 합
		int a = 5;
		int b = 3;
		System.out.println(solution(a, b));
	}

	public static long solution(int a, int b) {
		long swNsum = 0;
		if (a > b) {
			swNsum = a;
			a = b;
			b = (int) swNsum;
			swNsum = 0;
		}
		for (int i = a; i <= b; i++)
			swNsum += i;
		return swNsum;
	}

}
