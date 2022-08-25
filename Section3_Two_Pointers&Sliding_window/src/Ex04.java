import java.util.Scanner;

public class Ex04 {
	public static int solution(int M, int[] arr) {
		int answer = 0;
		int sum = 0;
		int cnt = 0;
		int minIndex = 0;
		
		for(int i=0; i<arr.length; i++) {
			// i번째까지 더한다
			sum += arr[i];
			// 합이 특정숫자 M과 같다면 +1
			if(sum == M) cnt++;
			// 합이 특정숫자 M보다 높을 때
			while(sum>=M) {
				// 합으로 구성되어 있는 맨 앞의 수열을 제거
				sum -= arr[minIndex];
				// 맨 앞의 수열인덱스 갱신
				minIndex++;
				// 합이 특정숫자 M과 같아졌다면 +1
				if(sum==M) cnt++;
			}
		}
		answer = cnt;
		
		// 출력
		return answer;
	}
	
	public static void main(String[] args) {
		// 연속 부분수열
		// N은 수열의 개수
		// M은 특정 숫자
		// N 수열에서 연속부분수열의 합이 M이 되는 경우의 합을 출력
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
