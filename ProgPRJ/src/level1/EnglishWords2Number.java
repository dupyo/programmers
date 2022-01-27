package level1;

public class EnglishWords2Number {

	public static void main(String[] args) {
		// 숫자 문자열과 영단어
		String s = "one4seveneight";
		System.out.println(solution(s));
	}

	public static int solution(String s) {
		String[] words = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		try {
			return Integer.parseInt(s);
		} catch (NumberFormatException e) {
			for (int i = 0; i < words.length; i++)
				s = s.replaceAll(words[i], "" + i);
		}
		return Integer.parseInt(s);
	}
}
