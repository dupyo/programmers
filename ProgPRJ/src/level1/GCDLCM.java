package level1;

import java.util.Arrays;

public class GCDLCM {

	public static void main(String[] args) {
		//최대공약수와 최소공배수
		int n = 42, m = 12;
		System.out.println(Arrays.toString(new GCDLCM().solution(n, m)));
	}
	
	//최대공약수와 최소공배수
	public int[] solution(int n, int m) {
		if(n > m) {
			int sw=n;
			n=m;
			m=sw;
		}
		int [] answer = {n, m}; //최종 결과 : answer[0](최대공약수) <= answer[1](최소공배수)
		while(!(n%answer[0] == 0 && m%answer[0] == 0)) //최대공약수 구하는 방법
			answer[0]--;
		
		while(!(answer[1]%m == 0 && answer[1]%n == 0)) //최소공배수 구하는 방법
			answer[1]++;
		
		return answer;
	} //유클리드 호제법 응용

}
