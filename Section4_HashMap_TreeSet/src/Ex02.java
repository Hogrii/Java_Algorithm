import java.util.HashMap;
import java.util.Scanner;

public class Ex02 {
	public static String solution(String str1, String str2) {
		String answer = "YES";
		HashMap<Character, Integer> anagramMap = new HashMap<>();
		
		// ù��° ���ڿ��� HashMap�� �����Ѵ�.
		for(char alphabet : str1.toCharArray()) {
			// Key : ���ĺ�, Value : ���ĺ� ��
			anagramMap.put(alphabet, anagramMap.getOrDefault(alphabet, 0)+1);
		}
		
		// �ι�° ���ڿ��� HashMap�� ����� Key : Value�� ���Ѵ�.
		for(char alphabet : str2.toCharArray()) {
			// ���� ���� ���ĺ��� HashMap�� ��ϵ��� �ʾҴٸ� NO ���
			if(!anagramMap.containsKey(alphabet)) answer = "NO";
			else {
				// ���ĺ� ���� ���� ���ؾ��ϱ� ������ Value ���� -1�� ���ҽ�Ų��.
				anagramMap.put(alphabet, anagramMap.get(alphabet)-1);
				// ���� Value���� ������ �ȴٸ� ���ڼ��� �ٸ��ٴ� ���̱� ������ NO ���
				// �̴� �ԷµǴ� ���ڼ��� ���̰� ���ٴ� ������ �ֱ� ������ ����
				if(anagramMap.get(alphabet)<0) answer = "NO";
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		// �Ƴ��׷�(�ؽ�)
		// �Ƴ��׷��̶� ���ĺ� ���� ������ �ٸ��� ������ ��ġ�� ��� �Ƴ��׷��̶� �Ѵ�.
		// AbaAeCe�� baeeACA�� ���� ������ �ٸ��� ����(���ĺ� ����)�� ����
		// �Էµ� �� �ܾ�(���̰� ����)�� �Ƴ��׷����� �Ǻ��� ��
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		System.out.println(solution(str1, str2));
	}
}
