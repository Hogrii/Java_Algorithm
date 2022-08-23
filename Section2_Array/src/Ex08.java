import java.util.Scanner;

public class Ex08 {	
	public static int[] solution(int N, int[] score){
		int[] answer = new int[N];
		
		for(int i=0; i<score.length; i++) {
			// �񱳰� ������ ����� 1������ �ʱ�ȭ
			int ranking = 1;
			for(int j=0; j<score.length; j++) {
				// ���� �������� ū ������ �ִٸ� ����� +1�� �÷��ش�.
				if(score[i]<score[j]) ranking++;
			}
			// ��� �Է�
			answer[i] = ranking;
		}

		return answer;
	}
	public static void main(String[] args) {
		// ��� ���ϱ�
		// ������ ���� ��� ���
		// ����� ���ٸ� ���� ����� ���� ó��
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] score = new int[N];
		
		for(int i=0; i<score.length; i++) {
			score[i] = sc.nextInt();
		}
		
		// ���
		for(int answer : solution(N, score)) {
			System.out.print(answer + " ");
		}
		
	}
}
