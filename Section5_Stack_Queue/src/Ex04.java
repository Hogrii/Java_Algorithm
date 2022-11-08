import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Ex04 {	
	public static int solution(String str) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		
		for(char letter : str.toCharArray()) {
			if(Character.isDigit(letter)) {
				stack.push(letter-48);
			}
			else {
				int rightNum = stack.pop();
				int leftNum = stack.pop();
				if(letter == '+') stack.push(leftNum+rightNum);
				else if(letter == '-') stack.push(leftNum-rightNum);
				else if(letter == '*') stack.push(leftNum*rightNum);
				else if(letter == '/') stack.push(leftNum/rightNum);
			}
		}
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
