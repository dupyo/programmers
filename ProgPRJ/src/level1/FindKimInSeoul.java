package level1;

public class FindKimInSeoul {

	public static void main(String[] args) {
		// 서울에서 김서방 찾기
		String[] seoul = { "Jane", "Kia", "Srr", "Kim", "Srr" };
		System.out.println(solution(seoul));
	}

	public static String solution(String[] seoul) {
		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim"))
				return "김서방은 " + i + "에 있다";
		}
		return "";
	}

}
