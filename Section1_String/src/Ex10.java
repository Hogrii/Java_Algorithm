import java.util.Scanner;

public class Ex10 {
	public static int[] solution(String str, char spelling) {
		int[] answer = new int[str.length()];
		int distance = 100;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==spelling) distance = 0;
			else distance++;
			
			answer[i] = distance;
		}
		
		distance = 100;
		for(int i=str.length()-1; i>=0; i--) {
			if(str.charAt(i)==spelling) distance = 0;
			else distance++;
			
//			if(answer[i]>distance) answer[i] = distance;
			answer[i] = Math.min(answer[i], distance);
		}
		
		return answer;
	}
	public static void main(String[] args) {
		// ���ڿ� str, ���� spelling�� �־�����.
		// str�� �� ���ڿ� spelling�� ������ �Ÿ��� ������� ���
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char spelling = sc.next().charAt(0);
		
		for(int distance : solution(str, spelling)) {
			System.out.print(distance + " ");
		}
	}
}
