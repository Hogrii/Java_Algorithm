import java.util.Scanner;

public class First_FindString {
	public static int solution(String str, char c) {
		int cnt = 0;
		
		// ���� ���ڿ��� �빮�ڷ� ����
		str = str.toUpperCase();
		// ���� ���ڸ� �빮�ڷ� ����
		c = Character.toUpperCase(c);
		
		// for��
		// ���� ���ڿ��� ���� ���ڿ��� �ϳ��� ����
		for(int i=0; i<str.length(); i++) {
			// ���� ���ڿ��� ���� ���ڿ��� ���� ��� ī��Ʈ�� �߰�
			if(str.charAt(i)==c) cnt++;
		}
		
		/*
		// forEach��
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
		
		// ���
		System.out.println(solution(str, c));
	}
}
