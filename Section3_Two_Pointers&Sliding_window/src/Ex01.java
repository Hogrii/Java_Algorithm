import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Ex01 {	
	public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		// 각 배열의 인덱스
		int p1 = 0;
		int p2 = 0;
		
		// 각 배열의 인덱스가 배열의 길이보다 작을 때 동작
		while(p1<n && p2<m) {
			// a의 값이 b보다 작으면 a를 추가
			if(a[p1]<b[p2]) answer.add(a[p1++]);
			// a의 값이 b보다 크거나 같으면 b를 추가
			else answer.add(b[p2++]);
		}
		
		// a의 인덱스가 배열의 길이만큼 돌지 못했을 때
		while(p1<n) answer.add(a[p1++]);
		// b의 인덱스가 배열의 길이만큼 돌지 못했을 때
		while(p2<m) answer.add(b[p2++]);
		
		return answer;
	}
	
	public static void main(String[] args) throws IOException {
		// 두 배열 합치기
		// 오름차순으로 정렬된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		Ex01 ex = new Ex01();
		
		// 첫번째 배열의 크기
		int n = Integer.parseInt(br.readLine());

		// 첫번째 배열
		int[] a = new int[n];
		
		// 첫번째 배열 원소 입력
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<a.length; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		// 두번째 배열의 크기
		int m = Integer.parseInt(br.readLine());
		
		// 두번째 배열
		int[] b = new int[m];
		
		// 두번째 배열 원소 입력
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<b.length; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		
		// 출력
		for(int x : ex.solution(n, m, a, b)) System.out.print(x + " ");
	}
}