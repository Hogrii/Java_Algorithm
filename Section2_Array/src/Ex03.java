import java.util.Scanner;

public class Ex03 {
	public static String solution(int round, int[] buildA, int[] buildB) {
		String answer = "";
		
		// 가위바위보
		if(buildA[round]==buildB[round]) answer = "D";
		else if((buildA[round]==1 && buildB[round]==3) || (buildA[round]==2 && buildB[round]==1) || (buildA[round]==3 && buildB[round]==2)) answer = "A";
		else answer = "B";
		
		// 출력
		return answer;
	}
	
	public static void main(String[] args) {
		// 가위바위보
		// N번 게임을 한다.
		// A가 이기면 A, B가 이기면 B, 비기면 D를 출력한다.
		// 1:가위, 2:바위, 3:보
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int round = 0;
		
		// A가 낼거
		int[] buildA = new int[N];
		for(int i=0; i<buildA.length; i++) {
			buildA[i] = sc.nextInt();
		}
		
		// B가 낼거
		int[] buildB = new int[N];
		for(int i=0; i<buildB.length; i++) {
			buildB[i] = sc.nextInt();
		}
		
		// 출력
		for(int i=0; i<N; i++) {
			System.out.println(solution(round, buildA, buildB));
			// 이번판이 끝나면 다음판 진행
			round++;
		}
	}
}
