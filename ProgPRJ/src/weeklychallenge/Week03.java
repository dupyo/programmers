package weeklychallenge;

public class Week03 {

	public static void main(String[] args) {
		// 퍼즐 조각 채우기
		int[][] game_board = {{1,1,0,0,1,0},{0,0,1,0,1,0},{0,1,1,0,0,1},{1,1,0,1,1,1},{1,0,0,0,1,0},{0,1,1,1,0,0}};
		int[][] table = {{1,0,0,1,1,0},{1,0,1,0,1,0},{0,1,1,0,1,1},{0,0,1,0,0,0},{1,1,0,1,1,0},{0,1,0,0,0,0}};
		System.out.println(solution(game_board, table));
	}

	public static int solution(int[][] game_board, int[][] table) {
		// 1. 도형이 있는 위치에 이진법으로 연산한 값을 저장한다
		int answer = -1;
		return answer;
	}

}
