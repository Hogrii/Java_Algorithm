import java.util.Scanner;

public class Ex10 {
	public static int solution(int[][] board) {
		int answer = 0;
		int peak = 0;
		
		for(int i=1; i<board.length; i++) {
			for(int j=1; j<board.length; j++) {
				// 현재 지점이 상하좌우보다 크면 봉우리 +1
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
		
		// 출력
		return answer;
	}
	
	public static void main(String[] args) {
		// 봉우리
		// N*N 격자판
		// 격자판 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리
		// 격자의 가장자리는 0
		// 봉우리의 개수 출력
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[][] board = new int[N+2][N+2];
		
		// 격자판 전체를 0으로 초기화(격자의 가장자리가 0이기 때문)
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board.length; j++) {
				board[i][j] = 0;
			}
		}
		
		// 격자의 가장자리를 제외한 격자판 입력
		for(int i=1; i<board.length-1; i++) {
			for(int j=1; j<board.length-1; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(solution(board));
	}
}
