package level1;

import java.util.Arrays;
import java.util.Collections;

public class IntToDesc {

	public static void main(String[] args) {
		//정수 내림차순으로 배치하기
		long n = 12311567;
		System.out.println(Long.toString(new IntToDesc().solution2(n)));
	}
	//정수 내림차순으로 배치하기
	public long solution2(long n) {
		String [] nStrs = Long.toString(n).split("");
		Arrays.sort(nStrs, Collections.reverseOrder());
		String nStr = String.join("", nStrs);
		return Long.parseLong(nStr);
	}

}
