package weeklychallenge;

public class Week04 {

	public static void main(String[] args) {
		// 직업군 추천하기
		String[] table = { "SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++",
				"HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP",
				"GAME C++ C# JAVASCRIPT C JAVA" };
		String[] languages = { "PYTHON", "C++", "SQL" };
		int[] preference = { 7, 5, 5 };
		System.out.println(solution(table, languages, preference));
	}
	public static String solution(String[] table, String[] languages, int[] preference) {
		String answer = "";
		int max = 0;
		for(int i = 0; i < table.length; i++) {
			String[] rank = table[i].split(" ");
			int sum = 0;
			for(int j = 0; j < languages.length; j++) 
				sum += (pointByRank(rank, languages[j]) * preference[j]);
			if(max <= sum) {
				answer = (max == sum && rank[0].compareTo(answer) > 0) ? answer : rank[0]; 
				max = sum;
			}
		}
		return answer;
	}
	public static int pointByRank(String[] rank, String language) {
		for(int i = 1; i < rank.length; i++) {
			if(rank[i].equals(language))
				return 6 - i;
		}
		return 0;
	}

}
