import java.util.Scanner;

public class Ex06 {
	public static int solution(int K, int[] arr) {
		int answer = 0;
		int cnt = 0;
		int lt = 0;
		
		for(int rt=0; rt<arr.length; rt++) {
			// 0이 나오면 K번만큼 1로 바꿀 수 있기 때문에 일단 진행
			if(arr[rt]==0) cnt++;
			// 만약 0을 1로 바꾼 횟수가 K보다 많아질 경우
			while(cnt>K) {
				// arr[0]부터 0이 나오는 지점을 조회
				// 조회 후 0이 확인되면 0을 1로 바꾼 횟수를 차감
				if(arr[lt]==0) cnt--;
				// 인덱스 0부터 시작해서 0값을 찾기 위한 값
				lt++;
			}
			// 현재 최대 길이보다 더 긴 부분이 나오면 갱신
			answer = Math.max(answer, rt-lt+1);
		}
		
		// 출력
		return answer;
	}
	
	public static void main(String[] args) {
		// 최대 길이 연속부분수열
		// 0과 1로 구성된 길이 N의 수열 입력
		// K번만큼 0을 1로 변경 가능
		// K번만큼 0을 1로 바꾸었을 때 1로만 구성된 최대 길이의 연속부분수열을 출력
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int arr[] = new int[N];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(solution(K, arr));
	}
}
