import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Ex04 {	
	public static int solution(String str) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		
		for(char letter : str.toCharArray()) {
			// ���ڿ��� ���� �������� ���������� Ȯ��
			if(Character.isDigit(letter)) {
				// �����̸� char���� 48�� ���� ���� ��´�.
				stack.push(letter-48);
			}
			else {
				// ���ڿ��� ���� �����ڶ�� pop�� �̿��� ���ڸ� ���� �� ������ �����Ѵ�.
				int rightNum = stack.pop();
				int leftNum = stack.pop();
				// ������ ����
				if(letter == '+') stack.push(leftNum+rightNum);
				else if(letter == '-') stack.push(leftNum-rightNum);
				else if(letter == '*') stack.push(leftNum*rightNum);
				else if(letter == '/') stack.push(leftNum/rightNum);
			}
		}
		// ������ ���� ���� answer�� ��� ���
		answer = stack.pop();
		
		return answer;
	}
	
	public static void main(String[] args) throws IOException{
		// ������ ����(postfix)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		System.out.println(solution(str));
	}
}
