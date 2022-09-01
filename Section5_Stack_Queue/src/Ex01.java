import java.util.Scanner;
import java.util.Stack;

public class Ex01 {
	public static String solution(String str) {
		String answer = "YES";
		// Stack 객체 생성
		Stack<Character> stack = new Stack<>();
		
		for(char bracket : str.toCharArray()) {
			if(bracket == '(') stack.push(bracket);
			else {
				if(stack.isEmpty()) return "NO";
				stack.pop();
			}
		}
		if(!stack.isEmpty()) answer = "NO";
		
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
