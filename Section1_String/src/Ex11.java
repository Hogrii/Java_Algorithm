import java.util.Scanner;

public class Ex11 {
	public static String solution(String str) {
		String answer = "" + str.charAt(0);
		int cnt = 1;
		
		for(int i=1; i<str.length(); i++) {
			if(str.charAt(i) != str.charAt(i-1)) {
				if(cnt==1) {
					answer = answer + str.charAt(i);
				}else {
					answer = answer + String.valueOf(cnt) + str.charAt(i);
					cnt = 1;
				}
				
				
			}
			else cnt++;
		}
		
		if(str.charAt(str.length()-1) == str.charAt(str.length()-2)) answer += cnt;
		return answer;
	}
	public static void main(String[] args) {
		// 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복될 경우
		// 문자열을 압축한다.
		// 반복횟수가 1인 경우 생략
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
		
	}
}
