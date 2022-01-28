package level1;

public class MinimalRectangle {

	public static void main(String[] args) {
		// 최소직사각형
		int[][] sizes = { { 60, 50 }, { 30, 70 }, { 60, 30 }, { 80, 40 } };
		System.out.println(solution(sizes));
	}

	public static int solution(int[][] sizes) {
		int[] max = new int[2];
		// [n][0]에 더 긴 길이, [n][1]에 더 짧은 길이로 다시 정렬하고 각각의 최댓값을 곱하여 크기 계산
		for (int i = 0; i < sizes.length; i++) {
			max[0] = Math.max(max[0], Math.max(sizes[i][0], sizes[i][1]));
			max[1] = Math.max(max[1], Math.min(sizes[i][0], sizes[i][1]));
		}
		return max[0] * max[1];
	}

}
