package level1;

public class DivisorAddOrSub {

	public static void main(String[] args) {
		// 약수의 개수와 덧셈
		int left = 13;
		int right = 17;
		System.out.println(solution(left, right));
	}

	public static int solution(int left, int right) {
		int answer = 0;
		for (int num = left; num <= right; num++) {
			answer += (num % Math.sqrt(num) == 0) ? -num : num;
		}
		return answer;
	}

}
