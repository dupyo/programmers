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
		return Math.max(price * count * (count + 1) / 2, 0);	// 클린 코드
	}

}
