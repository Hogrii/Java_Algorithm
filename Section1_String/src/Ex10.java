import java.util.Scanner;

public class Ex10 {
	public static int[] solution(String str, char spelling) {
		int[] answer = new int[str.length()];
		// �Ÿ��� 100���� �ʱ�ȭ
		int distance = 100;
		
		// str�� �տ��� �ڷ� �ȴ´�.
		for(int i=0; i<str.length(); i++) {
			// str�� ���ڿ� spelling�� ���ٸ� �Ÿ��� 0���� �ʱ�ȭ
			if(str.charAt(i)==spelling) distance = 0;
			// str�� ���ڿ� spelling�� �ٸ��ٸ� �Ÿ��� +1 ������Ų��.
			else distance++;
			
			answer[i] = distance;
		}
		
		// �Ÿ��� 100���� �ʱ�ȭ
		distance = 100;
		
		// str�� �ڿ��� ������ �ȴ´�.
		for(int i=str.length()-1; i>=0; i--) {
			// str�� ���ڿ� spelling�� ���ٸ� �Ÿ��� 0���� �ʱ�ȭ
			if(str.charAt(i)==spelling) distance = 0;
			// str�� ���ڿ�  spelling�� �ٸ��ٸ� �Ÿ��� +1 ������Ų��.
			else distance++;
			
			// �Էµ� �Ÿ��� ���� �Ÿ����� ũ�ٸ� ���� ���� ��ϵ� �Ÿ��� �Է��Ѵ�.
//			if(answer[i]>distance) answer[i] = distance;
			answer[i] = Math.min(answer[i], distance);
		}
		
		return answer;
	}
	public static void main(String[] args) {
		// ���ڿ� str, ���� spelling�� �־�����.
		// str�� �� ���ڿ� spelling�� ������ �Ÿ��� ������� ���
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char spelling = sc.next().charAt(0);
		
		for(int distance : solution(str, spelling)) {
			System.out.print(distance + " ");
		}
	}
}
