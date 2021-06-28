package kakaoInternship2020;

public class MathExpressionMaximize {

	public static void main(String[] args) {
		// 수식 최대화
		String expression = "50*6-3*2";
		// "50*6-3*2" -> 300
		new MathExpressionMaximize().solution(expression);
	}

	public long solution(String expression) {
		long answer = 0;
		String[] operand = expression.split("\\W");
		char[] operator = expression.replaceAll("\\w", "").toCharArray();
		int loopCnt = 1;
		for (int i = operator.length; i >= 1; i--) {
			loopCnt *= i;
		}
		for (int i = 0; i < operand.length - 1; i++) {
			answer += operation(Long.parseLong(operand[i]), Long.parseLong(operand[i + 1]), operator[i]);
		}
		return answer;
	}

	public long operation(long operand1, long operand2, char operator) {
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
