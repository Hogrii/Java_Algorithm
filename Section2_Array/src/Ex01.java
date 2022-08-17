import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {
	public static ArrayList<Integer> solution(int[] num) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		answer.add(num[0]);
		
		for(int i=1; i<num.length; i++) {
			if(num[i]>num[i-1]) answer.add(num[i]);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		// N���� ������ �Է¹޾� �ڽ��� �ٷ� �� ������ ū ���� ���
		// ù��° ���� ������ ���
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] num = new int[N];
		
		for(int i=0; i<N; i++) {
			num[i] = sc.nextInt();
		}
		
		for(int answer : solution(num)) {
			System.out.print(answer + " ");
		}
	}
}
