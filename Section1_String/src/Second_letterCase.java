import java.util.Scanner;

public class Second_letterCase {
	public static String solution(String str) {
		String answer = "";
		
		// �빮�ڴ� �ҹ��ڷ�, �ҹ��ڴ� �빮�ڷ� ����
		for(char c : str.toCharArray()) {
			if(Character.isLowerCase(c)) answer += Character.toUpperCase(c);
			else answer += Character.toLowerCase(c);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		// ���
		System.out.println(solution(str));
	}
}
