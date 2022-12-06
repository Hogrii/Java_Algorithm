import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Ex02 {
	public static String solution(String str) {
		String answer = "";
		Stack<Character> stack = new Stack<>();
		
		// �Է¹��� ���ڿ��� �ϳ��� üũ
		for(char c : str.toCharArray()) {
			// �Է¹��� ���ڰ� )�� ��� (�� ���ö����� pop
			if(c==')') {
				while(stack.pop()!='(');
			// �Է¹��� ���ڰ� )�� �ƴϸ� ��� push
			}else stack.push(c);
		}
		
		// stack�� �����ִ� ���ڸ� answer�� ��´�.
		for(int i=0; i<stack.size(); i++) answer += stack.get(i);

		return answer;
	}
	
	public static void main(String[] args) throws IOException{
		// ��ȣ��������
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		// ���		
		System.out.println(solution(str));		
	}
}
