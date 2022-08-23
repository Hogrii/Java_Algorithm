import java.util.Scanner;

public class Ex08 {	
	public static int[] solution(int N, int[] score){
		int[] answer = new int[N];
		
		for(int i=0; i<score.length; i++) {
			int ranking = 1;
			for(int j=0; j<score.length; j++) {
				if(score[i]<score[j]) ranking++;
			}
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
		
		for(int answer : solution(N, score)) {
			System.out.print(answer + " ");
		}
		
	}
}
