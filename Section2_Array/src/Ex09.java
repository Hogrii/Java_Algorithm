import java.util.Scanner;

public class Ex09 {
	public static int solution(int N, int[][] grating) {
		int answer = 0;
		int sumWidth, sumVertical;
		int diagonal1 = 0, diagonal2 = 0;
				
		for(int i=0; i<grating.length; i++) {
			sumWidth = sumVertical = 0;
			for(int j=0; j<grating.length; j++) {
				sumWidth += grating[i][j];
				sumVertical += grating[j][i];
			}			
			answer = Math.max(answer, sumWidth);
			answer = Math.max(answer, sumVertical);
		}
		
		for(int i=0; i<grating.length; i++) {
			for(int j=0; j<grating.length; j++) {
				if(i==j) diagonal1 += grating[i][j];
				if(i+j == N-1) diagonal2 += grating[i][j];
			}
		}		
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
		System.out.println(solution(N, grating));		
	}
}
