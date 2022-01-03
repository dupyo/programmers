package level1;

import java.util.Arrays;

public class MatrixSum {

	public static void main(String[] args) {
		// 행렬의 덧셈
		int [][] arr1 = {{1, 2}, {2, 3}};
		int [][] arr2 = {{3, 4}, {5, 6}};
		System.out.println(Arrays.deepToString(solution(arr1, arr2)));

	}
	
	public static int[][] solution(int[][] arr1, int[][] arr2) {
		int dep1 = arr1.length;
		int dep2 = arr1[0].length;
		int[][] answer = new int [dep1][dep2];
		for (int i = 0; i < dep1; i++) {
			for (int j = 0; j < dep2; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		return answer;
	}

}
