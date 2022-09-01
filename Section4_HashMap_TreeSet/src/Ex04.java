import java.util.HashMap;
import java.util.Scanner;

public class Ex04 {
	public static int solution(String S, String T) {
		int answer = 0;
		HashMap<Character, Integer> anaMap = new HashMap<>();
		int startIndex = 0, endIndex = T.length();
		
		for(int i=T.length()-1; i<S.length(); i++) {
			// 문자열 T를 anaMap에 입력
			for(char charT : T.toCharArray()) {
				anaMap.put(charT, anaMap.getOrDefault(charT, 0)+1);
			}
			
			// 문자열 S를 T와 비교하기 위해 T와 같은 크기로 분할
			String compareS = S.substring(startIndex, endIndex);
			// 분할된 문자열 S를 anaMap에 넣는다.
			// 이때, 이미 등록된 값이면 -1
			for(char charS : compareS.toCharArray()) {
				anaMap.put(charS, anaMap.getOrDefault(charS, 0)-1);
				// 만약 분할된 문자열 S로 저장된 값이 0이라면 anaMap에서 제거
				if(anaMap.get(charS)==0) anaMap.remove(charS);
			}
			// anaMap의 크기가 0이면 모든 단어가 일치
			if(anaMap.size()==0) answer++;
			
			// 믄지얄 S의 분할 범위 갱신
			startIndex++;
			endIndex++;
			
			// anaMap 초기화
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
		// 모든 아나그램 찾기
		// S문자열에서 T문자열과 아나그램이 되는 부분의 개수를 출력
		// 판별시 대소문가 구분
		// 부분문자열은 연속된 문자열
		Scanner sc = new Scanner(System.in);
		
		String S = sc.nextLine();
		String T = sc.nextLine();
		
		System.out.println(solution(S, T));
	}
}
