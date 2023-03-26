import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex06 {
	public int solution(int k, int[] arr) {
		// 최대 길이
		int max = 0;
		int lt = 0;
		int rt = 0;
		// 현재 변경횟수
		int changeCnt = 0;
		
		// 검색
		for(rt=0; rt<arr.length; rt++) {
			// rt가 0을 만나면 변경횟수 추가
			if(arr[rt]==0) changeCnt++;
			
			// 변경횟수가 최대 변경횟수보다 커질때
			while(changeCnt>k) {
				// lt가 0을 만나면 변경횟수 감소
				if(arr[lt]==0) changeCnt--;
				
				// lt 앞으로 이동
				lt++;				
			}
			// rt의 위치에서 lt와의 거리를 구한다
			max = Math.max(max, rt-lt+1);
		}		
		
		return max;
	}
	
	public static void main(String[] args) throws IOException{
		// 최대 길이 연속부분수열
		// 0과 1로 구성된 길이 n 수열
		// 최대 k번 0 -> 1로 변경 가능
		// 1로만 구성된 최대 길이의 연속부분수열을 출력
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		Ex06 ex = new Ex06();
		
		// 수열 길이, 변경 횟수
		st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		// 배열 생성
		int[] arr = new int[n];
		
		// 배열에 수열 입력
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// 출력
		System.out.println(ex.solution(k, arr));	
	}
}