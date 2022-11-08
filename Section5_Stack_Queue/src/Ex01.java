import java.util.Scanner;
import java.util.Stack;

public class Ex01 {
	public static String solution(String str) {
		String answer = "YES";
		// Stack 객체 생성
		Stack<Character> stack = new Stack<>();
		
		for(char bracket : str.toCharArray()) {
			// 여는 괄호가 오면 stack에 쌓는다.
			if(bracket == '(') stack.push(bracket);
			// 닫는 괄호가 왔을 때
			else {
				// stack이 비어 있으면 올바르지 못한 괄호이기 때문에 NO 리턴
				if(stack.isEmpty()) return "NO";
				// stack이 비어있지 않으면 맨 위에 있는 stack를 꺼낸다.
				stack.pop();
			}
		}
		// 만약 모든 과정이 끝났을 때 stack에 뭔가 쌓여있다면 NO 리턴
		if(!stack.isEmpty()) answer = "NO";
		
		// 출력
		return answer;
	}
	
	public static void main(String[] args) {
		// 올바른 괄호
		// 괄호가 입력되었을 때 올바른 괄호면 "YES", 아니면 "NO" 출력
		// 올바른 괄호는 쌍이 올바르게 위치함을 의미
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		System.out.println(solution(str));
	}
}
