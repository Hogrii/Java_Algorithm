import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex04 {
	public int solution(int m, int[] arr) {		
		// Ư�� ����
		int lt = 0;
		int rt = 0;
		// ��
		int sum = 0;
		// Ƚ��
		int cnt = 0;
		
		for(rt=0; rt<arr.length; rt++) {
			// sum�� rt�� �ش��ϴ� ���� ����
			sum += arr[rt];
			
			// sum�� Ư������ m�� ������ Ƚ�� +1
			if(sum==m) cnt++;
			
			// sum�� Ư������ m���� ũ�ų� ���� ��
			while(sum>=m) {
				// sum�� lt�� �ش��ϴ� ���� ����
				sum -= arr[lt++];
				// lt���� �������� �� Ư������ m�� ���� ��
				if(sum==m) cnt++;
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) throws IOException{
		// ���� �κм���		
		// N���� ���� �̷���� ����
		// ���� �� ���Ӻκм����� ���� Ư������ M�� �Ǵ� ����� Ƚ��
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		Ex04 ex = new Ex04();
		
		// ������ ����, Ư������
		st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		// ������ ���� �迭
		int[] arr = new int[n];
		
		// �迭�� ���� �Է�
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(ex.solution(m,  arr));
	}
}

/*
// ���� �ڵ�
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
*/