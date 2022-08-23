import java.util.Scanner;

public class Ex07 {
	public static int solution(int[] grading) {
		int answer = 0;
		int point = 0;
		int addPoint = 0;
		
		for(int i=0; i<grading.length; i++) {
			// 문제를 맞췄다면 가점 +1 이후 합계 누적
			if(grading[i] == 1) {
				addPoint++;
				point += addPoint;
			// 문제를 틀렸다면 가점을 0으로 변경
			}else {
				addPoint = 0;
			}
		}
		
		answer = point;
		return answer;
	}
	
	public static void main(String[] args) {
		// 점수계산
		// 처음으로 맞췄을 때 1점
		// 틀리다가 맞았을 때 1점
		// 연속으로 맞추면 연속으로 맞춘 횟수만큼 가점
		// 채점 결과는 맞췄을 때 1, 틀렸을 때 0으로 입력한다.
		Scanner sc = new Scanner(System.in);
		
		// 문제의 수
		int N = sc.nextInt();
		// 채점 결과
		int[] grading = new int[N];
		
		for(int i=0; i<grading.length; i++) {
			grading[i] = sc.nextInt();
		}
		
		// 출력
		System.out.println(solution(grading));
	}
}
