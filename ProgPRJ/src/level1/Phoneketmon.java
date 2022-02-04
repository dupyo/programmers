package level1;

import java.util.HashSet;
import java.util.Set;

public class Phoneketmon {

	public static void main(String[] args) {
		// 폰켓몬
		int[] nums = { 3, 3, 3, 2, 2, 4 };
		System.out.println(solution(nums));
	}

	public static int solution(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
		return (set.size() > nums.length / 2) ? (nums.length / 2) : set.size();
	}

}
