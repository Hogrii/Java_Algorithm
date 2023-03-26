import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex03 {
	public int solution(int n, int k, int[] sales) {
		int sum = 0;
		
		// 1~k�� ���� ��
		for(int i=0; i<k; i++) sum += sales[i];
		
		// �ְ� ���� �ʱ�ȭ
		int max = sum;
		
		// �����̵� ������
		// ������ ������ ���ϰ� ���� ù�� ������ ���ش�
		for(int i=k; i<sales.length; i++) {
			sum += sales[i-k] + sales[i];
			// �ְ� ���� ����
			max = Math.max(max, sum);
		}
		return max;
	}
	
	public static void main(String[] args) throws IOException{
		// �ִ� ����
		// N�ϰ� ������ ��
		// ���ӵ� K�� ������ �ִ� ����� ���ϱ�
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		Ex03 ex = new Ex03();
		
		// ������ ��, ���ӵ� ��
		st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		// ���� �迭
		int[] sales = new int[n];
		
		// ���� �Է�
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<sales.length; i++) {
			sales[i] = Integer.parseInt(st.nextToken());
		}
		
		// ���
		System.out.println(ex.solution(n, k, sales));
	}
}

/*
// �����ڵ�
	public static int solution(int K, int[] sales) {
		int answer = 0;
		int maxSales = 0;
		
	
//		// Ǯ�� 1 -> Time Exceed
//		for(int i=K-1; i<sales.length; i++) {
//			int sumSales = 0;
//			int nDaySales = K;
//			while(nDaySales>0) {
//				sumSales += sales[i-nDaySales+1];
//				nDaySales--;
//			}
//			if(maxSales<sumSales) maxSales = sumSales;
//		}
//		
//		answer = maxSales;

		
		// Ǯ�� 2
		int sumSales = 0;
		
		// 1~K�ϰ� ���� ��
		for(int i=0; i<K; i++) {
			sumSales += sales[i];
		}
		// �ִ� ������ 1~K���� ������ �ʱ�ȭ
		maxSales = sumSales;
		
		for(int i=K; i<sales.length; i++) {
			// ���� �հ迡 �������� �߰�, K���� ������ ����
			sumSales += sales[i] - sales[i-K];
			// �ִ� ���� �� �� �ִ� ���� �� ����
			maxSales = Math.max(maxSales, sumSales);
		}
		answer = maxSales;
		
		// ���
		return answer;
	}
	
	public static void main(String[] args) {
		// �ִ� ����
		// N�� ������ ���� ���
		// K�� ���� �ִ� ������� ��
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int[] sales = new int[N];
		for(int i=0; i<N; i++) {
			sales[i] = sc.nextInt();
		}
		
		System.out.println(solution(K, sales));
	}
*/