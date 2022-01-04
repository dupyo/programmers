package level1;

public class HarshadNumber {

	public static void main(String[] args) {
		// 하샤드 수
		int x = 270;
		System.out.println(solution(x));
	}
	
	public static boolean solution(int x) {
		int sum = 0;
		int tmp = x;
		while (tmp > 0) {
			sum += tmp - (tmp / 10 * 10);
			tmp /= 10;
		}
		return x % sum == 0;
	}

}
