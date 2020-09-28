package level1;

public class OddEven {

	public static void main(String[] args) {
		//짝수와 홀수
		int num = 11289;
		System.out.println(new OddEven().solution(num));

	}
	
	//짝수와 홀수
	public String solution(int num) {
		return (num%2 == 0) ? "Even" : "Odd";
	}

}
