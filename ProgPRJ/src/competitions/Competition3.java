package competitions;

import java.util.ArrayList;
import java.util.List;

public class Competition3 {

	public static void main(String[] args) {
		int [] a = {9,-1,-5};
		System.out.println(new Competition3().solution(a));
	}
	
	public int solution(int[] a) {
        int answer = 0;
        int chn=1;
        int idx=0;
        int cnt=0;
        for(int i=0; i<a.length; i++) {
        	List<Integer> list = new ArrayList<>();
        	for(int j=0; j<a.length; j++) {
        		list.add(a[j]);
        	}
        	idx=i;
        	while(idx+1 < list.size() && cnt<list.size() ) {
        		if(list.get(idx) > list.get(idx+1) && (list.get(idx) != list.get(i))) {
    				list.remove(idx);
        		} else if((list.get(idx+1) == list.get(i))&&chn>0) {
    				list.remove(idx);
    				chn=0;
    			}
        		cnt++;
        	}
        	answer += (list.size()==1 && list.contains(list.get(i))) ? 1 : 0;
        }
        return answer;
    }

}
