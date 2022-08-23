import java.util.Scanner;

public class Ex10 {
	public static int solution(int[][] board) {
		int answer = 0;
		int peak = 0;
		
		for(int i=1; i<board.length; i++) {
			for(int j=1; j<board.length; j++) {
				// ���� ������ �����¿캸�� ũ�� ���츮 +1
				if(board[i][j]>board[i-1][j] && board[i][j]>board[i+1][j] && 
						board[i][j]>board[i][j-1] && board[i][j]>board[i][j+1]) {
					peak++;
				}
			}
		}
		answer = peak;
		
		/*
		// Other solution
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, 1, 0, -1};
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				boolean peak = true;
				for(int k=0; k<4; k++) {
					int nx = i+dx[k];
					int ny = j+dy[k];
					if(nx>=0 && nx<n && ny>=0 && ny<n && board[nx][ny]>=board[i][j]) {
						peak = false;
						break;
					}
				}
				if(peak) answer++;
			}
		}
		 */
		
		// ���
		return answer;
	}
	
	public static void main(String[] args) {
		// ���츮
		// N*N ������
		// ������ ���� �� �ڽ��� �����¿� ���ں��� ū ���ڴ� ���츮
		// ������ �����ڸ��� 0
		// ���츮�� ���� ���
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[][] board = new int[N+2][N+2];
		
		// ������ ��ü�� 0���� �ʱ�ȭ(������ �����ڸ��� 0�̱� ����)
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board.length; j++) {
				board[i][j] = 0;
			}
		}
		
		// ������ �����ڸ��� ������ ������ �Է�
		for(int i=1; i<board.length-1; i++) {
			for(int j=1; j<board.length-1; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(solution(board));
	}
}
