import java.util.Scanner;

public class First_FindString {
	public static int solution(String str, char c) {
		int cnt = 0;
		
		// 받은 문자열을 대문자로 변경
		str = str.toUpperCase();
		// 비교할 문자를 대문자로 변경
		c = Character.toUpperCase(c);
		
		// for문
		// 받은 문자열에 비교할 문자열을 하나씩 대조
		for(int i=0; i<str.length(); i++) {
			// 받은 문자열이 비교할 문자열과 같을 경우 카운트를 추가
			if(str.charAt(i)==c) cnt++;
		}
		
		/*
		// forEach문
		for(char x : str.toCharArray()) {
			if(x == c) cnt++;
		}
		 */
		
		return cnt;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		char c = sc.next().charAt(0);
		
		// 출력
		System.out.println(solution(str, c));
	}
}
