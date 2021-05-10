package level2;

public class PresentOfDigit {

	public static void main(String[] args) {
		int n = 15;
		System.out.println(new PresentOfDigit().solution(n));
	}
	
	public int solution(int n) {
        int answer = 0;
		int sum = 0;
		int start = 0;
		for (int i = 1; i < (n / 2) + 1; i++) {
			sum = 0;
			start=i;
			while (sum < n) {
				sum += start;
				start++;
				if (sum == n) {
					answer += 1;
					break;
				}
			}
		}
		answer++;

		return answer;
    }
	
	//자신의 약수 중 홀수의 개수

}
