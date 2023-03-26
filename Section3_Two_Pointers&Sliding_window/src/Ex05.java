import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05 {
	public int solution(int n) {
		int rt, lt = 1;
		int sum = 0;
		int cnt = 0;
		
		// 1부터 절반+1까지만 돌린다 -> 절반 이상이면 둘이 합쳐 n이 될 수 없음
		for(rt=1; rt<=(n/2)+1; rt++) {
			// sum에 rt를 더해준다
			sum += rt;
			// sum이 n과 같으면 cnt을 증가
			if(sum==n) cnt++;
			
			// sum이 n보다 크거나 같을 때
			while(sum>=n) {
				// sum에서 lt값을 빼고 lt는 증가
				sum -= lt++;
				// sum에서 lt값을 뺀 값이 n과 같으면 cnt 증가
				if(sum==n) cnt++;
			}
		}
		return cnt;		
	}
	
	public static void main(String[] args) throws IOException{
		// 연속된 자연수의 합
		// N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수 출력
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Ex05 ex = new Ex05();
		
		// 정수 n
		int n = Integer.parseInt(br.readLine());
		
		// 출력
		System.out.println(ex.solution(n));
	}
}