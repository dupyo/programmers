package level1;

public class OddEven {

	public static void main(String[] args) {
		// 짝수와 홀수
		int num = 11289;
		System.out.println(solution(num));

	}

	public static String solution(int num) {
		if (num % 2 == 0)
			return "Even";
		return "Odd";
	}

}
