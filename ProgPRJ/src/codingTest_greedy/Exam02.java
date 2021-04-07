package codingTest_greedy;

public class Exam02 {

	public static void main(String[] args) {
		String S="02984";
		System.out.println(new Exam02().solution(S));
	}
	
	public int solution(String S) {
		int answer=0;
		
		for(char n : S.toCharArray()) {
			int num = Character.getNumericValue(n);
			if(num < 2)
				answer+=num;
			else if(answer < 2)
				answer+=num;
			else
				answer*=num;
		}
		
		return answer;
	}

}
