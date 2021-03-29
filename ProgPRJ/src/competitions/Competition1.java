package competitions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Competition1 {

	public static void main(String[] args) {
		int [] numbers = {5,0,2,7,1,3,2,7,4};
		System.out.println(Arrays.toString(new Competition1().solution(numbers)));
	}
	
	//두 개 뽑아서 더하기
	public int[] solution(int[] numbers) {
		int sum = 0;
        List<Integer> list = new ArrayList<Integer>();
        Arrays.sort(numbers);
        for(int i=0; i<numbers.length; i++) {
        	for(int j=i+1; j<numbers.length; j++) {
        		if(!list.contains(sum=numbers[i]+numbers[j]))
        			list.add(sum);
        	}
        }
        
        int[] answer = new int [list.size()];
        for(int i=0; i<list.size(); i++)
        	answer[i]=list.get(i);
        return answer;
    }

}
