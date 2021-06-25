package level2;

import java.util.Arrays;

public class DifferentBitInTwo {

	public static void main(String[] args) {
		// 2개 이하로 다른 비트
		long[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 31, 47, 85, 91, 93, 95, 157, 167 };
		// long[] numbers = { 1001, 337, 0, 1, 333, 673, 343, 221, 898, 997, 121, 1015,
		// 665, 779, 891, 421, 222, 256, 512, 128, 100 };
		System.out.println(Arrays.toString(new DifferentBitInTwo().solution(numbers)));
	}

	public long[] solution(long[] numbers) {
		long[] answer = new long[numbers.length];
		int i = 0;
		for (long number : numbers) {
			// 2개 이하로 다른 비트를 찾는 규칙 존재
			answer[i++] = ((number ^ (number+1))>>2) + number + 1;
			
			// 내 소스 코드 - 비트, 쉬프트 연산하는 반복문 처리는 시간 초과로 인해 테스트 케이스를 통과하기 어려움#################
//			System.out.println(number + " : " + Long.bitCount(number));
//			if (number % 2 == 0) { // 짝수 처리
//				answer[i++] = number + 1;
//				continue;
//			}
//			if ((number & (number + 1)) == 0) { // 2의 거듭제곱 - 1
//				answer[i++] = ((number + 1) * 2) - ((number + 1) / 2 + 1);
//				continue;
//			}
//			long targetIndex = 0;
//			while (true) {
//				if ((number >> ++targetIndex) % 2 == 0) { // 그외 홀수 처리
//					long frontNumber = (number >> (targetIndex)) << targetIndex;
//					answer[i++] = frontNumber + (1 << targetIndex) + ((number - frontNumber) >> 1);
//					break;
//				}
//			}
//			System.out.println(Long.toBinaryString(answer[(i - 1)]));
			// 내 소스 코드 ##########################################################################
		}
		System.out.println("-------");
		return answer;
	}

}
