package level1;

public class CollatzConjecture {

	public static void main(String[] args) {
		// 콜라츠 추측
		int num = 626331;
		System.out.println(solution(num));
	}
	
	public static int solution(int num) {
		int cnt = 0;
		while (num > 1 & cnt < 500) { // 계산 과정에서 num이 정수형 범위를 벗어나면 음수로 변환되기 때문에 (num > 1) 조건식 사용
			num = (num % 2 == 0) ? num / 2 : (num * 3) + 1;
			cnt++;
		}
		return (num == 1) ? cnt : -1;
	}

}
