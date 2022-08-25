import java.util.Scanner;

public class Ex03 {
	public static int solution(int K, int[] sales) {
		int answer = 0;
		int maxSales = 0;
		
		/*
		// Ǯ�� 1 -> Time Exceed
		for(int i=K-1; i<sales.length; i++) {
			int sumSales = 0;
			int nDaySales = K;
			while(nDaySales>0) {
				sumSales += sales[i-nDaySales+1];
				nDaySales--;
			}
			if(maxSales<sumSales) maxSales = sumSales;
		}
		
		answer = maxSales;
		 */
		
		// Ǯ�� 2
		int sumSales = 0;
		
		for(int i=0; i<K; i++) {
			sumSales += sales[i];
		}
		maxSales = sumSales;
		
		for(int i=K; i<sales.length; i++) {
			sumSales += sales[i] - sales[i-K];
			maxSales = Math.max(maxSales, sumSales);
		}
		answer = maxSales;
		
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
}
