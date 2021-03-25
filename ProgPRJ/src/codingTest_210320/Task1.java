package codingTest_210320;

import java.util.Arrays;

public class Task1 {

	public static void main(String[] args) {
		int a = 3;
		String [] times = {"12:00~23:59", "11:00~18:00", "14:00~20:00"};
		System.out.println("" + new Task1().solution(a, times));
	}
	
	public String solution(int a, String[] times) {
		int str = 0;
		int end = 2359;
		String from = "";
		String to = "";
		
		for(int i=0; i<a; i++) {
			String[] time = times[i].replaceAll(":", "").split("~");
			if(str < Integer.parseInt(time[0])) {
				from=times[i].substring(0,5);
				str=Integer.parseInt(time[0]);
			}
			if(end > Integer.parseInt(time[1])) {
				to=times[i].substring(6);
				end=Integer.parseInt(time[1]);
			}
		}
		
		String answer = "";
		
		if(str>end)
			answer="-1";
		else
			answer=from+"~"+to;
		
		return answer;
	}

}
