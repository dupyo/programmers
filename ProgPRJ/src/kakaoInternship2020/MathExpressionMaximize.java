package kakaoInternship2020;

import java.util.ArrayList;
import java.util.List;

public class MathExpressionMaximize {

	public static void main(String[] args) {
		// 수식 최대화
		String expression = "50*6-3*2";
		// "50*6-3*2" -> 300
		solution(expression);
	}

	public static long solution(String expression) {
		long answer = 0;
		String[] operand = expression.split("\\W");
		char[] operator = expression.replaceAll("\\w", "").toCharArray();
		int loopCnt = 1;

		// list 형식으로 피연산자와 연산자를 순서대로 저장하여 사용
		List<Object> list = new ArrayList<>();
		for (int i = 0; i < operator.length; i++) {
			list.add(Long.parseLong(operand[i]));
			list.add(operator[i]);
		}
		list.add(Long.parseLong(operand[operand.length - 1]));
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + ", ");
		}
		System.out.println();

		// list 복사
		List<Object> copyList = list.subList(0, list.size());
		long tmp = 0;
		for (int i = 1; i < operator.length; i++) {
			tmp = operation((long) copyList.get(i - 1), (long) copyList.get(i + 1), (char) copyList.get(i));
			System.out.println(i+" "+tmp);
			list.add(i - 1, tmp);
			list.remove(i);
			list.remove(i + 1);
		}
		System.out.println("answer : " + answer);
		return answer;
	}

	public static long operation(long operand1, long operand2, char operator) {
		// * : 42, + : 43, - : 45
		if (operator == 42)
			return (operand1 * operand2);
		if (operator == 43)
			return (operand1 + operand2);
		if (operator == 45)
			return (operand1 - operand2);
		return 0;
	}

}
