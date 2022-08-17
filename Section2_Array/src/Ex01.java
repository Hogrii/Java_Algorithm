import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {
	public static ArrayList<Integer> solution(int[] num) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		// 첫번째 수는 무조건 출력한다.
		answer.add(num[0]);
		
		for(int i=1; i<num.length; i++) {
			// 현재의 수가 이전의 수보다 크면 추가한다.
			if(num[i]>num[i-1]) answer.add(num[i]);
		}
		
		// 출력
		return answer;
	}
	
	public static void main(String[] args) {
		// N개의 정수를 입력받아 자신의 바로 앞 수보다 큰 수만 출력
		// 첫번째 수는 무조건 출력
		Scanner sc = new Scanner(System.in);
		
		// 받을 정수의 수
		int N = sc.nextInt();
		int[] num = new int[N];
		
		// 입력받은 정수
		for(int i=0; i<N; i++) {
			num[i] = sc.nextInt();
		}
		
		for(int answer : solution(num)) {
			System.out.print(answer + " ");
		}
	}
}
