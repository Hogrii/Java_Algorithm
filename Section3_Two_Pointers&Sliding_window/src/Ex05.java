import java.util.Scanner;

public class Ex05 {
	public static int solution(int N) {
		int answer = 0;
		int sum = 0;
		int cnt = 0;
		int min = 1;
		
		// N과 같으면 15가 되기 때문에 작다라고 해야한다.
		for(int i=1; i<N; i++) {
			// i는 1부터 더해준다
			sum += i;
			// 합이 N과 같다면 +1
			if(sum==N) cnt++;
			// 합이 N보다 크다면
			while(sum>N) {
				// 맨 앞부터 제거
				sum -= min;
				// 최소값 증가
				min++;
				// 합이 N과 같아졌다면 +1
				if(sum==N) cnt++;
			}
		}
		
		answer = cnt;
		return answer;
	}
	
	public static void main(String[] args) {
		// 연속된 자연수의 합
		// 양의 정수 N 입력
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		System.out.println(solution(N));
	}
}
