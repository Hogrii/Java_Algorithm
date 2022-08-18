import java.util.Scanner;

public class Ex05 {
	public static int solution(int N) {
		int answer = 0;
		
		// 2~N���� �迭 ����
		boolean[] notPrime = new boolean[N+1];
		// 2~N���� �Ҽ��̸� false, �Ҽ��� �ƴϸ� true
		for(int i=2; i<N; i++) {
			if(notPrime[i]==false) {
				answer++;
				for(int j=i; j<=N; j=j+i) notPrime[j]=true;
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
		
		// �Է�
		int N = sc.nextInt();
		System.out.println(solution(N));
	}
}
