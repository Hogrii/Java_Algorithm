import java.util.HashMap;
import java.util.Scanner;

public class Ex02 {
	public static String solution(String str1, String str2) {
		String answer = "YES";
		HashMap<Character, Integer> anagramMap = new HashMap<>();
		
		// 첫번째 문자열을 HashMap에 저장한다.
		for(char alphabet : str1.toCharArray()) {
			// Key : 알파벳, Value : 알파벳 수
			anagramMap.put(alphabet, anagramMap.getOrDefault(alphabet, 0)+1);
		}
		
		// 두번째 문자열을 HashMap에 저장된 Key : Value와 비교한다.
		for(char alphabet : str2.toCharArray()) {
			// 만약 현재 알파벳이 HashMap에 등록되지 않았다면 NO 출력
			if(!anagramMap.containsKey(alphabet)) answer = "NO";
			else {
				// 알파벳 글자 수를 비교해야하기 때문에 Value 값을 -1씩 감소시킨다.
				anagramMap.put(alphabet, anagramMap.get(alphabet)-1);
				// 만약 Value값이 음수가 된다면 글자수가 다르다는 뜻이기 때문에 NO 출력
				// 이는 입력되는 글자수의 길이가 같다는 조건이 있기 때문에 가능
				if(anagramMap.get(alphabet)<0) answer = "NO";
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		// 아나그램(해쉬)
		// 아나그램이란 알파벳 나열 순서는 다르나 구성이 일치할 경우 아나그램이라 한다.
		// AbaAeCe와 baeeACA는 나열 순서는 다르나 구성(알파벳 개수)이 같다
		// 입력된 두 단어(길이가 같음)가 아나그램인지 판별할 것
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		System.out.println(solution(str1, str2));
	}
}
