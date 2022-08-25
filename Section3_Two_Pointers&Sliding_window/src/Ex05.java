import java.util.Scanner;

public class Ex05 {
	public static int solution(int N) {
		int answer = 0;
		int sum = 0;
		int cnt = 0;
		int min = 1;
		
		for(int i=1; i<N; i++) {
			sum += i;
			if(sum==N) cnt++;
			while(sum>N) {
				sum -= min;
				min++;
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
