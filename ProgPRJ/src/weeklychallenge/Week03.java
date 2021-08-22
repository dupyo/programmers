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
		// 1. 두 배열을 서로 다른 일차원 배열로 변환한다
		int answer = -1;
		int[] gameboardArray = new int[game_board.length * game_board.length];
		int[] tableArray = new int[gameboardArray.length];
		for(int i = 0; i < gameboardArray[i.length; i++)
			gameboardArray[i] = game_board[i % game_board.length];
		for(int i = 0; i < tableArray.length; i++)
			tableArray[i] = table[i % table.length];
		
		System.out.println("game board " + Arrays.toString(gameboardArray));
		System.out.println("table " + Arrays.toString(tableArray));
		return answer;
	}
	
	public static String array2String(int[] arr) {
		String str = "";
		for(int value : arr)
			str += value;
		return str;
	}

}
