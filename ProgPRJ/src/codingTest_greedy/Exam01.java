package codingTest_greedy;

public class Exam01 {

	public static void main(String[] args) {
		int N=26, k=3;
		System.out.println(new Exam01().solution(N, k));
	}
	
	public int solution(int N, int k) {
		int answer=0;
		int mok=0;
		while(true) {
			mok=(N/k);
			answer+=N-(mok*k);
			N=mok*k;
			if(N<k)
				break;
			N/=k;
			answer++;
		}
		answer+=N-1;
		return answer;
	}

}
