import java.util.Scanner;

public class Second_letterCase {
	public static String solution(String str) {
		String answer = "";
		
		// 대문자는 소문자로, 소문자는 대문자로 변경
		for(char c : str.toCharArray()) {
			if(Character.isLowerCase(c)) answer += Character.toUpperCase(c);
			else answer += Character.toLowerCase(c);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		// 출력
		System.out.println(solution(str));
	}
}
