import java.util.Scanner;

public class Ex03 {
	public static String solution(String str) {
		String answer = "";
		
		// ���� ���� ��(������ �ּҰ� : -2147483648)���� �ʱ�ȭ �� �ִ밪�� ã�´�.
		int max = Integer.MIN_VALUE;
		
		/*
		// indexOf�� �̿��� ���� �� �ܾ� �и��ϱ�
		int pos;
		
		while((pos = str.indexOf(' ')) != -1) {
			String word = str.substring(0, pos);
			int strLength = word.length();
			if(strLength>max) {
				max = strLength;
				answer = word;
			}
			// str�� ��ġ�� ���� �ٷ� ���� ������� �����ϰ� ����
			str = str.substring(pos+1);
		}
		
		if(str.length()>max) answer = str;
		 */
		
		/*
		// split�� �̿��� ���� �� �ܾ� �и��ϱ�
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
