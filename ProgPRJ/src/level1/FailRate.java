package level1;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class FailRate {

	public static void main(String[] args) {
		
		int N=5;
		int [] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		System.out.println("jinsu : " + Arrays.toString(new FailRate().solution1(N, stages)));
		System.out.println("dupyo : " + Arrays.toString(new FailRate().solution(N, stages)));
	}
	///////////////////////////////////////////////////////////
	public int[] solution1(int N, int[] stages) {
		double[] failureRate = new double[N]; //실패율 배열
		double denominator = 0; //분모 
		double numerator = 0; //분자
		
		int[] answer = new int[N];
		int answerTmp;
		
		for(int i=0; i < N; i++ ) {
		//1,2,3,4,5
		for(int j=0; j < stages.length; j++) {
			//2,1,2,6,2,4,3,3
			if( (i+1) < stages[j]) {
				//분모 : N 보다 큰 배열 값 갯수
				denominator++;
			}else if((i+1) == stages[j]){
				denominator++;
				numerator++;
			}
		}
		failureRate[i] = (numerator/denominator);
		denominator =0;
		numerator =0;
		answer[i] = i+1;
		}
		
		//Selection Sort
		double temp = 0 ; //데이터 Swap용 임시 변수
		for( int i=0; i < failureRate.length-1; i++){
			//i = 0,1,2,3
			for (int j=i+1; j<failureRate.length; j++){
				//j = 1,2,3,4
				if(failureRate[i] < failureRate[j]){ //오름차순 ; 큰수를 뒤로, data[i] > data[j]
										//내림차순 ; 큰수를 앞으로, data[i] < data[j]
					//데이터 값 체인지
					temp = failureRate[i];
					failureRate[i] = failureRate[j];
					failureRate[j] = temp;

					answerTmp = answer[i];
					answer[i] = answer[j];
					answer[j] = answerTmp;
				}else if(failureRate[i] == failureRate[j]) {
					if(answer[i] > answer[j]) {
						temp = failureRate[i];
						failureRate[i] = failureRate[j];
						failureRate[j] = temp;
						answerTmp = answer[i];
						answer[i] = answer[j];
						answer[j] = answerTmp;
					}
				}
			}
		}
		
		//실패율이 높은 스테이지부터 내림차순
		//실패율이 같은 스테이지가 있다면 작은 번호의 스테이지가 먼저 오도록 
		
		//for(int k =0; k < )
		return answer;
	}
	
	
	////////////////////////////////////////////////////////////
	//실패율
	public int[] solution(int N, int[] stages) {
		int [] answer = new int [N]; //실패율 높은 스테이지 순으로 정렬할 배열. 
		int i=0, cnt=1; //스테이지 배열 인덱스, 실패한 스테이지 개수
		float [][] answerD = new float [N][2]; //[N][0]은 실패율, [N][1]은 스테이지 번호 
		Arrays.sort(stages);
		
		while((i < stages.length)&&(stages[i] != N+1)) {
			if((i+cnt) < stages.length && stages[i] == stages[i+cnt]) {
				cnt++;
			} else {
				answerD[stages[i]-1][0]=cnt/(float)(stages.length-i);
				answerD[stages[i]-1][1]=stages[i];
				i+=cnt;
				cnt=1;
			}
		}
		
		for(int j=0; j < N; j++) {
			if(answerD[j][0] == 0)
				answerD[j][1]=j+1;
		}
		
		Arrays.sort(answerD, new Comparator<float[]>() {
			@Override
			public int compare(float[] arr1, float[] arr2) {
				if(arr1[0] == arr2[0])
					return (int)(arr1[1]-arr2[1]);
				else if(arr2[0] > arr1[0])
					return 1;
				else
					return -1;
			}
		});
		
		for(int j=0; j < N; j++)
			answer[j]=(int)answerD[j][1];

		return answer;
	}

}
