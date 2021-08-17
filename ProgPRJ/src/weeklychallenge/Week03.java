package weeklychallenge;

import java.util.Arrays;

public class Week03 {

	public static void main(String[] args) {
		// 퍼즐 조각 채우기
		int[][] game_board = { { 1, 1, 0, 0, 1, 0 }, { 0, 0, 1, 0, 1, 0 }, { 0, 1, 1, 0, 0, 1 }, { 1, 1, 0, 1, 1, 1 },
				{ 1, 0, 0, 0, 1, 0 }, { 0, 1, 1, 1, 0, 0 } };
		int[][] table = { { 1, 0, 0, 1, 1, 0 }, { 1, 0, 1, 0, 1, 0 }, { 0, 1, 1, 0, 1, 1 }, { 0, 0, 1, 0, 0, 0 },
				{ 1, 1, 0, 1, 1, 0 }, { 0, 1, 0, 0, 0, 0 } };
		System.out.println(solution(game_board, table));
	}

	public static int solution(int[][] game_board, int[][] table) {
		// 1. 도형이 있는 위치에 이진법으로 연산한 값을 저장한다
		int answer = -1;
		int[] decimalbyGameboard = new int[game_board.length];
		int[] decimalbyTable = new int[table.length];
		for(int i = 0; i < game_board.length; i++) {
			decimalbyGameboard[i] = Integer.parseInt(arrayToString(game_board[i]), 2);
		}
		for(int i = 0; i < table.length; i++) {
			decimalbyTable[i] = Integer.parseInt(arrayToString(table[i]), 2);
		}
		System.out.println("game board " + Arrays.toString(decimalbyGameboard));
		System.out.println("table " + Arrays.toString(decimalbyTable));
		for(int i = 0; i < decimalbyTable.length; i++) {
			System.out.println(Integer.toBinaryString(decimalbyGameboard[i] & decimalbyTable[i]));
		}
		return answer;
	}
	
	public static String arrayToString(int[] arr) {
		String answer = "";
		for(int value : arr)
			answer += value;
		return answer;
	}

}
