package codingTest_greedy;

public class Exam00 {

	public static void main(String[] args) {
		int N=1260;
		System.out.println(new Exam00().solution(N));
	}
	
	public int solution(int N) {
		int[] n={500, 100, 50, 10};
		int i=0;
		int j=0;
		int answer=0;
		while(N > 0) {
			if(i * n[j] < N) {
				i++;
			} else {
				if((i-1)*n[j]==N || (i)*n[j]>N)
					i--;
				answer+=i;
				N-=i*n[j];
				j++;
				i=1;
			}
		}
		return answer;
	}

}
