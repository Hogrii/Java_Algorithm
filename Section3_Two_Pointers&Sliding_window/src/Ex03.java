import java.util.Scanner;

public class Ex03 {
	public static int solution(int K, int[] sales) {
		int answer = 0;
		int maxSales = 0;
		
		/*
		// 풀이 1 -> Time Exceed
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
		
		// 풀이 2
		int sumSales = 0;
		
		// 1~K일간 매출 합
		for(int i=0; i<K; i++) {
			sumSales += sales[i];
		}
		// 최대 매출을 1~K일의 합으로 초기화
		maxSales = sumSales;
		
		for(int i=K; i<sales.length; i++) {
			// 현재 합계에 다음날을 추가, K일전 매출을 제거
			sumSales += sales[i] - sales[i-K];
			// 최대 매출 비교 후 최대 매출 값 갱신
			maxSales = Math.max(maxSales, sumSales);
		}
		answer = maxSales;
		
		// 출력
		return answer;
	}
	
	public static void main(String[] args) {
		// 최대 매출
		// N일 동안의 매출 기록
		// K일 동안 최대 매출액의 합
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
