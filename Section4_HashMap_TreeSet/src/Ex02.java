import java.util.HashMap;
import java.util.Scanner;

public class Ex02 {
	public static String solution(String str1, String str2) {
		String answer = "YES";
		HashMap<Character, Integer> anagramMap = new HashMap<>();
		
		for(char alphabet : str1.toCharArray()) {
			anagramMap.put(alphabet, anagramMap.getOrDefault(alphabet, 0)+1);
		}
		
		for(char alphabet : str2.toCharArray()) {
			if(!anagramMap.containsKey(alphabet)) answer = "NO";
			else {
				anagramMap.put(alphabet, anagramMap.get(alphabet)-1);
				if(anagramMap.get(alphabet)<0) answer = "NO";
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		// 아나그램(해쉬)
		// 아나그램이란 알파벳 나열 순서는 다르나 구성이 일치할 경우 아나그램이라 한다.
		// AbaAeCe와 baeeACA는 나열 순서는 다르나 구성(알파벳 개수)이 같다
		// 입력된 두 단어가 아나그램인지 판별할 것
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		System.out.println(solution(str1, str2));
	}
}
