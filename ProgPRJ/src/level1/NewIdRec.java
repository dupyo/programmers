package level1;

public class NewIdRec {

	public static void main(String[] args) {
		String new_id = "a=b";
		System.out.println("answer : " + new NewIdRec().solution(new_id));
	}

	public String solution(String new_id) {
		String answer = "";
		// 1단계 대문자 -> 소문자
		new_id = new_id.toLowerCase();

		// 2단계 알파벳, 숫자, 빼기(-), 밑줄(_), 마침표(.) 제외한 모든 문자 제거
		for (Character c : new_id.toCharArray()) {
			if (Character.isAlphabetic(c) || Character.isDigit(c) || c == '-' || c == '_' || c == '.')
				answer += c;
		}

		// 3단계 마침표(.) 2번 이상 연속된다면 한 개로 치환

//		boolean areDots = true;
//		while (areDots) {
//			if (answer.contains(".."))
//				answer = answer.replace("..", ".");
//			else
//				areDots = false;
//		}

		answer = answer.replaceAll("\\.{2,}", ".");

		// 4단계 처음이나 끝에 위치한 마침표(.) 제거
		answer = answer.replaceAll("^\\.", "");
		answer = answer.replaceAll("\\.$", "");

		// 5단계 빈 문자열이라면, "a" 대입
		if (answer.isEmpty())
			answer = "a";

		// 6단계 16자 이상이라면, 첫 15개의 문자 제외한 나머지 제거. 만약 제거 후 마침표(.)가 끝에 위치한다면 마침표(.) 제거
		if (answer.length() >= 16)
			answer = answer.substring(0, 15);
		answer = answer.replaceAll("\\.$", "");

		// 7단계 2자 이하라면, 마지막 문자를 길이가 3이 될 때까지 반복
		while (answer.length() <= 2)
			answer += answer.substring(answer.length() - 1);

		return answer;
	}

}
