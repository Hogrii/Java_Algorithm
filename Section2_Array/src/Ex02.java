import java.util.Scanner;

public class Ex02 {
	public static int solution(int[] students) {
		// 첫번째 학생은 무조건 보이기 때문에 1명 추가
		// 첫번째 학생이 현재 가장 큰 키를 가졌기 때문에 추가
		int answer = 1, height = students[0];
		
		for(int i=1; i<students.length; i++) {
			// 현재 보이는 학생보다 키가 큰 학생이 오면 보이는 학생 수 추가
			// 키가 가장 큰 학생 갱신
			if(students[i]>height) {
				answer++;
				height = students[i];
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		// N명의 학생을 일렬로 세운다.
		// 학생의 키를 입력하고 선생님이 볼 수 있는 학생의 수를 구하라.
		// 앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않는다.
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] students = new int[N];
		
		for(int i=0; i<students.length; i++) {
			students[i] = sc.nextInt();
		}
		
		System.out.println(solution(students));
	}
}
