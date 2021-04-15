package level1;

import java.util.Arrays;

public class FindKimInSeoul {

	public static void main(String[] args) {
		String[] seoul = {"Jane", "Kia", "Srr", "Kim", "Srr"};
		System.out.println(new FindKimInSeoul().solution(seoul));
	}
	
	public String solution(String[] seoul) {
		String answer="";
//		int i = Arrays.asList(seoul).indexOf("Kim");
//		answer="김서방은 "+i+"에 있다";
		int i=0;
		while(true) {
			if(seoul[i].equals("Kim")) {
				i++;
				break;
			}
		}
		answer="김서방은 "+i+"에 있다";
		return answer;
	}

}
