package level1;

public class ArrAvg {

	public static void main(String[] args) {
		// 평균 구하기
		int[] arr = { 5, 5 };
		System.out.println(solution(arr));
	}

	// 평균 구하기
	public static double solution(int[] arr) {
		double sum = 0;
		for (int i : arr)
			sum += i;
		return sum / arr.length;
	}

}
