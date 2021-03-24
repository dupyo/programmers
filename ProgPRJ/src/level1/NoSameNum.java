package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoSameNum {

	public static void main(String[] args) {
		int[] arr = {1, 1, 3, 3, 0, 1, 1};
		System.out.println(Arrays.toString(new NoSameNum().solution(arr)));
	}
	
	public int[] solution(int []arr) {
        int pre = arr[0];
		List arrList = new ArrayList();
		arrList.add(arr[0]);
		
		for(int i=1; i < arr.length; i++) {
			if(pre!=arr[i]) {
				arrList.add(arr[i]);
				pre=arr[i];
			}
		}
		
		int [] answer = new int [arrList.size()];
		for(int i=0; i < arrList.size(); i++)
			answer[i]=(int)arrList.get(i);
		
		return answer;
    }

}
