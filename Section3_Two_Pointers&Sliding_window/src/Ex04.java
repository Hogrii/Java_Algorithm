import java.util.Scanner;

public class Ex04 {
	public static int solution(int M, int[] arr) {
		int answer = 0;
		int sum = 0;
		int cnt = 0;
		int minIndex = 0;
		
		for(int i=0; i<arr.length; i++) {
			// i��°���� ���Ѵ�
			sum += arr[i];
			// ���� Ư������ M�� ���ٸ� +1
			if(sum == M) cnt++;
			// ���� Ư������ M���� ���� ��
			while(sum>=M) {
				// ������ �����Ǿ� �ִ� �� ���� ������ ����
				sum -= arr[minIndex];
				// �� ���� �����ε��� ����
				minIndex++;
				// ���� Ư������ M�� �������ٸ� +1
				if(sum==M) cnt++;
			}
		}
		answer = cnt;
		
		// ���
		return answer;
	}
	
	public static void main(String[] args) {
		// ���� �κм���
		// N�� ������ ����
		// M�� Ư�� ����
		// N �������� ���Ӻκм����� ���� M�� �Ǵ� ����� ���� ���
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int arr[] = new int[N];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(solution(M, arr));
	}
}
