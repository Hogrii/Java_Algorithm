import java.util.Scanner;

public class Ex07 {
	public static String solution(String str) {
		String answer = "YES";
		
		// StringBuilder�� �̿��� ȸ�� ���ڿ��� ���Ѵ�.
		// str�� ����� reverseStr�� ��´�.
		String reverseStr = new StringBuilder(str).reverse().toString();
		// ���� str�� reverseStr�� ���� �ʴٸ� NO�� ���
		// ���ٸ� YES�� ����Ѵ�. �̶�, ��/�ҹ��ڴ� ����(IgnoreCase)�Ѵ�.
		if(!str.equalsIgnoreCase(reverseStr)) return "NO";
		
		/*
		// ���ڿ��� ���̸� �̿��� ȸ�� ���ڿ��� ���Ѵ�.
		// str�� ��� �빮�ڷ� �ٲپ��ش�.
		str = str.toUpperCase();
		// str�� ���̸� wordLength�� ��´�.
		int wordLength = str.length();
		for(int i=0; i<wordLength/2; i++) {
			// �� �հ� �� ���� ���ڸ� ���ϰ� �ٸ��ٸ� NO ���
			// ���ٸ� ������ ���Ѵ�.
			if(str.charAt(i) != str.charAt(wordLength-i-1)) return "NO";
		}
		 */
		
		return answer;
	}
	public static void main(String[] args) {
		// ȸ�� ���ڿ��̶�?
		// �տ��� ���� ���� �ڿ��� ���� ���� ���� ���ڿ��� ���Ѵ�.
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
		
	}
}
