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
				// 크레인이 닿는 배열의 값이 0이 아닌 경우 = 인형이 있음
				if(board[j][moves[i]-1]!=0) {
					// 해당 자리의 인형을 tmp에 담는다.
					int tmp = board[j][moves[i]-1];
					// 해당 자리의 인형을 뽑았기 때문에 0으로 바꿔준다.
					board[j][moves[i]-1] = 0;
					// 현재 뽑은 인형의 맨 윗자리가 비어있지 않고, 현재 뽑은 인형과 같은 인형이라면
					if(!stack.empty() && stack.peek()==tmp) {
						// 인형을 터뜨린다.
						answer += 2;
						stack.pop();
					}
					// if에 해당하지 않으면 뽑은 인형을 stack의 맨 위에 올려둔다.
					else stack.push(tmp);
					// 크레인이 인형에 한번이라도 닿으면 프로그램을 종료해야하기 떄문에 반드시 break로 for문을 나가준다.
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
