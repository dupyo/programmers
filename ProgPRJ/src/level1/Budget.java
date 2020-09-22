package level1;

import java.util.Arrays;

public class Budget {

	public static void main(String[] args) {
		//예산
		int [] d = {2,2,3,1,1,5};
		int budget = 10;
		System.out.println(new Budget().solution(d, budget));
	}
	//예산
	public int solution(int[] d, int budget) {
		int answer = 0;
		int sum = 0;
		Arrays.sort(d);
		while((d.length > answer) && (budget >= (sum+d[answer]))) 
			sum+=d[answer++];
		return answer;
	}

}
