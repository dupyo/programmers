package level1;

import java.util.Arrays;
import java.util.Comparator;

public class OrderStrILike {

	public static void main(String[] args) {
		// 문자열 내 마음대로 정렬하기
		String[] strings = {"sun", "bed", "car"};
		int n = 1;
		System.out.println(Arrays.toString(solution(strings, n)));
	}
	
	public static String[] solution(String[] strings, int n) {
		Arrays.sort(strings, new Comparator<String>() {
			@Override
			public int compare(String arr1, String arr2) { // 오름차순 정렬
				if (arr1.charAt(n) == arr2.charAt(n))
					return arr1.compareTo(arr2);
				if (arr1.charAt(n) > arr2.charAt(n))
					return 1;
				return -1;
			}
		});
		return strings;
	}

}
