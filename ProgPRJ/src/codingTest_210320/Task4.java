package codingTest_210320;

public class Task4 {

	public static void main(String[] args) {
		System.out.println("" + new Task4().solution("CABCD"));
	}
	
public String solution(String S) {
		String N [] = {"AB", "BA", "CD", "DC"};
		int cnt = 0;
		String pre = "";
		int is_over_4 = 0;
		while(is_over_4 < 5) {
			pre=S;
			S=S.replaceAll(N[cnt%4], "");
			if(pre.equals(S))
				is_over_4++;
			else
				is_over_4=0;
			cnt++;
		}
		
		return S;
	}

}
