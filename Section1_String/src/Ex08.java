import java.util.Scanner;

public class Ex08 {
	public static String solution(String str) {
		String answer = "NO";
		
		// str을 모두 대문자로 바꾼다.
		// str 내 대문자가 아닌 것들을 모두 ""로 대체한다.
		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		// str을 StringBuilder로 뒤집는다.
		String reverseStr = new StringBuilder(str).reverse().toString();
		// str과 reverseStr이 같다면 YES, 아니면 NO
		if(str.equals(reverseStr)) answer = "YES";
		
		return answer;
	}
	
	public static void main(String[] args) {
		// 팰린드롬이란?
		// 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 말한다.
		
		// 알파벳 이외의 문자들은 무시
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(solution(str));		
	}
}
