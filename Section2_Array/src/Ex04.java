import java.util.Scanner;

public class Ex04 {
	public static int[] solution(int account) {
		int[] answer = new int[account];
		answer[0] = answer[1] = 1;
		
		for(int i=2; i<account; i++) {
			answer[i] = answer[i-2] + answer[i-1];
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		// 피보나치
		// 입력은 수열의 총 항의 수
		// 입력이 7이면 1 1 2 3 5 8 13
		Scanner sc = new Scanner(System.in);
		
		int account = sc.nextInt();
		
		for(int answer : solution(account)) {
			System.out.print(answer + " ");			
		}
	}
}
