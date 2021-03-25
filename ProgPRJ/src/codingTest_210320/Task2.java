package codingTest_210320;

public class Task2 {

	public static void main(String[] args) {
		System.out.println(new Task2().solution(4, "1101"));
	}
	
	public int solution(int a, String b) {
		int answer = 0;
		
		while(b.contains("101"))
			b=b.replaceAll("101", "1");
		
		int std_o = b.length()-1;
		int std_ot = b.length()-1;
		int ot = 1;
		int one = 1;
		int two = 1;
		
		while(std_o>=0) {			//같은 것이 있는 순열 구하기
			for(int i=std_ot; i >= 1; i--)	//첫번째 수와 두번째 수의 합의 팩토리얼
				ot*=i;
			for(int i=std_o; i >= 1; i--)	//첫번째 수의 팩토리얼
				one*=i;
			for(int i=std_ot-std_o; i >= 1; i--)	//두번째 수의 팩토리얼
				two*=i;
			
			std_ot--;
			std_o-=2;
			answer+=ot/(one*two);
			ot=1;
			one=1;
			two=1;
		}
		
		return answer;
	}

}
