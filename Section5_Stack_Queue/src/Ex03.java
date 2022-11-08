import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Ex03 {
	public static int solution(int N, int[][] board, int M, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0; i<moves.length; i++) {
			for(int j=0; j<board.length; j++) {
				if(board[j][moves[i]-1]!=0) {
					int tmp = board[j][moves[i]-1];
					board[j][moves[i]-1] = 0;
					if(!stack.empty() && stack.peek()==tmp) {
						answer += 2;
						stack.pop();
					}
					else stack.push(tmp);
					break;
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws IOException{
		// 크레용 인형뽑기(카카오)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[][] board = new int[N][N];
		
		for(int i=0; i<board.length; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<board.length; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int M = Integer.parseInt(br.readLine());
		int[] moves = new int[M];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<moves.length; i++) {
			moves[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(solution(N, board, M, moves));
	}
}
