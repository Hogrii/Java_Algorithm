import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Ex04 {	
	public static int solution(String str) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		
		for(char letter : str.toCharArray()) {
			// 문자열의 값이 숫자인지 연산자인지 확인
			if(Character.isDigit(letter)) {
				// 숫자이면 char에서 48을 빼서 값을 얻는다.
				stack.push(letter-48);
			}
			else {
				// 문자열의 값이 연산자라면 pop을 이용해 숫자를 꺼낸 뒤 연산을 진행한다.
				int rightNum = stack.pop();
				int leftNum = stack.pop();
				// 연산자 종류
				if(letter == '+') stack.push(leftNum+rightNum);
				else if(letter == '-') stack.push(leftNum-rightNum);
				else if(letter == '*') stack.push(leftNum*rightNum);
				else if(letter == '/') stack.push(leftNum/rightNum);
			}
		}
		// 마지막 남은 값을 answer에 담아 출력
		answer = stack.pop();
		
		return answer;
	}
	
	public static void main(String[] args) throws IOException{
		// 후위식 연산(postfix)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		System.out.println(solution(str));
	}
}
