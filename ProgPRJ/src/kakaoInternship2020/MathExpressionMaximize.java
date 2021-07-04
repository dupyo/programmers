package kakaoInternship2020;

import java.util.ArrayList;
import java.util.List;

public class MathExpressionMaximize {

	public static void main(String[] args) {
		// 수식 최대화
		String expression = "50*6-3*2";
		// "50*6-3*2" -> 300
		System.out.println(solution(expression));
	}

	public static long solution(String expression) {
		long answer = 0;
		String[] operand = expression.split("\\W");
		String[] operator = expression.replaceAll("\\w", "").split("");

		// list 형식으로 피연산자와 연산자를 순서대로 저장하여 사용
		List<Object> list = new ArrayList<>();
		for (int i = 0; i < operator.length; i++) {
			list.add(Long.parseLong(operand[i]));
			list.add(operator[i]);
		}
		list.add(Long.parseLong(operand[operand.length - 1]));

		// list 복사
		List<Object> copyList = list.subList(0, list.size());
		long tmp = 0;
		int operated_j = 1;
		int j = 1;
		// 순서에 맞게 연산하는 부분은 구현했음. 우선순위를 재정의 하는 앞부분이 필요함. 가능하면 스택 구조로 해결할 수 있는 방법으로.
		for (int i = 0; i < operator.length; i++) {
			while (j < copyList.size()) {
				if ((char) copyList.get(j) == operator[i]) {
					tmp = operation((long) copyList.get(operated_j - 1), (long) copyList.get(operated_j + 1),
							(char) copyList.get(operated_j));
					copyList.set(operated_j + 1, tmp);
					copyList.remove(operated_j);
					copyList.remove(operated_j - 1);
					operated_j = 1;
					j = 1;
					continue;
				}
				operated_j += 2;
				j += 2;
			}
			j = 1;
			operated_j = 1;
		}
		long abs = Math.abs((long) copyList.get(0));
		if (abs > answer)
			answer = abs;
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
