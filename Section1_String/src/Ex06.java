import java.util.Scanner;

public class Ex06 {
	public static String solution(String str) {
		String answer = "";
		
		for(int i=0; i<str.length(); i++) {
			// System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(i));
			// 만약 i번째 글자가 i번째에서 발견된다면 추가
			// 만약 i번째 글자가 i번째가 아닌 곳에서 발견된다면 무시 
			if(str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		System.out.println(solution(str));
	}
}
