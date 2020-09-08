package level1;

public class OddText {

	public static void main(String[] args) {
		//이상한 문자 만들기
		String s = "try hello world";
		System.out.println(new OddText().solution(s));
	}
	
	//이상한 문자 만들기
	public String solution(String s) {
		char [] aphs = s.toCharArray();
		int idx = 0;
		for(int i=0; i<aphs.length; i++) {
			if(aphs[i] == ' ') {
				idx=0;
			} else if(idx%2==0) {
				aphs[i]=Character.toUpperCase(aphs[i]);
				idx++;
			} else {
				aphs[i]=Character.toLowerCase(aphs[i]);
				idx++;
			}
		}
		return String.valueOf(aphs);
	}
}
