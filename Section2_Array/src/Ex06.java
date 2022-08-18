import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Ex06 {
	public static boolean checkPrime(int reverseNatural) {
		// 뒤집은 자연수의 크기만큼 배열 생성(0~뒤집은 수)
		boolean[] prime = new boolean[reverseNatural+1];
		
		// 모든 수를 소수라고 생각한 뒤 소수가 아닌 수를 제거한다.
		for(int i=2; i<prime.length; i++) {
			prime[i] = true;
		}
		
		for(int i=2; i<prime.length; i++) {
			// i가 true라면
			if(prime[i]==true)	{
				// i의 배수를 모두 false로 바꾼다.
				for(int j=i+i; j<prime.length; j=j+i)	{
					prime[j] = false;
				}				
			}
		}
		// 뒤집은 자연수 리턴
		return prime[reverseNatural];
	}
	
	public static ArrayList<Integer> solution(String[] natural) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		// 뒤집은 자연수를 넣어줄 변수
		int reverseNatural = 0;
		
		for(int i=0; i<natural.length; i++) {
			// 자연수 뒤집기
			reverseNatural = Integer.parseInt(new StringBuilder(natural[i]).reverse().toString());
			// 뒤집은 자연수가 소수인지 판단
			if(checkPrime(reverseNatural)==true) answer.add(reverseNatural);
		}
		// 출력
		return answer;
	}
	
	public static void main(String[] args) throws IOException{
		// 뒤집은 소수
		// 첫 줄에 자연수의 개수 N
		// 둘째 줄에  N개의 자연수 입력
		// 입력받은 자연수를 뒤집었을 때 소수이면 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		// 자연수의 개수
		int N = Integer.parseInt(br.readLine());
		String[] natural = new String[N];
		
		// N개의 자연수 입력
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<natural.length; i++) {
			natural[i] = st.nextToken();
		}
		
		for(int answer : solution(natural)) {
			System.out.print(answer + " ");
		}
	}
}
