import java.util.Scanner;

public class Ex11 {
	public static String solution(String str) {
		String answer = "" + str.charAt(0);
		// ���� ���ڿ� ī��Ʈ
		int cnt = 1;
		
		for(int i=1; i<str.length(); i++) {
			// ���� ���ڰ� ���� ���ڿ� ���� �ʴٸ� �Է��� �Ѵ�.
			if(str.charAt(i) != str.charAt(i-1)) {
				// ���ڿ� ī��Ʈ�� 1�̶�� ���� ���ڸ� �߰��Ѵ�.
				if(cnt==1) {
					answer = answer + str.charAt(i);
				// ���ڿ� ī��Ʈ�� 2 �̻��̶�� ī��Ʈ�� �߰��ϰ� ���� ���ڵ� �߰��Ѵ�.
				}else {
					answer = answer + String.valueOf(cnt) + str.charAt(i);
					cnt = 1;
				}
			}
			// ���� ���ڰ� ���� ���ڿ� ���ٸ� ���ڿ� ī��Ʈ�� ���ش�.
			else cnt++;
		}
		// ������ ���ڰ� ������ �ٷ� �� ���ڿ� ��ġ�Ѵٸ� ���ڿ� ī��Ʈ�� �ٿ��ְ� ����Ѵ�.
		if(str.charAt(str.length()-1) == str.charAt(str.length()-2)) answer += cnt;
		return answer;
	}
	public static void main(String[] args) {
		// �빮�ڷ� �̷���� ���ڿ��� �Է¹޾� ���� ���ڰ� �������� �ݺ��� ���
		// ���ڿ��� �����Ѵ�.
		// �ݺ�Ƚ���� 1�� ��� ����
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
		
	}
}
