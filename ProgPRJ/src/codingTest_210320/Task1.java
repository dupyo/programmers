package codingTest_210320;

import java.util.Arrays;

public class Task1 {

	public static void main(String[] args) {
		System.out.println("" + new Task1().solution(123456));
	}
	
	public int solution(int A) {
		
		char [] A_arr =  Integer.toString(A).toCharArray();
		String B_str = "";
		for(int i=0; i<A_arr.length; i++) {
			if(i%2==0)
				B_str+=Character.getNumericValue(A_arr[i]);
			else
				B_str+=Character.getNumericValue(A_arr[A_arr.length-i]);
		}
		
		return Integer.parseInt(B_str);
	}

}
