import java.util.ArrayList;
import java.util.Scanner;

public class Ex04 {
	public static ArrayList<String> solution(int N, String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		
		for(String word : str) {
			// �ܾ char�� �ɰ� �迭�� ��´�.
			char[] letters = word.toCharArray();
			// �ܾ� ���縵�� ù��°�� leftIndex, �������� rightIndex�� ����
			int leftIndex = 0, rightIndex = word.length()-1;
			while(leftIndex<rightIndex) {
				// ù��°�� ������ ���縵�� �ٲ۴�.
				char tmp = letters[leftIndex];
				letters[leftIndex] = letters[rightIndex];
				letters[rightIndex] = tmp;
				// Index���� �������� ��� ���縵�� ��ġ�� �ٲپ��ش�.
				leftIndex++;
				rightIndex--;
			}
			// ��ġ�� ��� �������ٸ� char -> String���� ����ȯ
			String reverseWord = String.valueOf(letters);
			// ArrayList�� ������ ���ڿ� �߰�
			answer.add(reverseWord);
		}
		
		/*
		// StringBuilder�� �̿��ؼ� �ܾ� ������
		for(String word : str) {
			// StringBuilder�� reverse�� ���� �����´�.
			// toString�� �̿��� StringBuilder -> String���� ����ȯ
			String reverseWord = new StringBuilder(word).reverse().toString();
			// ArrayList�� ������ ���ڿ� �߰�
			answer.add(reverseWord);
		}
		 */
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.nextLine());
		String[] str = new String[N];
		for(int i=0; i<N; i++) {
			str[i] = sc.nextLine();
		}
		
		for(String reverseWord : solution(N, str)) {
			System.out.println(reverseWord);
		}	
	}
}
