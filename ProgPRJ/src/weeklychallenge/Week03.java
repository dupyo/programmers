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
		for(int i = 0; i < gameboardArray.length; i++) {
			for(int j = 0; j < tableArray.length; j++) {
				gameboardArray[i] = game_board[i % game_board.length][j % table.length];
				tableArray[i] = table[i % table.length][j % table.length];
			}
		}
		
		System.out.println("game board " + Arrays.toString(gameboardArray));
		System.out.println("table " + Arrays.toString(tableArray));
		return answer;
	}
	
}
