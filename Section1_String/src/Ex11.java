import java.util.Scanner;

public class Ex11 {
	public static String solution(String str) {
		String answer = "" + str.charAt(0);
		// 같은 문자열 카운트
		int cnt = 1;
		
		for(int i=1; i<str.length(); i++) {
			// 현재 문자가 이전 문자와 같지 않다면 입력을 한다.
			if(str.charAt(i) != str.charAt(i-1)) {
				// 문자열 카운트가 1이라면 현재 문자만 추가한다.
				if(cnt==1) {
					answer = answer + str.charAt(i);
				// 문자열 카운트가 2 이상이라면 카운트를 추가하고 현재 문자도 추가한다.
				}else {
					answer = answer + String.valueOf(cnt) + str.charAt(i);
					cnt = 1;
				}
			}
			// 현재 문자가 이전 문자와 같다면 문자열 카운트만 해준다.
			else cnt++;
		}
		// 마지막 문자가 마지막 바로 전 문자와 일치한다면 문자열 카운트를 붙여주고 출력한다.
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
