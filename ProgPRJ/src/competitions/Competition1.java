package competitions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Competition1 {

	public static void main(String[] args) {
		int [] numbers = {2,1,3,4,1};
		System.out.println(Arrays.toString(new Competition1().solution(numbers)));
	}
	
	public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<numbers.length; i++) {
        	for(int j=i+1; j<numbers.length; j++) {
        		if(!list.contains(numbers[i]+numbers[j]))
        			list.add(numbers[i]+numbers[j]);
        	}
        }
        Collections.sort(list);
        int[] answer = new int [list.size()];
        for(int i=0; i<list.size(); i++) {
        	answer[i]=list.get(i);
        }
        return answer;
    }

}
