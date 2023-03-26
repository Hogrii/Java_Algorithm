import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex04 {
	public int solution(int m, int[] arr) {		
		// 특정 구간
		int lt = 0;
		int rt = 0;
		// 합
		int sum = 0;
		// 횟수
		int cnt = 0;
		
		for(rt=0; rt<arr.length; rt++) {
			// sum에 rt에 해당하는 값을 저장
			sum += arr[rt];
			
			// sum이 특정숫자 m와 같으면 횟수 +1
			if(sum==m) cnt++;
			
			// sum이 특정숫자 m보다 크거나 같을 때
			while(sum>=m) {
				// sum에 lt에 해당하는 값을 제거
				sum -= arr[lt++];
				// lt값을 제거했을 때 특정숫자 m과 같을 때
				if(sum==m) cnt++;
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) throws IOException{
		// 연속 부분수열		
		// N개의 수로 이루어진 수열
		// 수열 내 연속부분수열의 합이 특정숫자 M이 되는 경우의 횟수
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		Ex04 ex = new Ex04();
		
		// 수열의 길이, 특정숫자
		st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		// 수열을 담을 배열
		int[] arr = new int[n];
		
		// 배열에 수열 입력
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(ex.solution(m,  arr));
	}
}

/*
// 이전 코드
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
*/