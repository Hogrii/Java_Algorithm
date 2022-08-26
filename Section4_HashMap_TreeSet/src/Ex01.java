import java.util.HashMap;
import java.util.Scanner;

public class Ex01 {
	public static char solution(int n, String str) {
		char answer = ' ';
		// Key는 Char, Value는 int
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('A', 3);
		
		return answer;
	}
	
	public static void main(String[] args) {
		// 학급 회장(해쉬)
		// 학생 수 N 입력
		// N개의 투표용지 입력(A~E)
		// 회장으로 선출된 학생 출력
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String str = sc.next();
		
		System.out.println(solution(n, str));
		
	}
}
