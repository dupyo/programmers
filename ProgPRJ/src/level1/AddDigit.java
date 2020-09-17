package level1;

public class AddDigit {

	public static void main(String[] args) {
		//자릿수 더하기
		int n = 987;
		System.out.println(new AddDigit().solution(n));
	}
	public int solution(int n) {
		int answer = 0;
		int dig = 1;
		int add = 0;
		for(int i=1; i<=100000000; i*=10) {
			if(n/i < 10)
				break;
			else
				dig++;
		}
		//int dig = Integer.toString(n).length();
		while(dig > 0) {
			add = (int)Math.pow(10, --dig);
			answer += (n/add);
			n-=(n/add)*add;
		}
		return answer;
	}

}
