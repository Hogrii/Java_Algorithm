import java.util.Scanner;

public class Ex12 {
	public static int solution(int N, int M, int[][] mathRank) {
		int answer = 0;
		int mentotiRel = 0;
		
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				int mentotiCnt = 0;
				for(int k=0; k<M; k++) {
					int mento = 0, menti = 0;
					for(int l=0; l<N; l++) {
						if(mathRank[k][l]==i) mento = l;
						if(mathRank[k][l]==j) menti = l;
					}
					if(mento<menti) mentotiCnt++; 
				}
				if(mentotiCnt == M) mentotiRel++;
			}
		}
		answer = mentotiRel;
		
		return answer;
	}
	
	public static void main(String[] args) {
		// 멘토링
		// 첫째줄 N은 학생의 수, M은 수학테스트 횟수
		// 둘째줄에 3 4 1 2가 주어지면 3번 학생이 1등, 4번 학생이 2등
		// 멘토와 멘티가 되려면 멘토는 단 한번도 멘티보다 성적이 낮으면 안됨
		// 멘토와 멘티 짝을 만들 수 있는 총 경우의 수 출력
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
