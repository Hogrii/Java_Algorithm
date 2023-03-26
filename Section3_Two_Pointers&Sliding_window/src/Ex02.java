import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex02 {
	public ArrayList<Integer> solution(int[] a, int[] b) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		// 각 배열 오름차순 정렬
		Arrays.sort(a);
		Arrays.sort(b);
		
		// 각 배열의 인덱스
		int p1 = 0;
		int p2 = 0;
		
		while(p1<a.length && p2<b.length) {
			if(a[p1] == b[p2]) {
				answer.add(a[p1]);
				p1++;
				p2++;
			}else {
				if(a[p1]<b[p2]) p1++;
				else p2++;
			}
		}
		
		return answer;		
	}
	
	public static void main(String[] args) throws IOException{
		// 공통원소 구하기
		// A, B 두 개의 집합이 주어지면 공통 원소를 추출해 오름차순으로 출력
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		Ex02 ex = new Ex02();
		
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
		
		// 두번쨰 배열 원소 입력
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<b.length; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		
		// 출력
		for(int x : ex.solution(a, b)) System.out.print(x + " ");
	}
}