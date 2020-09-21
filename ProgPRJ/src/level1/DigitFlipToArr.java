package level1;

import java.util.Arrays;

public class DigitFlipToArr {

	public static void main(String[] args) {
		//자연수 뒤집어 배열로 만들기
		long n = 999898;
		System.out.println(Arrays.toString(new DigitFlipToArr().solution(n)));
	}
	
	//자연수 뒤집어 배열로 만들기
	public int[] solution(long n) {
		/*int dig = 1;
		long n2 = n;
		while(true) {
			n2/=10;
			if(n2+9 < 10)
				break;
			dig++;
		}
		int[] answer = new int [dig];
		for(int i=0; i < dig; i++) {
			answer[i]=(int)(n%10);
			n/=10;
		}*/
		String nStr = Long.toString(n);
		int [] answer = new int [nStr.length()];
		for(int i=0; i < nStr.length(); i++)
			answer[i]=Integer.parseInt(""+nStr.charAt(nStr.length()-1-i));
		return answer;
	}

}
