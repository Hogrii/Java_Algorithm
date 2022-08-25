import java.util.Scanner;

public class Ex05 {
	public static int solution(int N) {
		int answer = 0;
		int sum = 0;
		int cnt = 0;
		int min = 1;
		
		// N�� ������ 15�� �Ǳ� ������ �۴ٶ�� �ؾ��Ѵ�.
		for(int i=1; i<N; i++) {
			// i�� 1���� �����ش�
			sum += i;
			// ���� N�� ���ٸ� +1
			if(sum==N) cnt++;
			// ���� N���� ũ�ٸ�
			while(sum>N) {
				// �� �պ��� ����
				sum -= min;
				// �ּҰ� ����
				min++;
				// ���� N�� �������ٸ� +1
				if(sum==N) cnt++;
			}
		}
		
		answer = cnt;
		return answer;
	}
	
	public static void main(String[] args) {
		// ���ӵ� �ڿ����� ��
		// ���� ���� N �Է�
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		System.out.println(solution(N));
	}
}
