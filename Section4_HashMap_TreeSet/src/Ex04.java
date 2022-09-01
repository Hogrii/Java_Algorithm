import java.util.HashMap;
import java.util.Scanner;

public class Ex04 {
	public static int solution(String S, String T) {
		int answer = 0;
		HashMap<Character, Integer> anaMap = new HashMap<>();
		int startIndex = 0, endIndex = T.length();
		
		for(int i=T.length()-1; i<S.length(); i++) {
			// ���ڿ� T�� anaMap�� �Է�
			for(char charT : T.toCharArray()) {
				anaMap.put(charT, anaMap.getOrDefault(charT, 0)+1);
			}
			
			// ���ڿ� S�� T�� ���ϱ� ���� T�� ���� ũ��� ����
			String compareS = S.substring(startIndex, endIndex);
			// ���ҵ� ���ڿ� S�� anaMap�� �ִ´�.
			// �̶�, �̹� ��ϵ� ���̸� -1
			for(char charS : compareS.toCharArray()) {
				anaMap.put(charS, anaMap.getOrDefault(charS, 0)-1);
				// ���� ���ҵ� ���ڿ� S�� ����� ���� 0�̶�� anaMap���� ����
				if(anaMap.get(charS)==0) anaMap.remove(charS);
			}
			// anaMap�� ũ�Ⱑ 0�̸� ��� �ܾ ��ġ
			if(anaMap.size()==0) answer++;
			
			// ������ S�� ���� ���� ����
			startIndex++;
			endIndex++;
			
			// anaMap �ʱ�ȭ
			for(char charT : T.toCharArray()) {
				anaMap.remove(charT);
			}
			for(char charS : compareS.toCharArray()) {
				anaMap.remove(charS);
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		// ��� �Ƴ��׷� ã��
		// S���ڿ����� T���ڿ��� �Ƴ��׷��� �Ǵ� �κ��� ������ ���
		// �Ǻ��� ��ҹ��� ����
		// �κй��ڿ��� ���ӵ� ���ڿ�
		Scanner sc = new Scanner(System.in);
		
		String S = sc.nextLine();
		String T = sc.nextLine();
		
		System.out.println(solution(S, T));
	}
}
