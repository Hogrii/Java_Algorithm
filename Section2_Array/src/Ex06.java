import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Ex06 {
	public static boolean checkPrime(int reverseNatural) {
		boolean[] prime = new boolean[reverseNatural+1];
		
		for(int i=2; i<prime.length; i++) {
			prime[i] = true;
		}
		
		for(int i=2; i<prime.length; i++) {
			if(prime[i]==true)	{
				for(int j=i+i; j<prime.length; j=j+i)	{
					prime[j] = false;
				}				
			}
		}		
		
		return prime[reverseNatural];
	}
	
	public static ArrayList<Integer> solution(String[] natural) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		int reverseNatural = 0;
		
		for(int i=0; i<natural.length; i++) {
			reverseNatural = Integer.parseInt(new StringBuilder(natural[i]).reverse().toString());
			if(checkPrime(reverseNatural)==true) answer.add(reverseNatural);
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws IOException{
		// 뒤집은 소수
		// 첫 줄에 자연수의 개수 N
		// 둘째 줄에  N개의 자연수 입력
		// 입력받은 자연수를 뒤집었을 때 소수이면 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		String[] natural = new String[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<natural.length; i++) {
			natural[i] = st.nextToken();
		}
		
		for(int answer : solution(natural)) {
			System.out.print(answer + " ");
		}
	}
}
