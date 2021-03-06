package codingTest_210312;

public class Task3 {

	public static void main(String[] args) {
		System.out.println("" + new Task3().solution("ABACBADCCDC"));
	}
	
public String solution(String S) {
		String N [] = {"AB", "BA", "CD", "DC"};
		String pre = "";
		int cnt = 0;
		int is_over_4 = 0;

		while(is_over_4 < 5) {
			S=S.replaceAll(N[cnt++%4], "");
			if(pre.equals(S))
				is_over_4++;
			else {
				pre=S;
				is_over_4=0;
			}
		}
		
		return S;
	}

}