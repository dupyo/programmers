package level1;

public class AddDigit {

	public static void main(String[] args) {
		//자릿수 더하기
		int n = 983;
		System.out.println(new AddDigit().solution(n));
	}
	public int solution(int n) {
		int answer = 0;
		/*int dig = 1;
		for(int i=1; i<=100000000; i*=10) {
			if(n/i < 10)
				break;
			else
				dig++;
		}*/
		int dig = Integer.toString(n).length();
		/*int add = 0;
		while(dig > 0) {
			add = (int)Math.pow(10, --dig);
			answer += (n/add);
			n-=(n/add)*add;
		}*/
		char[] nArr = Integer.toString(n).toCharArray();
		for(int i=0; i < nArr.length; i++)
			answer+=Character.getNumericValue(nArr[i]);
		return answer;
	}

}
