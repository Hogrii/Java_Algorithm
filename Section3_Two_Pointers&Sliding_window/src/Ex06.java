import java.util.Scanner;

public class Ex06 {
	public static int solution(int K, int[] arr) {
		int answer = 0;
		int cnt = 0;
		int lt = 0;
		
		for(int rt=0; rt<arr.length; rt++) {
			// 0�� ������ K����ŭ 1�� �ٲ� �� �ֱ� ������ �ϴ� ����
			if(arr[rt]==0) cnt++;
			// ���� 0�� 1�� �ٲ� Ƚ���� K���� ������ ���
			while(cnt>K) {
				// arr[0]���� 0�� ������ ������ ��ȸ
				// ��ȸ �� 0�� Ȯ�εǸ� 0�� 1�� �ٲ� Ƚ���� ����
				if(arr[lt]==0) cnt--;
				// �ε��� 0���� �����ؼ� 0���� ã�� ���� ��
				lt++;
			}
			// ���� �ִ� ���̺��� �� �� �κ��� ������ ����
			answer = Math.max(answer, rt-lt+1);
		}
		
		// ���
		return answer;
	}
	
	public static void main(String[] args) {
		// �ִ� ���� ���Ӻκм���
		// 0�� 1�� ������ ���� N�� ���� �Է�
		// K����ŭ 0�� 1�� ���� ����
		// K����ŭ 0�� 1�� �ٲپ��� �� 1�θ� ������ �ִ� ������ ���Ӻκм����� ���
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int arr[] = new int[N];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(solution(K, arr));
	}
}
