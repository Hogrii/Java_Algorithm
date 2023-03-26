import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex03 {
	public int solution(int n, int k, int[] sales) {
		int sum = 0;
		
		// 1~k일 매출 합
		for(int i=0; i<k; i++) sum += sales[i];
		
		// 최고 매출 초기화
		int max = sum;
		
		// 슬라이딩 윈도우
		// 다음날 매출은 더하고 제일 첫날 매출은 빼준다
		for(int i=k; i<sales.length; i++) {
			sum += sales[i-k] + sales[i];
			// 최고 매출 갱신
			max = Math.max(max, sum);
		}
		return max;
	}
	
	public static void main(String[] args) throws IOException{
		// 최대 매출
		// N일간 매출기록 중
		// 연속된 K일 동안의 최대 매출액 구하기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		Ex03 ex = new Ex03();
		
		// 매출기록 일, 연속된 날
		st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		// 매출 배열
		int[] sales = new int[n];
		
		// 매출 입력
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<sales.length; i++) {
			sales[i] = Integer.parseInt(st.nextToken());
		}
		
		// 출력
		System.out.println(ex.solution(n, k, sales));
	}
}

/*
// 이전코드
	public static int solution(int K, int[] sales) {
		int answer = 0;
		int maxSales = 0;
		
	
//		// 풀이 1 -> Time Exceed
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
*/