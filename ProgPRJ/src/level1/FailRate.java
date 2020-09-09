package level1;

import java.util.Arrays;
import java.util.Random;

public class FailRate {

	public static void main(String[] args) {
		//실패율
		while(true) {
			Random random1 = new Random();
			int N=random1.nextInt(500);
			int[] stages = new int[random1.nextInt(30)+1];
			Random random = new Random();
			for (int i=0; i < stages.length; i++) {
				stages[i] =  (random.nextInt(N+1)+1);	
			}
			if(!Arrays.toString(new FailRate().solution(N, stages)).equals(Arrays.toString(solution1(N, stages)))) {
				System.out.println("stages : " + Arrays.toString(stages));
				break;
			}
		}
		/*int N=474;
		int [] stages = {2, 2, 3, 5, 6, 6, 6, 6};
		System.out.println("jinsu : " + Arrays.toString(solution1(N, stages)));
		System.out.println("dupyo : " + Arrays.toString(new FailRate().solution(N, stages)));*/
	}
	///////////////////////////////////////////////////////////
	   public static int[] solution1(int N, int[] stages) {
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
		double [] answerD = new double [N]; //실패율 높은 스테이지 순으로 정렬할 배열. 
		int [] answer = new int [N]; //실패율 높은 스테이지 순으로 정렬할 배열. 
		Arrays.sort(stages);
		//System.out.println("sort : " + Arrays.toString(stages));
		//System.out.println();
		int i=0, cnt=1; //스테이지 번호, 실패한 스테이지 개수
		while(i < stages.length) {
			if(stages[i] == N+1) {
				break;
			} else if((i+cnt) < stages.length && stages[i] == stages[i+cnt]) {
				cnt++;
			} else {
				answerD[stages[i]-1]=(long)((1.0-((double)cnt/(double)(stages.length-i)))*1000000000.0)+((double)(stages[i])/1000.0);
				i+=cnt;
				cnt=1;
			}
		}
		for(int j=0; j < N; j++) {
			if(answerD[j] == 0)
				answerD[j]=1000000000.0+((double)(j+1)/1000.0);
		}
		//System.out.println("answerD1 : " + Arrays.toString(answerD));
		Arrays.sort(answerD);
		//System.out.println("answerD2 : " + Arrays.toString(answerD));
		//System.out.println(Math.round((answerD[0]-(long)answerD[0])*1000.0));
		for(int j=0; j < N; j++) {
			//System.out.println("round"+j+" : " + Math.round((answerD[j]-(int)answerD[j])*1000.0));
			//System.out.println(j+"th : " + ((answerD[j]-(int)answerD[j])));
			//System.out.println();
			answerD[j]=Math.round((answerD[j]-(int)answerD[j])*1000.0);
			answer[j]=(int)answerD[j];
		}
		return answer;
	}

}
