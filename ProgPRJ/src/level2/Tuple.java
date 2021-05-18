package level2;

import java.util.Arrays;
import java.util.Comparator;

public class Tuple {

	public static void main(String[] args) {
		//튜플 - 2019 카카오 개발자 겨울 인턴십
		String s = "{{4,2,3},{3},{2,3,4,1},{2,3}}";
		System.out.println(Arrays.toString(new Tuple().solution(s)));
	}
	
	public int[] solution(String s) {
		String tmp = s.replace("{", "");
		int tupleSize = s.length()-tmp.length()-1;
		s=tmp.replace("}", "");
		String[] allarr = s.split(",");
		Arrays.sort(allarr);
		int [][] tupleOrder = new int [tupleSize][2];
		int stIdx = 0;
		int cnt = 1;
		int i = 0;
		int[] answer = new int [tupleSize];
		while(i < allarr.length) {
			int factor = Integer.parseInt(allarr[i]);
			if ((i + cnt) < allarr.length && allarr[i].equals(allarr[i + cnt])) {	//오름차순 정렬 후 각 스테이지를 가리키는 인덱스의 첫번째 위치 (i) + i가 가리키는 스테이지에 도달했지만 클리어하지 못한 플레이어의 수(cnt) 
				cnt++;	//i가 가리키는 스테이지에 도달했지만 클리어하지 못한 플레이어의 수를 카운트
			} else {
				tupleOrder[stIdx][0]=factor;
				tupleOrder[stIdx][1]=cnt;
				stIdx++;
				i+=cnt;
				cnt=1;	//cnt값 초기화
			}
		}
		Arrays.sort(tupleOrder, new Comparator<int[]>() {
			@Override
			public int compare(int[] arr1, int[] arr2) {
				if (arr2[1] > arr1[1])
					return 1;
				else
					return -1;
			}
		});
		for(int j=0; j < tupleSize; j++)
			answer[j]=tupleOrder[j][0];
		return answer;
	}

}
