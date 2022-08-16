import java.util.Scanner;

public class Ex08 {
	public static String solution(String str) {
		String answer = "NO";
		
		// str�� ��� �빮�ڷ� �ٲ۴�.
		// str �� �빮�ڰ� �ƴ� �͵��� ��� ""�� ��ü�Ѵ�.
		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		// str�� StringBuilder�� �����´�.
		String reverseStr = new StringBuilder(str).reverse().toString();
		// str�� reverseStr�� ���ٸ� YES, �ƴϸ� NO
		if(str.equals(reverseStr)) answer = "YES";
		
		return answer;
	}
	
	public static void main(String[] args) {
		// �Ӹ�����̶�?
		// �տ��� ���� ���� �ڿ��� ���� ���� ���� ���ڿ��� ���Ѵ�.
		
		// ���ĺ� �̿��� ���ڵ��� ����
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(solution(str));		
	}
}
