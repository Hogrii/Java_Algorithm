import java.util.Scanner;

public class Ex08 {	
	public static int[] solution(int N, int[] score){
		int[] answer = new int[N];
		
		for(int i=0; i<score.length; i++) {
			// 비교가 끝나면 등수를 1등으로 초기화
			int ranking = 1;
			for(int j=0; j<score.length; j++) {
				// 현재 점수보다 큰 점수가 있다면 등수를 +1씩 늘려준다.
				if(score[i]<score[j]) ranking++;
			}
			// 등수 입력
			answer[i] = ranking;
		}

		return answer;
	}
	public static void main(String[] args) {
		// 등수 구하기
		// 점수에 따라 등수 출력
		// 등수가 같다면 높은 등수로 동일 처리
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] score = new int[N];
		
		for(int i=0; i<score.length; i++) {
			score[i] = sc.nextInt();
		}
		
		// 출력
		for(int answer : solution(N, score)) {
			System.out.print(answer + " ");
		}
		
	}
}
