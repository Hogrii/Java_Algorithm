import java.util.Scanner;

public class Ex05 {
	public static String solution(String str) {
		String answer = "";
		
		char[] letters = str.toCharArray();
		int leftIndex = 0, rightIndex = str.length()-1;
		while(leftIndex<rightIndex) {
			if(!Character.isAlphabetic(letters[leftIndex])) leftIndex++; 
			else if(!Character.isAlphabetic(letters[rightIndex])) rightIndex--;
			else {			
				char tmp = letters[leftIndex];
				letters[leftIndex] = letters[rightIndex];
				letters[rightIndex] = tmp;
				leftIndex++;
				rightIndex--;
			}
		}
		answer = String.valueOf(letters);
		
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		System.out.println(solution(str));
	}
}
