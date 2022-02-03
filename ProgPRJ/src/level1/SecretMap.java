package level1;

public class SecretMap {

	public static void main(String[] args) {
		// [1차] 비밀지도
		int n = 6;
		int[] arr1 = { 46, 33, 33, 22, 31, 50 };
		int[] arr2 = { 27, 56, 19, 14, 14, 10 };
		System.out.println(solution(n, arr1, arr2));
	}

	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		for (int i = 0; i < n; i++) {
			int targetBit = 1;
			int or = arr1[i] | arr2[i];
			answer[i] = "";
			for (int j = 0; j < n; j++) {
				answer[i] = ((or & (targetBit << j)) > 0 ? "#" : " ") + answer[i];
			}
		}
		return answer;
	}

}
