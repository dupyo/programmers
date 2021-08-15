package level1;

public class Year2016 {

	public static void main(String[] args) {
		// 2016년
		int a = 5;
		int b = 25;
		System.out.println(solution(a, b));
	}

	public static String solution(int a, int b) {
		String[] week = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
		int[] month = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int total = 0;
		for(int i = 0; i < a - 1; i++)
			total += month[i];
		
		total += b - 1;
		return week[total % 7];
	}

}
