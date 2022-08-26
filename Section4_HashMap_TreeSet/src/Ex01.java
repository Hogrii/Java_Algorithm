import java.util.HashMap;
import java.util.Scanner;

public class Ex01 {
	public static char solution(int n, String votes) {
		char answer = ' ';
		HashMap<Character, Integer> voteMap = new HashMap<>();
		
		/*
		// Key�� Char, Value�� int
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('A', 3);
		 */
		
		for(char vote : votes.toCharArray()) {
			// .getOrDefault()�� ���� ������ vote���� �������� ������ 0���� �����´�.
			// ī���ÿ� ���� �߿�!
			voteMap.put(vote, voteMap.getOrDefault(vote, 0)+1);
		}
		
		// Integer.MIN_VALUE�� ���� �� ���� ���� ���� �����´�.
		// �ִ밪�� �����ϱ� ���� ���� ���� ���� �������� ��
		int max = Integer.MIN_VALUE;
		
		// .ketSet()�� HashMap Ÿ������ ����� ��ü�� Ű���� Ž���Ѵ�.
		for(char key : voteMap.keySet()) {
			// .get(key)�� HashMap�� ����Ǿ� �ִ� key�� �ش��ϴ� value�� �����´�.
			// System.out.println(key + " " + voteMap.get(key));
			if(voteMap.get(key)>max) {
				max = voteMap.get(key);
				answer = key;
			}
		}
		
		// .containsKey()�� �ش��ϴ� key�� ���� value�� �ִ��� Ȯ���ϴ� ��
		// Ű�� �����ϸ� true, �������� ������ false�� ���
		// System.out.println(voteMap.containsKey('A'));
		
		// .size()�� ���� HashMap�� ��ϵǾ� �ִ� key�� ���� �����´�.
		// System.out.println(voteMap.size());
		
		// .remove()�� key�� �����Ѵ�.
		// System.out.println(voteMap.remove());
		
		// ���
		return answer;
	}
	
	public static void main(String[] args) {
		// �б� ȸ��(�ؽ�)
		// �л� �� N �Է�
		// N���� ��ǥ���� �Է�(A~E)
		// ȸ������ ����� �л� ���
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String votes = sc.next();
		
		System.out.println(solution(n, votes));		
	}
}
