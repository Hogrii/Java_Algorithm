import java.util.Scanner;

public class Ex12 {
	public static String solution(int N, String str) throws Exception{
		String answer = "";
		int start = 0;
		int end = 7;	
		
		for(int i=0; i<N; i++) {
			// str�� 7�ڸ��� ������ pw�� ��´�.
			String pw = str.substring(start, end);
			
			// pw�� 0�� 1�� �����Ѵ�.
			pw = pw.replace("#", "1");
			pw = pw.replace("*", "0");
			
			// pw : string -> binary -> decimal
			int decimal = Integer.parseInt(pw, 2);
			
			// pw : decimal -> char(ascii) -> string
			answer += String.valueOf((char)decimal);					
			
			// ���� pw�� ���� 7�� �����ش�.
			start += 7;
			end += 7;
		}		
		return answer;
	}
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		String str = sc.nextLine();

		System.out.println(solution(N, str));
	}
}
