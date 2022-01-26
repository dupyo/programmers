package level1;

public class AddFreeNumber {

	public static void main(String[] args) {
		// 없는 숫자 더하기
		int[] numbers = { 1, 2, 3, 4, 6, 7, 8, 0 };
		System.out.println(solution(numbers));
	}

	public static int solution(int[] numbers) {
		int answer = 45;
		for (int i = 0; i < numbers.length; i++)
			answer -= numbers[i];
		return answer;
	}
}
