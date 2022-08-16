import java.util.Scanner;

public class Ex07 {
	public static String solution(String str) {
		String answer = "YES";
		
		// StringBuilder를 이용해 회문 문자열을 구한다.
		// str을 뒤집어서 reverseStr에 담는다.
		String reverseStr = new StringBuilder(str).reverse().toString();
		// 만약 str과 reverseStr이 같지 않다면 NO를 출력
		// 같다면 YES를 출력한다. 이때, 대/소문자는 무시(IgnoreCase)한다.
		if(!str.equalsIgnoreCase(reverseStr)) return "NO";
		
		/*
		// 문자열의 길이를 이용해 회문 문자열을 구한다.
		// str을 모두 대문자로 바꾸어준다.
		str = str.toUpperCase();
		// str의 길이를 wordLength에 담는다.
		int wordLength = str.length();
		for(int i=0; i<wordLength/2; i++) {
			// 맨 앞과 맨 뒤의 글자를 비교하고 다르다면 NO 출력
			// 같다면 다음을 비교한다.
			if(str.charAt(i) != str.charAt(wordLength-i-1)) return "NO";
		}
		 */
		
		return answer;
	}
	public static void main(String[] args) {
		// 회문 문자열이란?
		// 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 말한다.
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
		
	}
}
