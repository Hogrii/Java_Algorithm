import java.util.HashMap;
import java.util.Scanner;

public class Ex01 {
	public static char solution(int n, String str) {
		char answer = ' ';
		// Key�� Char, Value�� int
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('A', 3);
		
		return answer;
	}
	
	public static void main(String[] args) {
		// �б� ȸ��(�ؽ�)
		// �л� �� N �Է�
		// N���� ��ǥ���� �Է�(A~E)
		// ȸ������ ����� �л� ���
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String str = sc.next();
		
		System.out.println(solution(n, str));
		
	}
}
