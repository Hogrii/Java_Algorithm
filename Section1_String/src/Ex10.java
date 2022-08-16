import java.util.Scanner;

public class Ex10 {
	public static int[] solution(String str, char spelling) {
		int[] answer = new int[str.length()];
		// 거리를 100으로 초기화
		int distance = 100;
		
		// str을 앞에서 뒤로 훑는다.
		for(int i=0; i<str.length(); i++) {
			// str의 글자와 spelling이 같다면 거리를 0으로 초기화
			if(str.charAt(i)==spelling) distance = 0;
			// str의 글자와 spelling이 다르다면 거리를 +1 증가시킨다.
			else distance++;
			
			answer[i] = distance;
		}
		
		// 거리를 100으로 초기화
		distance = 100;
		
		// str을 뒤에서 앞으로 훑는다.
		for(int i=str.length()-1; i>=0; i--) {
			// str의 글자와 spelling이 같다면 거리를 0으로 초기화
			if(str.charAt(i)==spelling) distance = 0;
			// str의 글자와  spelling이 다르다면 거리를 +1 증가시킨다.
			else distance++;
			
			// 입력된 거리가 현재 거리보다 크다면 현재 새로 기록된 거리로 입력한다.
//			if(answer[i]>distance) answer[i] = distance;
			answer[i] = Math.min(answer[i], distance);
		}
		
		return answer;
	}
	public static void main(String[] args) {
		// 문자열 str, 문자 spelling이 주어진다.
		// str의 각 문자와 spelling이 떨어진 거리를 순서대로 출력
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char spelling = sc.next().charAt(0);
		
		for(int distance : solution(str, spelling)) {
			System.out.print(distance + " ");
		}
	}
}
