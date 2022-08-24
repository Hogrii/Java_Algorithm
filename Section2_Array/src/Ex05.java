import java.util.Scanner;

public class Ex05 {
	public static int solution(int N) {
		int answer = 0;
		
		// 2~N까지 배열 생성
		boolean[] notPrime = new boolean[N+1];
		// 2~N까지 소수이면 false, 소수가 아니면 true
		for(int i=2; i<N; i++) {
			if(notPrime[i]==false) {
				answer++;
				for(int j=i; j<=N; j=j+i) notPrime[j]=true;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		// 에라토스테네스 체
		// 자연수 N 입력
		// 1~N까지 숫자 중 소수의 개수 출력
		// 입력은 2 이상을 입력한다.
		Scanner sc = new Scanner(System.in);
		
		// 입력
		int N = sc.nextInt();
		System.out.println(solution(N));
	}
}
