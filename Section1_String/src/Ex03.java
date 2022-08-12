import java.util.Scanner;

public class Ex03 {
	public static String solution(String str) {
		String answer = "";
		
		// 가장 작은 값(정수의 최소값 : -2147483648)으로 초기화 후 최대값을 찾는다.
		int max = Integer.MIN_VALUE;
		
		/*
		// indexOf를 이용해 분장 속 단어 분리하기
		int pos;
		
		while((pos = str.indexOf(' ')) != -1) {
			String word = str.substring(0, pos);
			int strLength = word.length();
			if(strLength>max) {
				max = strLength;
				answer = word;
			}
			// str의 위치를 띄어쓰기 바로 다음 문장부터 시작하게 변경
			str = str.substring(pos+1);
		}
		
		if(str.length()>max) answer = str;
		 */
		
		/*
		// split을 이용해 문장 속 단어 분리하기
		String[] words = str.split(" ");
		for(String word : words) {
			int strLength = word.length();
			if(strLength>max) {
				max = strLength;
				answer = word;
			}
		}
		 */
				
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		System.out.println(solution(str));
	}
}
