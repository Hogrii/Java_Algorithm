import java.util.Scanner;
import java.util.Stack;

public class Ex01 {
	public static String solution(String str) {
		String answer = "YES";
		// Stack ��ü ����
		Stack<Character> stack = new Stack<>();
		
		for(char bracket : str.toCharArray()) {
			// ���� ��ȣ�� ���� stack�� �״´�.
			if(bracket == '(') stack.push(bracket);
			// �ݴ� ��ȣ�� ���� ��
			else {
				// stack�� ��� ������ �ùٸ��� ���� ��ȣ�̱� ������ NO ����
				if(stack.isEmpty()) return "NO";
				// stack�� ������� ������ �� ���� �ִ� stack�� ������.
				stack.pop();
			}
		}
		// ���� ��� ������ ������ �� stack�� ���� �׿��ִٸ� NO ����
		if(!stack.isEmpty()) answer = "NO";
		
		// ���
		return answer;
	}
	
	public static void main(String[] args) {
		// �ùٸ� ��ȣ
		// ��ȣ�� �ԷµǾ��� �� �ùٸ� ��ȣ�� "YES", �ƴϸ� "NO" ���
		// �ùٸ� ��ȣ�� ���� �ùٸ��� ��ġ���� �ǹ�
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		System.out.println(solution(str));
	}
}
