package level1;

public class SumBtw2Ints {

	public static void main(String[] args) {
		int a=5;
		int b=3;
		System.out.println(new SumBtw2Ints().solution(a, b));
	}
	
	public long solution(int a, int b) {
		long swNsum = 0;
		if(a > b) {
			swNsum=a;
			a=b;
			b=(long)swNsum;
			swNsum=0;
		}
		for(int i=a; i <= b; i++)
			swNsum+=i;
		return swNsum;
	}

}
