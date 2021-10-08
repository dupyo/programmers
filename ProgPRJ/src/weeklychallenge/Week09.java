package weeklychallenge;

import java.util.Arrays;

public class Week09 {

	public static void main(String[] args) {
		// 전력망을 둘로 나누기
		int n = 7;
		int[][] wires = { { 1, 2 }, { 2, 7 }, { 3, 7 }, { 3, 4 }, { 4, 5 }, { 6, 7 } };
		System.out.println(solution(n, wires)); // result : 3
	}

	public static int solution(int n, int[][] wires) {
		int answer = -1;
		int[] neighbors = new int[n + 1];
		for (int i = 0; i < n - 1; i++) {
			neighbors[wires[i][0]]++;
			neighbors[wires[i][1]]++;
		}
		System.out.println(Arrays.toString(neighbors));
		return answer;
	}

}
