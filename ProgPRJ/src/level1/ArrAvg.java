package level1;

public class ArrAvg {

	public static void main(String[] args) {
		//평균 구하기
		int [] arr = {5,5};
		System.out.println(new ArrAvg().solution(arr));

	}
	
	//평균 구하기
	public double solution(int[] arr) {
		int i=0;
		double sum=0;
		while(i<arr.length) sum+=arr[i++];
		return sum/i;
	}

}
