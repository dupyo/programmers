package level1;

public class CollatzConjecture {

	public static void main(String[] args) {
		// 콜라츠 추측
		int num = 4;
		System.out.println(solution(num));

	}
	
	public static int solution(int num) {
		int cnt = 0;
		while (num != 1 & num > 0 & cnt < 500) {
			num = (num % 2 == 0) ? num / 2 : (num * 3) + 1;
			cnt++;
		}
		return (num == 1) ? cnt : -1;
	}

}
