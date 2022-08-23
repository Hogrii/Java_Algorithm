import java.util.Scanner;

public class Ex09 {
	public static int solution(int N, int[][] grating) {
		int answer = 0;
		// 가로합, 세로합
		int sumWidth, sumVertical;
		// 왼쪽 위 -> 오른쪽 아래 합, 오른쪽 위 -> 왼쪽 아래 합
		int diagonal1 = 0, diagonal2 = 0;
		
		for(int i=0; i<grating.length; i++) {
			sumWidth = sumVertical = 0;
			for(int j=0; j<grating.length; j++) {
				// 가로합
				sumWidth += grating[i][j];
				// 세로합
				sumVertical += grating[j][i];
			}
			// answer에 최대합 저장
			answer = Math.max(answer, sumWidth);
			answer = Math.max(answer, sumVertical);
		}
		
		for(int i=0; i<grating.length; i++) {
			for(int j=0; j<grating.length; j++) {
				// 대각선 1 : i==j 일때
				if(i==j) diagonal1 += grating[i][j];
				// 대각선 2 : i+j 합이 격자판 가로의 수와 같을 때
				if(i+j == N-1) diagonal2 += grating[i][j];
			}
		}
		// answer에 최대합 저장
		answer = Math.max(answer, diagonal1);
		answer = Math.max(answer, diagonal2);
		
		return answer;
	}
	
	public static void main(String[] args) {
		// 격자판 최대합
		// N*N 격자판이 주어졌을 때 각 행의 합, 열의 합, 대각선의 합 중 가장 큰 합 출력
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[][] grating = new int[N][N];
		
		for(int i=0; i<grating.length; i++) {
			for(int j=0; j<grating.length; j++) {
				grating[i][j] = sc.nextInt();
			}
		}
		// 출력
		System.out.println(solution(N, grating));		
	}
}
