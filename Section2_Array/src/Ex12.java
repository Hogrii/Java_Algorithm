import java.util.Scanner;

public class Ex12 {
	public static int solution(int N, int M, int[][] mathRank) {
		int answer = 0;
		int mentotiRel = 0;
		
		// 1�� �л����� �� ����
		for(int i=1; i<=N; i++) {
			// 1�� �л����� �� ���
			for(int j=1; j<=N; j++) {
				int mentotiCnt = 0;
				for(int k=0; k<M; k++) {
					int mento = 0, menti = 0;
					for(int l=0; l<N; l++) {
						// mathRank[k][l]�� �л��� i�� �л��̶�� mento�� ����(l)�� ����
						if(mathRank[k][l]==i) mento = l;
						// mathRank[k][l]�� �л��� j�� �л��̶�� menti�� ����(l)�� ����
						if(mathRank[k][l]==j) menti = l;
					}
					// ���� menti�� mento���� ������ ���ٸ� mento-menti ī��Ʈ�� +1
					if(mento<menti) mentotiCnt++; 
				}
				// i�� �л����κ��� mento-menti ���谡 M��(�����׽�Ʈ Ƚ��)��ŭ �׿��ٸ� ���� ����
				if(mentotiCnt == M) mentotiRel++;
			}
		}
		answer = mentotiRel;
		
		// ���
		return answer;
	}
	
	public static void main(String[] args) {
		// ���丵
		// ù°�� N�� �л��� ��, M�� �����׽�Ʈ Ƚ��
		// ��°�ٿ� 3 4 1 2�� �־����� 3�� �л��� 1��, 4�� �л��� 2��
		// ����� ��Ƽ�� �Ƿ��� ����� �� �ѹ��� ��Ƽ���� ������ ������ �ȵ�
		// ����� ��Ƽ ¦�� ���� �� �ִ� �� ����� �� ���
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[][] mathRank = new int[M][N];
		
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				mathRank[i][j] = sc.nextInt();
			}
		}
		System.out.println(solution(N, M, mathRank));
	}
}
