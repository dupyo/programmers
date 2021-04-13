package codingTest_greedy;

import java.util.Arrays;
import java.util.Collections;

public class Exam03 {

	public static void main(String[] args) {
		int N=7;
		String K="2132241";
		System.out.println(new Exam03().solution(N, K));
	}
	
	//print("#######################################")
	// 예제 03
	//한 마은에 모험가가 N명 있음, 모함가 길드에서는 N명의 모험가를 대상으로 '공포도' 를 측정했는데,
	//'공포도' 가 높은 모험가는 쉽게 공포를 느껴 위험 상황에서 제대로 대처할 능력이 떨어짐
	//모험가 그룹을 안전하게 구성하고자 공포도가 X인 모험가는 반드시 X명 이상으로 구성한 모험가 그룹에 참여해야만 여행을 떠날수있음
	//N명의 모험가에 대한 정보가 주어졌을때, 여행을 떠날 수 있는 그룹 수의 최댓값을 구하는 프로그램을 작성하시오
    //
	//입력조건 : 첫째 줄에 모험가의 수 N이 주어짐, 각 모험가의 공포도의 값은 N이하의 자연수로 주어지며, 각 자연수는 공백으로 구분
	//출력조건 : 여행을 떠날 수 있는 그룹 수의 최댓값을 출력
    //
	//입력예시 : 5 // 23122 , 출력예시 : 2
	//입력예시 : 7 // 2132241 , 출력예시 : 3
	public int solution(int N, String K) {
		int answer=0;
		int i=0;
		String [] KNums = K.split("");
		Arrays.sort(KNums);
		Collections.reverse(Arrays.asList(KNums));
		System.out.println(Arrays.toString(KNums));
		while(true) {
			System.out.println("i : " + i);
			try {
				i+=Integer.parseInt(KNums[i]);
				answer++;
				System.out.println("answer : " + answer);
				System.out.println("----out1");
			}
			catch (IndexOutOfBoundsException e) {
				System.out.println("----out2");
				break;
			}
		}
		System.out.println("======");
		return answer;
	}

}
