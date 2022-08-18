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
		// ������ �Ҽ�
		// ù �ٿ� �ڿ����� ���� N
		// ��° �ٿ�  N���� �ڿ��� �Է�
		// �Է¹��� �ڿ����� �������� �� �Ҽ��̸� ���
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
