import java.util.Scanner;

public class Ex11 {
	public static int solution(int N, int[][] classRoom) {
		int answer = 0;
		int max = Integer.MIN_VALUE;
		
		for(int i=1; i<=N; i++) {
			int cnt = 0;
			for(int j=1; j<=N; j++) {
				for(int k=1; k<=5; k++) {
					if(classRoom[i][k]==classRoom[j][k]) {
						cnt++;
						break;
					}
				}
			}
			if(cnt>max) {
				max=cnt;
				answer=i;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		// �ӽù��� ���ϱ�
		// 1~5�г���� �ѹ��̶� ���� ���̾��� ����� ���� ���� �л� ����
		// �ӽù��� �ĺ��� �������� ��� ���� ���� ��ȣ �л� ���
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int classRoom[][] = new int[N+1][6];
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=5; j++) {
				classRoom[i][j] = sc.nextInt();
				
			}
		}
		
		System.out.println(solution(N, classRoom));
	}
}
