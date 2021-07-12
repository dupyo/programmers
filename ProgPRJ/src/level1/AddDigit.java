package level1;

public class AddDigit {

	public static void main(String[] args) {
		//자릿수 더하기
		int n = 983123123;
		System.out.println(solution(n));
	}
	public static int solution(int n) {
		int answer = 0;
		for(char num : Integer.toString(n).toCharArray())
			answer+=Character.getNumericValue(num);
		return answer;
	}

}
