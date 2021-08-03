package weeklychallenge;

public class Week01 {

	public static void main(String[] args) {
		// 부족한 금액 계산하기
		int price = 3;
		int money = 20;
		int count = 4;
		System.out.println(solution(price, money, count));
	}

	public static long solution(int price, int money, int count) {
		long answer = (long)price * (long)count * (long)(count + 1) / 2 - (long)money;
		if(answer <= 0)
			return 0;
		return answer;
	}

}
