package codingTest_greedy;

public class Exam01 {

	public static void main(String[] args) {
		int N=25, k=3;
		System.out.println(new Exam01().solution(N, k));
	}
	
	public int solution(int N, int k) {
		int answer=0;
		while(N>1) {
			/*if(N%k == 0)
				N=N/k;
			else
				N--;*/
			N=(N%k==0) ? N/k : N-1;
			answer++;
		}
		return answer;
	}

}
