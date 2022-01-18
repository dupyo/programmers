package level1;

import java.util.Arrays;
import java.util.Comparator;

public class OrderStrILike {

	public static void main(String[] args) {
		// 문자열 내 마음대로 정렬하기
		String[] strings = {"abce", "abcd", "cdx"};
		int n = 1;
		System.out.println(Arrays.toString(solution(strings, n)));
	}
	
	public static String[] solution(String[] strings, int n) {
		String[] answer = new String [strings.length];
		String[][] indexArr = new String[strings.length][2];
		for (int i = 0; i < strings.length; i++) {
			indexArr[i][0] = "" + strings[i].charAt(n);
			indexArr[i][1] = strings[i];
		}
		Arrays.sort(indexArr, new Comparator<String[]>() {
			public int compare(String[] arr1, String[] arr2) {
				if (arr1[0].compareTo(arr2[0]) == 0)
					return arr1[1].compareTo(arr2[1]);
				if (arr1[0].compareTo(arr2[0]) > 0)
					return 1;
				return -1;
			}
		});
		for (int i = 0; i < answer.length; i++) {
			answer[i] = indexArr[i][1];
		}
		return answer;
	}

}
