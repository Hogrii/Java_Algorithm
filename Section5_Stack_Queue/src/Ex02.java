import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Ex02 {
	public static String solution(String str) {
		String answer = "";
		Stack<Character> stack = new Stack<>();
		
		// 입력받은 문자열을 하나씩 체크
		for(char c : str.toCharArray()) {
			// 입력받은 문자가 )일 경우 (가 나올때까지 pop
			if(c==')') {
				while(stack.pop()!='(');
			// 입력받은 문자가 )가 아니면 모두 push
			}else stack.push(c);
		}
		
		// stack에 남아있는 문자를 answer에 담는다.
		for(int i=0; i<stack.size(); i++) answer += stack.get(i);

		return answer;
	}
	
	public static void main(String[] args) throws IOException{
		// 괄호문자제거
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		// 출력		
		System.out.println(solution(str));		
	}
}
