package level1;

public class PosiNegaSum {

	public static void main(String[] args) {
		//음양 더하기
		int[] absolutes = {4,7,12};
		boolean[] signs = {true,false,true};
		System.out.println(new PosiNegaSum().solution(absolutes, signs));
	}

	public int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
		for(int i=0; i < absolutes.length; i++)
			answer+=absolutes[i]*(signs[i] ? 1 : -1);
		return answer;
	}
}
