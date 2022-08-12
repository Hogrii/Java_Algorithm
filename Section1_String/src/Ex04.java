import java.util.ArrayList;
import java.util.Scanner;

public class Ex04 {
	public static ArrayList<String> solution(int N, String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		
		for(String word : str) {
			// 단어를 char로 쪼개 배열에 담는다.
			char[] letters = word.toCharArray();
			// 단어 스펠링의 첫번째를 leftIndex, 마지막을 rightIndex로 설정
			int leftIndex = 0, rightIndex = word.length()-1;
			while(leftIndex<rightIndex) {
				// 첫번째와 마지막 스펠링을 바꾼다.
				char tmp = letters[leftIndex];
				letters[leftIndex] = letters[rightIndex];
				letters[rightIndex] = tmp;
				// Index값을 증감시켜 모든 스펠링의 위치를 바꾸어준다.
				leftIndex++;
				rightIndex--;
			}
			// 위치를 모두 뒤집었다면 char -> String으로 형변환
			String reverseWord = String.valueOf(letters);
			// ArrayList에 뒤집은 문자열 추가
			answer.add(reverseWord);
		}
		
		/*
		// StringBuilder를 이용해서 단어 뒤집기
		for(String word : str) {
			// StringBuilder의 reverse를 통해 뒤집는다.
			// toString을 이용해 StringBuilder -> String으로 형변환
			String reverseWord = new StringBuilder(word).reverse().toString();
			// ArrayList에 뒤집은 문자열 추가
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
