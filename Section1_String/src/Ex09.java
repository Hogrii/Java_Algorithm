import java.util.Scanner;

public class Ex09 {
	public static int solution(String str) {
		String answer = "";
//		int answer = 0;
		
		for(char ascii : str.toCharArray()) {
			// ascii�� ���ڶ�� answer�� ���������ش�.
			// �� ���ڸ��� 0�� ��� ���ڿ��̱� ������ ������ �ȵȴ�.
			// ���� answer�� Integer.parseInt�� �̿��� return ���ش�.
			if(Character.isDigit(ascii)) answer += ascii;
			
			
//			if(ascii >= 48 && ascii <=57) answer = answer*10+(ascii-48);
		}
		
		return Integer.parseInt(answer);
//		return answer;
	}
	public static void main(String[] args) {
		// ���ڿ� ���ڰ� �����ִ� ���ڿ����� ���ڸ� �����Ѵ�.
		// ������ ���ڸ� �ڿ����� �����.
		// �� ���ڸ��� 0�� ��µȴٸ� �ڿ����� �ٲپ����� �翬�� ���õȴ�.
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		System.out.println(solution(str));
	}
}
