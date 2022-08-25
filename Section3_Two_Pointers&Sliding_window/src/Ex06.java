import java.util.Scanner;

public class Ex06 {
	public static int solution(int K, int[] arr) {
		int answer = 0;
		int cnt = 0;
		int lt = 0;
		
		for(int rt=0; rt<arr.length; rt++) {
			if(arr[rt]==0) cnt++;
			while(cnt>K) {
				if(arr[lt]==0) cnt--;
				lt++;
			}
			answer = Math.max(answer, rt-lt+1);
		}

		
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
