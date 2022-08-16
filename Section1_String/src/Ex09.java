import java.util.Scanner;

public class Ex09 {
	public static int solution(String str) {
		String answer = "";
//		int answer = 0;
		
		for(char ascii : str.toCharArray()) {
			// ascii가 숫자라면 answer에 누적시켜준다.
			// 맨 앞자리가 0일 경우 문자열이기 때문에 생략이 안된다.
			// 따라서 answer에 Integer.parseInt를 이용해 return 해준다.
			if(Character.isDigit(ascii)) answer += ascii;
			
			
//			if(ascii >= 48 && ascii <=57) answer = answer*10+(ascii-48);
		}
		
		return Integer.parseInt(answer);
//		return answer;
	}
	public static void main(String[] args) {
		// 문자와 숫자가 섞여있는 문자열에서 숫자만 추출한다.
		// 추출한 숫자를 자연수로 만든다.
		// 맨 앞자리가 0이 출력된다면 자연수로 바꾸었을때 당연히 무시된다.
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		System.out.println(solution(str));
	}
}
