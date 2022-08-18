import java.util.Scanner;

public class Ex05 {
	public static int solution(int N) {
		int answer = 0;
		
		boolean[] prime = new boolean[N+1];
		for(int i=2; i<N; i++) {
			if(prime[i]==false) {
				answer++;
				for(int j=i; j<=N; j=j+i) prime[j]=true;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		// �����佺�׳׽� ü
		// �ڿ��� N �Է�
		// 1~N���� ���� �� �Ҽ��� ���� ���
		// �Է��� 2 �̻��� �Է��Ѵ�.
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		System.out.println(solution(N));
	}
}
