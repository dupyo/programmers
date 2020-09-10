package competitions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Competition2 {

	public static void main(String[] args) {
		int n=5;
		System.out.println(Arrays.toString(new Competition2().solution(n)));

	}
	
	public int[] solution(int n) {
        
		/*if(n==1) {
			int [] answer = {1};
			return answer;
		} else if(n==2) {
			int [] answer = {1,2};
			return answer;
		}
		int dir=0; //3으로나눠서 0일땐 +1점화식, 1일땐 +1등차수열, 2일땐 -1점화식
		int idx=0; //인덱스
		int idxSum=1; //누적되어 더해지는 인덱스 수
		int cntSum=1; //누적되어 더해지는 카운트수
		int[] answer = new int [n*(n+1)/2];
		for(int i=n; i>0; i--) { //i는채울숫자
			if(dir%3==0) {
				for(int j=1; j<=i; j++) {
					answer[idx]=j;
					System.out.println("answer : " +Arrays.toString(answer));
					System.out.println("idx : " +idx);
					idx+=idxSum++;
				}
			} else if(dir%3==1) {
				for(int j=1; j<=i; j++) {
					
				}
			} else {
				for(int j=1; j<=i; j++) {
				}
			}
			dir++;
			System.out.println("dir : " + dir);
		}*/
		List<Integer> listAnswer = new ArrayList<>();
	       
	       int [][] array = new int[n][n];
	           int verical = -1;
	           int horizon = 0;
	           int num = 1;
	           
	           for (int i = 0; i < n; i++) {
	            for (int j = i; j < n; j++) {
	               if (i % 3 == 0) { 
	                  verical++;
	               } else if (i % 3 == 1) { 
	                  horizon++;
	               } else if (i % 3 == 2) { 
	                  verical--;
	                  horizon--;
	               }
	               array[verical][horizon] = num++; 
	               System.out.println("arr["+verical+"]["+horizon+"] : " + array[verical][horizon]);

	            } 

	         }
	         for (int i = 0; i < n; i++) {
	            for (int j = 0; j <= i; j++) { 
	               System.out.print(array[i][j] + " ");
	               listAnswer.add(array[i][j]);
	            }
	            System.out.println();
	         }
	         
	         int [] answer = new int[listAnswer.size()];
	         for(int i=0; i<answer.length;i++) { 
	            answer[i] = listAnswer.get(i);
	         }
	         
	         for(int i:answer) { 
	            System.out.print(i+"  ");
	         }

        return answer;
    }

}
