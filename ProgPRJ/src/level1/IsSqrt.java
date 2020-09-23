package level1;

public class IsSqrt {

	public static void main(String[] args) {
		//정수 제곱근 판별
		long n = 9;
		System.out.println(new IsSqrt().solution(n));
	}
	//정수 제곱근 판별
	public long solution(long n) {
		long answer = 0;
		long sqrt = (long)Math.sqrt(n);
		if(sqrt*sqrt == n) {
			answer=(sqrt+1)*(sqrt+1);
		} else {
			answer=-1;
		}
		return answer;
	}

}
